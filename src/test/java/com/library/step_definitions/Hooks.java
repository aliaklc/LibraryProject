package com.library.step_definitions;

import com.library.utility.Driver;
import org.junit.After;

public class Hooks {


    @After
    public void teardownScenario(){
        Driver.quitDriver();
    }

}
