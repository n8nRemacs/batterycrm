package com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component;

import Yn0.InterfaceC18304a;
import co0.InterfaceC27233b;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.E;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.DeliveryUniversalCheckoutFragment;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.b;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module.k;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module.n;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module.o;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.p;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;

/* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
    public static final class b implements com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c f257002a;

        /* renamed from: b, reason: collision with root package name */
        public final u<gj.d> f257003b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f257004c;

        /* renamed from: d, reason: collision with root package name */
        public final u<a.b> f257005d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f257006e;

        /* renamed from: f, reason: collision with root package name */
        public final l f257007f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Screen> f257008g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f257009h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f257010i;

        /* renamed from: j, reason: collision with root package name */
        public final l f257011j;

        /* renamed from: k, reason: collision with root package name */
        public final u<E> f257012k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC18304a> f257013l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.safedeal_checkout.delivery_universal_checkout.a> f257014m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC27233b> f257015n;

        /* renamed from: o, reason: collision with root package name */
        public final p f257016o;

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.a$b$a, reason: collision with other inner class name */
        public static final class C7710a implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c f257017a;

            public C7710a(com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar) {
                this.f257017a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257017a.El();
            }
        }

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.a$b$b, reason: collision with other inner class name */
        public static final class C7711b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f257018a;

            public C7711b(cv.b bVar) {
                this.f257018a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f257018a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        public static final class c implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f257019a;

            public c(cv.b bVar) {
                this.f257019a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f257019a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        public static final class d implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c f257020a;

            public d(com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar) {
                this.f257020a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eLg = this.f257020a.lg();
                t.c(eLg);
                return eLg;
            }
        }

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        public static final class e implements u<InterfaceC27233b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c f257021a;

            public e(com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar) {
                this.f257021a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257021a.q6();
            }
        }

        /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c f257022a;

            public f(com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar) {
                this.f257022a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f257022a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar, cv.b bVar, r rVar, DeliveryUniversalCheckoutData deliveryUniversalCheckoutData, C7709a c7709a) {
            this.f257002a = cVar;
            this.f257003b = new C7710a(cVar);
            this.f257004c = new C7711b(bVar);
            this.f257005d = new c(bVar);
            this.f257006e = new f(cVar);
            this.f257007f = l.a(rVar);
            u<Screen> uVarD = g.d(n.a());
            this.f257008g = uVarD;
            u<ScreenPerformanceTracker> uVarD2 = g.d(new o(this.f257007f, uVarD, this.f257006e));
            this.f257009h = uVarD2;
            this.f257010i = g.d(new k(uVarD2, this.f257003b, this.f257004c, this.f257005d));
            this.f257011j = l.a(deliveryUniversalCheckoutData);
            this.f257013l = g.d(new Yn0.d(new d(cVar)));
            u<com.avito.android.safedeal_checkout.delivery_universal_checkout.a> uVarD3 = g.d(new com.avito.android.safedeal_checkout.delivery_universal_checkout.di.module.l(this.f257010i));
            this.f257014m = uVarD3;
            u<InterfaceC18304a> uVar = this.f257013l;
            l lVar = this.f257011j;
            com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b bVar2 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b(lVar, uVarD3, uVar);
            this.f257016o = new p(this.f257010i, new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.n(new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.k(lVar, bVar2, this.f257010i, uVarD3, this.f257004c, new e(cVar)), new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.b(bVar2), com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.p.a(), com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.t.a(), this.f257009h));
        }

        @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.b
        public final void a(DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment) {
            deliveryUniversalCheckoutFragment.f256874t0 = this.f257016o;
            deliveryUniversalCheckoutFragment.f256876v0 = this.f257009h.get();
            com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar = this.f257002a;
            deliveryUniversalCheckoutFragment.f256877w0 = cVar.sd();
            deliveryUniversalCheckoutFragment.f256863A0 = cVar.Ad();
            cVar.S6();
        }
    }

    /* compiled from: DaggerDeliveryUniversalCheckoutComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.b.a
        public final com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.b a(r rVar, DeliveryUniversalCheckoutData deliveryUniversalCheckoutData, com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, rVar, deliveryUniversalCheckoutData, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
