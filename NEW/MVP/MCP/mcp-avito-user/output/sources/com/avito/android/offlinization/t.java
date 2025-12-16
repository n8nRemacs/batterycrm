package com.avito.android.offlinization;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: OfflinizationInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/offlinization/t;", "Lokhttp3/Interceptor;", "a", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface t extends Interceptor {

    /* renamed from: W1, reason: collision with root package name */
    @Y61.k
    public static final a f208596W1 = a.f208597a;

    /* compiled from: OfflinizationInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/t$a;", "", "<init>", "()V", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f208597a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C6222a f208598b = new C6222a();

        /* compiled from: OfflinizationInterceptor.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/offlinization/t$a$a", "Lcom/avito/android/offlinization/t;", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.offlinization.t$a$a, reason: collision with other inner class name */
        public static final class C6222a implements t {
            @Override // okhttp3.Interceptor
            @Y61.k
            public final Response intercept(@Y61.k Interceptor.Chain chain) {
                return chain.proceed(chain.request());
            }
        }
    }
}
