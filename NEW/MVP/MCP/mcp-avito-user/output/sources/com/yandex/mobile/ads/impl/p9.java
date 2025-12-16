package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class p9 extends ji {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final X509TrustManager f388741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final X509TrustManagerExtensions f388742b;

    public static final class a {
        @Y61.l
        public static p9 a(@Y61.k X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new p9(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public p9(@Y61.k X509TrustManager x509TrustManager, @Y61.k X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f388741a = x509TrustManager;
        this.f388742b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.ji
    @Y61.k
    public final List a(@Y61.k String str, @Y61.k List list) throws SSLPeerUnverifiedException {
        try {
            return this.f388742b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e12) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e12.getMessage());
            sSLPeerUnverifiedException.initCause(e12);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof p9) && ((p9) obj).f388741a == this.f388741a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f388741a);
    }
}
