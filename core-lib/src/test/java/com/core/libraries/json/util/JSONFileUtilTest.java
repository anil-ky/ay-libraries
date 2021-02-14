package com.core.libraries.json.util;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
//import com.ey.nfi.libraries.application.SpringContext;
//import org.springframework.context.ApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class JSONFileUtilTest {

    //@Autowired
    //private SpringContext springContext;
    @Autowired
    private ApplicationContext context;

    private JSONFileUtil jsonFileUtil;

    @Autowired
    ResourceLoader resourceLoader;

    //@Before
    /*public void init() {
        springContext.setApplicationContext(context);
    }*/

    @Test
    void getMockResponse() {
        jsonFileUtil = new JSONFileUtil();
        Car car = jsonFileUtil.getMockResponse("mockdata/car.json", Car.class);

        Assert.assertEquals("yellow", car.getColor());
    }
}