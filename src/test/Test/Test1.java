package Test;


import pages.PageYandex;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

        @Test
        public void Test_1(){
            PageYandex page = new PageYandex();
            page.goToYandex();
        }
}
