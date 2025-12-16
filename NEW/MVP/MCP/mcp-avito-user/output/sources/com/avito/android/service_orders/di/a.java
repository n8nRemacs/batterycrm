package com.avito.android.service_orders.di;

import Ju0.InterfaceC14251a;
import Nu0.C14614b;
import Pu0.InterfaceC14839a;
import Su0.C15227c;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.S0;
import com.avito.android.B2;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_orders.ServiceOrdersArguments;
import com.avito.android.service_orders.di.h;
import com.avito.android.service_orders.list.ServiceOrdersListFragment;
import com.avito.android.service_orders.list.l;
import com.avito.android.service_orders.mvi.A;
import com.avito.android.service_orders.mvi.C34936f;
import com.avito.android.service_orders.mvi.D;
import com.avito.android.service_orders.mvi.F;
import com.avito.android.service_orders.mvi.InterfaceC34931a;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.android.util.S;
import com.avito.android.util.V;
import cv.InterfaceC39417a;
import java.util.Set;
import vK0.C49228b;

/* compiled from: DaggerServiceOrdersListComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServiceOrdersListComponent.java */
    public static final class b implements h.a {
        public b() {
        }

        @Override // com.avito.android.service_orders.di.h.a
        public final h a(ServiceOrdersListFragment serviceOrdersListFragment, InterfaceC39417a interfaceC39417a, i iVar, C28478k c28478k, ServiceOrdersArguments serviceOrdersArguments, S0 s02) {
            interfaceC39417a.getClass();
            return new c(iVar, interfaceC39417a, serviceOrdersListFragment, c28478k, serviceOrdersArguments, s02, null);
        }
    }

    /* compiled from: DaggerServiceOrdersListComponent.java */
    public static final class c implements com.avito.android.service_orders.di.h {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f279069A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f279070B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f279071C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<E> f279072D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f279073E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.a> f279074F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.l f279075G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f279076H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f279077I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f279078J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_persistence.b> f279079K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.d> f279080L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<R0> f279081M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14251a> f279082N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.mvi.domain.d> f279083O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.service_orders.mvi.x f279084P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.mvi.domain.a> f279085Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.h> f279086R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.e> f279087S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f279088T;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.service_orders.mvi.v f279089U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC22983P> f279090V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34931a> f279091W;

        /* renamed from: X, reason: collision with root package name */
        public final F f279092X;

        /* renamed from: Y, reason: collision with root package name */
        public final com.avito.android.service_orders.mvi.i f279093Y;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f279094a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.service_orders.di.i f279095b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14839a> f279096c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f279097d;

        /* renamed from: e, reason: collision with root package name */
        public final C14614b f279098e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<C> f279099f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<PreloadingPromiseTestGroup> f279100g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f279101h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f279102i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f279103j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<AbstractC33302a<String, TypedResult<C15227c>>> f279104k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.toolbar.c> f279105l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f279106m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f279107n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f279108o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.blueprints.snippet_item.c> f279109p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f279110q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<Ju0.e> f279111r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.blueprints.calendar_button_item.c> f279112s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.blueprints.banner_item.c> f279113t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_orders.list.blueprints.management_panels.c> f279114u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f279115v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.f f279116w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f279117x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<B2> f279118y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f279119z;

        /* compiled from: DaggerServiceOrdersListComponent.java */
        /* renamed from: com.avito.android.service_orders.di.a$c$a, reason: collision with other inner class name */
        public static final class C8299a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279120a;

            public C8299a(com.avito.android.service_orders.di.i iVar) {
                this.f279120a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f279120a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279121a;

            public b(com.avito.android.service_orders.di.i iVar) {
                this.f279121a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f279121a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        /* renamed from: com.avito.android.service_orders.di.a$c$c, reason: collision with other inner class name */
        public static final class C8300c implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279122a;

            public C8300c(com.avito.android.service_orders.di.i iVar) {
                this.f279122a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f279122a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class d implements dagger.internal.u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279123a;

            public d(com.avito.android.service_orders.di.i iVar) {
                this.f279123a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f279123a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f279124a;

            public e(cv.b bVar) {
                this.f279124a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f279124a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class f implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279125a;

            public f(com.avito.android.service_orders.di.i iVar) {
                this.f279125a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f279125a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class g implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279126a;

            public g(com.avito.android.service_orders.di.i iVar) {
                this.f279126a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f279126a.r();
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279127a;

            public h(com.avito.android.service_orders.di.i iVar) {
                this.f279127a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f279127a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279128a;

            public i(com.avito.android.service_orders.di.i iVar) {
                this.f279128a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f279128a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class j implements dagger.internal.u<com.avito.android.service_booking_persistence.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279129a;

            public j(com.avito.android.service_orders.di.i iVar) {
                this.f279129a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f279129a.K7();
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC14839a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279130a;

            public k(com.avito.android.service_orders.di.i iVar) {
                this.f279130a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14839a interfaceC14839aR4 = this.f279130a.r4();
                dagger.internal.t.c(interfaceC14839aR4);
                return interfaceC14839aR4;
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class l implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279131a;

            public l(com.avito.android.service_orders.di.i iVar) {
                this.f279131a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f279131a.D();
            }
        }

        /* compiled from: DaggerServiceOrdersListComponent.java */
        public static final class m implements dagger.internal.u<PreloadingPromiseTestGroup> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_orders.di.i f279132a;

            public m(com.avito.android.service_orders.di.i iVar) {
                this.f279132a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f279132a.ge();
            }
        }

        public c(com.avito.android.service_orders.di.i iVar, cv.b bVar, Fragment fragment, C28478k c28478k, ServiceOrdersArguments serviceOrdersArguments, S0 s02, C8298a c8298a) {
            this.f279094a = bVar;
            this.f279095b = iVar;
            this.f279096c = new k(iVar);
            dagger.internal.l lVarB = dagger.internal.l.b(serviceOrdersArguments);
            this.f279097d = lVarB;
            this.f279098e = new C14614b(lVarB, this.f279096c);
            this.f279099f = new d(iVar);
            this.f279100g = new m(iVar);
            this.f279101h = dagger.internal.l.a(s02);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f279102i = lVarA;
            b bVar2 = new b(iVar);
            this.f279103j = bVar2;
            this.f279104k = dagger.internal.g.d(new r(this.f279098e, this.f279099f, this.f279100g, this.f279101h, lVarA, bVar2));
            dagger.internal.u<com.avito.android.service_orders.list.toolbar.c> uVarD = dagger.internal.g.d(com.avito.android.service_orders.list.toolbar.f.a());
            this.f279105l = uVarD;
            dagger.internal.u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new x(new com.avito.android.service_orders.list.toolbar.b(uVarD)));
            this.f279106m = uVarD2;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new w(uVarD2));
            this.f279107n = uVarD3;
            this.f279108o = dagger.internal.g.d(new y(uVarD3, this.f279106m));
            this.f279109p = dagger.internal.g.d(com.avito.android.service_orders.list.blueprints.snippet_item.l.a());
            g gVar = new g(iVar);
            this.f279110q = gVar;
            dagger.internal.u<Ju0.e> uVarD4 = dagger.internal.g.d(new Ju0.g(gVar));
            this.f279111r = uVarD4;
            this.f279112s = dagger.internal.g.d(new com.avito.android.service_orders.list.blueprints.calendar_button_item.f(uVarD4));
            this.f279113t = dagger.internal.g.d(com.avito.android.service_orders.list.blueprints.banner_item.g.a());
            dagger.internal.u<com.avito.android.service_orders.list.blueprints.management_panels.c> uVarD5 = dagger.internal.g.d(com.avito.android.service_orders.list.blueprints.management_panels.h.a());
            this.f279114u = uVarD5;
            this.f279115v = dagger.internal.g.d(new p(uVarD5, this.f279109p, this.f279112s, this.f279113t));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f279116w = fVar;
            this.f279117x = dagger.internal.g.d(new q(fVar));
            com.avito.android.service_orders.list.blueprints.title_item.b bVar3 = new com.avito.android.service_orders.list.blueprints.title_item.b(com.avito.android.service_orders.list.blueprints.title_item.d.a());
            l lVar = new l(iVar);
            this.f279118y = lVar;
            dagger.internal.u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new o(bVar3, new com.avito.android.service_orders.list.blueprints.snippet_item.b(this.f279109p, lVar), new com.avito.android.service_orders.list.blueprints.calendar_button_item.b(this.f279112s), new com.avito.android.service_orders.list.blueprints.banner_item.b(this.f279113t), new com.avito.android.service_orders.list.blueprints.management_panels.b(this.f279114u)));
            this.f279119z = uVarD6;
            this.f279069A = dagger.internal.g.d(new com.avito.android.service_orders.di.l(uVarD6));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD7 = dagger.internal.g.d(new n(com.avito.android.service_orders.list.blueprints.c.a()));
            this.f279070B = uVarD7;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.service_orders.di.m(uVarD7, this.f279117x, this.f279069A));
            this.f279071C = uVarD8;
            dagger.internal.f.a(this.f279116w, dagger.internal.g.d(new s(uVarD8, this.f279119z)));
            dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.a> uVarD9 = dagger.internal.g.d(new com.avito.android.service_booking_utils.ux_feedback.d(new C8299a(iVar), new C8300c(iVar)));
            this.f279074F = uVarD9;
            this.f279075G = dagger.internal.l.a(new com.avito.android.service_orders.list.r(new com.avito.android.service_orders.list.q(this.f279107n, this.f279108o, this.f279115v, this.f279116w, this.f279071C, this.f279111r, uVarD9, this.f279105l)));
            this.f279077I = dagger.internal.g.d(new C30060h5(new i(iVar), this.f279102i));
            h hVar = new h(iVar);
            j jVar = new j(iVar);
            this.f279079K = jVar;
            this.f279080L = dagger.internal.g.d(new com.avito.android.service_orders.list.f(this.f279118y, hVar, jVar));
            this.f279081M = new f(iVar);
            dagger.internal.u<InterfaceC14251a> uVarD10 = dagger.internal.g.d(new Ju0.c(this.f279110q));
            this.f279082N = uVarD10;
            dagger.internal.u<com.avito.android.service_orders.mvi.domain.d> uVarD11 = dagger.internal.g.d(new com.avito.android.service_orders.mvi.domain.h(this.f279097d, uVarD10, this.f279104k, this.f279080L, this.f279081M, this.f279118y));
            this.f279083O = uVarD11;
            this.f279084P = new com.avito.android.service_orders.mvi.x(uVarD11);
            this.f279085Q = dagger.internal.g.d(new com.avito.android.service_orders.mvi.domain.c(this.f279081M, this.f279096c));
            this.f279086R = dagger.internal.g.d(com.avito.android.service_booking_utils.ux_feedback.j.a());
            dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.e> uVarD12 = dagger.internal.g.d(com.avito.android.service_booking_utils.ux_feedback.g.a());
            this.f279087S = uVarD12;
            this.f279089U = new com.avito.android.service_orders.mvi.v(uVarD12, this.f279083O, this.f279085Q, this.f279086R, new e(bVar));
            dagger.internal.u<InterfaceC22983P> uVarD13 = dagger.internal.g.d(dagger.internal.l.a(fragment));
            this.f279090V = uVarD13;
            dagger.internal.u<InterfaceC34931a> uVarD14 = dagger.internal.g.d(new C34936f(uVarD13, this.f279103j));
            this.f279091W = uVarD14;
            this.f279092X = new F(uVarD14, this.f279079K);
            this.f279093Y = new com.avito.android.service_orders.mvi.i(new A(this.f279084P, this.f279089U, D.a(), this.f279092X, this.f279077I));
        }

        @Override // com.avito.android.service_orders.di.h
        public final void a(ServiceOrdersListFragment serviceOrdersListFragment) {
            this.f279104k.get();
            serviceOrdersListFragment.f279191t0 = (l.e) this.f279075G.f393949a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f279094a.u4();
            dagger.internal.t.c(aVarU4);
            serviceOrdersListFragment.f279192u0 = aVarU4;
            serviceOrdersListFragment.f279193v0 = this.f279077I.get();
            serviceOrdersListFragment.f279194w0 = this.f279093Y;
            com.avito.android.service_orders.di.i iVar = this.f279095b;
            Application applicationK = iVar.k();
            dagger.internal.t.c(applicationK);
            C49228b.f440688b.getClass();
            serviceOrdersListFragment.f279195x0 = new V(C49228b.a.a(applicationK), new S());
            iVar.D();
        }
    }

    public static h.a a() {
        return new b();
    }
}
