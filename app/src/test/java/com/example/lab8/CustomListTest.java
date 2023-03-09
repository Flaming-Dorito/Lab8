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
        int listSize = list.getCount();
        list.addCity(new City("Toronto", "Ontario"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * test the hasCity method
     */
    @Test
    public void testHasCity(){
        list = MockCityList();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }






}
