package com.avito.android.str_seller_orders.strsellerordersrange.di;

import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersrange.di.e;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.n;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.o;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.q;
import com.avito.android.str_seller_orders.strsellerordersrange.ui.StrSellerOrdersRangeFragment;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ez0.InterfaceC40183a;
import java.util.List;

/* compiled from: DaggerStrSellerOrdersRangeComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.strsellerordersrange.di.e.a
        public final e a(r rVar, cz0.e eVar, InterfaceC39417a interfaceC39417a, String str, String str2, String str3, boolean z12) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, rVar, str, str2, str3, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.strsellerordersrange.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f290208a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f290209b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f290210c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f290211d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.c> f290212e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290213f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290214g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290215h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290216i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290217j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f290218k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC40183a> f290219l;

        /* renamed from: m, reason: collision with root package name */
        public final u<R0> f290220m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerordersrange.domain.b> f290221n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerordersrange.mvi.e f290222o;

        /* renamed from: p, reason: collision with root package name */
        public final l f290223p;

        /* renamed from: q, reason: collision with root package name */
        public final l f290224q;

        /* renamed from: r, reason: collision with root package name */
        public final l f290225r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerordersrange.mvi.g f290226s;

        /* renamed from: t, reason: collision with root package name */
        public final u<J0> f290227t;

        /* renamed from: u, reason: collision with root package name */
        public final u<o> f290228u;

        /* renamed from: v, reason: collision with root package name */
        public final n f290229v;

        /* renamed from: w, reason: collision with root package name */
        public final Ez0.f f290230w;

        /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.strsellerordersrange.di.a$c$a, reason: collision with other inner class name */
        public static final class C8759a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290231a;

            public C8759a(cz0.e eVar) {
                this.f290231a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f290231a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290232a;

            public b(cz0.e eVar) {
                this.f290232a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f290232a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.strsellerordersrange.di.a$c$c, reason: collision with other inner class name */
        public static final class C8760c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290233a;

            public C8760c(cz0.e eVar) {
                this.f290233a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f290233a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
        public static final class d implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290234a;

            public d(cz0.e eVar) {
                this.f290234a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f290234a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrSellerOrdersRangeComponent.java */
        public static final class e implements u<InterfaceC40183a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290235a;

            public e(cz0.e eVar) {
                this.f290235a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40183a interfaceC40183aL8 = this.f290235a.l8();
                t.c(interfaceC40183aL8);
                return interfaceC40183aL8;
            }
        }

        public c(cz0.e eVar, cv.b bVar, r rVar, String str, String str2, String str3, Boolean bool, C8758a c8758a) {
            this.f290208a = bVar;
            this.f290209b = new b(eVar);
            u<C28478k> uVarD = dagger.internal.g.d(new j(l.a(rVar)));
            this.f290210c = uVarD;
            this.f290211d = dagger.internal.g.d(new k(uVarD, this.f290209b));
            u<com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.c> uVarD2 = dagger.internal.g.d(com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.f.a());
            this.f290212e = uVarD2;
            this.f290213f = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerordersrange.ui.items.order.b(uVarD2));
            this.f290214g = dagger.internal.g.d(new com.avito.android.str_seller_orders.common.items.order_stub.c(com.avito.android.str_seller_orders.common.items.order_stub.e.a()));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f290213f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f290214g);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new h(bVarA.b()));
            this.f290215h = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new g(uVarD3));
            this.f290216i = uVarD4;
            this.f290217j = dagger.internal.g.d(new i(uVarD4, this.f290215h));
            u<com.avito.android.str_seller_orders.strsellerordersrange.domain.b> uVarD5 = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerordersrange.domain.f(new C8759a(eVar), new e(eVar), new C8760c(eVar)));
            this.f290221n = uVarD5;
            this.f290222o = new com.avito.android.str_seller_orders.strsellerordersrange.mvi.e(uVarD5);
            this.f290223p = l.a(str);
            this.f290224q = l.a(str2);
            this.f290225r = l.a(str3);
            this.f290226s = new com.avito.android.str_seller_orders.strsellerordersrange.mvi.g(this.f290223p, this.f290224q, this.f290225r, l.a(bool), this.f290221n);
            u<o> uVarD6 = dagger.internal.g.d(new q(new d(eVar)));
            this.f290228u = uVarD6;
            this.f290229v = new n(uVarD6);
            this.f290230w = new Ez0.f(new com.avito.android.str_seller_orders.strsellerordersrange.mvi.j(this.f290222o, this.f290226s, com.avito.android.str_seller_orders.strsellerordersrange.mvi.l.a(), this.f290229v, this.f290211d, this.f290223p, this.f290224q, this.f290225r));
        }

        @Override // com.avito.android.str_seller_orders.strsellerordersrange.di.e
        public final void a(StrSellerOrdersRangeFragment strSellerOrdersRangeFragment) {
            strSellerOrdersRangeFragment.f290324n0 = this.f290211d.get();
            strSellerOrdersRangeFragment.f290325o0 = this.f290217j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f290208a.u4();
            t.c(aVarU4);
            strSellerOrdersRangeFragment.f290326p0 = aVarU4;
            strSellerOrdersRangeFragment.f290327q0 = this.f290230w;
            strSellerOrdersRangeFragment.f290328r0 = this.f290212e.get();
        }
    }

    public static e.a a() {
        return new b();
    }
}
