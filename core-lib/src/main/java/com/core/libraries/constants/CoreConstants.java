package com.core.libraries.constants;

public class CoreConstants {

    public static final String MOCK_FILE_LOCATION = "mockdata/";
    public static final String CP_STR = "classpath:";

    // preventing creation of object
    private CoreConstants() {
        throw new IllegalStateException("Cannot Create Constants Instance");
    }
}
