package com.avito.android.widget_filters.di;

import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.view.T0;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.location.H;
import com.avito.android.location.r;
import com.avito.android.util.R0;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import com.avito.android.widget_filters.di.b;
import com.avito.android.widget_filters.di.i;
import com.avito.android.widget_filters.domain.D;
import com.avito.android.widget_filters.domain.InterfaceC36154b;
import com.avito.android.widget_filters.domain.o;
import com.avito.android.widget_filters.domain.s;
import com.avito.android.widget_filters.domain.use_case.p;
import com.avito.android.widget_filters.domain.v;
import com.avito.android.widget_filters.domain.x;
import com.avito.android.widget_filters.domain.y;
import com.avito.android.widget_filters.mvi.A;
import com.avito.android.widget_filters.mvi.B;
import com.avito.android.widget_filters.mvi.q;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import lE.C43624b;
import nW.InterfaceC44343a;
import oW.InterfaceC44697a;

/* compiled from: DaggerWidgetFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWidgetFiltersComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.widget_filters.di.b.a
        public final com.avito.android.widget_filters.di.b a(C28478k c28478k, WidgetFiltersOpenParams widgetFiltersOpenParams, FragmentManager fragmentManager, ActivityC22955m activityC22955m, Y41.l lVar, com.avito.android.widget_filters.di.c cVar, InterfaceC44697a interfaceC44697a, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, interfaceC44697a, c28478k, widgetFiltersOpenParams, fragmentManager, activityC22955m, lVar, null);
        }
    }

    /* compiled from: DaggerWidgetFiltersComponent.java */
    public static final class c implements com.avito.android.widget_filters.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<AK0.i> f329763A;

        /* renamed from: B, reason: collision with root package name */
        public final u<Context> f329764B;

        /* renamed from: C, reason: collision with root package name */
        public final u<AK0.l> f329765C;

        /* renamed from: D, reason: collision with root package name */
        public final u<s> f329766D;

        /* renamed from: E, reason: collision with root package name */
        public final u<o> f329767E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.analytics.e> f329768F;

        /* renamed from: G, reason: collision with root package name */
        public final q f329769G;

        /* renamed from: H, reason: collision with root package name */
        public final u<MP0.a> f329770H;

        /* renamed from: I, reason: collision with root package name */
        public final u<B> f329771I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f329772J;

        /* renamed from: K, reason: collision with root package name */
        public final u<C43624b> f329773K;

        /* renamed from: L, reason: collision with root package name */
        public final u<MP0.e> f329774L;

        /* renamed from: M, reason: collision with root package name */
        public final A f329775M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC28481c> f329776N;

        /* renamed from: O, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f329777O;

        /* renamed from: P, reason: collision with root package name */
        public final KP0.e f329778P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.l f329779Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f329780R;

        /* renamed from: S, reason: collision with root package name */
        public final com.avito.android.widget_filters.ui.items.dates.j f329781S;

        /* renamed from: T, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f329782T;

        /* renamed from: U, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f329783U;

        /* renamed from: V, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f329784V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f329785W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f329786X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f329787Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.android.widget_filters_shared.a> f329788Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f329789a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.widget_filters.di.c f329790b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f329791c;

        /* renamed from: d, reason: collision with root package name */
        public final u<PP0.a> f329792d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f329793e;

        /* renamed from: f, reason: collision with root package name */
        public final u<H> f329794f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.B> f329795g;

        /* renamed from: h, reason: collision with root package name */
        public final u<I1> f329796h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC44343a> f329797i;

        /* renamed from: j, reason: collision with root package name */
        public final u<r> f329798j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC36154b> f329799k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f329800l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.analytics.b> f329801m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.g> f329802n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.widget_filters.mvi.s f329803o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.g> f329804p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.use_case.a> f329805q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.B> f329806r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.utils.b> f329807s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.use_case.n> f329808t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.use_case.e> f329809u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.use_case.k> f329810v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.widget_filters.domain.use_case.h> f329811w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Gson> f329812x;

        /* renamed from: y, reason: collision with root package name */
        public final u<v> f329813y;

        /* renamed from: z, reason: collision with root package name */
        public final u<y> f329814z;

        /* compiled from: DaggerWidgetFiltersComponent.java */
        /* renamed from: com.avito.android.widget_filters.di.a$c$a, reason: collision with other inner class name */
        public static final class C10247a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329815a;

            public C10247a(com.avito.android.widget_filters.di.c cVar) {
                this.f329815a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f329815a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class b implements u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f329816a;

            public b(InterfaceC44697a interfaceC44697a) {
                this.f329816a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f329816a.d6();
                t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        /* renamed from: com.avito.android.widget_filters.di.a$c$c, reason: collision with other inner class name */
        public static final class C10248c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329817a;

            public C10248c(com.avito.android.widget_filters.di.c cVar) {
                this.f329817a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329817a.g();
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329818a;

            public d(com.avito.android.widget_filters.di.c cVar) {
                this.f329818a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f329818a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class e implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329819a;

            public e(com.avito.android.widget_filters.di.c cVar) {
                this.f329819a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f329819a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class f implements u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f329820a;

            public f(InterfaceC44697a interfaceC44697a) {
                this.f329820a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f329820a.u0();
                t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class g implements u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329821a;

            public g(com.avito.android.widget_filters.di.c cVar) {
                this.f329821a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329821a.H();
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class h implements u<AK0.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329822a;

            public h(com.avito.android.widget_filters.di.c cVar) {
                this.f329822a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AK0.i iVarQ2 = this.f329822a.q2();
                t.c(iVarQ2);
                return iVarQ2;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class i implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f329823a;

            public i(InterfaceC44697a interfaceC44697a) {
                this.f329823a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329823a.i3();
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329824a;

            public j(com.avito.android.widget_filters.di.c cVar) {
                this.f329824a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f329824a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class k implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329825a;

            public k(com.avito.android.widget_filters.di.c cVar) {
                this.f329825a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f329825a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class l implements u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329826a;

            public l(com.avito.android.widget_filters.di.c cVar) {
                this.f329826a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329826a.J();
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class m implements u<com.avito.android.geo_common.interactor.B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f329827a;

            public m(InterfaceC44697a interfaceC44697a) {
                this.f329827a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.B bQ3 = this.f329827a.q3();
                t.c(bQ3);
                return bQ3;
            }
        }

        /* compiled from: DaggerWidgetFiltersComponent.java */
        public static final class n implements u<PP0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.widget_filters.di.c f329828a;

            public n(com.avito.android.widget_filters.di.c cVar) {
                this.f329828a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                PP0.a aVarRg = this.f329828a.rg();
                t.c(aVarRg);
                return aVarRg;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.widget_filters.di.c cVar, cv.b bVar, InterfaceC44697a interfaceC44697a, C28478k c28478k, WidgetFiltersOpenParams widgetFiltersOpenParams, FragmentManager fragmentManager, T0 t02, Y41.l lVar, C10246a c10246a) {
            this.f329789a = bVar;
            this.f329790b = cVar;
            this.f329791c = dagger.internal.l.a(widgetFiltersOpenParams);
            this.f329792d = new n(cVar);
            this.f329793e = new d(cVar);
            this.f329798j = dagger.internal.B.a(com.avito.android.location.A.a(new i(interfaceC44697a), new g(cVar), new m(interfaceC44697a), new b(interfaceC44697a)));
            com.avito.android.widget_filters.di.i iVar = i.a.f329836a;
            this.f329799k = dagger.internal.g.d(new com.avito.android.widget_filters.domain.e(iVar));
            u<com.avito.android.widget_filters.analytics.b> uVarD = dagger.internal.g.d(new com.avito.android.widget_filters.analytics.d(this.f329791c, new C10247a(cVar)));
            this.f329801m = uVarD;
            u<com.avito.android.widget_filters.domain.g> uVarD2 = dagger.internal.g.d(new com.avito.android.widget_filters.domain.n(this.f329791c, uVarD, this.f329792d, this.f329793e, this.f329798j, this.f329799k));
            this.f329802n = uVarD2;
            this.f329803o = new com.avito.android.widget_filters.mvi.s(this.f329791c, uVarD2, iVar);
            this.f329805q = dagger.internal.g.d(new com.avito.android.widget_filters.domain.use_case.d(new f(interfaceC44697a), this.f329793e));
            this.f329806r = dagger.internal.g.d(D.a());
            this.f329807s = dagger.internal.g.d(com.avito.android.widget_filters.utils.d.a());
            this.f329808t = dagger.internal.g.d(p.a());
            this.f329809u = dagger.internal.g.d(new com.avito.android.widget_filters.domain.use_case.g(this.f329807s));
            this.f329810v = dagger.internal.g.d(new com.avito.android.widget_filters.domain.use_case.m(this.f329807s));
            this.f329811w = dagger.internal.g.d(com.avito.android.widget_filters.domain.use_case.j.a());
            u<v> uVarD3 = dagger.internal.g.d(new x(new e(cVar)));
            this.f329813y = uVarD3;
            this.f329814z = dagger.internal.g.d(new com.avito.android.widget_filters.domain.A(uVarD3, this.f329808t, this.f329809u, this.f329810v, this.f329811w));
            h hVar = new h(cVar);
            C10248c c10248c = new C10248c(cVar);
            this.f329764B = c10248c;
            u<AK0.l> uVarD4 = dagger.internal.g.d(new com.avito.android.widget_filters.di.j(hVar, c10248c));
            this.f329765C = uVarD4;
            u<s> uVarD5 = dagger.internal.g.d(new com.avito.android.widget_filters.domain.u(uVarD4, this.f329793e));
            this.f329766D = uVarD5;
            this.f329767E = dagger.internal.g.d(new com.avito.android.widget_filters.domain.r(uVarD5));
            u<com.avito.android.widget_filters.analytics.e> uVarD6 = dagger.internal.g.d(com.avito.android.widget_filters.analytics.k.a());
            this.f329768F = uVarD6;
            u<com.avito.android.widget_filters.domain.use_case.a> uVar = this.f329805q;
            u<com.avito.android.widget_filters.domain.B> uVar2 = this.f329806r;
            u<com.avito.android.widget_filters.domain.g> uVar3 = this.f329802n;
            u<com.avito.android.widget_filters.utils.b> uVar4 = this.f329807s;
            this.f329769G = new q(uVarD6, uVar, uVar2, uVar3, uVar4, this.f329814z, this.f329767E, this.f329801m);
            u<MP0.a> uVarD7 = dagger.internal.g.d(new MP0.c(uVar4));
            this.f329770H = uVarD7;
            this.f329771I = dagger.internal.g.d(new com.avito.android.widget_filters.mvi.D(uVarD7, this.f329807s));
            u<MP0.e> uVarD8 = dagger.internal.g.d(new MP0.g(new k(cVar), this.f329807s, new l(cVar)));
            this.f329774L = uVarD8;
            this.f329775M = new A(uVarD8, this.f329771I, this.f329808t, this.f329809u, this.f329811w, this.f329810v, this.f329813y);
            this.f329776N = new j(cVar);
            this.f329777O = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f329776N);
            this.f329778P = new KP0.e(new com.avito.android.widget_filters.mvi.v(this.f329803o, this.f329769G, com.avito.android.widget_filters.mvi.x.a(), this.f329775M, this.f329777O));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f329779Q = lVarA;
            this.f329780R = dagger.internal.g.d(new com.avito.android.widget_filters.ui.items.category.f(new com.avito.android.widget_filters.ui.items.category.k(lVarA)));
            this.f329781S = new com.avito.android.widget_filters.ui.items.dates.j(this.f329779Q);
            this.f329782T = dagger.internal.g.d(new com.avito.android.widget_filters.ui.items.dates.d(this.f329781S, dagger.internal.l.a(fragmentManager)));
            this.f329783U = dagger.internal.g.d(new com.avito.android.widget_filters.ui.items.guests.g(new com.avito.android.widget_filters.ui.items.guests.j(this.f329779Q)));
            this.f329784V = dagger.internal.g.d(new com.avito.android.widget_filters.ui.items.location.d(new com.avito.android.widget_filters.ui.items.location.h(this.f329779Q)));
            A.b bVarA = dagger.internal.A.a(4, 0);
            u<TV0.b<?, ?>> uVar5 = this.f329780R;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar5);
            list.add(this.f329782T);
            list.add(this.f329783U);
            list.add(this.f329784V);
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new com.avito.android.widget_filters.di.f(bVarA.b()));
            this.f329785W = uVarD9;
            u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new com.avito.android.widget_filters.di.e(uVarD9));
            this.f329786X = uVarD10;
            this.f329787Y = dagger.internal.g.d(new com.avito.android.widget_filters.di.g(uVarD10, this.f329785W, com.avito.android.widget_filters.ui.items.h.a()));
            this.f329788Z = dagger.internal.g.d(new com.avito.android.widget_filters.di.k(dagger.internal.l.a(t02), this.f329764B));
        }

        @Override // com.avito.android.widget_filters.di.b
        public final void a(WidgetFiltersFragment widgetFiltersFragment) {
            widgetFiltersFragment.f330272n0 = this.f329778P;
            widgetFiltersFragment.f330274p0 = this.f329777O.get();
            widgetFiltersFragment.f330275q0 = this.f329787Y.get();
            widgetFiltersFragment.f330276r0 = this.f329788Z.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f329789a.u4();
            t.c(aVarU4);
            widgetFiltersFragment.f330277s0 = aVarU4;
            widgetFiltersFragment.f330278t0 = this.f329807s.get();
            this.f329790b.J();
        }
    }

    public static b.a a() {
        return new b();
    }
}
