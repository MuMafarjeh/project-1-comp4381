# ResturentControllerApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResturentUsingGET**](ResturentControllerApi.md#getResturentUsingGET) | **GET** /resturent | getResturent


<a name="getResturentUsingGET"></a>
# **getResturentUsingGET**
> List&lt;Restaurant&gt; getResturentUsingGET(location)

getResturent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResturentControllerApi;


ResturentControllerApi apiInstance = new ResturentControllerApi();
String location = "31.959193,35.182007"; // String | location
try {
    List<Restaurant> result = apiInstance.getResturentUsingGET(location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResturentControllerApi#getResturentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **String**| location | [optional] [default to 31.959193,35.182007]

### Return type

[**List&lt;Restaurant&gt;**](Restaurant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

