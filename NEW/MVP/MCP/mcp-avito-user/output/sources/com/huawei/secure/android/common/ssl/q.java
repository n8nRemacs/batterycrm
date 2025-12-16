package com.huawei.secure.android.common.ssl;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public class q implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            x509Certificate.getIssuerDN().getName();
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i12 = 0; i12 < x509CertificateArr.length; i12++) {
            x509CertificateArr2[i12] = x509CertificateArr[(x509CertificateArr.length - 1) - i12];
        }
        CertificateException e12 = new CertificateException("CBG root CA CertificateException");
        try {
            V01.d.a(x509CertificateArr2);
        } catch (InvalidKeyException e13) {
            e13.getMessage();
        } catch (NoSuchAlgorithmException e14) {
            e14.getMessage();
        } catch (NoSuchProviderException e15) {
            e15.getMessage();
        } catch (SignatureException e16) {
            e16.getMessage();
        } catch (CertificateException e17) {
            e12 = e17;
            e12.getMessage();
        }
        throw e12;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            new ArrayList();
            throw null;
        } catch (Exception e12) {
            e12.getMessage();
            return new X509Certificate[0];
        }
    }
}
