// [START maps_http_places_details_no_plus_compound_code]
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://maps.googleapis.com/maps/api/place/details/json?place_id=GhIJQWDl0CKxOMARUrgehSvwYEA&fields=plus_code&key=YOUR_API_KEY")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
// [END maps_http_places_details_no_plus_compound_code]