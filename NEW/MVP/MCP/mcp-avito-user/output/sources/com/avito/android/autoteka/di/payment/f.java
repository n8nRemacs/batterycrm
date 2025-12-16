package com.avito.android.autoteka.di.payment;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.data.order.k;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.di.payment.a;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.autoteka.presentation.payment.e;
import com.avito.android.autoteka.presentation.payment.mvi.B;
import com.avito.android.autoteka.presentation.payment.mvi.j;
import com.avito.android.autoteka.presentation.payment.mvi.o;
import com.avito.android.autoteka.presentation.payment.mvi.r;
import com.avito.android.autoteka.presentation.payment.mvi.t;
import com.avito.android.deep_linking.x;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.u;
import xj0.InterfaceC49957a;
import yf.l;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaPaymentComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAutotekaPaymentComponent.java */
    public static final class b implements com.avito.android.autoteka.di.payment.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f96476a;

        /* renamed from: b, reason: collision with root package name */
        public final l f96477b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC50257a> f96478c;

        /* renamed from: d, reason: collision with root package name */
        public final u<k> f96479d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f96480e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96481f;

        /* renamed from: g, reason: collision with root package name */
        public final o f96482g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC49957a> f96483h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.order.f> f96484i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.a> f96485j;

        /* renamed from: k, reason: collision with root package name */
        public final j f96486k;

        /* renamed from: l, reason: collision with root package name */
        public final u<x> f96487l;

        /* renamed from: m, reason: collision with root package name */
        public final t f96488m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f96489n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96490o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f96491p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.autoteka.items.payment.b f96492q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.autoteka.items.fullScreenError.payment.b f96493r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96494s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96495t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96496u;

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        public static final class a implements u<com.avito.android.autoteka.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96497a;

            public a(l lVar) {
                this.f96497a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.autoteka.data.a aVarT1 = this.f96497a.T1();
                dagger.internal.t.c(aVarT1);
                return aVarT1;
            }
        }

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        /* renamed from: com.avito.android.autoteka.di.payment.f$b$b, reason: collision with other inner class name */
        public static final class C2860b implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96498a;

            public C2860b(l lVar) {
                this.f96498a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96498a.kl();
                dagger.internal.t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        public static final class c implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96499a;

            public c(l lVar) {
                this.f96499a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96499a.Za();
                dagger.internal.t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96500a;

            public d(l lVar) {
                this.f96500a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96500a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96501a;

            public e(l lVar) {
                this.f96501a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f96501a.q();
                dagger.internal.t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerAutotekaPaymentComponent.java */
        /* renamed from: com.avito.android.autoteka.di.payment.f$b$f, reason: collision with other inner class name */
        public static final class C2861f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96502a;

            public C2861f(cv.b bVar) {
                this.f96502a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96502a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, Boolean bool, PaymentDetails paymentDetails, Y41.l lVar2, C28478k c28478k, a aVar) {
            this.f96476a = bVar;
            this.f96477b = lVar;
            C2860b c2860b = new C2860b(lVar);
            this.f96478c = c2860b;
            this.f96479d = g.d(new com.avito.android.autoteka.data.order.o(c2860b));
            this.f96480e = dagger.internal.l.a(paymentDetails);
            dagger.internal.l lVarA = dagger.internal.l.a(bool);
            C2861f c2861f = new C2861f(bVar);
            this.f96481f = c2861f;
            this.f96482g = new o(this.f96480e, lVarA, this.f96479d, c2861f);
            u<com.avito.android.autoteka.data.order.f> uVarD = g.d(new com.avito.android.autoteka.data.order.j(new com.avito.android.autoteka.data.j(new c(lVar), this.f96478c)));
            this.f96484i = uVarD;
            a aVar2 = new a(lVar);
            u<k> uVar = this.f96479d;
            dagger.internal.l lVar3 = this.f96480e;
            this.f96486k = new j(lVar3, uVarD, uVar, aVar2);
            this.f96488m = new t(lVar3, this.f96481f, new e(lVar));
            this.f96489n = new d(lVar);
            this.f96490o = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96489n);
            this.f96491p = dagger.internal.l.a(new com.avito.android.autoteka.presentation.payment.g(new com.avito.android.autoteka.presentation.payment.f(new r(this.f96482g, this.f96486k, this.f96488m, B.a(), this.f96490o))));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            this.f96492q = new com.avito.android.autoteka.items.payment.b(new com.avito.android.autoteka.items.payment.f(lVarA2));
            this.f96493r = new com.avito.android.autoteka.items.fullScreenError.payment.b(new com.avito.android.autoteka.items.fullScreenError.payment.e(lVarA2));
            u<com.avito.konveyor.a> uVarD2 = g.d(new com.avito.android.autoteka.di.payment.d(this.f96492q, this.f96493r, new com.avito.android.autoteka.items.skeleton.payment.b(com.avito.android.autoteka.items.skeleton.payment.d.a())));
            this.f96494s = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = g.d(new com.avito.android.autoteka.di.payment.c(uVarD2));
            this.f96495t = uVarD3;
            this.f96496u = g.d(new com.avito.android.autoteka.di.payment.e(uVarD3, this.f96494s));
        }

        @Override // com.avito.android.autoteka.di.payment.a
        public final void a(AutotekaPaymentActivity autotekaPaymentActivity) {
            autotekaPaymentActivity.f97387m = (e.a) this.f96491p.f393949a;
            autotekaPaymentActivity.f97389o = this.f96496u.get();
            autotekaPaymentActivity.f97390p = this.f96495t.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96476a.u4();
            dagger.internal.t.c(aVarU4);
            autotekaPaymentActivity.f97391q = aVarU4;
            l lVar = this.f96477b;
            autotekaPaymentActivity.f97392r = lVar.x();
            autotekaPaymentActivity.f97393s = lVar.G1();
            autotekaPaymentActivity.f97396v = this.f96490o.get();
        }
    }

    /* compiled from: DaggerAutotekaPaymentComponent.java */
    public static final class c implements a.InterfaceC2859a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.payment.a.InterfaceC2859a
        public final com.avito.android.autoteka.di.payment.a a(l lVar, InterfaceC39417a interfaceC39417a, boolean z12, PaymentDetails paymentDetails, Y41.l lVar2, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, Boolean.valueOf(z12), paymentDetails, lVar2, c28478k, null);
        }
    }

    public static a.InterfaceC2859a a() {
        return new c();
    }
}
