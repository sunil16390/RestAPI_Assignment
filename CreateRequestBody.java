package resuable;

public class CreateRequestBody {

    public String createPetDetailRequestBody(String petID, String petName){
        String body = "{\n" +
                "    \"id\": \""+petID+"\",\n" +
                "    \"category\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"string\"\n" +
                "    },\n" +
                "    \"name\": \""+petName+"\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"string\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"string\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";
        return body;
    }
}
