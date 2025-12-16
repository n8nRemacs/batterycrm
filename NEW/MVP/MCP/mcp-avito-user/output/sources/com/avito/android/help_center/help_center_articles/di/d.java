package com.avito.android.help_center.help_center_articles.di;

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
import com.avito.android.help_center.help_center_articles.HelpCenterArticlesActivity;
import com.avito.android.help_center.help_center_articles.di.e;
import com.avito.android.help_center.help_center_articles.di.h;
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

/* compiled from: DaggerHelpCenterArticlesComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class d {

    /* compiled from: DaggerHelpCenterArticlesComponent.java */
    public static final class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public f f161684a;

        /* renamed from: b, reason: collision with root package name */
        public String f161685b;

        /* renamed from: c, reason: collision with root package name */
        public String f161686c;

        /* renamed from: d, reason: collision with root package name */
        public String f161687d;

        /* renamed from: e, reason: collision with root package name */
        public String f161688e;

        public b() {
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e.a a(String str) {
            this.f161686c = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e.a b(String str) {
            this.f161687d = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e build() {
            t.a(f.class, this.f161684a);
            t.a(String.class, this.f161685b);
            return new c(this.f161684a, this.f161685b, this.f161686c, this.f161687d, this.f161688e, null);
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e.a c(String str) {
            this.f161688e = str;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e.a d(f fVar) {
            this.f161684a = fVar;
            return this;
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e.a
        public final e.a e(String str) {
            str.getClass();
            this.f161685b = str;
            return this;
        }
    }

    /* compiled from: DaggerHelpCenterArticlesComponent.java */
    public static final class c implements com.avito.android.help_center.help_center_articles.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.help_center.help_center_articles.di.f f161689a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f161690b;

        /* renamed from: c, reason: collision with root package name */
        public final u<CookieManager> f161691c = dagger.internal.g.d(h.a.f161725a);

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC34273b0> f161692d;

        /* renamed from: e, reason: collision with root package name */
        public final u<F0> f161693e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34319z> f161694f;

        /* renamed from: g, reason: collision with root package name */
        public final u<I> f161695g;

        /* renamed from: h, reason: collision with root package name */
        public final u<l1> f161696h;

        /* renamed from: i, reason: collision with root package name */
        public final u<U0> f161697i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47681a> f161698j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f161699k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f161700l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f161701m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H0> f161702n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f161703o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC30756m> f161704p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C30277e1> f161705q;

        /* renamed from: r, reason: collision with root package name */
        public final u<H> f161706r;

        /* renamed from: s, reason: collision with root package name */
        public final u<E> f161707s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f161708t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f161709u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f161710v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.help_center.help_center_articles.e> f161711w;

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161712a;

            public a(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161712a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f161712a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class b implements u<InterfaceC34319z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161713a;

            public b(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161713a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161713a.Bj();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_articles.di.d$c$c, reason: collision with other inner class name */
        public static final class C4739c implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161714a;

            public C4739c(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161714a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161714a.U2();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        /* renamed from: com.avito.android.help_center.help_center_articles.di.d$c$d, reason: collision with other inner class name */
        public static final class C4740d implements u<InterfaceC34273b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161715a;

            public C4740d(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161715a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161715a.wd();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class e implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161716a;

            public e(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161716a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f161716a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class f implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161717a;

            public f(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161717a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161717a.C();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class g implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161718a;

            public g(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161718a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161718a.n0();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161719a;

            public h(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161719a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f161719a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class i implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161720a;

            public i(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161720a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f161720a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class j implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161721a;

            public j(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161721a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161721a.ji();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class k implements u<l1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161722a;

            public k(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161722a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161722a.Wg();
            }
        }

        /* compiled from: DaggerHelpCenterArticlesComponent.java */
        public static final class l implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.help_center_articles.di.f f161723a;

            public l(com.avito.android.help_center.help_center_articles.di.f fVar) {
                this.f161723a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161723a.I0();
            }
        }

        public c(com.avito.android.help_center.help_center_articles.di.f fVar, String str, String str2, String str3, String str4, a aVar) {
            this.f161689a = fVar;
            this.f161690b = new h(fVar);
            this.f161692d = new C4740d(fVar);
            this.f161693e = new j(fVar);
            this.f161694f = new b(fVar);
            this.f161695g = new C4739c(fVar);
            this.f161696h = new k(fVar);
            this.f161697i = new l(fVar);
            this.f161698j = new g(fVar);
            u<com.avito.android.cookie_provider.b> uVarA = B.a(new com.avito.android.cookie_provider.d(new i(fVar)));
            this.f161700l = uVarA;
            this.f161703o = B.a(new C14150b(this.f161692d, this.f161693e, this.f161694f, this.f161695g, this.f161696h, this.f161697i, this.f161698j, uVarA, new a(fVar), new e(fVar)));
            this.f161704p = dagger.internal.g.d(o.a());
            u<H> uVarD = dagger.internal.g.d(new J(new f(fVar)));
            this.f161706r = uVarD;
            this.f161707s = dagger.internal.g.d(new G(uVarD));
            this.f161708t = dagger.internal.l.a(str);
            this.f161709u = dagger.internal.l.b(str2);
            this.f161710v = dagger.internal.l.b(str3);
            this.f161711w = dagger.internal.g.d(new com.avito.android.help_center.help_center_articles.l(this.f161690b, this.f161691c, this.f161703o, this.f161704p, this.f161706r, this.f161707s, this.f161708t, this.f161709u, this.f161710v, dagger.internal.l.b(str4)));
        }

        @Override // com.avito.android.help_center.help_center_articles.di.e
        public final void a(HelpCenterArticlesActivity helpCenterArticlesActivity) {
            helpCenterArticlesActivity.f161677m = this.f161711w.get();
            com.avito.android.help_center.help_center_articles.di.f fVar = this.f161689a;
            helpCenterArticlesActivity.f161678n = fVar.h();
            InterfaceC28373a interfaceC28373aA = fVar.a();
            t.c(interfaceC28373aA);
            helpCenterArticlesActivity.f161679o = interfaceC28373aA;
        }
    }

    public static e.a a() {
        return new b();
    }
}
