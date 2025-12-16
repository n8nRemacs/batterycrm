package z81;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Z;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC50399a f443871a;

    /* renamed from: b, reason: collision with root package name */
    public final H81.a f443872b;

    /* renamed from: c, reason: collision with root package name */
    public final h f443873c = new h(this);

    /* renamed from: d, reason: collision with root package name */
    public final i f443874d = new i(this);

    /* renamed from: e, reason: collision with root package name */
    public final g f443875e = new g(this);

    public j(InterfaceC50399a interfaceC50399a, H81.a aVar) {
        this.f443871a = interfaceC50399a;
        this.f443872b = aVar;
    }

    public static final OkHttpClient.Builder a(j jVar, OkHttpClient.Builder builder) throws NoSuchAlgorithmException, KeyManagementException {
        Object bVar;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.connectTimeout(15000L, timeUnit);
        builder.readTimeout(15000L, timeUnit);
        builder.writeTimeout(15000L, timeUnit);
        builder.followRedirects(true);
        builder.followSslRedirects(true);
        H81.a aVar = jVar.f443872b;
        aVar.getClass();
        try {
            int i12 = Z.f406624c;
            Object obj = aVar.f6965b;
            bVar = obj;
            if (obj == null) {
                X509TrustManager x509TrustManagerB = aVar.b();
                aVar.f6965b = x509TrustManagerB;
                bVar = x509TrustManagerB;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        boolean z12 = bVar instanceof Z.b;
        Object obj2 = bVar;
        if (z12) {
            obj2 = null;
        }
        X509TrustManager x509TrustManager = (X509TrustManager) obj2;
        if (x509TrustManager != null) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
            builder.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
        }
        return builder.retryOnConnectionFailure(true);
    }
}
