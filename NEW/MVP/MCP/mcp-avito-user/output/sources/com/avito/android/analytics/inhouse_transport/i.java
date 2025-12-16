package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.V2;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.C44802l;

/* compiled from: GzipRequestInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/i;", "Lokhttp3/Interceptor;", "<init>", "()V", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements Interceptor {
    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) throws Throwable {
        Request request = chain.request();
        if (request.body() == null) {
            Request requestBuild = request.newBuilder().header("Content-Encoding", "gzip").build();
            V2.f318762a.c("GzipRequestInterceptor", "newRequest.toString():" + requestBuild, null);
            return chain.proceed(requestBuild);
        }
        if (request.header("Content-Encoding") != null) {
            return chain.proceed(request);
        }
        Request.Builder builderHeader = request.newBuilder().header("Content-Encoding", "gzip");
        String strMethod = request.method();
        h hVar = new h(request.body());
        C44802l c44802l = new C44802l();
        hVar.writeTo(c44802l);
        return chain.proceed(builderHeader.method(strMethod, new g(hVar, c44802l)).build());
    }
}
