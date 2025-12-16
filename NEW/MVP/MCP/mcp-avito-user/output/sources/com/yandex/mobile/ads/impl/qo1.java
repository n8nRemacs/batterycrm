package com.yandex.mobile.ads.impl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* loaded from: classes8.dex */
public final class qo1 implements oo1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final po1 f389276a;

    public qo1(@Y61.k kn1 kn1Var) {
        this.f389276a = new po1(kn1Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        this.f389276a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        this.f389276a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @Y61.k
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f389276a.c();
    }
}
