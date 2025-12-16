package com.yandex.runtime.network.internal;

import android.net.http.X509TrustManagerExtensions;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class CertificateVerifier {
    private static X509Certificate[] decodeChain(byte[][] bArr) throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            X509Certificate[] x509CertificateArr = new X509Certificate[bArr.length];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                x509CertificateArr[i12] = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr[i12]));
            }
            return x509CertificateArr;
        } catch (CertificateException unused) {
            return null;
        }
    }

    private static X509TrustManager getTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManager[] trustManagers;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            trustManagers = trustManagerFactory.getTrustManagers();
        } catch (KeyStoreException | NoSuchAlgorithmException unused) {
        }
        if (trustManagers == null) {
            return null;
        }
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static boolean verify(byte[][] bArr) throws CertificateException {
        X509TrustManager trustManager;
        X509Certificate[] x509CertificateArrDecodeChain = decodeChain(bArr);
        if (x509CertificateArrDecodeChain == null || (trustManager = getTrustManager()) == null) {
            return false;
        }
        try {
            new X509TrustManagerExtensions(trustManager).checkServerTrusted(x509CertificateArrDecodeChain, "TLS", "");
            return true;
        } catch (IllegalArgumentException e12) {
            e12.getMessage();
            return false;
        } catch (CertificateException e13) {
            e13.getMessage();
            return false;
        }
    }
}
