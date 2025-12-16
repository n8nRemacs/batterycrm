package com.avito.android.quic;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: QuicInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/quic/b;", "Lokhttp3/Interceptor;", "a", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b extends Interceptor {

    /* compiled from: QuicInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/b$a;", "Lcom/avito/android/quic/b;", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f246166b = new a();

        @Override // okhttp3.Interceptor
        @Y61.k
        public final Response intercept(@Y61.k Interceptor.Chain chain) {
            return chain.proceed(chain.request());
        }
    }
}
