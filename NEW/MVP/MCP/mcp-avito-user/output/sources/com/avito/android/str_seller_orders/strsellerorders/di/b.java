package com.avito.android.str_seller_orders.strsellerorders.di;

import Cz0.C13377a;
import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.T0;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersFragment;
import com.avito.android.str_seller_orders.strsellerorders.di.d;
import com.avito.android.str_seller_orders.strsellerorders.mvi.n;
import com.avito.android.str_seller_orders.strsellerorders.mvi.p;
import com.avito.android.str_seller_orders.strsellerorders.mvi.s;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import ez0.InterfaceC40183a;
import java.util.List;
import kotlin.G0;
import yF0.InterfaceC50108b;
import yz0.InterfaceC50328b;
import zz0.C50653c;
import zz0.InterfaceC50651a;

/* compiled from: DaggerStrSellerOrdersComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerStrSellerOrdersComponent.java */
    /* renamed from: com.avito.android.str_seller_orders.strsellerorders.di.b$b, reason: collision with other inner class name */
    public static final class C8733b implements d.a {
        public C8733b() {
        }

        @Override // com.avito.android.str_seller_orders.strsellerorders.di.d.a
        public final d a(cz0.e eVar, InterfaceC39417a interfaceC39417a, r rVar, Y41.l lVar, boolean z12, ActivityC22955m activityC22955m) {
            interfaceC39417a.getClass();
            return new c(new k(), new f(), new C13377a(), eVar, interfaceC39417a, rVar, lVar, Boolean.valueOf(z12), activityC22955m, null);
        }
    }

    /* compiled from: DaggerStrSellerOrdersComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.strsellerorders.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289711A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289712B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289713C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289714D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289715E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289716F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289717G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289718H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f289719I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289720J;

        /* renamed from: K, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289721K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f289722L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f289723M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f289724N;

        /* renamed from: O, reason: collision with root package name */
        public final u<SK0.b> f289725O;

        /* renamed from: P, reason: collision with root package name */
        public final u<InterfaceC50651a> f289726P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.l f289727Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerordersdialog.shared.a> f289728R;

        /* renamed from: a, reason: collision with root package name */
        public final Y41.l<? super InterfaceC50328b, G0> f289729a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f289730b;

        /* renamed from: c, reason: collision with root package name */
        public final cz0.e f289731c;

        /* renamed from: d, reason: collision with root package name */
        public final u<d1> f289732d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC40183a> f289733e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f289734f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerorders.domain.a> f289735g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.str_core.c> f289736h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC50108b> f289737i;

        /* renamed from: j, reason: collision with root package name */
        public final xz0.c f289738j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerorders.mvi.k f289739k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f289740l;

        /* renamed from: m, reason: collision with root package name */
        public final u<x> f289741m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f289742n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerorders.mvi.i f289743o;

        /* renamed from: p, reason: collision with root package name */
        public final u<J0> f289744p;

        /* renamed from: q, reason: collision with root package name */
        public final u<s> f289745q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Context> f289746r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerorders.mvi.r f289747s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f289748t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C28478k> f289749u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f289750v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerorders.l f289751w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f289752x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.e> f289753y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerorders.mvi.items.order.c> f289754z;

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289755a;

            public a(cz0.e eVar) {
                this.f289755a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f289755a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.strsellerorders.di.b$c$b, reason: collision with other inner class name */
        public static final class C8734b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289756a;

            public C8734b(cz0.e eVar) {
                this.f289756a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f289756a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.strsellerorders.di.b$c$c, reason: collision with other inner class name */
        public static final class C8735c implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289757a;

            public C8735c(cz0.e eVar) {
                this.f289757a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f289757a.p();
                t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289758a;

            public d(cz0.e eVar) {
                this.f289758a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f289758a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class e implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289759a;

            public e(cz0.e eVar) {
                this.f289759a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f289759a.g();
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class f implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289760a;

            public f(cz0.e eVar) {
                this.f289760a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f289760a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class g implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289761a;

            public g(cz0.e eVar) {
                this.f289761a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f289761a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class h implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289762a;

            public h(cz0.e eVar) {
                this.f289762a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f289762a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class i implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289763a;

            public i(cz0.e eVar) {
                this.f289763a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f289763a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class j implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289764a;

            public j(cz0.e eVar) {
                this.f289764a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f289764a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class k implements u<InterfaceC40183a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289765a;

            public k(cz0.e eVar) {
                this.f289765a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40183a interfaceC40183aL8 = this.f289765a.l8();
                t.c(interfaceC40183aL8);
                return interfaceC40183aL8;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class l implements u<InterfaceC50108b> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289766a;

            public l(cz0.e eVar) {
                this.f289766a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f289766a.q9();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_seller_orders.strsellerorders.di.k kVar, com.avito.android.str_seller_orders.strsellerorders.di.f fVar, C13377a c13377a, cz0.e eVar, cv.b bVar, r rVar, Y41.l lVar, Boolean bool, T0 t02, a aVar) {
            this.f289729a = lVar;
            this.f289730b = bVar;
            this.f289731c = eVar;
            j jVar = new j(eVar);
            this.f289732d = jVar;
            k kVar2 = new k(eVar);
            h hVar = new h(eVar);
            this.f289734f = hVar;
            this.f289735g = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.domain.d(jVar, kVar2, hVar));
            this.f289736h = dagger.internal.g.d(new com.avito.android.str_core.f(this.f289732d));
            this.f289738j = new xz0.c(new l(eVar));
            dagger.internal.l lVarA = dagger.internal.l.a(bool);
            u<com.avito.android.str_seller_orders.strsellerorders.domain.a> uVar = this.f289735g;
            u<com.avito.android.str_core.c> uVar2 = this.f289736h;
            xz0.c cVar = this.f289738j;
            this.f289739k = new com.avito.android.str_seller_orders.strsellerorders.mvi.k(uVar, uVar2, cVar, this.f289734f, lVarA);
            this.f289743o = new com.avito.android.str_seller_orders.strsellerorders.mvi.i(uVar, cVar, new a(eVar), new g(eVar), new f(eVar));
            u<s> uVarD = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.u(new i(eVar)));
            this.f289745q = uVarD;
            this.f289747s = new com.avito.android.str_seller_orders.strsellerorders.mvi.r(uVarD, new e(eVar));
            this.f289748t = new d(eVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.di.l(kVar, dagger.internal.l.a(rVar)));
            this.f289749u = uVarD2;
            this.f289750v = dagger.internal.g.d(new m(kVar, this.f289748t, uVarD2));
            this.f289751w = new com.avito.android.str_seller_orders.strsellerorders.l(new n(this.f289739k, this.f289743o, p.a(), this.f289747s, this.f289750v));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f289752x = lVarA2;
            this.f289753y = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.h(lVarA2));
            this.f289754z = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.order.f(this.f289752x));
            this.f289711A = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.header.c(com.avito.android.str_seller_orders.strsellerorders.mvi.items.header.e.a()));
            this.f289712B = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters.d(this.f289753y));
            this.f289713C = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.order.b(this.f289754z));
            this.f289714D = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.header_stub.c(com.avito.android.str_seller_orders.strsellerorders.mvi.items.header_stub.e.a()));
            this.f289715E = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.filters_stub.c(com.avito.android.str_seller_orders.strsellerorders.mvi.items.filters_stub.e.a()));
            this.f289716F = dagger.internal.g.d(new com.avito.android.str_seller_orders.common.items.order_stub.c(com.avito.android.str_seller_orders.common.items.order_stub.e.a()));
            this.f289717G = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.widget_stub.c(com.avito.android.str_seller_orders.strsellerorders.mvi.items.widget_stub.e.a()));
            this.f289718H = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget.c(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.calendar_widget.f(this.f289752x)));
            this.f289720J = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.c(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.f(this.f289752x), new C8734b(eVar)));
            this.f289721K = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.banner.c(new com.avito.android.str_seller_orders.strsellerorders.mvi.items.banner.f(this.f289752x)));
            A.b bVarA = A.a(10, 0);
            u<TV0.b<?, ?>> uVar3 = this.f289711A;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar3);
            list.add(this.f289712B);
            list.add(this.f289713C);
            list.add(this.f289714D);
            list.add(this.f289715E);
            list.add(this.f289716F);
            list.add(this.f289717G);
            list.add(this.f289718H);
            list.add(this.f289720J);
            list.add(this.f289721K);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.di.i(fVar, bVarA.b()));
            this.f289722L = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.di.h(fVar, uVarD3));
            this.f289723M = uVarD4;
            this.f289724N = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerorders.di.j(fVar, uVarD4, this.f289722L));
            this.f289726P = dagger.internal.g.d(new C50653c(new C8735c(eVar)));
            this.f289727Q = dagger.internal.l.a(t02);
            this.f289728R = dagger.internal.g.d(new Cz0.b(c13377a, this.f289727Q, new com.avito.android.str_seller_orders.strsellerordersdialog.shared.b(new com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.i(com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.b.a(), com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.k.a(), com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.f.a()))));
        }

        @Override // com.avito.android.str_seller_orders.strsellerorders.di.d
        public final void a(StrSellerOrdersFragment strSellerOrdersFragment) {
            strSellerOrdersFragment.f289656n0 = this.f289751w;
            strSellerOrdersFragment.f289658p0 = this.f289753y.get();
            strSellerOrdersFragment.f289659q0 = this.f289754z.get();
            strSellerOrdersFragment.f289660r0 = this.f289750v.get();
            strSellerOrdersFragment.f289661s0 = this.f289724N.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f289730b.u4();
            t.c(aVarU4);
            strSellerOrdersFragment.f289662t0 = aVarU4;
            strSellerOrdersFragment.f289663u0 = this.f289726P.get();
            cz0.e eVar = this.f289731c;
            eVar.J();
            com.avito.android.util.text.a aVarE = eVar.e();
            t.c(aVarE);
            strSellerOrdersFragment.f289664v0 = aVarE;
            strSellerOrdersFragment.f289665w0 = eVar.M0();
            strSellerOrdersFragment.f289666x0 = this.f289728R.get();
        }
    }

    public static d.a a() {
        return new C8733b();
    }
}
