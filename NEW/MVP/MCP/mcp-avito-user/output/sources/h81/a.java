package H81;

import android.content.res.Resources;
import com.avito.android.R;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Z;
import kotlin.collections.C42745f0;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final List f6963d = C42745f0.U(Integer.valueOf(R.raw.sberca_ext_web), Integer.valueOf(R.raw.sberca_root_ext), Integer.valueOf(R.raw.sberca_test_ext), Integer.valueOf(R.raw.sberca_test_root_ext), Integer.valueOf(R.raw.rusca_sub_rsa2022), Integer.valueOf(R.raw.rusca_root_rsa2022), Integer.valueOf(R.raw.actalis_root_ca), Integer.valueOf(R.raw.actalis_webclickstream), Integer.valueOf(R.raw.id_sber_ru_ext), Integer.valueOf(R.raw.id_sber_ru_root), Integer.valueOf(R.raw.sberca_int), Integer.valueOf(R.raw.sberca_root_int), Integer.valueOf(R.raw.sberca_ext), Integer.valueOf(R.raw.sberca_test_int_g2), Integer.valueOf(R.raw.sberca_test_int), Integer.valueOf(R.raw.sberca_test_root_int), Integer.valueOf(R.raw.sberca_test_ext_g2));

    /* renamed from: a, reason: collision with root package name */
    public final Resources f6964a;

    /* renamed from: b, reason: collision with root package name */
    public X509TrustManager f6965b;

    /* renamed from: c, reason: collision with root package name */
    public X509TrustManager f6966c;

    public a(Resources resources) {
        this.f6964a = resources;
    }

    public static KeyStore a(Resources resources) throws Exception {
        TrustManager[] trustManagers;
        InputStream inputStreamOpenRawResource;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                InputStream inputStream = null;
                keyStore.load(null, null);
                Iterator it = f6963d.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    try {
                        try {
                            inputStreamOpenRawResource = resources.openRawResource(iIntValue);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (KeyStoreException e12) {
                        e = e12;
                    } catch (CertificateException e13) {
                        e = e13;
                    }
                    try {
                        keyStore.setCertificateEntry(resources.getResourceName(iIntValue), certificateFactory.generateCertificate(inputStreamOpenRawResource));
                        if (inputStreamOpenRawResource != null) {
                            try {
                                inputStreamOpenRawResource.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (KeyStoreException e14) {
                        e = e14;
                        throw new Exception("KeyStore is inited already, aliases aren't repeated certainly", e);
                    } catch (CertificateException e15) {
                        e = e15;
                        throw new Exception("Certificate is certainly valid", e);
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStreamOpenRawResource;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    trustManagers = trustManagerFactory.getTrustManagers();
                } catch (KeyStoreException | NoSuchAlgorithmException unused3) {
                }
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509Certificate[] acceptedIssuers = ((X509TrustManager) trustManager).getAcceptedIssuers();
                        int length = acceptedIssuers.length;
                        for (int i12 = 0; i12 < length; i12++) {
                            keyStore.setCertificateEntry("item_" + i12, acceptedIssuers[i12]);
                        }
                        return keyStore;
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
            } catch (IOException e16) {
                throw new Exception("There must be no error with this KeyStore's format", e16);
            } catch (KeyStoreException e17) {
                throw new Exception("KeyStore with default type can be always created", e17);
            } catch (NoSuchAlgorithmException e18) {
                throw new Exception("KeyStore is empty now, there is no need for integrity checking algorithm", e18);
            } catch (CertificateException e19) {
                throw new Exception("There are no certificates in KeyStore, so no exception may be thrown", e19);
            }
        } catch (CertificateException e22) {
            throw new Exception("X.509 is supported everywhere", e22);
        }
    }

    public final X509TrustManager b() throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(a(this.f6964a));
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
                if (x509TrustManager != null) {
                    return x509TrustManager;
                }
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.Z$b] */
    public final X509TrustManager c() {
        X509TrustManager bVar;
        try {
            int i12 = Z.f406624c;
            bVar = this.f6966c;
            if (bVar == null) {
                bVar = b();
                this.f6966c = bVar;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return bVar;
    }
}
