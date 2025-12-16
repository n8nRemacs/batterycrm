package com.avito.android.authorization.auth.di;

import Sm0.C15204c;
import Zd.p;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.auth.AuthFragment;
import com.avito.android.authorization.auth.C28640t;
import com.avito.android.authorization.auth.C28643w;
import com.avito.android.authorization.auth.InterfaceC28636o;
import com.avito.android.authorization.auth.InterfaceC28641u;
import com.avito.android.authorization.auth.InterfaceC28644x;
import com.avito.android.authorization.auth.auth_socials.s;
import com.avito.android.authorization.auth.auth_socials.w;
import com.avito.android.authorization.auth.di.b;
import com.avito.android.authorization.auth.e0;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.social.C35011c;
import com.avito.android.social.C35016h;
import com.avito.android.social.C35019k;
import com.avito.android.social.C35033z;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35014f;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.M;
import com.avito.android.social.S;
import com.avito.android.social.V;
import com.avito.android.social.X;
import com.avito.android.social.Z;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import java.util.Map;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerAuthComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class l {

    /* compiled from: DaggerAuthComponent.java */
    public static final class b implements com.avito.android.authorization.auth.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.authorization.auth.auth_socials.k> f92942A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.authorization.auth.auth_socials.d f92943B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.authorization.auth.auth_socials.b f92944C;

        /* renamed from: D, reason: collision with root package name */
        public final u<M> f92945D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.social.button.g> f92946E;

        /* renamed from: F, reason: collision with root package name */
        public final u<Context> f92947F;

        /* renamed from: G, reason: collision with root package name */
        public final u<InterfaceC35029v> f92948G;

        /* renamed from: H, reason: collision with root package name */
        public final u<X> f92949H;

        /* renamed from: I, reason: collision with root package name */
        public final u<R0> f92950I;

        /* renamed from: J, reason: collision with root package name */
        public final u<S> f92951J;

        /* renamed from: K, reason: collision with root package name */
        public final u<InterfaceC35017i> f92952K;

        /* renamed from: L, reason: collision with root package name */
        public final u<InterfaceC35009a> f92953L;

        /* renamed from: M, reason: collision with root package name */
        public final u<InterfaceC35014f> f92954M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC35013e> f92955N;

        /* renamed from: O, reason: collision with root package name */
        public final u<Map<String, D>> f92956O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.authorization.auth.auth_socials.u f92957P;

        /* renamed from: Q, reason: collision with root package name */
        public final w f92958Q;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.auth.di.c f92959a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f92960b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27663a> f92961c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B3.c> f92962d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f92963e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C40806a> f92964f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f92965g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28636o> f92966h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f92967i;

        /* renamed from: j, reason: collision with root package name */
        public final C15204c f92968j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f92969k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C28478k> f92970l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f92971m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35741a1> f92972n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C50648b> f92973o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f92974p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f92975q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC30274a> f92976r;

        /* renamed from: s, reason: collision with root package name */
        public final u<p> f92977s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.credman.i> f92978t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f92979u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f92980v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28644x> f92981w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC28641u> f92982x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC34258d> f92983y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.authorization.auth.auth_socials.h> f92984z;

        /* compiled from: DaggerAuthComponent.java */
        public static final class a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92985a;

            public a(com.avito.android.authorization.auth.di.c cVar) {
                this.f92985a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f92985a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        /* renamed from: com.avito.android.authorization.auth.di.l$b$b, reason: collision with other inner class name */
        public static final class C2741b implements u<p> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92986a;

            public C2741b(com.avito.android.authorization.auth.di.c cVar) {
                this.f92986a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92986a.M5();
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class c implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92987a;

            public c(com.avito.android.authorization.auth.di.c cVar) {
                this.f92987a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f92987a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class d implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92988a;

            public d(com.avito.android.authorization.auth.di.c cVar) {
                this.f92988a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f92988a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class e implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92989a;

            public e(com.avito.android.authorization.auth.di.c cVar) {
                this.f92989a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92989a.R();
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class f implements u<InterfaceC35013e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92990a;

            public f(com.avito.android.authorization.auth.di.c cVar) {
                this.f92990a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35013e interfaceC35013eG3 = this.f92990a.g3();
                t.c(interfaceC35013eG3);
                return interfaceC35013eG3;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class g implements u<com.avito.android.credman.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92991a;

            public g(com.avito.android.authorization.auth.di.c cVar) {
                this.f92991a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92991a.Vb();
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class h implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f92992a;

            public h(cv.b bVar) {
                this.f92992a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92992a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class i implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92993a;

            public i(com.avito.android.authorization.auth.di.c cVar) {
                this.f92993a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f92993a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class j implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92994a;

            public j(com.avito.android.authorization.auth.di.c cVar) {
                this.f92994a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f92994a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class k implements u<B3.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92995a;

            public k(com.avito.android.authorization.auth.di.c cVar) {
                this.f92995a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92995a.I2();
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        /* renamed from: com.avito.android.authorization.auth.di.l$b$l, reason: collision with other inner class name */
        public static final class C2742l implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92996a;

            public C2742l(com.avito.android.authorization.auth.di.c cVar) {
                this.f92996a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f92996a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class m implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92997a;

            public m(com.avito.android.authorization.auth.di.c cVar) {
                this.f92997a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f92997a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAuthComponent.java */
        public static final class n implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.auth.di.c f92998a;

            public n(com.avito.android.authorization.auth.di.c cVar) {
                this.f92998a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                M mR2 = this.f92998a.R2();
                t.c(mR2);
                return mR2;
            }
        }

        public b(com.avito.android.authorization.auth.di.c cVar, cv.b bVar, Activity activity, r rVar, Resources resources, Kundle kundle, String str, CodeConfirmationSource codeConfirmationSource, Boolean bool, a aVar) {
            this.f92959a = cVar;
            this.f92960b = bVar;
            a aVar2 = new a(cVar);
            this.f92961c = aVar2;
            k kVar = new k(cVar);
            C2742l c2742l = new C2742l(cVar);
            this.f92963e = c2742l;
            e eVar = new e(cVar);
            this.f92964f = eVar;
            c cVar2 = new c(cVar);
            this.f92965g = cVar2;
            this.f92966h = dagger.internal.g.d(new C28640t(aVar2, kVar, c2742l, eVar, cVar2));
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f92967i = lVarA;
            this.f92968j = new C15204c(lVarA);
            this.f92969k = new m(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.authorization.auth.di.f(dagger.internal.l.a(rVar)));
            this.f92970l = uVarD;
            this.f92971m = dagger.internal.g.d(new C30065i(this.f92969k, uVarD));
            this.f92973o = B.a(new C50650d(new j(cVar), this.f92967i));
            dagger.internal.l lVarA2 = dagger.internal.l.a(activity);
            this.f92974p = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA2));
            this.f92975q = uVarA;
            this.f92976r = B.a(new o(uVarA, this.f92974p));
            this.f92977s = new C2741b(cVar);
            this.f92978t = new g(cVar);
            this.f92979u = new h(bVar);
            this.f92980v = dagger.internal.l.b(kundle);
            this.f92981w = dagger.internal.g.d(new e0(this.f92966h, this.f92961c, this.f92963e, this.f92968j, this.f92971m, this.f92973o, this.f92964f, this.f92976r, this.f92977s, this.f92965g, this.f92978t, this.f92979u, this.f92980v, dagger.internal.l.b(str)));
            this.f92982x = dagger.internal.g.d(new C28643w(this.f92967i));
            this.f92983y = new d(cVar);
            u<com.avito.android.authorization.auth.auth_socials.h> uVarD2 = dagger.internal.g.d(com.avito.android.authorization.auth.auth_socials.j.a());
            this.f92984z = uVarD2;
            u<com.avito.android.authorization.auth.auth_socials.k> uVarD3 = dagger.internal.g.d(new com.avito.android.authorization.auth.auth_socials.p(uVarD2, this.f92983y, this.f92964f));
            this.f92942A = uVarD3;
            this.f92943B = new com.avito.android.authorization.auth.auth_socials.d(uVarD3);
            this.f92944C = new com.avito.android.authorization.auth.auth_socials.b(this.f92965g);
            this.f92945D = new n(cVar);
            this.f92946E = dagger.internal.g.d(com.avito.android.social.button.d.a());
            u<Context> uVarD4 = dagger.internal.g.d(new com.avito.android.authorization.auth.di.e(this.f92974p));
            this.f92947F = uVarD4;
            this.f92948G = dagger.internal.g.d(new C35033z(uVarD4));
            this.f92949H = B.a(Z.a());
            this.f92951J = B.a(new V(new i(cVar)));
            this.f92952K = B.a(new C35019k(this.f92947F));
            this.f92953L = B.a(C35011c.a());
            u<InterfaceC35014f> uVarA2 = B.a(new C35016h(this.f92965g));
            this.f92954M = uVarA2;
            u<Map<String, D>> uVarD5 = dagger.internal.g.d(new com.avito.android.authorization.auth.di.g(uVarA2, this.f92948G, this.f92949H, this.f92951J, this.f92952K, this.f92953L, new f(cVar), this.f92964f));
            this.f92956O = uVarD5;
            this.f92957P = new com.avito.android.authorization.auth.auth_socials.u(uVarD5, this.f92945D, this.f92946E);
            this.f92958Q = new w(new com.avito.android.authorization.auth.auth_socials.g(this.f92943B, this.f92944C, s.a(), this.f92957P, this.f92971m));
        }

        @Override // com.avito.android.authorization.auth.di.b
        public final void a(AuthFragment authFragment) {
            com.avito.android.authorization.auth.di.c cVar = this.f92959a;
            authFragment.f92831t0 = cVar.m1();
            authFragment.f92832u0 = cVar.X7();
            authFragment.f92833v0 = cVar.g0();
            authFragment.f92834w0 = cVar.t0();
            authFragment.f92835x0 = cVar.E2();
            authFragment.f92836y0 = this.f92981w.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            authFragment.f92837z0 = interfaceC28373aA;
            M mR2 = cVar.R2();
            t.c(mR2);
            authFragment.f92817A0 = mR2;
            authFragment.f92818B0 = this.f92982x.get();
            cVar.R();
            authFragment.f92819C0 = this.f92971m.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92960b.u4();
            t.c(aVarU4);
            authFragment.f92820D0 = aVarU4;
            authFragment.f92821E0 = this.f92976r.get();
            com.avito.android.ui.status_bar.e eVarB0 = cVar.b0();
            t.c(eVarB0);
            authFragment.f92822F0 = eVarB0;
            authFragment.f92824H0 = this.f92958Q;
        }
    }

    /* compiled from: DaggerAuthComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.authorization.auth.di.b.a
        public final com.avito.android.authorization.auth.di.b a(com.avito.android.authorization.auth.di.c cVar, ActivityC22955m activityC22955m, r rVar, Resources resources, Kundle kundle, String str, InterfaceC39417a interfaceC39417a) {
            CodeConfirmationSource codeConfirmationSource = CodeConfirmationSource.f92767o;
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, activityC22955m, rVar, resources, kundle, str, codeConfirmationSource, Boolean.FALSE, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
