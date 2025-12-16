package com.avito.android.remote.interceptor;

import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: DefineResponseBodyHeadersInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/F;", "Lcom/avito/android/remote/interceptor/E;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class F implements E {
    @Inject
    public F() {
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody == null) {
            return responseProceed;
        }
        return responseProceed.newBuilder().body(new L(responseProceed.headers(), responseBodyBody)).build();
    }
}
