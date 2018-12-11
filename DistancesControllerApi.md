# DistancesControllerApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDistanceUsingGET**](DistancesControllerApi.md#getDistanceUsingGET) | **GET** /distance | getDistance


<a name="getDistanceUsingGET"></a>
# **getDistanceUsingGET**
> List&lt;DistanceModelClass&gt; getDistanceUsingGET(origins, destinations)

getDistance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DistancesControllerApi;


DistancesControllerApi apiInstance = new DistancesControllerApi();
String origins = "31.959193,35.182007"; // String | origins
String destinations = "32.0651634,34.7713842"; // String | destinations
try {
    List<DistanceModelClass> result = apiInstance.getDistanceUsingGET(origins, destinations);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistancesControllerApi#getDistanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origins** | **String**| origins | [optional] [default to 31.959193,35.182007]
 **destinations** | **String**| destinations | [optional] [default to 32.0651634,34.7713842]

### Return type

[**List&lt;DistanceModelClass&gt;**](DistanceModelClass.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

