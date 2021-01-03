import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    void API(){

//       Response re =RestAssured.get("https://reqres.in/api/users?page=2");
//       Response response=RestAssured.get("https://developers.zomato.com/api/v2.1/categories");
//        System.out.println(re.getBody().asString());
//        System.out.println(re.getStatusCode());
//        System.out.println(re.getStatusLine());
////        System.out.println(response.getBody().asString());
//
//
//        response.header("user","340970318461079beb4181972c38b0fc");
////        response.header("Accept","application/json");
//
//        JsonPath jsPath = re.jsonPath();
//        String s=jsPath.get("data.id[0]").toString();
//        System.out.println(s);
        RestAssured.baseURI ="https://developers.zomato.com/api/v2.1";
        RequestSpecification request = RestAssured.given();
        request.header("user-key","7b8c2002a92c21109f1dfd2808ea50e1");

        System.out.println(request.body()getBody());


    }
}
