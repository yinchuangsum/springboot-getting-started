package com.ycsum.gettingstarted;

import com.ycsum.gettingstarted.controller.WebController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GettingStartedApplicationTests {

    @Autowired
    private WebController controller;
    @Test
    void contextLoads() {
        Assertions.assertThat(controller).isNotNull();
    }

}
