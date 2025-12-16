package cb1;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: cb1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27168g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57983a = C42727D.c(a.f57984l);

    /* renamed from: cb1.g$a */
    public static final class a extends N implements Y41.a<OkHttpClient> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f57984l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final OkHttpClient invoke() {
            com.vk.push.core.network.http.a aVar = com.vk.push.core.network.http.a.f367118a;
            InterfaceC42726C interfaceC42726C = C27168g.f57983a;
            com.vk.push.core.network.http.e eVar = com.vk.push.core.network.http.e.f367121a;
            C27166e c27166e = C27166e.f57980a;
            eVar.getClass();
            HttpLoggingInterceptor level = new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT).setLevel(HttpLoggingInterceptor.Level.NONE);
            com.vk.push.core.network.http.c cVar = com.vk.push.core.network.http.c.f367120a;
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            final String packageName = pVar.f13852a.getApplicationContext().getPackageName();
            cVar.getClass();
            Interceptor[] interceptorArr = {level, new Interceptor() { // from class: com.vk.push.core.network.http.b
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    c cVar2 = c.f367120a;
                    return chain.proceed(chain.request().newBuilder().header("x-vkpns-request-id", UUID.randomUUID().toString()).header("User-Agent", "host_sdk/6.1.0").header("X-Vkpns-Package-Name", packageName).build());
                }
            }};
            aVar.getClass();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderRetryOnConnectionFailure = builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).retryOnConnectionFailure(true);
            C42745f0.i(builderRetryOnConnectionFailure.interceptors(), interceptorArr);
            return builderRetryOnConnectionFailure.build();
        }
    }
}
