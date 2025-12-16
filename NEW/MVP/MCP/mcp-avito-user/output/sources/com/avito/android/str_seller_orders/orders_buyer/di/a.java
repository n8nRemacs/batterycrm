package com.avito.android.str_seller_orders.orders_buyer.di;

import Y41.l;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders.orders_buyer.StrOrdersBuyerFragment;
import com.avito.android.str_seller_orders.orders_buyer.di.b;
import com.avito.android.str_seller_orders.orders_buyer.mvi.j;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import oz0.C44965c;
import oz0.InterfaceC44963a;

/* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.orders_buyer.di.b.a
        public final com.avito.android.str_seller_orders.orders_buyer.di.b a(cz0.e eVar, InterfaceC39417a interfaceC39417a, r rVar, l lVar) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, rVar, lVar, null);
        }
    }

    /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.orders_buyer.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f288925a;

        /* renamed from: b, reason: collision with root package name */
        public final u<d1> f288926b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f288927c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_buyer.domain.a> f288928d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_buyer.mvi.e f288929e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f288930f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_buyer.mvi.c f288931g;

        /* renamed from: h, reason: collision with root package name */
        public final u<J0> f288932h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC44963a> f288933i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_buyer.mvi.l f288934j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f288935k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C28478k> f288936l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f288937m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_buyer.c f288938n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288939o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f288940p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288941q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288942r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_buyer.items.order.h f288943s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288944t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288945u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f288946v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f288947w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f288948x;

        /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders_buyer.di.a$c$a, reason: collision with other inner class name */
        public static final class C8696a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288949a;

            public C8696a(cz0.e eVar) {
                this.f288949a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f288949a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288950a;

            public b(cz0.e eVar) {
                this.f288950a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f288950a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders_buyer.di.a$c$c, reason: collision with other inner class name */
        public static final class C8697c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288951a;

            public C8697c(cz0.e eVar) {
                this.f288951a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f288951a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
        public static final class d implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288952a;

            public d(cz0.e eVar) {
                this.f288952a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f288952a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrOrdersBuyerFragmentComponent.java */
        public static final class e implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f288953a;

            public e(cz0.e eVar) {
                this.f288953a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f288953a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        public c() {
            throw null;
        }

        public c(cz0.e eVar, cv.b bVar, r rVar, l lVar, C8695a c8695a) {
            this.f288925a = bVar;
            u<com.avito.android.str_seller_orders.orders_buyer.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.domain.g(new e(eVar), new C8697c(eVar)));
            this.f288928d = uVarD;
            this.f288929e = new com.avito.android.str_seller_orders.orders_buyer.mvi.e(uVarD);
            this.f288931g = new com.avito.android.str_seller_orders.orders_buyer.mvi.c(uVarD, new C8696a(eVar));
            u<InterfaceC44963a> uVarD2 = dagger.internal.g.d(new C44965c(new d(eVar)));
            this.f288933i = uVarD2;
            this.f288934j = new com.avito.android.str_seller_orders.orders_buyer.mvi.l(uVarD2);
            this.f288935k = new b(eVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.di.d(dagger.internal.l.a(rVar)));
            this.f288936l = uVarD3;
            this.f288937m = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.di.e(uVarD3, this.f288935k));
            this.f288938n = new com.avito.android.str_seller_orders.orders_buyer.c(new com.avito.android.str_seller_orders.orders_buyer.mvi.h(this.f288929e, this.f288931g, j.a(), this.f288934j, this.f288937m));
            this.f288939o = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.items.header.b(com.avito.android.str_seller_orders.orders_buyer.items.header.e.a()));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f288940p = lVarA;
            this.f288941q = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.items.section_empty.b(new com.avito.android.str_seller_orders.orders_buyer.items.section_empty.f(lVarA)));
            this.f288942r = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.items.button_pagination.b(new com.avito.android.str_seller_orders.orders_buyer.items.button_pagination.f(this.f288940p)));
            com.avito.android.str_seller_orders.orders_buyer.items.order.h hVar = new com.avito.android.str_seller_orders.orders_buyer.items.order.h(this.f288940p);
            this.f288943s = hVar;
            this.f288944t = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.items.order.b(hVar));
            this.f288945u = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_buyer.items.order.d(this.f288943s));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f288939o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f288941q);
            list.add(this.f288942r);
            list.add(this.f288944t);
            list.add(this.f288945u);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new h(bVarA.b()));
            this.f288946v = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new g(uVarD4));
            this.f288947w = uVarD5;
            this.f288948x = dagger.internal.g.d(new i(uVarD5, this.f288946v));
        }

        @Override // com.avito.android.str_seller_orders.orders_buyer.di.b
        public final void a(StrOrdersBuyerFragment strOrdersBuyerFragment) {
            strOrdersBuyerFragment.f288905n0 = this.f288938n;
            strOrdersBuyerFragment.f288907p0 = this.f288937m.get();
            strOrdersBuyerFragment.f288908q0 = this.f288948x.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f288925a.u4();
            t.c(aVarU4);
            strOrdersBuyerFragment.f288909r0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
