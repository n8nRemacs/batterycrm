package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p91;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class cz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final p91 f384490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final si f384491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final List<Certificate> f384492c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final InterfaceC42726C f384493d;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.cz$a$a, reason: collision with other inner class name */
        public static final class C10974a extends kotlin.jvm.internal.N implements Y41.a<List<? extends Certificate>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f384494a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10974a(List<? extends Certificate> list) {
                super(0);
                this.f384494a = list;
            }

            @Override // Y41.a
            public final List<? extends Certificate> invoke() {
                return this.f384494a;
            }
        }

        @X41.n
        @X41.i
        @Y61.k
        public static cz a(@Y61.k SSLSession sSLSession) throws IOException {
            List listA;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(up1.a("cipherSuite == ", cipherSuite));
            }
            si siVarA = si.f389950b.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            p91 p91VarA = p91.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listA = peerCertificates != null ? qc1.a(Arrays.copyOf(peerCertificates, peerCertificates.length)) : C42784z0.f406748b;
            } catch (SSLPeerUnverifiedException unused) {
                listA = C42784z0.f406748b;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new cz(p91VarA, siVarA, localCertificates != null ? qc1.a(Arrays.copyOf(localCertificates, localCertificates.length)) : C42784z0.f406748b, new C10974a(listA));
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends Certificate>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a<List<Certificate>> f384495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f384495a = aVar;
        }

        @Override // Y41.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.f384495a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C42784z0.f406748b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cz(@Y61.k p91 p91Var, @Y61.k si siVar, @Y61.k List<? extends Certificate> list, @Y61.k Y41.a<? extends List<? extends Certificate>> aVar) {
        this.f384490a = p91Var;
        this.f384491b = siVar;
        this.f384492c = list;
        this.f384493d = C42727D.c(new b(aVar));
    }

    @X41.i
    @Y61.k
    public final si a() {
        return this.f384491b;
    }

    @X41.i
    @Y61.k
    public final List<Certificate> b() {
        return this.f384492c;
    }

    @X41.i
    @Y61.k
    public final List<Certificate> c() {
        return (List) this.f384493d.getValue();
    }

    @X41.i
    @Y61.k
    public final p91 d() {
        return this.f384490a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof cz) {
            cz czVar = (cz) obj;
            if (czVar.f384490a == this.f384490a && kotlin.jvm.internal.L.f(czVar.f384491b, this.f384491b) && kotlin.jvm.internal.L.f(czVar.c(), c()) && kotlin.jvm.internal.L.f(czVar.f384492c, this.f384492c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f384492c.hashCode() + ((c().hashCode() + ((this.f384491b.hashCode() + ((this.f384490a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        List<Certificate> listC = c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (Certificate certificate : listC) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sbA = Cif.a("Handshake{tlsVersion=");
        sbA.append(this.f384490a);
        sbA.append(" cipherSuite=");
        sbA.append(this.f384491b);
        sbA.append(" peerCertificates=");
        sbA.append(string);
        sbA.append(" localCertificates=");
        List<Certificate> list = this.f384492c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        return androidx.compose.ui.graphics.colorspace.e.p(sbA, arrayList2, '}');
    }
}
