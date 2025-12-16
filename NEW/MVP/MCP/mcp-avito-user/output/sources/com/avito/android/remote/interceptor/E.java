package com.avito.android.remote.interceptor;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: DefineResponseBodyHeadersInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/interceptor/E;", "Lokhttp3/Interceptor;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface E extends Interceptor {

    /* compiled from: DefineResponseBodyHeadersInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/E$a;", "Lcom/avito/android/remote/interceptor/E;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements E {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f253487b = new a();

        @Override // okhttp3.Interceptor
        @Y61.k
        public final Response intercept(@Y61.k Interceptor.Chain chain) {
            return chain.proceed(chain.request());
        }
    }
}
