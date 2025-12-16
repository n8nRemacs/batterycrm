package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

@j.X
/* loaded from: classes8.dex */
public final class on1 extends X509ExtendedTrustManager implements oo1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final po1 f388597a;

    public on1(@Y61.k bn bnVar) {
        this.f388597a = new po1(bnVar);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        this.f388597a.a(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        this.f388597a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @Y61.k
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f388597a.c();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        this.f388597a.a(x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        this.f388597a.b(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        this.f388597a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        this.f388597a.b(x509CertificateArr, str, sSLEngine);
    }
}
