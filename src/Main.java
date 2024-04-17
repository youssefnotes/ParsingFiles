
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
File fileName = new File("D:\\dev\\java\\ParsingJson\\uom json response.txt");
String jsonStringFromFile = new String(Files.readAllBytes(Paths.get(fileName.toString())));
        String jsonString = """
                {
                    "d": {
                        "results": [
                            {
                                "__metadata": {
                                    "id": "https://my405604-api.s4hana.cloud.sap/sap/opu/odata/sap/YY1_UOM_CDS/YY1_UOM('%25O')",
                                    "uri": "https://my405604-api.s4hana.cloud.sap/sap/opu/odata/sap/YY1_UOM_CDS/YY1_UOM('%25O')",
                                    "type": "YY1_UOM_CDS.YY1_UOMType"
                                },
                                "UnitOfMeasure": "%O",
                                "UnitOfMeasureSAPCode": "%O",
                                "UnitOfMeasure_1": "%O",
                                "UnitOfMeasureLongName": "Promille",
                                "UnitOfMeasureName": "%0"
                            },
                            {
                                "__metadata": {
                                    "id": "https://my405604-api.s4hana.cloud.sap/sap/opu/odata/sap/YY1_UOM_CDS/YY1_UOM('%25O')",
                                    "uri": "https://my405604-api.s4hana.cloud.sap/sap/opu/odata/sap/YY1_UOM_CDS/YY1_UOM('%25O')",
                                    "type": "YY1_UOM_CDS.YY1_UOMType"
                                },
                                "UnitOfMeasure": "%O",
                                "UnitOfMeasureSAPCode": "%O",
                                "UnitOfMeasure_1": "%O",
                                "UnitOfMeasureLongName": "Promil",
                                "UnitOfMeasureName": "%0"
                            }
                        ]
                    }
                }""";

        JSONObject jsonObject = new JSONObject(jsonStringFromFile);

        JSONArray jsonObjectUnits = jsonObject.getJSONObject("d").getJSONArray("results");

      jsonObjectUnits.forEach(unit -> System.out.println(unit));
    }
}
