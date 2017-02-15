/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import retrofit2.Retrofit;
import fixtures.bodycomplex.Dictionarys;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.DictionaryWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Dictionarys.
 */
public class DictionarysImpl implements Dictionarys {
    /** The Retrofit service to perform REST calls. */
    private DictionarysService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Dictionarys.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DictionarysImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(DictionarysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Dictionarys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DictionarysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys getValid" })
        @GET("complex/dictionary/typed/valid")
        Observable<Response<ResponseBody>> getValid();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys putValid" })
        @PUT("complex/dictionary/typed/valid")
        Observable<Response<ResponseBody>> putValid(@Body DictionaryWrapper complexBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys getEmpty" })
        @GET("complex/dictionary/typed/empty")
        Observable<Response<ResponseBody>> getEmpty();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys putEmpty" })
        @PUT("complex/dictionary/typed/empty")
        Observable<Response<ResponseBody>> putEmpty(@Body DictionaryWrapper complexBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys getNull" })
        @GET("complex/dictionary/typed/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Dictionarys getNotProvided" })
        @GET("complex/dictionary/typed/notprovided")
        Observable<Response<ResponseBody>> getNotProvided();

    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getValid() {
        return getValidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types with dictionary property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DictionaryWrapper> getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromResponse(getValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<DictionaryWrapper> getValidAsync() {
        return getValidWithServiceResponseAsync().map(new Func1<ServiceResponse<DictionaryWrapper>, DictionaryWrapper>() {
            @Override
            public DictionaryWrapper call(ServiceResponse<DictionaryWrapper> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types with dictionary property.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getValidWithServiceResponseAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DictionaryWrapper, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     */
    public void putValid(DictionaryWrapper complexBody) {
        putValidWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putValidWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putValidAsync(DictionaryWrapper complexBody) {
        return putValidWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putValidWithServiceResponseAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getEmpty() {
        return getEmptyWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DictionaryWrapper> getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromResponse(getEmptyWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<DictionaryWrapper> getEmptyAsync() {
        return getEmptyWithServiceResponseAsync().map(new Func1<ServiceResponse<DictionaryWrapper>, DictionaryWrapper>() {
            @Override
            public DictionaryWrapper call(ServiceResponse<DictionaryWrapper> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getEmptyWithServiceResponseAsync() {
        return service.getEmpty()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DictionaryWrapper, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     */
    public void putEmpty(DictionaryWrapper complexBody) {
        putEmptyWithServiceResponseAsync(complexBody).toBlocking().single().body();
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(putEmptyWithServiceResponseAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> putEmptyAsync(DictionaryWrapper complexBody) {
        return putEmptyWithServiceResponseAsync(complexBody).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putEmptyWithServiceResponseAsync(DictionaryWrapper complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putEmpty(complexBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getNull() {
        return getNullWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DictionaryWrapper> getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromResponse(getNullWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<DictionaryWrapper> getNullAsync() {
        return getNullWithServiceResponseAsync().map(new Func1<ServiceResponse<DictionaryWrapper>, DictionaryWrapper>() {
            @Override
            public DictionaryWrapper call(ServiceResponse<DictionaryWrapper> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getNullWithServiceResponseAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DictionaryWrapper, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the DictionaryWrapper object if successful.
     */
    public DictionaryWrapper getNotProvided() {
        return getNotProvidedWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DictionaryWrapper> getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        return ServiceFuture.fromResponse(getNotProvidedWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<DictionaryWrapper> getNotProvidedAsync() {
        return getNotProvidedWithServiceResponseAsync().map(new Func1<ServiceResponse<DictionaryWrapper>, DictionaryWrapper>() {
            @Override
            public DictionaryWrapper call(ServiceResponse<DictionaryWrapper> response) {
                return response.body();
            }
        });
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @return the observable to the DictionaryWrapper object
     */
    public Observable<ServiceResponse<DictionaryWrapper>> getNotProvidedWithServiceResponseAsync() {
        return service.getNotProvided()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DictionaryWrapper>>>() {
                @Override
                public Observable<ServiceResponse<DictionaryWrapper>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DictionaryWrapper> clientResponse = getNotProvidedDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DictionaryWrapper> getNotProvidedDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<DictionaryWrapper, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DictionaryWrapper>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
