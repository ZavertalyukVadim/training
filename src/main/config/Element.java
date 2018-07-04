package config;

public class Element extends Driver {

    protected void navigate(String url){
        driver.navigate().to(url);
    }
}
