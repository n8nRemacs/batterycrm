package com.avito.android.short_term_rent.bookingform.di;

import Hl0.InterfaceC14002a;
import bw0.C25730c;
import bw0.C25732e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.short_term_rent.bookingform.BookingFormFragment;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.short_term_rent.bookingform.di.a;
import com.avito.android.short_term_rent.bookingform.mvi.B;
import com.avito.android.short_term_rent.bookingform.mvi.D;
import com.avito.android.short_term_rent.bookingform.mvi.E;
import com.avito.android.short_term_rent.bookingform.mvi.G;
import com.avito.android.short_term_rent.bookingform.mvi.H;
import com.avito.android.short_term_rent.bookingform.mvi.J;
import com.avito.android.short_term_rent.bookingform.mvi.interactor.x;
import com.avito.android.short_term_rent.bookingform.mvi.v;
import com.avito.android.short_term_rent.bookingform.mvi.z;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.A;
import eF0.InterfaceC40000a;
import iw0.InterfaceC42121a;
import java.util.List;

/* compiled from: DaggerBookingFormComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class p {

    /* compiled from: DaggerBookingFormComponent.java */
    public static final class b implements com.avito.android.short_term_rent.bookingform.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281260A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.travel_payment_methods.items.payment_method.b> f281261B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.travel_payment_methods.items.payment_method.h> f281262C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f281263D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281264E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281265F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281266G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281267H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281268I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281269J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281270K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281271L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281272M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281273N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281274O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281275P;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.items.button.b f281276Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281277R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281278S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f281279T;

        /* renamed from: U, reason: collision with root package name */
        public final C25732e f281280U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f281281V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f281282W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f281283X;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f281284a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f281285b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Gson> f281286c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC42121a> f281287d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.mvi.interactor.q f281288e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<R0> f281289f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f281290g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.provider.a> f281291h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.short_term_rent.bookingform.mvi.interactor.a> f281292i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.short_term_rent.bookingform.mvi.interactor.d> f281293j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.mvi.u f281294k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.short_term_rent.bookingform.mvi.interactor.u> f281295l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14002a> f281296m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f281297n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.short_term_rent.bookingform.mvi.interactor.r> f281298o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.mvi.s f281299p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<H> f281300q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<E> f281301r;

        /* renamed from: s, reason: collision with root package name */
        public final D f281302s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f281303t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f281304u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f281305v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.short_term_rent.bookingform.l f281306w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.travel_payment_methods.items.loan_terms.b> f281307x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.travel_payment_methods.items.loan_terms.k> f281308y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.l f281309z;

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281310a;

            public a(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281310a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f281310a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        /* renamed from: com.avito.android.short_term_rent.bookingform.di.p$b$b, reason: collision with other inner class name */
        public static final class C8379b implements dagger.internal.u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281311a;

            public C8379b(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281311a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f281311a.v();
                dagger.internal.t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class c implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f281312a;

            public c(cv.b bVar) {
                this.f281312a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f281312a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class d implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281313a;

            public d(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281313a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f281313a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class e implements dagger.internal.u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281314a;

            public e(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281314a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f281314a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.travel_payment_methods.items.loan_terms.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f281315a;

            public f(InterfaceC40000a interfaceC40000a) {
                this.f281315a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281315a.pa();
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.travel_payment_methods.items.loan_terms.k> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f281316a;

            public g(InterfaceC40000a interfaceC40000a) {
                this.f281316a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281316a.x6();
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class h implements dagger.internal.u<com.avito.android.travel_payment_methods.items.payment_method.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f281317a;

            public h(InterfaceC40000a interfaceC40000a) {
                this.f281317a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281317a.hk();
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class i implements dagger.internal.u<com.avito.android.travel_payment_methods.items.payment_method.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f281318a;

            public i(InterfaceC40000a interfaceC40000a) {
                this.f281318a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281318a.wk();
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class j implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281319a;

            public j(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281319a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f281319a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC14002a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281320a;

            public k(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281320a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14002a interfaceC14002aSg = this.f281320a.Sg();
                dagger.internal.t.c(interfaceC14002aSg);
                return interfaceC14002aSg;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class l implements dagger.internal.u<InterfaceC42121a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281321a;

            public l(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281321a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42121a interfaceC42121aFk = this.f281321a.fk();
                dagger.internal.t.c(interfaceC42121aFk);
                return interfaceC42121aFk;
            }
        }

        /* compiled from: DaggerBookingFormComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.short_term_rent.bookingform.di.b f281322a;

            public m(com.avito.android.short_term_rent.bookingform.di.b bVar) {
                this.f281322a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f281322a.o();
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.short_term_rent.bookingform.di.b bVar, cv.b bVar2, InterfaceC40000a interfaceC40000a, Boolean bool, com.avito.android.analytics.screens.r rVar, BookingFormOpenParams bookingFormOpenParams, Y41.l lVar, a aVar) {
            this.f281284a = bVar2;
            this.f281285b = dagger.internal.l.a(bookingFormOpenParams);
            this.f281286c = new e(bVar);
            this.f281287d = new l(bVar);
            this.f281288e = new com.avito.android.short_term_rent.bookingform.mvi.interactor.q(this.f281285b, this.f281286c, new com.avito.android.short_term_rent.bookingform.data.models.d(com.avito.android.short_term_rent.utils.c.a()), com.avito.android.short_term_rent.bookingform.mvi.interactor.l.a());
            this.f281289f = new d(bVar);
            this.f281292i = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.mvi.interactor.c(new a(bVar), new C8379b(bVar)));
            this.f281293j = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.mvi.interactor.j(this.f281285b, com.avito.android.short_term_rent.bookingform.domain.h.a(), this.f281286c, this.f281287d, this.f281288e, this.f281289f, this.f281292i));
            this.f281294k = new com.avito.android.short_term_rent.bookingform.mvi.u(this.f281285b, dagger.internal.l.a(bool), this.f281293j);
            this.f281295l = dagger.internal.g.d(new x(new com.avito.android.short_term_rent.bookingform.domain.validation.d(this.f281289f)));
            this.f281296m = new k(bVar);
            this.f281297n = new m(bVar);
            dagger.internal.u<com.avito.android.short_term_rent.bookingform.mvi.interactor.r> uVarD = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.mvi.interactor.t(this.f281295l, this.f281292i, new com.avito.android.short_term_rent.bookingform.domain.f(com.avito.android.short_term_rent.bookingform.domain.h.a(), this.f281296m, this.f281286c, this.f281297n, this.f281289f), this.f281285b));
            this.f281298o = uVarD;
            this.f281299p = new com.avito.android.short_term_rent.bookingform.mvi.s(this.f281285b, uVarD, this.f281293j, this.f281295l, this.f281292i);
            this.f281300q = dagger.internal.g.d(J.a());
            dagger.internal.u<E> uVarD2 = dagger.internal.g.d(G.a());
            this.f281301r = uVarD2;
            this.f281302s = new D(uVarD2, this.f281300q);
            this.f281303t = new j(bVar);
            dagger.internal.u<C28478k> uVarD3 = dagger.internal.g.d(new n(dagger.internal.l.a(rVar)));
            this.f281304u = uVarD3;
            this.f281305v = dagger.internal.g.d(new o(uVarD3, this.f281303t));
            this.f281306w = new com.avito.android.short_term_rent.bookingform.l(new z(this.f281294k, this.f281299p, B.a(), this.f281302s, this.f281305v));
            this.f281307x = new f(interfaceC40000a);
            this.f281308y = new g(interfaceC40000a);
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f281309z = lVarA;
            this.f281260A = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.di.h(this.f281307x, new com.avito.android.short_term_rent.bookingform.di.i(lVarA, this.f281308y)));
            this.f281264E = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.di.j(new h(interfaceC40000a), new com.avito.android.short_term_rent.bookingform.di.k(this.f281309z, new i(interfaceC40000a), new c(bVar2))));
            this.f281265F = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.spacing.b(com.avito.android.short_term_rent.bookingform.items.spacing.d.a()));
            this.f281266G = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.dotted_text.f(new com.avito.android.short_term_rent.bookingform.items.dotted_text.l(this.f281309z)));
            this.f281267H = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.text.g(new com.avito.android.short_term_rent.bookingform.items.text.l(this.f281309z)));
            this.f281268I = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.booking_preview.f(new com.avito.android.short_term_rent.bookingform.items.booking_preview.l(this.f281309z)));
            this.f281269J = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.image_with_text.g(new com.avito.android.short_term_rent.bookingform.items.image_with_text.m(this.f281309z)));
            this.f281270K = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.select.g(new com.avito.android.short_term_rent.bookingform.items.select.l(this.f281309z)));
            this.f281271L = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.input.g(new com.avito.android.short_term_rent.bookingform.items.input.l(this.f281309z)));
            this.f281272M = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.toggle.f(new com.avito.android.short_term_rent.bookingform.items.toggle.k(this.f281309z)));
            this.f281273N = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.refund_toggle.b(new com.avito.android.short_term_rent.bookingform.items.refund_toggle.i(this.f281309z)));
            this.f281274O = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.info_banner.b(com.avito.android.short_term_rent.bookingform.items.info_banner.g.a()));
            this.f281275P = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.retro_badges.e(new com.avito.android.short_term_rent.bookingform.items.retro_badges.c(this.f281309z)));
            this.f281276Q = new com.avito.android.short_term_rent.bookingform.items.button.b(new com.avito.android.short_term_rent.bookingform.items.button.e(this.f281309z));
            this.f281277R = dagger.internal.g.d(this.f281276Q);
            this.f281278S = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.items.toggle_v2.b(new com.avito.android.short_term_rent.bookingform.items.toggle_v2.g(this.f281309z)));
            A.b bVarA = A.a(15, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f281260A;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f281264E);
            list.add(this.f281265F);
            list.add(this.f281266G);
            list.add(this.f281267H);
            list.add(this.f281268I);
            list.add(this.f281269J);
            list.add(this.f281270K);
            list.add(this.f281271L);
            list.add(this.f281272M);
            list.add(this.f281273N);
            list.add(this.f281274O);
            list.add(this.f281275P);
            list.add(this.f281277R);
            list.add(this.f281278S);
            this.f281279T = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.di.g(bVarA.b()));
            this.f281280U = new C25732e(com.avito.android.short_term_rent.bookingform.items.text.j.a(), com.avito.android.short_term_rent.bookingform.items.image_with_text.j.a(), com.avito.android.short_term_rent.bookingform.items.dotted_text.i.a(), com.avito.android.short_term_rent.bookingform.items.booking_preview.i.a(), com.avito.android.short_term_rent.bookingform.items.select.j.a(), com.avito.android.short_term_rent.bookingform.items.input.j.a(), com.avito.android.short_term_rent.bookingform.items.toggle.i.a(), com.avito.android.travel_payment_methods.items.payment_method.s.f302532a, com.avito.android.travel_payment_methods.items.loan_terms.i.f302504a, com.avito.android.short_term_rent.bookingform.items.info_banner.e.a());
            this.f281281V = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.page.b(com.avito.android.short_term_rent.bookingform.page.h.a(), this.f281279T, this.f281280U));
            A.b bVarA2 = A.a(1, 0);
            bVarA2.f393937a.add(this.f281281V);
            this.f281282W = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.di.l(bVarA2.b()));
            this.f281283X = dagger.internal.g.d(new com.avito.android.short_term_rent.bookingform.di.m(this.f281282W, new C25730c(com.avito.android.short_term_rent.bookingform.page.f.a())));
        }

        @Override // com.avito.android.short_term_rent.bookingform.di.a
        public final void a(BookingFormFragment bookingFormFragment) {
            bookingFormFragment.f281184o0 = this.f281306w;
            bookingFormFragment.f281186q0 = this.f281305v.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f281284a.u4();
            dagger.internal.t.c(aVarU4);
            bookingFormFragment.f281187r0 = aVarU4;
            bookingFormFragment.f281188s0 = new v();
            bookingFormFragment.f281189t0 = this.f281283X.get();
        }
    }

    /* compiled from: DaggerBookingFormComponent.java */
    public static final class c implements a.InterfaceC8377a {
        public c() {
        }

        @Override // com.avito.android.short_term_rent.bookingform.di.a.InterfaceC8377a
        public final com.avito.android.short_term_rent.bookingform.di.a a(com.avito.android.short_term_rent.bookingform.di.b bVar, InterfaceC39417a interfaceC39417a, boolean z12, com.avito.android.analytics.screens.r rVar, BookingFormOpenParams bookingFormOpenParams, Y41.l lVar, InterfaceC40000a interfaceC40000a) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, interfaceC40000a, Boolean.valueOf(z12), rVar, bookingFormOpenParams, lVar, null);
        }
    }

    public static a.InterfaceC8377a a() {
        return new c();
    }
}
