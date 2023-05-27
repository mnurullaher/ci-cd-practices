package com.nurullah.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MyController.class)
class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_hello() throws Exception {
        mockMvc.perform(get("/api"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$", Matchers.startsWith("Hello")));
    }

}