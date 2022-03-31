package Tests;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Busca{
private WebDriver driver;
    @Dado("que eu esteja no site")
    public void queEuEstejaNoSite() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\wesle\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.get("https://www.soc.com.br/blog-de-sst/#");
        //getdriver().get("https://www.soc.com.br/blog-de-sst/");
    }

    @Quando("insiro uma palavra para pesquisar")
    public void insiroUmaPalavraParaPesquisar() {
        //driver.findElement(By.xpath("//div[@data-elementor-type='popup']//../a[@class='elementor-icon']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Aceitar cookies']"))));

        WebElement element = driver.findElement(By.xpath("(//i[@class='fas fa-search'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


        driver.findElement(By.xpath("//input[@placeholder='Procurar']")).sendKeys("teste");


        driver.findElement(By.xpath("//input[@placeholder='Procurar']")).submit();

    }

     @Entao("eu espero que as informações referentes a busca que eu solicitei sejam apresentadas")
    public void euEsperoQueAsInformaçõesReferentesABuscaQueEuSoliciteiSejamApresentadas() {
        driver.findElement(By.xpath("//div[@data-elementor-type='popup']//../a[@class='elementor-icon']")).click();
        driver.findElement(By.xpath("//*[text()=' Analista de Testes – QA ']")).getText();
        driver.quit();
    }
    @Dado("acesse a rede socnet na aba funcionalidade")
    public void acesse_a_rede_socnet_na_aba_funcionalidade() {

        //driver.findElement(By.xpath("//div[@data-elementor-type='popup']//../a[@class='elementor-icon']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Aceitar cookies']"))));

        WebElement element = driver.findElement(By.xpath("(//a[text()='Funcionalidades']/span)[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        WebElement element2 = driver.findElement(By.xpath("(//a[text()='Rede SOCNET'])[1]"));
        JavascriptExecutor abridRedeSocNet = (JavascriptExecutor)driver;
        abridRedeSocNet.executeScript("arguments[0].click();", element2);





    }
    @Dado("clico em credenciados")
    public void clico_em_credenciados() {
        driver.findElement(By.xpath("//div[@data-elementor-type='popup']//../a[@class='elementor-icon']")).click();

        WebElement element3 = driver.findElement(By.xpath("//span[text()='Buscar credenciados']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element3);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));




    }
    @Quando("preencho os filtros para buscar um credenciado")
    public void preencho_os_filtros_para_buscar_um_credenciado() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("avenida paulista");

        driver.findElement(By.xpath("//button[@id='botao-buscar']")).click();
    }
    @Entao("espero que o site retorne os credenciados de acordo")
    public void espero_que_o_site_retorne_os_credenciados_de_acordo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='div-resultados-qtdd']"))));
        driver.quit();

    }

}
