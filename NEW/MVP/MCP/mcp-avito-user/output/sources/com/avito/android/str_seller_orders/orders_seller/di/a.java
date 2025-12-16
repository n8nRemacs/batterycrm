package com.avito.android.str_seller_orders.orders_seller.di;

import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersFragment;
import com.avito.android.str_seller_orders.orders_seller.StrSellerOrdersOpenParams;
import com.avito.android.str_seller_orders.orders_seller.di.b;
import com.avito.android.str_seller_orders.orders_seller.domain.p;
import com.avito.android.str_seller_orders.orders_seller.domain.s;
import com.avito.android.str_seller_orders.orders_seller.domain.w;
import com.avito.android.str_seller_orders.orders_seller.domain.y;
import com.avito.android.str_seller_orders.orders_seller.e;
import com.avito.android.str_seller_orders.orders_seller.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import ez0.InterfaceC40183a;
import java.util.List;
import rz0.InterfaceC47945a;
import yF0.InterfaceC50108b;

/* compiled from: DaggerStrSellerOrdersComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerOrdersComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.orders_seller.di.b.a
        public final com.avito.android.str_seller_orders.orders_seller.di.b a(cz0.e eVar, InterfaceC39417a interfaceC39417a, r rVar, StrSellerOrdersOpenParams strSellerOrdersOpenParams, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new c(new l(), new e(), eVar, interfaceC39417a, rVar, strSellerOrdersOpenParams, lVar, null);
        }
    }

    /* compiled from: DaggerStrSellerOrdersComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.orders_seller.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_seller.i f289248A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f289249B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289250C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289251D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289252E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289253F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289254G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289255H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f289256I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289257J;

        /* renamed from: K, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289258K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f289259L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f289260M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f289261N;

        /* renamed from: O, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289262O;

        /* renamed from: P, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289263P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289264Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289265R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f289266S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f289267T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f289268U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.l f289269V;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f289270a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f289271b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC40183a> f289272c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f289273d;

        /* renamed from: e, reason: collision with root package name */
        public final u<w> f289274e;

        /* renamed from: f, reason: collision with root package name */
        public final u<s> f289275f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC50108b> f289276g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_seller.domain.c f289277h;

        /* renamed from: i, reason: collision with root package name */
        public final u<d1> f289278i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.str_core.c> f289279j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_seller.mvi.g f289280k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_seller.domain.d> f289281l;

        /* renamed from: m, reason: collision with root package name */
        public final u<p> f289282m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_seller.domain.m> f289283n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28373a> f289284o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f289285p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC47945a> f289286q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_seller.domain.j> f289287r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_seller.mvi.e f289288s;

        /* renamed from: t, reason: collision with root package name */
        public final u<J0> f289289t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_seller.domain.g> f289290u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_seller.mvi.p> f289291v;

        /* renamed from: w, reason: collision with root package name */
        public final o f289292w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC28481c> f289293x;

        /* renamed from: y, reason: collision with root package name */
        public final u<C28478k> f289294y;

        /* renamed from: z, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f289295z;

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders_seller.di.a$c$a, reason: collision with other inner class name */
        public static final class C8710a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289296a;

            public C8710a(cz0.e eVar) {
                this.f289296a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f289296a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289297a;

            public b(cz0.e eVar) {
                this.f289297a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f289297a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders_seller.di.a$c$c, reason: collision with other inner class name */
        public static final class C8711c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289298a;

            public C8711c(cz0.e eVar) {
                this.f289298a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f289298a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class d implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289299a;

            public d(cz0.e eVar) {
                this.f289299a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f289299a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289300a;

            public e(cz0.e eVar) {
                this.f289300a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f289300a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class f implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289301a;

            public f(cz0.e eVar) {
                this.f289301a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f289301a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class g implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289302a;

            public g(cz0.e eVar) {
                this.f289302a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f289302a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class h implements u<InterfaceC40183a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289303a;

            public h(cz0.e eVar) {
                this.f289303a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40183a interfaceC40183aL8 = this.f289303a.l8();
                t.c(interfaceC40183aL8);
                return interfaceC40183aL8;
            }
        }

        /* compiled from: DaggerStrSellerOrdersComponent.java */
        public static final class i implements u<InterfaceC50108b> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f289304a;

            public i(cz0.e eVar) {
                this.f289304a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f289304a.q9();
            }
        }

        public c() {
            throw null;
        }

        public c(l lVar, com.avito.android.str_seller_orders.orders_seller.di.e eVar, cz0.e eVar2, cv.b bVar, r rVar, StrSellerOrdersOpenParams strSellerOrdersOpenParams, Y41.l lVar2, C8709a c8709a) {
            this.f289270a = bVar;
            this.f289271b = dagger.internal.l.a(strSellerOrdersOpenParams);
            this.f289272c = new h(eVar2);
            this.f289273d = new e(eVar2);
            u<w> uVarD = dagger.internal.g.d(y.a());
            this.f289274e = uVarD;
            this.f289275f = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.domain.u(uVarD, this.f289272c, this.f289273d));
            this.f289277h = new com.avito.android.str_seller_orders.orders_seller.domain.c(new i(eVar2));
            u<com.avito.android.str_core.c> uVarD2 = dagger.internal.g.d(new com.avito.android.str_core.f(new g(eVar2)));
            this.f289279j = uVarD2;
            this.f289280k = new com.avito.android.str_seller_orders.orders_seller.mvi.g(this.f289271b, this.f289275f, this.f289277h, uVarD2, this.f289273d);
            this.f289281l = dagger.internal.g.d(com.avito.android.str_seller_orders.orders_seller.domain.f.a());
            this.f289282m = dagger.internal.g.d(com.avito.android.str_seller_orders.orders_seller.domain.r.a());
            this.f289283n = dagger.internal.g.d(com.avito.android.str_seller_orders.orders_seller.domain.o.a());
            u<InterfaceC47945a> uVarD3 = dagger.internal.g.d(new rz0.c(new C8710a(eVar2), new d(eVar2)));
            this.f289286q = uVarD3;
            u<com.avito.android.str_seller_orders.orders_seller.domain.j> uVarD4 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.domain.l(uVarD3));
            this.f289287r = uVarD4;
            this.f289288s = new com.avito.android.str_seller_orders.orders_seller.mvi.e(this.f289275f, this.f289277h, this.f289281l, this.f289282m, this.f289283n, uVarD4);
            f fVar = new f(eVar2);
            this.f289289t = fVar;
            this.f289290u = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.domain.i(fVar));
            u<com.avito.android.str_seller_orders.orders_seller.mvi.p> uVarD5 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.mvi.s(this.f289289t));
            this.f289291v = uVarD5;
            this.f289292w = new o(uVarD5, this.f289290u, this.f289283n);
            this.f289293x = new C8711c(eVar2);
            u<C28478k> uVarD6 = dagger.internal.g.d(new m(lVar, dagger.internal.l.a(rVar)));
            this.f289294y = uVarD6;
            this.f289295z = dagger.internal.g.d(new n(lVar, this.f289293x, uVarD6));
            this.f289248A = new com.avito.android.str_seller_orders.orders_seller.i(new com.avito.android.str_seller_orders.orders_seller.mvi.k(this.f289280k, this.f289288s, com.avito.android.str_seller_orders.orders_seller.mvi.m.a(), this.f289292w, this.f289295z));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar2);
            this.f289249B = lVarA;
            this.f289250C = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.banner.b(new com.avito.android.str_seller_orders.orders_seller.items.banner.f(lVarA)));
            this.f289251D = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.widget.c(new com.avito.android.str_seller_orders.orders_seller.items.widget.g(this.f289249B)));
            this.f289252E = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.filters_stub.b(com.avito.android.str_seller_orders.orders_seller.items.filters_stub.e.a()));
            this.f289253F = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.header.b(com.avito.android.str_seller_orders.orders_seller.items.header.e.a()));
            this.f289254G = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.header_stub.b(com.avito.android.str_seller_orders.orders_seller.items.header_stub.e.a()));
            this.f289255H = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.widget_stub.b(com.avito.android.str_seller_orders.orders_seller.items.widget_stub.e.a()));
            this.f289257J = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.info_block.b(new com.avito.android.str_seller_orders.orders_seller.items.info_block.f(this.f289249B), new b(eVar2)));
            this.f289258K = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.filter.b(new com.avito.android.str_seller_orders.orders_seller.items.filter.f(this.f289249B)));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f289258K);
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.di.h(eVar, bVarA.b()));
            this.f289259L = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.di.g(eVar, uVarD7));
            this.f289260M = uVarD8;
            this.f289261N = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.di.i(eVar, uVarD8, this.f289259L));
            this.f289262O = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.filters.b(com.avito.android.str_seller_orders.orders_seller.items.filters.e.a(), this.f289261N));
            this.f289263P = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.booking_info.b(new com.avito.android.str_seller_orders.orders_seller.items.booking_info.f(this.f289249B)));
            this.f289264Q = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.items.empty_orders.b(com.avito.android.str_seller_orders.orders_seller.items.empty_orders.e.a()));
            this.f289265R = dagger.internal.g.d(new com.avito.android.str_seller_orders.common.items.order_stub.c(com.avito.android.str_seller_orders.common.items.order_stub.e.a()));
            A.b bVarA2 = A.a(11, 0);
            u<TV0.b<?, ?>> uVar = this.f289250C;
            List<u<T>> list = bVarA2.f393937a;
            list.add(uVar);
            list.add(this.f289251D);
            list.add(this.f289252E);
            list.add(this.f289253F);
            list.add(this.f289254G);
            list.add(this.f289255H);
            list.add(this.f289257J);
            list.add(this.f289262O);
            list.add(this.f289263P);
            list.add(this.f289264Q);
            list.add(this.f289265R);
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new j(eVar, bVarA2.b()));
            this.f289266S = uVarD9;
            u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_seller.di.f(eVar, uVarD9));
            this.f289267T = uVarD10;
            u<com.avito.konveyor.adapter.d> uVarD11 = dagger.internal.g.d(new k(eVar, uVarD10, this.f289266S, com.avito.android.str_seller_orders.orders_seller.items.b.a()));
            this.f289268U = uVarD11;
            dagger.internal.l lVar3 = this.f289249B;
            this.f289269V = dagger.internal.l.a(new com.avito.android.str_seller_orders.orders_seller.g(new com.avito.android.str_seller_orders.orders_seller.f(lVar3, uVarD11, new com.avito.android.str_seller_orders.orders_seller.items.d(lVar3))));
        }

        @Override // com.avito.android.str_seller_orders.orders_seller.di.b
        public final void a(StrSellerOrdersFragment strSellerOrdersFragment) {
            strSellerOrdersFragment.f289216n0 = this.f289248A;
            strSellerOrdersFragment.f289218p0 = this.f289295z.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f289270a.u4();
            t.c(aVarU4);
            strSellerOrdersFragment.f289219q0 = aVarU4;
            strSellerOrdersFragment.f289220r0 = (e.a) this.f289269V.f393949a;
            strSellerOrdersFragment.f289221s0 = this.f289268U.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
