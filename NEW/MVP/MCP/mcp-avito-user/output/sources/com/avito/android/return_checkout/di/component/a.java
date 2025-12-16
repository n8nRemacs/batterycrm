package com.avito.android.return_checkout.di.component;

import androidx.view.T0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.B;
import com.avito.android.return_checkout.DeliveryReturnCheckoutFragment;
import com.avito.android.return_checkout.di.component.b;
import com.avito.android.return_checkout.di.module.h;
import com.avito.android.return_checkout.di.module.i;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.avito.android.return_checkout.mvi.k;
import com.avito.android.return_checkout.n;
import com.avito.android.return_checkout.p;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;

/* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
    public static final class b implements com.avito.android.return_checkout.di.component.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.return_checkout.di.component.c f255256a;

        /* renamed from: b, reason: collision with root package name */
        public final u<gj.d> f255257b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f255258c;

        /* renamed from: d, reason: collision with root package name */
        public final u<a.b> f255259d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f255260e;

        /* renamed from: f, reason: collision with root package name */
        public final l f255261f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Screen> f255262g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f255263h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f255264i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.return_checkout.a> f255265j;

        /* renamed from: k, reason: collision with root package name */
        public final u<B> f255266k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35745a5> f255267l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.return_checkout.l> f255268m;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f255269n;

        /* renamed from: o, reason: collision with root package name */
        public final p f255270o;

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        /* renamed from: com.avito.android.return_checkout.di.component.a$b$a, reason: collision with other inner class name */
        public static final class C7640a implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.return_checkout.di.component.c f255271a;

            public C7640a(com.avito.android.return_checkout.di.component.c cVar) {
                this.f255271a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f255271a.El();
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        /* renamed from: com.avito.android.return_checkout.di.component.a$b$b, reason: collision with other inner class name */
        public static final class C7641b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f255272a;

            public C7641b(cv.b bVar) {
                this.f255272a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f255272a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        public static final class c implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f255273a;

            public c(cv.b bVar) {
                this.f255273a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f255273a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        public static final class d implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.return_checkout.di.component.c f255274a;

            public d(com.avito.android.return_checkout.di.component.c cVar) {
                this.f255274a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bW3 = this.f255274a.w3();
                t.c(bW3);
                return bW3;
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.return_checkout.di.component.c f255275a;

            public e(com.avito.android.return_checkout.di.component.c cVar) {
                this.f255275a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f255275a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.return_checkout.di.component.c f255276a;

            public f(com.avito.android.return_checkout.di.component.c cVar) {
                this.f255276a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f255276a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.return_checkout.di.component.c f255277a;

            public g(com.avito.android.return_checkout.di.component.c cVar) {
                this.f255277a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f255277a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.return_checkout.di.component.c cVar, cv.b bVar, DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment, T0 t02, r rVar, DeliveryReturnCheckoutData deliveryReturnCheckoutData, C7639a c7639a) {
            this.f255256a = cVar;
            this.f255257b = new C7640a(cVar);
            this.f255258c = new C7641b(bVar);
            this.f255259d = new c(bVar);
            this.f255260e = new g(cVar);
            this.f255261f = l.a(rVar);
            u<Screen> uVarD = dagger.internal.g.d(h.a());
            this.f255262g = uVarD;
            u<ScreenPerformanceTracker> uVarD2 = dagger.internal.g.d(new i(this.f255261f, uVarD, this.f255260e));
            this.f255263h = uVarD2;
            u<InterfaceC40691b> uVarD3 = dagger.internal.g.d(new com.avito.android.return_checkout.di.module.d(uVarD2, this.f255257b, this.f255258c, this.f255259d, this.f255262g));
            this.f255264i = uVarD3;
            this.f255265j = dagger.internal.g.d(new com.avito.android.return_checkout.di.module.e(uVarD3));
            this.f255268m = dagger.internal.g.d(new n(new d(cVar), new f(cVar)));
            l lVarA = l.a(deliveryReturnCheckoutData);
            e eVar = new e(cVar);
            u<com.avito.android.return_checkout.l> uVar = this.f255268m;
            u<com.avito.android.return_checkout.a> uVar2 = this.f255265j;
            com.avito.android.return_checkout.domain.b bVar2 = new com.avito.android.return_checkout.domain.b(lVarA, uVar, uVar2, eVar);
            this.f255270o = new p(this.f255264i, new com.avito.android.return_checkout.mvi.i(new com.avito.android.return_checkout.mvi.f(this.f255264i, uVar2, bVar2), new com.avito.android.return_checkout.mvi.b(bVar2), k.a(), com.avito.android.return_checkout.mvi.n.a(), this.f255263h));
        }

        @Override // com.avito.android.return_checkout.di.component.b
        public final void a(DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment) {
            deliveryReturnCheckoutFragment.f255222t0 = this.f255270o;
            deliveryReturnCheckoutFragment.f255224v0 = this.f255263h.get();
            com.avito.android.return_checkout.di.component.c cVar = this.f255256a;
            deliveryReturnCheckoutFragment.f255225w0 = cVar.Ad();
            deliveryReturnCheckoutFragment.f255226x0 = cVar.sd();
        }
    }

    /* compiled from: DaggerDeliveryReturnCheckoutComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.return_checkout.di.component.b.a
        public final com.avito.android.return_checkout.di.component.b a(DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment, DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment2, r rVar, DeliveryReturnCheckoutData deliveryReturnCheckoutData, com.avito.android.return_checkout.di.component.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, deliveryReturnCheckoutFragment, deliveryReturnCheckoutFragment2, rVar, deliveryReturnCheckoutData, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
