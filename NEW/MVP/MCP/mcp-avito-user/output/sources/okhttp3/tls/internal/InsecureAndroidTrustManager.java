package okhttp3.tls.internal;

import Y61.k;
import Y61.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: InsecureAndroidTrustManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J'\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u000fJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/tls/internal/InsecureAndroidTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "delegate", "insecureHosts", "", "", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/List;)V", "checkServerTrustedMethod", "Ljava/lang/reflect/Method;", "checkClientTrusted", "", "chain", "", "Ljava/security/cert/X509Certificate;", "authType", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "checkServerTrusted", "Ljava/security/cert/Certificate;", "host", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InsecureAndroidTrustManager implements X509TrustManager {

    @l
    private final Method checkServerTrustedMethod;

    @k
    private final X509TrustManager delegate;

    @k
    private final List<String> insecureHosts;

    public InsecureAndroidTrustManager(@k X509TrustManager x509TrustManager, @k List<String> list) throws NoSuchMethodException, SecurityException {
        Method method;
        this.delegate = x509TrustManager;
        this.insecureHosts = list;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.checkServerTrustedMethod = method;
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public X509Certificate[] getAcceptedIssuers() {
        return this.delegate.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public Void checkClientTrusted(@k X509Certificate[] chain, @l String authType) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }

    @k
    public final List<Certificate> checkServerTrusted(@k X509Certificate[] chain, @k String authType, @k String host) throws Throwable {
        if (this.insecureHosts.contains(host)) {
            return C42784z0.f406748b;
        }
        try {
            Method method = this.checkServerTrustedMethod;
            if (method != null) {
                return (List) method.invoke(this.delegate, chain, authType, host);
            }
            throw new CertificateException("Failed to call checkServerTrusted");
        } catch (InvocationTargetException e12) {
            throw e12.getTargetException();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public Void checkServerTrusted(@k X509Certificate[] chain, @k String authType) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }
}
