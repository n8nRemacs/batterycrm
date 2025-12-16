package com.yandex.mobile.ads.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class ln1 extends wo {

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f387586s;

    public ln1(@Y61.l String str, int i12, int i13, boolean z12, @Y61.l h10 h10Var, @Y61.l SSLSocketFactory sSLSocketFactory) {
        super(str, i12, i13, z12, h10Var);
        this.f387586s = sSLSocketFactory;
    }

    @Override // com.yandex.mobile.ads.impl.wo
    @Y61.k
    public final HttpURLConnection a(@Y61.k URL url) {
        HttpURLConnection httpURLConnectionA = super.a(url);
        SSLSocketFactory sSLSocketFactory = this.f387586s;
        if (sSLSocketFactory != null && (httpURLConnectionA instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnectionA).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionA;
    }
}
