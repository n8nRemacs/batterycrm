package com.avito.android.comfortable_deal.submitting.ordercall.di;

import Yo.v;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.domain.f;
import com.avito.android.comfortable_deal.repository.o;
import com.avito.android.comfortable_deal.submitting.ordercall.OrderCallFragment;
import com.avito.android.comfortable_deal.submitting.ordercall.b;
import com.avito.android.comfortable_deal.submitting.ordercall.di.b;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.h;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.k;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.m;
import cp.InterfaceC39387a;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import qp.C47425b;

/* compiled from: DaggerOrderCallComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerOrderCallComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.submitting.ordercall.di.b.a
        public final com.avito.android.comfortable_deal.submitting.ordercall.di.b a(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, null);
        }
    }

    /* compiled from: DaggerOrderCallComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.submitting.ordercall.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f123029a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.ordercall.di.c f123030b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39387a> f123031c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f123032d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f123033e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.ordercall.mvi.e f123034f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Context> f123035g;

        /* renamed from: h, reason: collision with root package name */
        public final h f123036h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f123037i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f123038j;

        /* renamed from: k, reason: collision with root package name */
        public final l f123039k;

        /* compiled from: DaggerOrderCallComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.ordercall.di.a$c$a, reason: collision with other inner class name */
        public static final class C3662a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.ordercall.di.c f123040a;

            public C3662a(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar) {
                this.f123040a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f123040a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerOrderCallComponent.java */
        public static final class b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.ordercall.di.c f123041a;

            public b(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar) {
                this.f123041a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f123041a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerOrderCallComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.ordercall.di.a$c$c, reason: collision with other inner class name */
        public static final class C3663c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.ordercall.di.c f123042a;

            public C3663c(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar) {
                this.f123042a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f123042a.g();
            }
        }

        /* compiled from: DaggerOrderCallComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f123043a;

            public d(cv.b bVar) {
                this.f123043a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123043a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerOrderCallComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.ordercall.di.c f123044a;

            public e(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar) {
                this.f123044a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f123044a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.comfortable_deal.submitting.ordercall.di.c cVar, cv.b bVar, C28478k c28478k, C3661a c3661a) {
            this.f123029a = bVar;
            this.f123030b = cVar;
            f fVar = new f(new b(cVar));
            d dVar = new d(bVar);
            v vVar = new v(new C3662a(cVar));
            this.f123034f = new com.avito.android.comfortable_deal.submitting.ordercall.mvi.e(fVar, dVar, vVar);
            this.f123036h = new h(new o(new C47425b(new C3663c(cVar))), vVar);
            this.f123037i = new e(cVar);
            this.f123038j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f123037i);
            this.f123039k = l.a(new com.avito.android.comfortable_deal.submitting.ordercall.d(new com.avito.android.comfortable_deal.submitting.ordercall.c(new k(this.f123034f, m.a(), com.avito.android.comfortable_deal.submitting.ordercall.mvi.o.a(), this.f123036h, this.f123038j))));
        }

        @Override // com.avito.android.comfortable_deal.submitting.ordercall.di.b
        public final void a(OrderCallFragment orderCallFragment) {
            orderCallFragment.f122995n0 = (b.a) this.f123039k.f393949a;
            orderCallFragment.f122997p0 = this.f123038j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123029a.u4();
            t.c(aVarU4);
            orderCallFragment.f122998q0 = aVarU4;
            t.c(this.f123030b.a());
        }
    }

    public static b.a a() {
        return new b();
    }
}
