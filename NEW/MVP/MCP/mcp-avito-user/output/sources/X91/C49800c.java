package x91;

import Y61.k;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: PlatformInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx91/c;", "Lokhttp3/Interceptor;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49800c implements Interceptor {
    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader("X-Platform-Type", "Android").build());
    }
}
