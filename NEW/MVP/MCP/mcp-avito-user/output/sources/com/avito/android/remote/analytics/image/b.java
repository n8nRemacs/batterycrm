package com.avito.android.remote.analytics.image;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: FrescoLoggingInterceptorImpl.kt */
@h31.j
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/b;", "Lcom/avito/android/remote/analytics/image/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f253124b;

    @Inject
    public b(@Y61.k e eVar) {
        this.f253124b = eVar;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        this.f253124b.a(request, responseProceed.headers());
        return responseProceed;
    }
}
