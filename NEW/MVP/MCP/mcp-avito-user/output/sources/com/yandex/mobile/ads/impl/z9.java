package com.yandex.mobile.ads.impl;

import j.InterfaceC42164u;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

@X41.i
@j.X
/* loaded from: classes8.dex */
public final class z9 {
    @InterfaceC42164u
    @Y61.k
    public static final oo1 a(@Y61.k bn bnVar) {
        return new on1(bnVar);
    }

    @InterfaceC42164u
    public static final void b(@Y61.k X509TrustManager x509TrustManager, @Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @InterfaceC42164u
    public static final void a(@Y61.k X509TrustManager x509TrustManager, @Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @InterfaceC42164u
    public static final void b(@Y61.k X509TrustManager x509TrustManager, @Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @InterfaceC42164u
    public static final void a(@Y61.k X509TrustManager x509TrustManager, @Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        if (x509TrustManager instanceof X509ExtendedTrustManager) {
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }
}
