package com.core.libraries.json.util;

public class Car {

    private String color;
    private String type;



    /**
     * @param color color
     * @param type car type
     */
    public Car(String color, String type) {
        super();
        this.color = color;
        this.type = type;
    }

    public Car() {

    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
