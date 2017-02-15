/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri.implementation;

import retrofit2.Retrofit;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.custombaseuri.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public class PathsInner {
    /** The Retrofit service to perform REST calls. */
    private PathsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterizedHostTestClientImpl client;

    /**
     * Initializes an instance of PathsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PathsInner(Retrofit retrofit, AutoRestParameterizedHostTestClientImpl client) {
        this.service = retrofit.create(PathsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PathsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.custombaseuri.Paths getEmpty" })
        @GET("customuri")
        Observable<Response<ResponseBody>> getEmpty(@Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     */
    public void getEmpty(String accountName) {
        getEmptyWithServiceResponseAsync(accountName).toBlocking().single().body();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getEmptyAsync(String accountName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getEmptyWithServiceResponseAsync(accountName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getEmptyAsync(String accountName) {
        return getEmptyWithServiceResponseAsync(accountName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getEmptyWithServiceResponseAsync(String accountName) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.host() == null) {
            throw new IllegalArgumentException("Parameter this.client.host() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{accountName}", accountName, "{host}", this.client.host());
        return service.getEmpty(this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getEmptyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
