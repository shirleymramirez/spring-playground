package com.galvanize.firstApi

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.RequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders


@RunWith(SpringRunner.class)
@WebMvcTest(PagesControllerTest.class)
class PagesControllerTest {

    @Autowired
    MockMvc mvc

    @Test
    public void testPi() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi")

        this.mvc.perform(request)
            .andExpect(status().isOK())
            .andExpect(content().string("3.141592653589793"))
    }
}
