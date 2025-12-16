package com.avito.android.autoteka.di.waitingForPayment;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import com.avito.android.autoteka.di.waitingForPayment.a;
import com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.h;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import yf.l;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
    public static final class b implements com.avito.android.autoteka.di.waitingForPayment.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f96609a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f96610b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC50257a> f96611c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.orderStatus.a> f96612d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.waitingForPayment.mvi.e f96613e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.waitingForPayment.mvi.c f96614f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96615g;

        /* renamed from: h, reason: collision with root package name */
        public final j f96616h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f96617i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96618j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.waitingForPayment.d f96619k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.autoteka.items.waitingForPayment.b f96620l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96621m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96622n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96623o;

        /* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
        public static final class a implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96624a;

            public a(l lVar) {
                this.f96624a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96624a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
        /* renamed from: com.avito.android.autoteka.di.waitingForPayment.f$b$b, reason: collision with other inner class name */
        public static final class C2870b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96625a;

            public C2870b(l lVar) {
                this.f96625a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96625a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96626a;

            public c(cv.b bVar) {
                this.f96626a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96626a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, WaitingForPaymentDetails waitingForPaymentDetails, Y41.l lVar2, C28478k c28478k, a aVar) {
            this.f96609a = lVar;
            this.f96610b = bVar;
            this.f96612d = g.d(new com.avito.android.autoteka.data.orderStatus.e(new a(lVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(waitingForPaymentDetails);
            u<com.avito.android.autoteka.data.orderStatus.a> uVar = this.f96612d;
            this.f96613e = new com.avito.android.autoteka.presentation.waitingForPayment.mvi.e(lVarA, uVar);
            this.f96614f = new com.avito.android.autoteka.presentation.waitingForPayment.mvi.c(lVarA, uVar);
            this.f96616h = new j(lVarA, new c(bVar));
            this.f96617i = new C2870b(lVar);
            this.f96618j = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96617i);
            this.f96619k = new com.avito.android.autoteka.presentation.waitingForPayment.d(new h(this.f96613e, this.f96614f, this.f96616h, com.avito.android.autoteka.presentation.waitingForPayment.mvi.l.a(), this.f96618j));
            this.f96620l = new com.avito.android.autoteka.items.waitingForPayment.b(com.avito.android.autoteka.items.waitingForPayment.d.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            u<com.avito.konveyor.a> uVarD = g.d(new d(this.f96620l, new com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.b(new com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.e(lVarA2)), new com.avito.android.autoteka.items.waitingForPaymentResponseItem.b(new com.avito.android.autoteka.items.waitingForPaymentResponseItem.f(lVarA2))));
            this.f96621m = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = g.d(new com.avito.android.autoteka.di.waitingForPayment.c(uVarD));
            this.f96622n = uVarD2;
            this.f96623o = g.d(new e(uVarD2, this.f96621m));
        }

        @Override // com.avito.android.autoteka.di.waitingForPayment.a
        public final void a(AutotekaWaitingForPaymentActivity autotekaWaitingForPaymentActivity) {
            autotekaWaitingForPaymentActivity.f97838m = this.f96619k;
            autotekaWaitingForPaymentActivity.f97840o = this.f96623o.get();
            autotekaWaitingForPaymentActivity.f97841p = this.f96622n.get();
            autotekaWaitingForPaymentActivity.f97842q = this.f96609a.x();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96610b.u4();
            t.c(aVarU4);
            autotekaWaitingForPaymentActivity.f97843r = aVarU4;
            autotekaWaitingForPaymentActivity.f97844s = this.f96618j.get();
        }
    }

    /* compiled from: DaggerAutotekaWaitingForPaymentComponent.java */
    public static final class c implements a.InterfaceC2869a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.waitingForPayment.a.InterfaceC2869a
        public final com.avito.android.autoteka.di.waitingForPayment.a a(l lVar, InterfaceC39417a interfaceC39417a, WaitingForPaymentDetails waitingForPaymentDetails, Y41.l lVar2, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, waitingForPaymentDetails, lVar2, c28478k, null);
        }
    }

    public static a.InterfaceC2869a a() {
        return new c();
    }
}
