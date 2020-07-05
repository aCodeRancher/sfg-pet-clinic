package guru.springframework.sfgpetclinic;


import guru.springframework.sfgpetclinic.controllers.IndexController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

    @Autowired
    IndexController indexController;

    @Test
    public void contextLoads() {
        assertEquals("index", indexController.index());
        assertNotNull(indexController);
    }

}
