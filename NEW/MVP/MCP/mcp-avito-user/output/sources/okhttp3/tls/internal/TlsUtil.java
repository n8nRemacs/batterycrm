package okhttp3.tls.internal;

import AK.c;
import X41.n;
import Y41.a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UserTypeCode;
import java.io.IOException;
import java.net.InetAddress;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.HandshakeCertificates;
import okhttp3.tls.HeldCertificate;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: TlsUtil.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0012\"\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0005\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0006¨\u0006\""}, d2 = {"Lokhttp3/tls/internal/TlsUtil;", "", "<init>", "()V", "Lokhttp3/tls/HandshakeCertificates;", "localhost", "()Lokhttp3/tls/HandshakeCertificates;", "", "keyStoreType", "", "Ljava/security/cert/X509Certificate;", "trustedCertificates", "insecureHosts", "Ljavax/net/ssl/X509TrustManager;", "newTrustManager", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljavax/net/ssl/X509TrustManager;", "Lokhttp3/tls/HeldCertificate;", "heldCertificate", "", "intermediates", "Ljavax/net/ssl/X509KeyManager;", "newKeyManager", "(Ljava/lang/String;Lokhttp3/tls/HeldCertificate;[Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/X509KeyManager;", "Ljava/security/KeyStore;", "newEmptyKeyStore", "(Ljava/lang/String;)Ljava/security/KeyStore;", "", "password", "[C", "getPassword", "()[C", "localhost$delegate", "Lkotlin/C;", "getLocalhost", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TlsUtil {

    @k
    public static final TlsUtil INSTANCE = new TlsUtil();

    @k
    private static final char[] password = "password".toCharArray();

    /* renamed from: localhost$delegate, reason: from kotlin metadata */
    @k
    private static final InterfaceC42726C localhost = C42727D.c(AnonymousClass2.INSTANCE);

    /* compiled from: TlsUtil.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/tls/HandshakeCertificates;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: okhttp3.tls.internal.TlsUtil$localhost$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements a<HandshakeCertificates> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // Y41.a
        @k
        public final HandshakeCertificates invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            HeldCertificate heldCertificateBuild = new HeldCertificate.Builder().commonName("localhost").addSubjectAlternativeName(InetAddress.getByName("localhost").getCanonicalHostName()).build();
            return new HandshakeCertificates.Builder().heldCertificate(heldCertificateBuild, new X509Certificate[0]).addTrustedCertificate(heldCertificateBuild.certificate()).build();
        }
    }

    private TlsUtil() {
    }

    private final HandshakeCertificates getLocalhost() {
        return (HandshakeCertificates) localhost.getValue();
    }

    @n
    @k
    public static final HandshakeCertificates localhost() {
        return INSTANCE.getLocalhost();
    }

    private final KeyStore newEmptyKeyStore(String keyStoreType) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        if (keyStoreType == null) {
            keyStoreType = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(keyStoreType);
        keyStore.load(null, password);
        return keyStore;
    }

    @n
    @k
    public static final X509KeyManager newKeyManager(@l String keyStoreType, @l HeldCertificate heldCertificate, @k X509Certificate... intermediates) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStoreNewEmptyKeyStore = INSTANCE.newEmptyKeyStore(keyStoreType);
        if (heldCertificate != null) {
            Certificate[] certificateArr = new Certificate[intermediates.length + 1];
            certificateArr[0] = heldCertificate.certificate();
            C42756l.s(intermediates, 0, certificateArr, 0, 12);
            keyStoreNewEmptyKeyStore.setKeyEntry(UserTypeCode.PRIVATE, heldCertificate.keyPair().getPrivate(), password, certificateArr);
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStoreNewEmptyKeyStore, password);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                return (X509KeyManager) keyManager;
            }
        }
        throw new IllegalStateException("Unexpected key managers:".concat(Arrays.toString(keyManagers)).toString());
    }

    @n
    @k
    @IgnoreJRERequirement
    public static final X509TrustManager newTrustManager(@l String keyStoreType, @k List<? extends X509Certificate> trustedCertificates, @k List<String> insecureHosts) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStoreNewEmptyKeyStore = INSTANCE.newEmptyKeyStore(keyStoreType);
        int size = trustedCertificates.size();
        for (int i12 = 0; i12 < size; i12++) {
            keyStoreNewEmptyKeyStore.setCertificateEntry(c.g(i12, "cert_"), trustedCertificates.get(i12));
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStoreNewEmptyKeyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                if (insecureHosts.isEmpty()) {
                    return x509TrustManager;
                }
                return Platform.INSTANCE.isAndroid() ? new InsecureAndroidTrustManager(x509TrustManager, insecureHosts) : new InsecureExtendedTrustManager((X509ExtendedTrustManager) x509TrustManager, insecureHosts);
            }
        }
        throw new IllegalStateException("Unexpected trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @k
    public final char[] getPassword() {
        return password;
    }
}
