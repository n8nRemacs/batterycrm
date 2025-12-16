package com.avito.android.publish.price_list.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C;
import androidx.view.InterfaceC22983P;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.C0;
import com.avito.android.publish.objects.C33973v;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.objects.P0;
import com.avito.android.publish.price_list.SelectPriceListFragment;
import com.avito.android.publish.price_list.di.c;
import com.avito.android.publish.price_list.di.o;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.x1;
import com.avito.android.util.C35876q3;
import com.avito.android.util.R0;
import com.google.common.collect.H1;
import java.util.Set;
import te0.C48657a;
import ue0.C49045c;
import ue0.InterfaceC49043a;
import yc.C50213a;

/* compiled from: DaggerSelectPriceListComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerSelectPriceListComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.publish.price_list.di.c.a
        public final com.avito.android.publish.price_list.di.c a(SelectPriceListFragment selectPriceListFragment, String str, Integer num, C28478k c28478k, d dVar) {
            return new c(dVar, selectPriceListFragment, str, num, c28478k, null);
        }
    }

    /* compiled from: DaggerSelectPriceListComponent.java */
    public static final class c implements com.avito.android.publish.price_list.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.r f238426A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.b f238427B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.publish.price_list.mvi.i f238428C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.domain.j> f238429D;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.publish.price_list.mvi.r f238430E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f238431F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f238432G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.publish.price_list.mvi.entity.d f238433H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.f f238434I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<C> f238435J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.selectable.e> f238436K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.selectable.c f238437L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.selectable.l> f238438M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.selectable.k f238439N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.selected.l> f238440O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.selected.k f238441P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.selected.e> f238442Q;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.selected.c f238443R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.header.g> f238444S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.header.d f238445T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.group.f> f238446U;

        /* renamed from: V, reason: collision with root package name */
        public final com.avito.android.publish.price_list.items.group.e f238447V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.items.spacer.d> f238448W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f238449X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f238450Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f238451Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.price_list.di.d f238452a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f238453a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f238454b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f238455b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<C0> f238456c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<FragmentManager> f238457c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<P0> f238458d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33971t> f238459d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<ObjectsParameter> f238460e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC22983P> f238461e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.domain.c> f238462f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.objects.result.a> f238463f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f238464g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<Boolean> f238465h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f238466i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<Resources> f238467j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f238468k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<C35876q3> f238469l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49043a> f238470m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.h f238471n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.n f238472o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<Q1> f238473p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.p f238474q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.b f238475r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.publish.price_list.mvi.k f238476s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<x1> f238477t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<CategoryParametersConverter> f238478u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<C50213a> f238479v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<R0> f238480w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f238481x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.publish.price_list.domain.g> f238482y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.publish.price_list.domain.use_case.d f238483z;

        /* compiled from: DaggerSelectPriceListComponent.java */
        /* renamed from: com.avito.android.publish.price_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C7167a implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238484a;

            public C7167a(com.avito.android.publish.price_list.di.d dVar) {
                this.f238484a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f238484a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class b implements dagger.internal.u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238485a;

            public b(com.avito.android.publish.price_list.di.d dVar) {
                this.f238485a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f238485a.D1();
                dagger.internal.t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        /* renamed from: com.avito.android.publish.price_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C7168c implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238486a;

            public C7168c(com.avito.android.publish.price_list.di.d dVar) {
                this.f238486a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238486a.z0();
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class d implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238487a;

            public d(com.avito.android.publish.price_list.di.d dVar) {
                this.f238487a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f238487a.u();
                dagger.internal.t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class e implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238488a;

            public e(com.avito.android.publish.price_list.di.d dVar) {
                this.f238488a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarO0 = this.f238488a.O0();
                dagger.internal.t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238489a;

            public f(com.avito.android.publish.price_list.di.d dVar) {
                this.f238489a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f238489a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238490a;

            public g(com.avito.android.publish.price_list.di.d dVar) {
                this.f238490a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238490a.o();
            }
        }

        /* compiled from: DaggerSelectPriceListComponent.java */
        public static final class h implements dagger.internal.u<x1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.price_list.di.d f238491a;

            public h(com.avito.android.publish.price_list.di.d dVar) {
                this.f238491a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x1 x1VarQj = this.f238491a.Qj();
                dagger.internal.t.c(x1VarQj);
                return x1VarQj;
            }
        }

        public c(com.avito.android.publish.price_list.di.d dVar, Fragment fragment, String str, Integer num, C28478k c28478k, C7166a c7166a) {
            this.f238452a = dVar;
            this.f238454b = dagger.internal.l.a(str);
            d dVar2 = new d(dVar);
            this.f238456c = dVar2;
            dagger.internal.u<P0> uVarD = dagger.internal.g.d(new com.avito.android.publish.objects.R0(dVar2));
            this.f238458d = uVarD;
            dagger.internal.u<ObjectsParameter> uVarD2 = dagger.internal.g.d(new s(this.f238454b, uVarD));
            this.f238460e = uVarD2;
            this.f238462f = dagger.internal.g.d(new com.avito.android.publish.price_list.domain.e(uVarD2));
            dagger.internal.l lVarB = dagger.internal.l.b(num);
            this.f238464g = lVarB;
            this.f238465h = dagger.internal.g.d(new q(lVarB));
            dagger.internal.l lVarA = dagger.internal.l.a(fragment);
            this.f238466i = lVarA;
            dagger.internal.u<Resources> uVarD3 = dagger.internal.g.d(new t(lVarA));
            this.f238467j = uVarD3;
            e eVar = new e(dVar);
            this.f238468k = eVar;
            dagger.internal.u<C35876q3> uVarD4 = dagger.internal.g.d(new k(uVarD3, eVar));
            this.f238469l = uVarD4;
            dagger.internal.u<InterfaceC49043a> uVarD5 = dagger.internal.g.d(new C49045c(uVarD4, this.f238462f, this.f238467j, this.f238468k));
            this.f238470m = uVarD5;
            dagger.internal.u<Boolean> uVar = this.f238465h;
            this.f238471n = new com.avito.android.publish.price_list.domain.use_case.h(uVar);
            this.f238472o = new com.avito.android.publish.price_list.domain.use_case.n(uVar);
            this.f238473p = new C7168c(dVar);
            com.avito.android.publish.price_list.domain.use_case.p pVar = new com.avito.android.publish.price_list.domain.use_case.p(uVar, this.f238462f, uVarD5, com.avito.android.publish.price_list.domain.use_case.j.a(), this.f238471n, this.f238472o, this.f238473p);
            this.f238474q = pVar;
            com.avito.android.publish.price_list.domain.b bVar = new com.avito.android.publish.price_list.domain.b(this.f238464g, this.f238456c);
            this.f238475r = bVar;
            this.f238476s = new com.avito.android.publish.price_list.mvi.k(this.f238462f, pVar, bVar);
            this.f238477t = new h(dVar);
            dagger.internal.u<CategoryParametersConverter> uVarD6 = dagger.internal.g.d(o.a.f238519a);
            this.f238478u = uVarD6;
            b bVar2 = new b(dVar);
            C7167a c7167a = new C7167a(dVar);
            this.f238480w = c7167a;
            dagger.internal.u<com.avito.android.publish.price_list.domain.g> uVarD7 = dagger.internal.g.d(new com.avito.android.publish.price_list.domain.i(uVarD6, this.f238477t, this.f238456c, bVar2, c7167a, new g(dVar)));
            this.f238482y = uVarD7;
            dagger.internal.u<com.avito.android.publish.price_list.domain.c> uVar2 = this.f238462f;
            dagger.internal.u<P0> uVar3 = this.f238458d;
            this.f238483z = new com.avito.android.publish.price_list.domain.use_case.d(uVar2, uVar3);
            this.f238426A = new com.avito.android.publish.price_list.domain.use_case.r(uVar2, uVar3);
            this.f238427B = new com.avito.android.publish.price_list.domain.use_case.b(uVar2, this.f238456c);
            this.f238428C = new com.avito.android.publish.price_list.mvi.i(this.f238465h, uVarD7, uVar2, this.f238475r, this.f238474q, com.avito.android.publish.price_list.domain.use_case.l.a(), com.avito.android.publish.price_list.domain.use_case.j.a(), this.f238483z, this.f238426A, com.avito.android.publish.price_list.domain.use_case.f.a(), this.f238427B, this.f238473p);
            dagger.internal.u<com.avito.android.publish.price_list.domain.j> uVarD8 = dagger.internal.g.d(new u(this.f238462f, this.f238480w));
            this.f238429D = uVarD8;
            this.f238430E = new com.avito.android.publish.price_list.mvi.r(uVarD8);
            this.f238431F = new f(dVar);
            this.f238432G = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f238431F);
            this.f238433H = new com.avito.android.publish.price_list.mvi.entity.d(new com.avito.android.publish.price_list.mvi.n(this.f238476s, this.f238428C, com.avito.android.publish.price_list.mvi.p.a(), this.f238430E, this.f238432G), this.f238429D);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f238434I = fVar;
            this.f238435J = dagger.internal.g.d(new j(fVar));
            dagger.internal.u<com.avito.android.publish.price_list.items.selectable.e> uVarD9 = dagger.internal.g.d(com.avito.android.publish.price_list.items.selectable.i.a());
            this.f238436K = uVarD9;
            this.f238437L = new com.avito.android.publish.price_list.items.selectable.c(uVarD9, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.selectable.l> uVarD10 = dagger.internal.g.d(com.avito.android.publish.price_list.items.selectable.p.a());
            this.f238438M = uVarD10;
            this.f238439N = new com.avito.android.publish.price_list.items.selectable.k(uVarD10, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.selected.l> uVarD11 = dagger.internal.g.d(com.avito.android.publish.price_list.items.selected.q.a());
            this.f238440O = uVarD11;
            this.f238441P = new com.avito.android.publish.price_list.items.selected.k(uVarD11, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.selected.e> uVarD12 = dagger.internal.g.d(com.avito.android.publish.price_list.items.selected.i.a());
            this.f238442Q = uVarD12;
            this.f238443R = new com.avito.android.publish.price_list.items.selected.c(uVarD12, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.header.g> uVarD13 = dagger.internal.g.d(com.avito.android.publish.price_list.items.header.i.a());
            this.f238444S = uVarD13;
            this.f238445T = new com.avito.android.publish.price_list.items.header.d(uVarD13, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.group.f> uVarD14 = dagger.internal.g.d(com.avito.android.publish.price_list.items.group.j.a());
            this.f238446U = uVarD14;
            this.f238447V = new com.avito.android.publish.price_list.items.group.e(uVarD14, this.f238468k);
            dagger.internal.u<com.avito.android.publish.price_list.items.spacer.d> uVarD15 = dagger.internal.g.d(com.avito.android.publish.price_list.items.spacer.f.a());
            this.f238448W = uVarD15;
            dagger.internal.u<com.avito.konveyor.a> uVarD16 = dagger.internal.g.d(new i(this.f238437L, this.f238439N, this.f238441P, this.f238443R, this.f238445T, this.f238447V, new com.avito.android.publish.price_list.items.spacer.b(uVarD15)));
            this.f238449X = uVarD16;
            this.f238450Y = dagger.internal.g.d(new com.avito.android.publish.price_list.di.f(uVarD16));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD17 = dagger.internal.g.d(new com.avito.android.publish.price_list.di.h(com.avito.android.publish.price_list.items.diff.c.a(), com.avito.android.publish.price_list.items.diff.e.a()));
            this.f238451Z = uVarD17;
            dagger.internal.u<com.avito.android.recycler.data_aware.c> uVarD18 = dagger.internal.g.d(new com.avito.android.publish.price_list.di.g(uVarD17, this.f238435J, this.f238450Y));
            this.f238453a0 = uVarD18;
            dagger.internal.f.a(this.f238434I, dagger.internal.g.d(new m(uVarD18, this.f238449X)));
            this.f238455b0 = dagger.internal.g.d(new l(this.f238436K, this.f238438M, this.f238442Q, this.f238440O, this.f238444S, this.f238446U, this.f238448W));
            dagger.internal.u<FragmentManager> uVarD19 = dagger.internal.g.d(new p(this.f238466i));
            this.f238457c0 = uVarD19;
            this.f238459d0 = dagger.internal.g.d(new C33973v(uVarD19, this.f238473p));
            dagger.internal.u<InterfaceC22983P> uVarD20 = dagger.internal.g.d(new r(this.f238466i));
            this.f238461e0 = uVarD20;
            this.f238463f0 = dagger.internal.g.d(new C48657a(this.f238457c0, uVarD20));
        }

        @Override // com.avito.android.publish.price_list.di.c
        public final void a(SelectPriceListFragment selectPriceListFragment) {
            selectPriceListFragment.f238387n0 = this.f238433H;
            com.avito.android.publish.price_list.di.d dVar = this.f238452a;
            C0 c0U = dVar.u();
            dagger.internal.t.c(c0U);
            selectPriceListFragment.f238388o0 = c0U;
            selectPriceListFragment.f238391r0 = (com.avito.konveyor.adapter.j) this.f238434I.get();
            selectPriceListFragment.f238392s0 = this.f238453a0.get();
            selectPriceListFragment.f238393t0 = H1.v(this.f238455b0.get());
            selectPriceListFragment.f238394u0 = this.f238459d0.get();
            selectPriceListFragment.f238395v0 = this.f238463f0.get();
            selectPriceListFragment.f238396w0 = this.f238432G.get();
            u3.l<SimpleTestGroupWithNone> lVarO0 = dVar.O0();
            dagger.internal.t.c(lVarO0);
            selectPriceListFragment.f238397x0 = lVarO0;
        }
    }

    public static c.a a() {
        return new b();
    }
}
