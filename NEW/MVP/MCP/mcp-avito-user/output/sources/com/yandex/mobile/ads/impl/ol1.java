package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* loaded from: classes8.dex */
public final class ol1 implements nl1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final InterfaceC42726C f388583a = C42727D.c(a.f388584a);

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<CertificateFactory> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f388584a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance("X.509");
        }
    }

    @Override // com.yandex.mobile.ads.impl.nl1
    public final boolean a(@Y61.k Context context, @Y61.k SslError sslError) throws CertificateException {
        v11 v11VarA = q21.b().a(context);
        if (v11VarA == null || !v11VarA.Q()) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : c11.a(sslError.getCertificate(), (CertificateFactory) this.f388583a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        try {
            d90.b(an.a(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
