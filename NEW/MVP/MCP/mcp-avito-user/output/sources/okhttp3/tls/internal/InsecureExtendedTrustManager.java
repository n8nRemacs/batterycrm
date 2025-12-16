package okhttp3.tls.internal;

import Y61.k;
import Y61.l;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.Metadata;
import okhttp3.internal.Util;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: InsecureExtendedTrustManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0011\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0017J)\u0010\u0018\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u0018\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0018\u001a\u00020\u00162\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/tls/internal/InsecureExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "delegate", "", "", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509ExtendedTrustManager;Ljava/util/List;)V", "", "Ljava/security/cert/X509Certificate;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "chain", "authType", "Ljava/net/Socket;", "socket", "Lkotlin/G0;", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/lang/Void;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/lang/Void;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "Ljava/util/List;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
@IgnoreJRERequirement
/* loaded from: classes7.dex */
public final class InsecureExtendedTrustManager extends X509ExtendedTrustManager {

    @k
    private final X509ExtendedTrustManager delegate;

    @k
    private final List<String> insecureHosts;

    public InsecureExtendedTrustManager(@k X509ExtendedTrustManager x509ExtendedTrustManager, @k List<String> list) {
        this.delegate = x509ExtendedTrustManager;
        this.insecureHosts = list;
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public X509Certificate[] getAcceptedIssuers() {
        return this.delegate.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(@k X509Certificate[] chain, @k String authType, @k Socket socket) throws CertificateException {
        if (this.insecureHosts.contains(Util.peerName(socket))) {
            return;
        }
        this.delegate.checkServerTrusted(chain, authType, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public Void checkClientTrusted(@k X509Certificate[] chain, @l String authType) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(@k X509Certificate[] chain, @k String authType, @k SSLEngine engine) throws CertificateException {
        if (this.insecureHosts.contains(engine.getPeerHost())) {
            return;
        }
        this.delegate.checkServerTrusted(chain, authType, engine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    @k
    public Void checkClientTrusted(@k X509Certificate[] chain, @k String authType, @l SSLEngine engine) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    @k
    public Void checkClientTrusted(@k X509Certificate[] chain, @k String authType, @l Socket socket) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public Void checkServerTrusted(@k X509Certificate[] chain, @k String authType) throws CertificateException {
        throw new CertificateException("Unsupported operation");
    }
}
