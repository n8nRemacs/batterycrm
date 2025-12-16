package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;
import okio.C44805o;

/* loaded from: classes8.dex */
public final class ki {

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final ki f387161c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Set<c> f387162a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final ji f387163b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final ArrayList f387164a = new ArrayList();

        @Y61.k
        public final ki a() {
            return new ki(C42745f0.P0(this.f387164a));
        }
    }

    public static final class b {
        @X41.n
        @Y61.k
        public static String a(@Y61.k X509Certificate x509Certificate) {
            StringBuilder sbA = Cif.a("sha256/");
            sbA.append(c(x509Certificate).a());
            return sbA.toString();
        }

        @X41.n
        @Y61.k
        public static C44805o b(@Y61.k X509Certificate x509Certificate) {
            return C44805o.a.d(C44805o.f420139e, x509Certificate.getPublicKey().getEncoded()).c("SHA-1");
        }

        @X41.n
        @Y61.k
        public static C44805o c(@Y61.k X509Certificate x509Certificate) {
            return C44805o.a.d(C44805o.f420139e, x509Certificate.getPublicKey().getEncoded()).c("SHA-256");
        }
    }

    public static final class c {
        public static boolean a(@Y61.k String str) {
            if (C43066x.h0(null, "**.", false) || C43066x.h0(null, "*.", false)) {
                throw null;
            }
            return str.equals(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.a<List<? extends X509Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f387166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f387167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Certificate> list, String str) {
            super(0);
            this.f387166b = list;
            this.f387167c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<? extends java.security.cert.X509Certificate> invoke() {
            /*
                r3 = this;
                com.yandex.mobile.ads.impl.ki r0 = com.yandex.mobile.ads.impl.ki.this
                com.yandex.mobile.ads.impl.ji r0 = r0.a()
                if (r0 == 0) goto L12
                java.util.List<java.security.cert.Certificate> r1 = r3.f387166b
                java.lang.String r2 = r3.f387167c
                java.util.List r0 = r0.a(r2, r1)
                if (r0 != 0) goto L14
            L12:
                java.util.List<java.security.cert.Certificate> r0 = r3.f387166b
            L14:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.C42745f0.q(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L23:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L23
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ki.d.invoke():java.lang.Object");
        }
    }

    public ki(@Y61.k Set<c> set, @Y61.l ji jiVar) {
        this.f387162a = set;
        this.f387163b = jiVar;
    }

    public final void a(@Y61.k String str, @Y61.k Y41.a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        Set<c> set = this.f387162a;
        List<c> arrayList = C42784z0.f406748b;
        for (Object obj : set) {
            ((c) obj).getClass();
            if (c.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                kotlin.jvm.internal.v0.b(arrayList).add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = aVar.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            Iterator it = arrayList.iterator();
            C44805o c44805oC = null;
            C44805o c44805oB = null;
            while (it.hasNext()) {
                ((c) it.next()).getClass();
                if (kotlin.jvm.internal.L.f(null, "sha256")) {
                    if (c44805oC == null) {
                        c44805oC = b.c(x509Certificate);
                    }
                    if (kotlin.jvm.internal.L.f(null, c44805oC)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.L.f(null, "sha1")) {
                        throw new AssertionError(up1.a("unsupported hashAlgorithm: ", null));
                    }
                    if (c44805oB == null) {
                        c44805oB = b.b(x509Certificate);
                    }
                    if (kotlin.jvm.internal.L.f(null, c44805oB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(b.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (c cVar : arrayList) {
            sb2.append("\n    ");
            sb2.append(cVar);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof ki) {
            ki kiVar = (ki) obj;
            if (kotlin.jvm.internal.L.f(kiVar.f387162a, this.f387162a) && kotlin.jvm.internal.L.f(kiVar.f387163b, this.f387163b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG2 = androidx.media3.exoplayer.analytics.m.g(this.f387162a, 1517, 41);
        ji jiVar = this.f387163b;
        return iG2 + (jiVar != null ? jiVar.hashCode() : 0);
    }

    public /* synthetic */ ki(Set set) {
        this(set, null);
    }

    @Y61.l
    public final ji a() {
        return this.f387163b;
    }

    public final void a(@Y61.k String str, @Y61.k List<? extends Certificate> list) {
        a(str, new d(list, str));
    }

    @Y61.k
    public final ki a(@Y61.k ji jiVar) {
        return kotlin.jvm.internal.L.f(this.f387163b, jiVar) ? this : new ki(this.f387162a, jiVar);
    }
}
