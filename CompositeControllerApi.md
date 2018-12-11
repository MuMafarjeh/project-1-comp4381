# CompositeControllerApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPlaceUsingGET**](CompositeControllerApi.md#findPlaceUsingGET) | **GET** /Composite | findPlace


<a name="findPlaceUsingGET"></a>
# **findPlaceUsingGET**
> String findPlaceUsingGET(location)

findPlace

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompositeControllerApi;


CompositeControllerApi apiInstance = new CompositeControllerApi();
String location = "31.959193,35.182007"; // String | location
try {
    String result = apiInstance.findPlaceUsingGET(location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompositeControllerApi#findPlaceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **String**| location | [optional] [default to 31.959193,35.182007]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

