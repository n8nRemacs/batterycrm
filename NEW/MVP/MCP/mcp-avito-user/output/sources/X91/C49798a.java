package x91;

import Y61.k;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: DeviceInfoInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx91/a;", "Lokhttp3/Interceptor;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49798a implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ru.mts.biometry.api.repo.a f442275b;

    public C49798a(@k ru.mts.biometry.api.repo.a aVar) {
        this.f442275b = aVar;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("X-App-Info", this.f442275b.getF436358a()).build());
    }
}
