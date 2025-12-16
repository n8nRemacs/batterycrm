package com.avito.android.short_term_rent.di.component;

import Hl0.InterfaceC14002a;
import Xv0.InterfaceC17053a;
import android.content.Context;
import bj.InterfaceC25659b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.di.component.b;
import com.avito.android.short_term_rent.di.module.n;
import com.avito.android.short_term_rent.di.module.o;
import com.avito.android.short_term_rent.soft_booking.StrSoftBookingFragment;
import com.avito.android.short_term_rent.soft_booking.mvi.A;
import com.avito.android.short_term_rent.soft_booking.mvi.C;
import com.avito.android.short_term_rent.soft_booking.mvi.t;
import com.avito.android.short_term_rent.soft_booking.mvi.v;
import com.avito.android.short_term_rent.soft_booking.mvi.y;
import com.avito.android.short_term_rent.utils.m;
import com.avito.android.short_term_rent.utils.q;
import com.avito.android.util.R0;
import com.avito.android.validation.C36024o;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.validation.d1;
import com.avito.android.validation.f1;
import com.avito.android.validation.g1;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.u;
import gw0.InterfaceC40745b;
import java.util.Date;

/* compiled from: DaggerStrSoftBookingFragmentComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.short_term_rent.di.component.b.a
        public final com.avito.android.short_term_rent.di.component.b a(InterfaceC40745b interfaceC40745b, InterfaceC39417a interfaceC39417a, String str, Date date, Date date2, int i12, String str2, String str3, boolean z12, String str4, Boolean bool, String str5, String str6, r rVar) {
            interfaceC39417a.getClass();
            return new c(interfaceC40745b, interfaceC39417a, str, date, date2, Integer.valueOf(i12), str2, str3, Boolean.valueOf(z12), str4, bool, str5, str6, rVar, null);
        }
    }

    /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
    public static final class c implements com.avito.android.short_term_rent.di.component.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC14002a> f282270A;

        /* renamed from: B, reason: collision with root package name */
        public final u<R0> f282271B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f282272C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.soft_booking.domain.d> f282273D;

        /* renamed from: E, reason: collision with root package name */
        public final u<Context> f282274E;

        /* renamed from: F, reason: collision with root package name */
        public final u<q> f282275F;

        /* renamed from: G, reason: collision with root package name */
        public final u<g1> f282276G;

        /* renamed from: H, reason: collision with root package name */
        public final u<hJ.i> f282277H;

        /* renamed from: I, reason: collision with root package name */
        public final u<hJ.e> f282278I;

        /* renamed from: J, reason: collision with root package name */
        public final u<d1> f282279J;

        /* renamed from: K, reason: collision with root package name */
        public final u<InterfaceC36020m> f282280K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.soft_booking.domain.a> f282281L;

        /* renamed from: M, reason: collision with root package name */
        public final t f282282M;

        /* renamed from: N, reason: collision with root package name */
        public final u<m> f282283N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.utils.a> f282284O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.soft_booking.mvi.state.b> f282285P;

        /* renamed from: Q, reason: collision with root package name */
        public final C f282286Q;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.short_term_rent.soft_booking.C f282287R;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f282288a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC40745b f282289b;

        /* renamed from: c, reason: collision with root package name */
        public final u<gj.d> f282290c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f282291d;

        /* renamed from: e, reason: collision with root package name */
        public final u<a.b> f282292e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f282293f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f282294g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f282295h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.short_term_rent.di.module.c f282296i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.remote.d1> f282297j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f282298k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f282299l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f282300m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f282301n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f282302o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f282303p;

        /* renamed from: q, reason: collision with root package name */
        public final u<E> f282304q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC17053a> f282305r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Gson> f282306s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.utils.d> f282307t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.short_term_rent.soft_booking.domain.k> f282308u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f282309v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f282310w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f282311x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f282312y;

        /* renamed from: z, reason: collision with root package name */
        public final v f282313z;

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        /* renamed from: com.avito.android.short_term_rent.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C8426a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282314a;

            public C8426a(InterfaceC40745b interfaceC40745b) {
                this.f282314a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f282314a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282315a;

            public b(InterfaceC40745b interfaceC40745b) {
                this.f282315a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f282315a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        /* renamed from: com.avito.android.short_term_rent.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C8427c implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282316a;

            public C8427c(InterfaceC40745b interfaceC40745b) {
                this.f282316a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f282316a.El();
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282317a;

            public d(InterfaceC40745b interfaceC40745b) {
                this.f282317a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f282317a.g();
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f282318a;

            public e(cv.b bVar) {
                this.f282318a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f282318a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f282319a;

            public f(cv.b bVar) {
                this.f282319a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f282319a.b();
                dagger.internal.t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class g implements u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282320a;

            public g(InterfaceC40745b interfaceC40745b) {
                this.f282320a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f282320a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class h implements u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282321a;

            public h(InterfaceC40745b interfaceC40745b) {
                this.f282321a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f282321a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282322a;

            public i(InterfaceC40745b interfaceC40745b) {
                this.f282322a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f282322a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class j implements u<InterfaceC14002a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282323a;

            public j(InterfaceC40745b interfaceC40745b) {
                this.f282323a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14002a interfaceC14002aVj = this.f282323a.vj();
                dagger.internal.t.c(interfaceC14002aVj);
                return interfaceC14002aVj;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class k implements u<com.avito.android.remote.d1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282324a;

            public k(InterfaceC40745b interfaceC40745b) {
                this.f282324a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.remote.d1 d1VarA0 = this.f282324a.a0();
                dagger.internal.t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrSoftBookingFragmentComponent.java */
        public static final class l implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40745b f282325a;

            public l(InterfaceC40745b interfaceC40745b) {
                this.f282325a = interfaceC40745b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f282325a.o();
            }
        }

        public c(InterfaceC40745b interfaceC40745b, cv.b bVar, String str, Date date, Date date2, Integer num, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, r rVar, C8425a c8425a) {
            this.f282288a = bVar;
            this.f282289b = interfaceC40745b;
            this.f282290c = new C8427c(interfaceC40745b);
            this.f282291d = new e(bVar);
            this.f282292e = new f(bVar);
            this.f282293f = new i(interfaceC40745b);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.short_term_rent.di.module.l(dagger.internal.l.a(rVar)));
            this.f282294g = uVarD;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f282293f, uVarD);
            this.f282295h = uVarI;
            this.f282296i = new com.avito.android.short_term_rent.di.module.c(uVarI, this.f282290c, this.f282291d, this.f282292e, this.f282294g);
            this.f282297j = new k(interfaceC40745b);
            this.f282298k = new b(interfaceC40745b);
            this.f282299l = dagger.internal.l.a(str);
            this.f282300m = dagger.internal.l.a(str2);
            this.f282301n = dagger.internal.l.b(bool2);
            this.f282302o = dagger.internal.l.b(date);
            this.f282303p = dagger.internal.l.b(date2);
            this.f282305r = dagger.internal.g.d(new Xv0.c(this.f282298k, this.f282299l, this.f282300m, this.f282301n, this.f282302o, this.f282303p, dagger.internal.l.b(str6), new C8426a(interfaceC40745b)));
            this.f282306s = dagger.internal.g.d(o.a());
            u<com.avito.android.short_term_rent.utils.d> uVarD2 = dagger.internal.g.d(com.avito.android.short_term_rent.utils.f.a());
            this.f282307t = uVarD2;
            this.f282308u = dagger.internal.g.d(new com.avito.android.short_term_rent.soft_booking.domain.r(uVarD2, this.f282297j, this.f282295h, this.f282305r, this.f282306s));
            this.f282309v = dagger.internal.l.a(num);
            this.f282310w = dagger.internal.l.b(str3);
            this.f282311x = dagger.internal.l.a(bool);
            this.f282312y = dagger.internal.l.b(str4);
            this.f282313z = new v(this.f282308u, this.f282296i, this.f282306s, this.f282302o, this.f282303p, this.f282309v, this.f282299l, this.f282310w, this.f282311x, this.f282312y, this.f282301n, dagger.internal.l.b(str5));
            this.f282270A = new j(interfaceC40745b);
            u<R0> uVarD3 = dagger.internal.g.d(n.a());
            this.f282271B = uVarD3;
            this.f282273D = dagger.internal.g.d(new com.avito.android.short_term_rent.soft_booking.domain.j(uVarD3, this.f282270A, new l(interfaceC40745b), this.f282295h, this.f282306s));
            u<q> uVarD4 = dagger.internal.g.d(new com.avito.android.short_term_rent.di.module.m(new d(interfaceC40745b)));
            this.f282275F = uVarD4;
            u<g1> uVarD5 = dagger.internal.g.d(new com.avito.android.short_term_rent.utils.l(uVarD4));
            this.f282276G = uVarD5;
            u<d1> uVarD6 = dagger.internal.g.d(new f1(uVarD5, new h(interfaceC40745b), new g(interfaceC40745b)));
            this.f282279J = uVarD6;
            u<InterfaceC36020m> uVarD7 = dagger.internal.g.d(new C36024o(uVarD6));
            this.f282280K = uVarD7;
            u<com.avito.android.short_term_rent.soft_booking.domain.a> uVarD8 = dagger.internal.g.d(new com.avito.android.short_term_rent.soft_booking.domain.c(uVarD7));
            this.f282281L = uVarD8;
            this.f282282M = new t(uVarD8, this.f282308u, this.f282273D, this.f282305r);
            this.f282283N = dagger.internal.g.d(com.avito.android.short_term_rent.utils.o.a());
            u<com.avito.android.short_term_rent.utils.a> uVarD9 = dagger.internal.g.d(com.avito.android.short_term_rent.utils.c.a());
            this.f282284O = uVarD9;
            u<com.avito.android.short_term_rent.soft_booking.mvi.state.b> uVarD10 = dagger.internal.g.d(new com.avito.android.short_term_rent.soft_booking.mvi.state.e(uVarD9, this.f282283N, this.f282307t));
            this.f282285P = uVarD10;
            this.f282286Q = new C(uVarD10);
            this.f282287R = new com.avito.android.short_term_rent.soft_booking.C(this.f282296i, new y(this.f282313z, this.f282282M, A.a(), this.f282286Q, this.f282295h));
        }

        @Override // com.avito.android.short_term_rent.di.component.b
        public final void a(StrSoftBookingFragment strSoftBookingFragment) {
            strSoftBookingFragment.f282538n0 = this.f282287R;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f282288a.u4();
            dagger.internal.t.c(aVarU4);
            strSoftBookingFragment.f282540p0 = aVarU4;
            strSoftBookingFragment.f282541q0 = this.f282295h.get();
            InterfaceC40745b interfaceC40745b = this.f282289b;
            com.avito.android.util.text.a aVarE = interfaceC40745b.e();
            dagger.internal.t.c(aVarE);
            strSoftBookingFragment.f282542r0 = aVarE;
            InterfaceC25659b interfaceC25659bSd = interfaceC40745b.sd();
            com.avito.android.short_term_rent.di.module.a.f282326a.getClass();
            strSoftBookingFragment.f282543s0 = interfaceC25659bSd.b(null);
            strSoftBookingFragment.f282544t0 = interfaceC40745b.G1();
            strSoftBookingFragment.f282545u0 = this.f282305r.get();
            strSoftBookingFragment.f282546v0 = interfaceC40745b.hj();
        }
    }

    public static b.a a() {
        return new b();
    }
}
