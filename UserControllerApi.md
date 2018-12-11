# UserControllerApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adduserUsingPOST**](UserControllerApi.md#adduserUsingPOST) | **POST** /user/user | adduser
[**finduserByNameUsingGET**](UserControllerApi.md#finduserByNameUsingGET) | **GET** /user/user | finduserByName
[**getUserUsingGET**](UserControllerApi.md#getUserUsingGET) | **GET** /user | user
[**getuserByIDUsingGET**](UserControllerApi.md#getuserByIDUsingGET) | **GET** /user/user/{id} | getUserByID


<a name="adduserUsingPOST"></a>
# **adduserUsingPOST**
> UserModelClass adduserUsingPOST(u)

adduser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
UserModelClass u = new UserModelClass(); // UserModelClass | u
try {
    UserModelClass result = apiInstance.adduserUsingPOST(u);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#adduserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **u** | [**UserModelClass**](UserModelClass.md)| u |

### Return type

[**UserModelClass**](UserModelClass.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="finduserByNameUsingGET"></a>
# **finduserByNameUsingGET**
> String finduserByNameUsingGET(name)

finduserByName

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
String name = "Muayed"; // String | name
try {
    String result = apiInstance.finduserByNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#finduserByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name | [optional] [default to Muayed]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> List&lt;Object&gt; getUserUsingGET()

user

This operation retrieves all user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
try {
    List<Object> result = apiInstance.getUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml, application/json

<a name="getuserByIDUsingGET"></a>
# **getuserByIDUsingGET**
> UserModelClass getuserByIDUsingGET(id)

getUserByID

This operation retrieves a user by it&#39;s ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
Integer id = 56; // Integer | id
try {
    UserModelClass result = apiInstance.getuserByIDUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getuserByIDUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**UserModelClass**](UserModelClass.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

