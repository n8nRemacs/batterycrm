package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes8.dex */
public final class c11 {
    @Y61.l
    public static final X509Certificate a(@Y61.k SslCertificate sslCertificate, @Y61.k CertificateFactory certificateFactory) throws CertificateException {
        byte[] byteArray;
        if (!kotlin.jvm.internal.L.f(certificateFactory.getType(), "X.509")) {
            certificateFactory.getType();
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState == null || (byteArray = bundleSaveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
            return null;
        } catch (CertificateException unused) {
            return null;
        }
    }
}
