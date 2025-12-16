package com.yandex.mobile.ads.impl;

import j.InterfaceC42155k;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class bb1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final InterfaceC42726C f383877a = C42727D.c(a.f383879a);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f383878b = 0;

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<CertificateFactory> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f383879a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final CertificateFactory invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    @InterfaceC42155k
    public static final boolean a() {
        return true;
    }

    @Y61.l
    public static final X509TrustManager a(@Y61.l KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) C42745f0.G(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Y61.l
    public static final X509Certificate a(@Y61.k byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f383877a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }
}
