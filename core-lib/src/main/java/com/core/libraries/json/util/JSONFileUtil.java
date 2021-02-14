package com.core.libraries.json.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;

import java.io.InputStreamReader;
import java.io.Reader;

import static com.core.libraries.constants.CoreConstants.CP_STR;
import static com.core.libraries.constants.CoreConstants.MOCK_FILE_LOCATION;

@Configuration
public class JSONFileUtil {

    @Autowired
    private ResourceLoader resourceLoad;

    /**
     * Reads the Mock Response from the given json file.
     *
     * @param fileName     name of the mock file to load
     * @param responseType type of the response
     * @return the response from the json mock file
     */
    public <T> T getMockResponse(String fileName, Class<T> responseType) {
        T mockResponse = null;
        try {
            Resource resource = resourceLoad.getResource(CP_STR + MOCK_FILE_LOCATION + fileName);
            Reader jsonFileStream = new InputStreamReader(resource.getInputStream());
            String jsonContent = FileCopyUtils.copyToString(jsonFileStream);

            /*if (StringUtils.isEmpty(jsonContent)) {
                throw new Exception("File does not have any content");
            }*/
            mockResponse = new ObjectMapper().readValue(jsonContent, responseType);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return mockResponse;
    }
}
