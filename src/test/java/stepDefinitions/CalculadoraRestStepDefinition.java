package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import java.util.Map;

public class CalculadoraRestStepDefinition {

    @Cuando("^Kevin envia la siguiente operacion al servicio \"([^\"]*)\"$")
    public void kevinEnviaLaSiguienteOperacionAlServicio(String url, Map<String,String> cuerpo) {
        System.out.println(cuerpo);
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(cuerpo).post();
        //System.out.println((SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(cuerpo).post()).getStatusCode());
    }

    @Entonces("^valida que el codigo de status sea (\\d+)$")
    public void validaQueElCodigoDeStatusSea(int status) {
        System.out.println(status);
        SerenityRest.lastResponse().then().statusCode(status);
    }

    @Entonces("^valida que el contenido de la llave \"([^\"]*)\" sea \"([^\"]*)\"$")
    public void validaQueElContenidoDeLaLlaveSea(String lleaveResultant, String resultadoEsperado) {
        System.out.println(resultadoEsperado);
        System.out.println(lleaveResultant);
        SerenityRest.lastResponse().then().body(lleaveResultant, Matchers.equalTo(resultadoEsperado));
    }

    @Entonces("^valida que el conteindo de la llave \"([^\"]*)\" sea null$")
    public void validaQueElConteindoDeLaLlaveSeaNull(String llaveError) {
        SerenityRest.lastResponse().then().body(llaveError, Matchers.equalTo(null));
    }

}
