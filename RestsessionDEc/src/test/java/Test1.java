import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    void Rest1(){

//        Response re= RestAssured.get("https://developers.zomato.com/api/v2.1/categories");
//
//        System.out.println(re.getStatusCode());
//        System.out.println(re.getStatusLine());
//        System.out.println(re.getBody().asString());

        RestAssured.baseURI ="https://developers.zomato.com/api/v2.1";
        RequestSpecification request = RestAssured.given();
        request.header("user-key","7b8c2002a92c21109f1dfd2808ea50e1");
        request.header("Accept","application/json");

        Response response = request.get("/categories");

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

        Assert.assertEquals(201,statusCode);




//        JsonPath jspath=re.jsonPath();
//        String s=jspath.get("data.id[0]").toString();
//        System.out.println(s);

    }


}
