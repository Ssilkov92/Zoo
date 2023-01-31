import org.junit.jupiter.api.*;


public class mainClassTest {
    /*@BeforeAll
    public void setUp(){

    }

    @BeforeEach
    public void BeforeEachTest(){

    }
*/
    @Test
    @Order(value = 5)
    public void testing1(){
        Assertions.assertFalse(1+3==5);
    }

    @Test
    @Order(value = 4)
    public void testing2(){
        Assertions.assertFalse(1+3==6);
    }

    @Test
    @Order(value = 3)
    public void testing3() {
        Assertions.assertTrue(1 + 1 == 2);

    }
    @Test
    @Order(value = 2)
    public void testing4(){
        Assertions.assertEquals(20, 15+5);
    }
    @Test
    @Order(value = 1)
    public void testing5(){
        Assertions.assertNotEquals(21, 15+5);
    }
}
    /*}
    @AfterAll
    public void logout(){

    }
    @AfterEach
    public void AfterEachTest(){

    }
}
*/