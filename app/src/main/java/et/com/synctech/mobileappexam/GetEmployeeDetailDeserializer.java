package et.com.synctech.mobileappexam;



  import com.google.gson.JsonDeserializationContext;
          import com.google.gson.JsonDeserializer;
          import com.google.gson.JsonElement;
          import com.google.gson.JsonObject;
          import com.google.gson.JsonParseException;

          import java.lang.reflect.Type;


public class GetEmployeeDetailDeserializer implements JsonDeserializer<EmployeeData> {
    @Override
    public EmployeeData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();

        final String id = jsonObject.get("id").getAsString();
        final String employee_name = jsonObject.get("emplyee_name").getAsString();
        final String employee_age = jsonObject.get("employee_age").getAsString();
        final String employee_salary = jsonObject.get("employee_salary").getAsString();
        final String profile_image = jsonObject.get("profile_image").getAsString();

        return new EmployeeData(id, employee_name, employee_age,employee_salary,profile_image);
    }
}
