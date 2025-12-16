package com.avito.android.order.feature.di;

import bj.InterfaceC25659b;
import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.feature.OrderFragment;
import com.avito.android.order.feature.di.b;
import com.avito.android.order.feature.di.module.h;
import com.avito.android.order.feature.mvi.C;
import com.avito.android.order.feature.mvi.w;
import com.avito.android.order.feature.mvi.y;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;

/* compiled from: DaggerOrderComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOrderComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.order.feature.di.b.a
        public final com.avito.android.order.feature.di.b a(String str, C28478k c28478k, com.avito.android.order.feature.di.c cVar, InterfaceC39417a interfaceC39417a, OrderScreenSegment orderScreenSegment) {
            str.getClass();
            interfaceC39417a.getClass();
            orderScreenSegment.getClass();
            return new c(new h(), cVar, interfaceC39417a, str, c28478k, orderScreenSegment, null);
        }
    }

    /* compiled from: DaggerOrderComponent.java */
    public static final class c implements com.avito.android.order.feature.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.order.feature.di.c f209531a;

        /* renamed from: b, reason: collision with root package name */
        public final u<gj.d> f209532b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f209533c;

        /* renamed from: d, reason: collision with root package name */
        public final u<a.b> f209534d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Wi.b> f209535e = dagger.internal.g.d(com.avito.android.order.feature.di.module.f.a());

        /* renamed from: f, reason: collision with root package name */
        public final l f209536f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f209537g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f209538h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f209539i;

        /* renamed from: j, reason: collision with root package name */
        public final u<N40.a> f209540j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f209541k;

        /* renamed from: l, reason: collision with root package name */
        public final u<dD.b> f209542l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.order.feature.data.e f209543m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.order.feature.a> f209544n;

        /* renamed from: o, reason: collision with root package name */
        public final l f209545o;

        /* renamed from: p, reason: collision with root package name */
        public final u<W40.b> f209546p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f209547q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Z0> f209548r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28373a> f209549s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.order.feature.mvi.l f209550t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.order.feature.h f209551u;

        /* compiled from: DaggerOrderComponent.java */
        /* renamed from: com.avito.android.order.feature.di.a$c$a, reason: collision with other inner class name */
        public static final class C6244a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209552a;

            public C6244a(com.avito.android.order.feature.di.c cVar) {
                this.f209552a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f209552a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class b implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209553a;

            public b(com.avito.android.order.feature.di.c cVar) {
                this.f209553a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f209553a.El();
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        /* renamed from: com.avito.android.order.feature.di.a$c$c, reason: collision with other inner class name */
        public static final class C6245c implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209554a;

            public C6245c(com.avito.android.order.feature.di.c cVar) {
                this.f209554a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f209554a.h0();
                t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f209555a;

            public d(cv.b bVar) {
                this.f209555a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f209555a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class e implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f209556a;

            public e(cv.b bVar) {
                this.f209556a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f209556a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209557a;

            public f(com.avito.android.order.feature.di.c cVar) {
                this.f209557a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f209557a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class g implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209558a;

            public g(com.avito.android.order.feature.di.c cVar) {
                this.f209558a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f209558a.W();
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class h implements u<N40.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209559a;

            public h(com.avito.android.order.feature.di.c cVar) {
                this.f209559a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                N40.a aVarO4 = this.f209559a.O4();
                t.c(aVarO4);
                return aVarO4;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class i implements u<dD.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209560a;

            public i(com.avito.android.order.feature.di.c cVar) {
                this.f209560a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f209560a.l6();
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class j implements u<W40.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209561a;

            public j(com.avito.android.order.feature.di.c cVar) {
                this.f209561a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                W40.b bVarW2 = this.f209561a.W2();
                t.c(bVarW2);
                return bVarW2;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class k implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.order.feature.di.c f209562a;

            public k(com.avito.android.order.feature.di.c cVar) {
                this.f209562a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f209562a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.order.feature.di.module.h hVar, com.avito.android.order.feature.di.c cVar, cv.b bVar, String str, C28478k c28478k, OrderScreenSegment orderScreenSegment, C6243a c6243a) {
            this.f209531a = cVar;
            this.f209532b = new b(cVar);
            this.f209533c = new d(bVar);
            this.f209534d = new e(bVar);
            l lVarA = l.a(c28478k);
            this.f209536f = lVarA;
            u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new com.avito.android.order.feature.di.module.i(hVar, new k(cVar), lVarA));
            this.f209538h = uVarD;
            u<InterfaceC40691b> uVarD2 = dagger.internal.g.d(new com.avito.android.order.feature.di.module.e(this.f209536f, uVarD, this.f209532b, this.f209533c, this.f209534d, this.f209535e));
            this.f209539i = uVarD2;
            this.f209543m = new com.avito.android.order.feature.data.e(new h(cVar), new f(cVar), new i(cVar));
            this.f209544n = dagger.internal.g.d(new com.avito.android.order.feature.di.module.g(uVarD2));
            this.f209545o = l.a(str);
            l lVarA2 = l.a(orderScreenSegment);
            com.avito.android.order.feature.data.e eVar = this.f209543m;
            u<com.avito.android.order.feature.a> uVar = this.f209544n;
            RK0.c cVar2 = RK0.c.f14341a;
            l lVar = this.f209545o;
            com.avito.android.order.feature.domain.b bVar2 = new com.avito.android.order.feature.domain.b(eVar, uVar, cVar2, lVar, lVarA2);
            com.avito.android.order.feature.mvi.t tVar = new com.avito.android.order.feature.mvi.t(bVar2, this.f209539i, uVar, this.f209535e, new j(cVar), this.f209533c);
            this.f209550t = new com.avito.android.order.feature.mvi.l(bVar2, eVar, lVar, new C6245c(cVar), new g(cVar), new C6244a(cVar));
            this.f209551u = new com.avito.android.order.feature.h(this.f209539i, new w(tVar, C.a(), this.f209550t, y.a(), this.f209538h));
        }

        @Override // com.avito.android.order.feature.di.b
        public final void a(OrderFragment orderFragment) {
            orderFragment.f209489t0 = this.f209551u;
            com.avito.android.order.feature.di.c cVar = this.f209531a;
            orderFragment.f209491v0 = cVar.Ad();
            InterfaceC25659b interfaceC25659bSd = cVar.sd();
            com.avito.android.order.feature.di.module.c.f209563a.getClass();
            orderFragment.f209492w0 = interfaceC25659bSd.b(null);
            orderFragment.f209493x0 = this.f209538h.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
