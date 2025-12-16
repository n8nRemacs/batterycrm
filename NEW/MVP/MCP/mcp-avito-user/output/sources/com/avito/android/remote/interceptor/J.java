package com.avito.android.remote.interceptor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.K5;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: ExceptionCatchingInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/J;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class J implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f253490b;

    @Inject
    public J(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f253490b = interfaceC28373a;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) throws Exception {
        try {
            return chain.proceed(chain.request());
        } catch (Exception e12) {
            if (K5.e(e12) || K5.c(e12)) {
                throw e12;
            }
            this.f253490b.c(new NonFatalErrorEvent("Unexpected exception in network request", e12, null, null, 12, null));
            throw new IOException(e12);
        }
    }
}
