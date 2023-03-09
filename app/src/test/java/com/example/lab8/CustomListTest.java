package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * test the addCity method
     */
    @Test
    public void testAddCity(){
        list = MockCityList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertEquals(1, list.getCount());
    }






}
