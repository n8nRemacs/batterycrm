package com.avito.android.help_center.help_center_request.di;

import Ir.C14150b;
import android.webkit.CookieManager;
import com.avito.android.C30277e1;
import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.help_center.E;
import com.avito.android.help_center.G;
import com.avito.android.help_center.H;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.help_center.J;
import com.avito.android.help_center.help_center_request.HelpCenterRequestFragment;
import com.avito.android.help_center.help_center_request.di.d;
import com.avito.android.help_center.help_center_request.di.g;
import com.avito.android.help_center.help_center_request.m;
import com.avito.android.help_center.o;
import com.avito.android.remote.interceptor.F0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.InterfaceC34319z;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.remote.l1;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;

/* compiled from: DaggerHelpCenterRequestComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class c {

    /* compiled from: DaggerHelpCenterRequestComponent.java */
    public static final class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public e f161767a;

        /* renamed from: b, reason: collision with root package name */
        public String f161768b;

        /* renamed from: c, reason: collision with root package name */
        public String f161769c;

        /* renamed from: d, reason: collision with root package name */
        public String f161770d;

        public b() {
        }

        @Override // com.avito.android.help_center.help_center_request.di.d.a
        public final d.a a(String str) {
            this.f161768b = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_request.di.d.a
        public final d.a b(String str) {
            this.f161769c = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_request.di.d.a
        public final d build() {
            t.a(e.class, this.f161767a);
            return new C4741c(this.f161767a, this.f161768b, this.f161769c, this.f161770d, null);
        }

        @Override // com.avito.android.help_center.help_center_request.di.d.a
        public final d.a c(String str) {
            this.f161770d = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_request.di.d.a
        public final d.a d(e eVar) {
            this.f161767a = eVar;
            return this;
        }
    }

    /* compiled from: DaggerHelpCenterRequestComponent.java */
    /* renamed from: com.avito.android.help_center.help_center_request.di.c$c, reason: collision with other inner class name */
    public static final class C4741c implements com.avito.android.help_center.help_center_request.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.help_center.help_center_request.di.e f161771a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f161772b;

        /* renamed from: c, reason: collision with root package name */
        public final u<CookieManager> f161773c = dagger.internal.g.d(g.a.f161806a);

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC34273b0> f161774d;

        /* renamed from: e, reason: collision with root package name */
        public final u<F0> f161775e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34319z> f161776f;

        /* renamed from: g, reason: collision with root package name */
        public final u<I> f161777g;

        /* renamed from: h, reason: collision with root package name */
        public final u<l1> f161778h;

        /* renamed from: i, reason: collision with root package name */
        public final u<U0> f161779i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47681a> f161780j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f161781k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f161782l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f161783m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H0> f161784n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f161785o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC30756m> f161786p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C30277e1> f161787q;

        /* renamed from: r, reason: collision with root package name */
        public final u<H> f161788r;

        /* renamed from: s, reason: collision with root package name */
        public final u<E> f161789s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f161790t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f161791u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.help_center.help_center_request.h> f161792v;

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$a */
        public static final class a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161793a;

            public a(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161793a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f161793a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$b */
        public static final class b implements u<InterfaceC34319z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161794a;

            public b(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161794a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161794a.Bj();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$c, reason: collision with other inner class name */
        public static final class C4742c implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161795a;

            public C4742c(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161795a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161795a.U2();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$d */
        public static final class d implements u<InterfaceC34273b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161796a;

            public d(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161796a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161796a.wd();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$e */
        public static final class e implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161797a;

            public e(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161797a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f161797a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$f */
        public static final class f implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161798a;

            public f(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161798a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161798a.C();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$g */
        public static final class g implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161799a;

            public g(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161799a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161799a.n0();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$h */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161800a;

            public h(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161800a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f161800a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$i */
        public static final class i implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161801a;

            public i(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161801a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f161801a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$j */
        public static final class j implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161802a;

            public j(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161802a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161802a.ji();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$k */
        public static final class k implements u<l1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161803a;

            public k(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161803a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161803a.Wg();
            }
        }

        /* compiled from: DaggerHelpCenterRequestComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_request.di.c$c$l */
        public static final class l implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_request.di.e f161804a;

            public l(com.avito.android.help_center.help_center_request.di.e eVar) {
                this.f161804a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161804a.I0();
            }
        }

        public C4741c(com.avito.android.help_center.help_center_request.di.e eVar, String str, String str2, String str3, a aVar) {
            this.f161771a = eVar;
            this.f161772b = new h(eVar);
            this.f161774d = new d(eVar);
            this.f161775e = new j(eVar);
            this.f161776f = new b(eVar);
            this.f161777g = new C4742c(eVar);
            this.f161778h = new k(eVar);
            this.f161779i = new l(eVar);
            this.f161780j = new g(eVar);
            u<com.avito.android.cookie_provider.b> uVarA = B.a(new com.avito.android.cookie_provider.d(new i(eVar)));
            this.f161782l = uVarA;
            this.f161785o = B.a(new C14150b(this.f161774d, this.f161775e, this.f161776f, this.f161777g, this.f161778h, this.f161779i, this.f161780j, uVarA, new a(eVar), new e(eVar)));
            this.f161786p = dagger.internal.g.d(o.a());
            u<H> uVarD = dagger.internal.g.d(new J(new f(eVar)));
            this.f161788r = uVarD;
            this.f161789s = dagger.internal.g.d(new G(uVarD));
            this.f161790t = dagger.internal.l.b(str);
            this.f161791u = dagger.internal.l.b(str2);
            this.f161792v = dagger.internal.g.d(new m(this.f161772b, this.f161773c, this.f161785o, this.f161786p, this.f161788r, this.f161789s, this.f161790t, this.f161791u, dagger.internal.l.b(str3)));
        }

        @Override // com.avito.android.help_center.help_center_request.di.d
        public final void a(HelpCenterRequestFragment helpCenterRequestFragment) {
            helpCenterRequestFragment.f161757n0 = this.f161792v.get();
            com.avito.android.help_center.help_center_request.di.e eVar = this.f161771a;
            helpCenterRequestFragment.f161758o0 = eVar.h();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            helpCenterRequestFragment.f161759p0 = interfaceC28373aA;
        }
    }

    public static d.a a() {
        return new b();
    }
}
