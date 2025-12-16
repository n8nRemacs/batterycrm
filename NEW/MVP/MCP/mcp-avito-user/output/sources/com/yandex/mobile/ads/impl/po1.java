package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* loaded from: classes8.dex */
public final class po1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bn f388917a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private KeyStore f388919c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private X509TrustManager f388920d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final InterfaceC42726C f388918b = C42727D.c(a.f388922a);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final Object f388921e = new Object();

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<X509TrustManager> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f388922a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final X509TrustManager invoke() throws NoSuchAlgorithmException, KeyStoreException {
            X509TrustManager x509TrustManagerA = bb1.a((KeyStore) null);
            if (x509TrustManagerA != null) {
                return x509TrustManagerA;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public po1(@Y61.k bn bnVar) {
        this.f388917a = bnVar;
    }

    private final void b() {
        if (!Thread.holdsLock(this.f388921e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    private final X509TrustManager d() {
        return (X509TrustManager) this.f388918b.getValue();
    }

    public final void a(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        d().checkClientTrusted(x509CertificateArr, str);
    }

    @Y61.k
    public final X509Certificate[] c() {
        return d().getAcceptedIssuers();
    }

    public final void a(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        if (bb1.a()) {
            z9.a(d(), x509CertificateArr, str, socket);
        } else {
            d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void b(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str) throws CertificateException {
        kotlin.G0 g02;
        try {
            d().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e12) {
            synchronized (this.f388921e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f388920d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        g02 = kotlin.G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 != null) {
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                        return;
                    }
                    throw e12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        if (bb1.a()) {
            z9.a(d(), x509CertificateArr, str, sSLEngine);
        } else {
            d().checkClientTrusted(x509CertificateArr, str);
        }
    }

    private final void a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore;
        b();
        b();
        if (this.f388919c == null) {
            int i12 = bb1.f383878b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore != null) {
                byte[][] bArrA = this.f388917a.a();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : bArrA) {
                    X509Certificate x509CertificateA = bb1.a(bArr);
                    if (x509CertificateA != null) {
                        arrayList.add(x509CertificateA);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                    } catch (KeyStoreException unused3) {
                    }
                }
                keyStore2 = keyStore;
            }
            this.f388919c = keyStore2;
        }
        b();
        if (this.f388920d == null) {
            b();
            if (this.f388919c != null) {
                b();
                this.f388920d = bb1.a(this.f388919c);
            }
        }
    }

    public final void b(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l Socket socket) throws CertificateException {
        kotlin.G0 g02;
        try {
            X509TrustManager x509TrustManagerD = d();
            if (bb1.a()) {
                z9.b(x509TrustManagerD, x509CertificateArr, str, socket);
            } else {
                x509TrustManagerD.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e12) {
            synchronized (this.f388921e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f388920d;
                    if (x509TrustManager != null) {
                        if (bb1.a()) {
                            z9.b(x509TrustManager, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        }
                        g02 = kotlin.G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 != null) {
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                        return;
                    }
                    throw e12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(@Y61.l X509Certificate[] x509CertificateArr, @Y61.l String str, @Y61.l SSLEngine sSLEngine) throws CertificateException {
        kotlin.G0 g02;
        try {
            X509TrustManager x509TrustManagerD = d();
            if (bb1.a()) {
                z9.b(x509TrustManagerD, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManagerD.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e12) {
            synchronized (this.f388921e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f388920d;
                    if (x509TrustManager != null) {
                        if (bb1.a()) {
                            z9.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        }
                        g02 = kotlin.G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 != null) {
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                        return;
                    }
                    throw e12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
