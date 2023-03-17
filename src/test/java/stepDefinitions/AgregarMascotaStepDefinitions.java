package stepDefinitions;

import Models.Mascota;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.rest.SerenityRest;


import java.util.List;

public class AgregarMascotaStepDefinitions {


    @Cuando("^david envia la siguiente informacion de mascota al servicio \"([^\"]*)\"$")
    public void davidEnviaLaSiguienteInformacionDeMascotaAlServicio(String url, List<Mascota> listaMascota) {

        String cuerpo = "{\n" +
                "  \"id\": "+listaMascota.get(0).getIdMascotas()+",\n" +
                "  \"category\": {\n" +
                "    \"id\": "+listaMascota.get(0).getIdCategoria()+",\n" +
                "    \"name\": \""+listaMascota.get(0).getNameCategoria()+"\"\n" +
                "  },\n" +
                "  \"name\": \""+listaMascota.get(0).getNombreMascota()+"\",\n" +
                "  \"photoUrls\": [\n" +
                "    \""+listaMascota.get(0).getPhotoUrlMascota()+"\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": "+listaMascota.get(0).getIdTags()+",\n" +
                "      \"name\": \""+listaMascota.get(0).getNombreTags()+"\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \""+listaMascota.get(0).getStatusMascota()+"\"\n" +
                "}";

        SerenityRest.given().baseUri(url).header("Content-Type","application/json").body(cuerpo).post();
    }
}
