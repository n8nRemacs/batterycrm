package com.avito.android.orders.feature.beduin_orders_list.di;

import com.avito.android.Z0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment;
import com.avito.android.orders.feature.beduin_orders_list.di.a;
import com.avito.android.orders.feature.beduin_orders_list.di.f;
import com.avito.android.orders.feature.beduin_orders_list.mvi.A;
import com.avito.android.orders.feature.beduin_orders_list.mvi.D;
import com.avito.android.orders.feature.beduin_orders_list.mvi.q;
import com.avito.android.orders.feature.beduin_orders_list.mvi.v;
import com.avito.android.orders.feature.beduin_orders_list.mvi.x;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import n50.InterfaceC44195a;
import n50.InterfaceC44196b;

/* compiled from: DaggerBeduinOrdersComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class i {

    /* compiled from: DaggerBeduinOrdersComponent.java */
    public static final class b implements com.avito.android.orders.feature.beduin_orders_list.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.orders.feature.beduin_orders_list.di.c f210027a;

        /* renamed from: b, reason: collision with root package name */
        public final C28478k f210028b;

        /* renamed from: c, reason: collision with root package name */
        public final u<gj.d> f210029c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f210030d;

        /* renamed from: e, reason: collision with root package name */
        public final u<a.b> f210031e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Wi.b> f210032f = dagger.internal.g.d(f.a.f210023a);

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f210033g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.orders.feature.beduin_orders_list.di.h f210034h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f210035i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.orders.feature.beduin_orders_list.f> f210036j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f210037k;

        /* renamed from: l, reason: collision with root package name */
        public final u<X40.a> f210038l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.orders.feature.beduin_orders_list.data.e f210039m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f210040n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC44196b> f210041o;

        /* renamed from: p, reason: collision with root package name */
        public final u<W40.b> f210042p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Z0> f210043q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f210044r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.orders.feature.beduin_orders_list.e f210045s;

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class a implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210046a;

            public a(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210046a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210046a.El();
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        /* renamed from: com.avito.android.orders.feature.beduin_orders_list.di.i$b$b, reason: collision with other inner class name */
        public static final class C6272b implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210047a;

            public C6272b(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210047a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f210047a.h0();
                t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f210048a;

            public c(cv.b bVar) {
                this.f210048a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f210048a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class d implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f210049a;

            public d(cv.b bVar) {
                this.f210049a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f210049a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210050a;

            public e(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210050a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f210050a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class f implements u<InterfaceC44196b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44195a f210051a;

            public f(InterfaceC44195a interfaceC44195a) {
                this.f210051a = interfaceC44195a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44196b interfaceC44196bN6 = this.f210051a.N6();
                t.c(interfaceC44196bN6);
                return interfaceC44196bN6;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class g implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210052a;

            public g(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210052a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210052a.W();
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class h implements u<X40.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210053a;

            public h(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210053a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                X40.a aVarZ9 = this.f210053a.z9();
                t.c(aVarZ9);
                return aVarZ9;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        /* renamed from: com.avito.android.orders.feature.beduin_orders_list.di.i$b$i, reason: collision with other inner class name */
        public static final class C6273i implements u<W40.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210054a;

            public C6273i(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210054a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                W40.b bVarW2 = this.f210054a.W2();
                t.c(bVarW2);
                return bVarW2;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210055a;

            public j(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210055a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f210055a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerBeduinOrdersComponent.java */
        public static final class k implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders.feature.beduin_orders_list.di.c f210056a;

            public k(com.avito.android.orders.feature.beduin_orders_list.di.c cVar) {
                this.f210056a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210056a.o();
            }
        }

        public b(com.avito.android.orders.feature.beduin_orders_list.di.c cVar, InterfaceC44195a interfaceC44195a, cv.b bVar, com.avito.android.orders.feature.beduin_orders_list.i iVar, C28478k c28478k, a aVar) {
            this.f210027a = cVar;
            this.f210028b = c28478k;
            this.f210029c = new a(cVar);
            this.f210030d = new c(bVar);
            this.f210031e = new d(bVar);
            l lVarA = l.a(c28478k);
            com.avito.android.orders.feature.beduin_orders_list.di.h hVar = new com.avito.android.orders.feature.beduin_orders_list.di.h(lVarA, new j(cVar));
            this.f210034h = hVar;
            u<InterfaceC40691b> uVarD = dagger.internal.g.d(new com.avito.android.orders.feature.beduin_orders_list.di.e(this.f210029c, this.f210030d, this.f210031e, this.f210032f, lVarA, hVar));
            this.f210035i = uVarD;
            this.f210036j = dagger.internal.g.d(new com.avito.android.orders.feature.beduin_orders_list.di.g(uVarD));
            this.f210039m = new com.avito.android.orders.feature.beduin_orders_list.data.e(new e(cVar), new h(cVar));
            this.f210040n = new k(cVar);
            l lVarB = l.b(iVar);
            f fVar = new f(interfaceC44195a);
            com.avito.android.orders.feature.beduin_orders_list.data.e eVar = this.f210039m;
            u<com.avito.android.orders.feature.beduin_orders_list.f> uVar = this.f210036j;
            A a12 = new A(eVar, uVar, lVarB, fVar);
            C6273i c6273i = new C6273i(cVar);
            u<InterfaceC40691b> uVar2 = this.f210035i;
            this.f210045s = new com.avito.android.orders.feature.beduin_orders_list.e(this.f210035i, new com.avito.android.orders.feature.beduin_orders_list.mvi.t(new q(uVar, uVar2, this.f210032f, eVar, this.f210040n, a12, c6273i, new D(eVar, uVar2), new g(cVar), new C6272b(cVar)), new com.avito.android.orders.feature.beduin_orders_list.mvi.e(uVar2, a12, fVar), v.a(), x.a(), this.f210034h));
        }

        @Override // com.avito.android.orders.feature.beduin_orders_list.di.a
        public final void a(BeduinOrdersFragment beduinOrdersFragment) {
            beduinOrdersFragment.f209966n0 = this.f210045s;
            com.avito.android.orders.feature.beduin_orders_list.di.c cVar = this.f210027a;
            beduinOrdersFragment.f209968p0 = cVar.Ad();
            beduinOrdersFragment.f209969q0 = cVar.sd();
            InterfaceC28481c interfaceC28481cB = cVar.b();
            t.c(interfaceC28481cB);
            com.avito.android.orders.feature.beduin_orders_list.di.d.f210016a.getClass();
            beduinOrdersFragment.f209970r0 = interfaceC28481cB.a(this.f210028b);
        }
    }

    /* compiled from: DaggerBeduinOrdersComponent.java */
    public static final class c implements a.InterfaceC6271a {
        public c() {
        }

        @Override // com.avito.android.orders.feature.beduin_orders_list.di.a.InterfaceC6271a
        public final com.avito.android.orders.feature.beduin_orders_list.di.a a(com.avito.android.orders.feature.beduin_orders_list.di.c cVar, InterfaceC44195a interfaceC44195a, InterfaceC39417a interfaceC39417a, com.avito.android.orders.feature.beduin_orders_list.i iVar, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC44195a, interfaceC39417a, iVar, c28478k, null);
        }
    }

    public static a.InterfaceC6271a a() {
        return new c();
    }
}
