package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.th;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.zs;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class bq0 implements Cloneable, th.a {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f384022B = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final gq f384024a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final gl f384025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final List<m70> f384026c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final List<m70> f384027d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final zs.b f384028e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f384029f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final wc f384030g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f384031h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f384032i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final em f384033j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    private final lr f384034k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    private final ProxySelector f384035l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    private final wc f384036m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    private final SocketFactory f384037n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f384038o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    private final X509TrustManager f384039p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    private final List<il> f384040q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    private final List<sv0> f384041r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    private final aq0 f384042s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    private final ki f384043t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    private final ji f384044u;

    /* renamed from: v, reason: collision with root package name */
    private final int f384045v;

    /* renamed from: w, reason: collision with root package name */
    private final int f384046w;

    /* renamed from: x, reason: collision with root package name */
    private final int f384047x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    private final x01 f384048y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    private static final List<sv0> f384023z = qc1.a(sv0.f390036e, sv0.f390034c);

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    private static final List<il> f384021A = qc1.a(il.f386510e, il.f386511f);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private gq f384049a = new gq();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private gl f384050b = new gl();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final ArrayList f384051c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        private final ArrayList f384052d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        private zs.b f384053e = qc1.a(zs.f392345a);

        /* renamed from: f, reason: collision with root package name */
        private boolean f384054f = true;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        private wc f384055g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f384056h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f384057i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        private em f384058j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        private lr f384059k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        private wc f384060l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        private SocketFactory f384061m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        private SSLSocketFactory f384062n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        private X509TrustManager f384063o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        private List<il> f384064p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        private List<? extends sv0> f384065q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        private aq0 f384066r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        private ki f384067s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        private ji f384068t;

        /* renamed from: u, reason: collision with root package name */
        private int f384069u;

        /* renamed from: v, reason: collision with root package name */
        private int f384070v;

        /* renamed from: w, reason: collision with root package name */
        private int f384071w;

        public a() {
            wc wcVar = wc.f391376a;
            this.f384055g = wcVar;
            this.f384056h = true;
            this.f384057i = true;
            this.f384058j = em.f385004a;
            this.f384059k = lr.f387697a;
            this.f384060l = wcVar;
            this.f384061m = SocketFactory.getDefault();
            int i12 = bq0.f384022B;
            this.f384064p = b.a();
            this.f384065q = b.b();
            this.f384066r = aq0.f383629a;
            this.f384067s = ki.f387161c;
            this.f384069u = 10000;
            this.f384070v = 10000;
            this.f384071w = 10000;
        }

        @Y61.k
        public final a a() {
            this.f384056h = true;
            return this;
        }

        @Y61.k
        public final wc b() {
            return this.f384055g;
        }

        @Y61.l
        public final ji c() {
            return this.f384068t;
        }

        @Y61.k
        public final ki d() {
            return this.f384067s;
        }

        public final int e() {
            return this.f384069u;
        }

        @Y61.k
        public final gl f() {
            return this.f384050b;
        }

        @Y61.k
        public final List<il> g() {
            return this.f384064p;
        }

        @Y61.k
        public final em h() {
            return this.f384058j;
        }

        @Y61.k
        public final gq i() {
            return this.f384049a;
        }

        @Y61.k
        public final lr j() {
            return this.f384059k;
        }

        @Y61.k
        public final zs.b k() {
            return this.f384053e;
        }

        public final boolean l() {
            return this.f384056h;
        }

        public final boolean m() {
            return this.f384057i;
        }

        @Y61.k
        public final aq0 n() {
            return this.f384066r;
        }

        @Y61.k
        public final ArrayList o() {
            return this.f384051c;
        }

        @Y61.k
        public final ArrayList p() {
            return this.f384052d;
        }

        @Y61.k
        public final List<sv0> q() {
            return this.f384065q;
        }

        @Y61.k
        public final wc r() {
            return this.f384060l;
        }

        public final int s() {
            return this.f384070v;
        }

        public final boolean t() {
            return this.f384054f;
        }

        @Y61.k
        public final SocketFactory u() {
            return this.f384061m;
        }

        @Y61.l
        public final SSLSocketFactory v() {
            return this.f384062n;
        }

        public final int w() {
            return this.f384071w;
        }

        @Y61.l
        public final X509TrustManager x() {
            return this.f384063o;
        }

        @Y61.k
        public final a a(@Y61.k SSLSocketFactory sSLSocketFactory, @Y61.k X509TrustManager x509TrustManager) {
            if (sSLSocketFactory.equals(this.f384062n)) {
                x509TrustManager.equals(this.f384063o);
            }
            this.f384062n = sSLSocketFactory;
            this.f384068t = ji.a.a(x509TrustManager);
            this.f384063o = x509TrustManager;
            return this;
        }

        @Y61.k
        public final a b(long j12, @Y61.k TimeUnit timeUnit) {
            this.f384070v = qc1.a(j12, timeUnit);
            return this;
        }

        @Y61.k
        public final a a(long j12, @Y61.k TimeUnit timeUnit) {
            this.f384069u = qc1.a(j12, timeUnit);
            return this;
        }
    }

    public static final class b {
        @Y61.k
        public static List a() {
            return bq0.f384021A;
        }

        @Y61.k
        public static List b() {
            return bq0.f384023z;
        }
    }

    public bq0(@Y61.k a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f384024a = aVar.i();
        this.f384025b = aVar.f();
        this.f384026c = qc1.b(aVar.o());
        this.f384027d = qc1.b(aVar.p());
        this.f384028e = aVar.k();
        this.f384029f = aVar.t();
        this.f384030g = aVar.b();
        this.f384031h = aVar.l();
        this.f384032i = aVar.m();
        this.f384033j = aVar.h();
        this.f384034k = aVar.j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f384035l = proxySelector == null ? rp0.f389602a : proxySelector;
        this.f384036m = aVar.r();
        this.f384037n = aVar.u();
        List<il> listG = aVar.g();
        this.f384040q = listG;
        this.f384041r = aVar.q();
        this.f384042s = aVar.n();
        this.f384045v = aVar.e();
        this.f384046w = aVar.s();
        this.f384047x = aVar.w();
        this.f384048y = new x01();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            this.f384038o = null;
            this.f384044u = null;
            this.f384039p = null;
            this.f384043t = ki.f387161c;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (((il) it.next()).a()) {
                    if (aVar.v() != null) {
                        this.f384038o = aVar.v();
                        ji jiVarC = aVar.c();
                        this.f384044u = jiVarC;
                        this.f384039p = aVar.x();
                        this.f384043t = aVar.d().a(jiVarC);
                    } else {
                        int i12 = ts0.f390303c;
                        ts0.a.b().getClass();
                        X509TrustManager x509TrustManagerC = ts0.c();
                        this.f384039p = x509TrustManagerC;
                        ts0.a.b().getClass();
                        this.f384038o = ts0.c(x509TrustManagerC);
                        ji jiVarA = ji.a.a(x509TrustManagerC);
                        this.f384044u = jiVarA;
                        this.f384043t = aVar.d().a(jiVarA);
                    }
                }
            }
            this.f384038o = null;
            this.f384044u = null;
            this.f384039p = null;
            this.f384043t = ki.f387161c;
        }
        y();
    }

    private final void y() {
        if (this.f384026c.contains(null)) {
            StringBuilder sbA = Cif.a("Null interceptor: ");
            sbA.append(this.f384026c);
            throw new IllegalStateException(sbA.toString().toString());
        }
        if (this.f384027d.contains(null)) {
            StringBuilder sbA2 = Cif.a("Null network interceptor: ");
            sbA2.append(this.f384027d);
            throw new IllegalStateException(sbA2.toString().toString());
        }
        List<il> list = this.f384040q;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((il) it.next()).a()) {
                    if (this.f384038o == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f384044u == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f384039p == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f384038o != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f384044u != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f384039p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.L.f(this.f384043t, ki.f387161c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @X41.i
    @Y61.k
    public final wc c() {
        return this.f384030g;
    }

    @Y61.k
    public final Object clone() {
        return super.clone();
    }

    @X41.i
    @Y61.k
    public final ki d() {
        return this.f384043t;
    }

    @X41.i
    public final int e() {
        return this.f384045v;
    }

    @X41.i
    @Y61.k
    public final gl f() {
        return this.f384025b;
    }

    @X41.i
    @Y61.k
    public final List<il> g() {
        return this.f384040q;
    }

    @X41.i
    @Y61.k
    public final em h() {
        return this.f384033j;
    }

    @X41.i
    @Y61.k
    public final gq i() {
        return this.f384024a;
    }

    @X41.i
    @Y61.k
    public final lr j() {
        return this.f384034k;
    }

    @X41.i
    @Y61.k
    public final zs.b k() {
        return this.f384028e;
    }

    @X41.i
    public final boolean l() {
        return this.f384031h;
    }

    @X41.i
    public final boolean m() {
        return this.f384032i;
    }

    @Y61.k
    public final x01 n() {
        return this.f384048y;
    }

    @X41.i
    @Y61.k
    public final aq0 o() {
        return this.f384042s;
    }

    @X41.i
    @Y61.k
    public final List<m70> p() {
        return this.f384026c;
    }

    @X41.i
    @Y61.k
    public final List<m70> q() {
        return this.f384027d;
    }

    @X41.i
    @Y61.k
    public final List<sv0> r() {
        return this.f384041r;
    }

    @X41.i
    @Y61.k
    public final wc s() {
        return this.f384036m;
    }

    @X41.i
    @Y61.k
    public final ProxySelector t() {
        return this.f384035l;
    }

    @X41.i
    public final int u() {
        return this.f384046w;
    }

    @X41.i
    public final boolean v() {
        return this.f384029f;
    }

    @X41.i
    @Y61.k
    public final SocketFactory w() {
        return this.f384037n;
    }

    @X41.i
    @Y61.k
    public final SSLSocketFactory x() {
        SSLSocketFactory sSLSocketFactory = this.f384038o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @X41.i
    public final int z() {
        return this.f384047x;
    }

    @Override // com.yandex.mobile.ads.impl.th.a
    @Y61.k
    public final bx0 a(@Y61.k ry0 ry0Var) {
        return new bx0(this, ry0Var, false);
    }

    public bq0() {
        this(new a());
    }
}
