package com.avito.android.zstd;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: ZstdInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/zstd/i;", "Lokhttp3/Interceptor;", "a", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface i extends Interceptor {

    /* renamed from: c2, reason: collision with root package name */
    @Y61.k
    public static final a f331365c2 = a.f331366a;

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/zstd/i$a;", "", "<init>", "()V", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f331366a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C10302a f331367b = new C10302a();

        /* compiled from: ZstdInterceptor.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/zstd/i$a$a", "Lcom/avito/android/zstd/i;", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.zstd.i$a$a, reason: collision with other inner class name */
        public static final class C10302a implements i {
            @Override // okhttp3.Interceptor
            @Y61.k
            public final Response intercept(@Y61.k Interceptor.Chain chain) {
                return chain.proceed(chain.request());
            }
        }
    }
}
