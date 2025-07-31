package OOP;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;




public class Conversor {
    public double valor;
    private static final String API_KEY = "fxr_live_f0385e6b474b47c54ec1bdc2b8e50438f364";
    public String moedaOrigem;
    public String moedaDestino;


    public void ConversorMoeda() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.fxratesapi.com/convert?from=%s&to=%s&amount=%.2f&apikey=%s".formatted(moedaOrigem, moedaDestino, valor, API_KEY)))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //converte o resultado para json
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        double resultado = json.get("result").getAsDouble();
        System.out.printf("%.2f%n",resultado);

    }










    public void setValor(double valor) {
        this.valor = valor;
    }


    public void setMoedaOrigem(String moedaOrigem) {
        this.moedaOrigem = moedaOrigem;
    }


    public void setMoedaDestino(String moedaDestino) {
        this.moedaDestino = moedaDestino;
    }
}
