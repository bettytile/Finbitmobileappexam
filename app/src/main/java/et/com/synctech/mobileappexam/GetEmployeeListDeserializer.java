package et.com.synctech.mobileappexam;



  import com.google.gson.JsonArray;
          import com.google.gson.JsonDeserializationContext;
          import com.google.gson.JsonDeserializer;
          import com.google.gson.JsonElement;
          import com.google.gson.JsonObject;
          import com.google.gson.JsonParseException;

          import java.lang.reflect.Type;
          import java.util.ArrayList;
          import java.util.List;


public class GetEmployeeListDeserializer implements JsonDeserializer<List<EmployeeData>> {
    @Override
    public List deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List employees = new ArrayList<>();

        final JsonObject jsonObject = json.getAsJsonObject();
        final Boolean success = jsonObject.get("success").getAsBoolean();
        final JsonArray itemsJsonArray = jsonObject.get("data").getAsJsonArray();

        for (JsonElement itemsJsonElement : itemsJsonArray) {
            final JsonObject itemJsonObject = itemsJsonElement.getAsJsonObject();
            final String id = itemJsonObject.get("id").getAsString();
            final String employee_name = itemJsonObject.get("employee_name").getAsString();
            final String employee_age = itemJsonObject.get("employee_age").getAsString();
            final String employee_salary = itemJsonObject.get("employee_salary").getAsString();
            final String profile_image = itemJsonObject.get("profile_image").getAsString();


            employees.add(new EmployeeData(id, employee_name, employee_age, employee_salary, profile_image));
        }

        return employees;
    }
}