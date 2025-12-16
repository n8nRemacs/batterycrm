package com.avito.beduin.v2.utils.network;

import Y61.k;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: ProgressInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/utils/network/d;", "Lokhttp3/Interceptor;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f338468b;

    public d(@k e eVar) {
        this.f338468b = eVar;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        Response responseBuild;
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyBody = responseProceed.body();
        return (responseBodyBody == null || (responseBuild = responseProceed.newBuilder().body(new g(responseBodyBody, this.f338468b)).build()) == null) ? responseProceed : responseBuild;
    }
}
