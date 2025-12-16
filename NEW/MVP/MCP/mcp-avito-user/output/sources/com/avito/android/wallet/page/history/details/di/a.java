package com.avito.android.wallet.page.history.details.di;

import Y41.l;
import aP0.InterfaceC19802a;
import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.wallet.page.history.details.di.b;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsFragment;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsOpenParams;
import com.avito.android.wallet.page.history.details.mvi.component.h;
import com.avito.android.wallet.page.history.details.mvi.component.j;
import com.avito.android.wallet.page.history.details.mvi.component.m;
import com.avito.android.wallet.page.history.details.mvi.component.o;
import com.avito.android.wallet.page.history.details.mvi.component.q;
import com.avito.android.wallet.page.history.details.mvi.component.s;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import nd.InterfaceC44378a;

/* compiled from: DaggerHistoryDetailsComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerHistoryDetailsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.wallet.page.history.details.di.b.a
        public final com.avito.android.wallet.page.history.details.di.b a(com.avito.android.wallet.page.di.component.e eVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, PaymentHistoryDetailsOpenParams paymentHistoryDetailsOpenParams, l lVar) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, c28478k, paymentHistoryDetailsOpenParams, lVar, null);
        }
    }

    /* compiled from: DaggerHistoryDetailsComponent.java */
    public static final class c implements com.avito.android.wallet.page.history.details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f327835a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.wallet.page.di.component.e f327836b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC19802a> f327837c;

        /* renamed from: d, reason: collision with root package name */
        public final u<NO0.a> f327838d;

        /* renamed from: e, reason: collision with root package name */
        public final j f327839e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC44378a> f327840f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f327841g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f327842h;

        /* renamed from: i, reason: collision with root package name */
        public final h f327843i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Application> f327844j;

        /* renamed from: k, reason: collision with root package name */
        public final q f327845k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f327846l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f327847m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.wallet.page.history.details.mvi.l f327848n;

        /* compiled from: DaggerHistoryDetailsComponent.java */
        /* renamed from: com.avito.android.wallet.page.history.details.di.a$c$a, reason: collision with other inner class name */
        public static final class C10166a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327849a;

            public C10166a(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327849a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f327849a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        public static final class b implements u<InterfaceC44378a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327850a;

            public b(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327850a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44378a interfaceC44378aE5 = this.f327850a.E5();
                t.c(interfaceC44378aE5);
                return interfaceC44378aE5;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        /* renamed from: com.avito.android.wallet.page.history.details.di.a$c$c, reason: collision with other inner class name */
        public static final class C10167c implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327851a;

            public C10167c(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327851a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f327851a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f327852a;

            public d(cv.b bVar) {
                this.f327852a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f327852a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327853a;

            public e(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327853a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f327853a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        public static final class f implements u<InterfaceC19802a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327854a;

            public f(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327854a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19802a interfaceC19802aMg = this.f327854a.mg();
                t.c(interfaceC19802aMg);
                return interfaceC19802aMg;
            }
        }

        /* compiled from: DaggerHistoryDetailsComponent.java */
        public static final class g implements u<NO0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327855a;

            public g(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327855a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NO0.a aVarCd = this.f327855a.cd();
                t.c(aVarCd);
                return aVarCd;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.wallet.page.di.component.e eVar, cv.b bVar, C28478k c28478k, PaymentHistoryDetailsOpenParams paymentHistoryDetailsOpenParams, l lVar, C10165a c10165a) {
            this.f327835a = bVar;
            this.f327836b = eVar;
            this.f327837c = new f(eVar);
            this.f327838d = new g(eVar);
            com.avito.android.wallet.page.history.details.mvi.j jVar = new com.avito.android.wallet.page.history.details.mvi.j(dagger.internal.l.a(paymentHistoryDetailsOpenParams), this.f327837c, this.f327838d);
            this.f327839e = new j(jVar);
            this.f327843i = new h(jVar, new b(eVar), new d(bVar), new C10166a(eVar));
            this.f327845k = new q(new s(new C10167c(eVar)));
            this.f327846l = new e(eVar);
            this.f327847m = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f327846l);
            this.f327848n = new com.avito.android.wallet.page.history.details.mvi.l(new m(this.f327839e, this.f327843i, o.a(), this.f327845k, this.f327847m));
        }

        @Override // com.avito.android.wallet.page.history.details.di.b
        public final void a(PaymentHistoryDetailsFragment paymentHistoryDetailsFragment) {
            paymentHistoryDetailsFragment.f327858h0 = this.f327848n;
            paymentHistoryDetailsFragment.f327860j0 = this.f327847m.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f327835a.u4();
            t.c(aVarU4);
            paymentHistoryDetailsFragment.f327861k0 = aVarU4;
            com.avito.android.wallet.page.di.component.e eVar = this.f327836b;
            x xVarQ = eVar.q();
            t.c(xVarQ);
            paymentHistoryDetailsFragment.f327862l0 = xVarQ;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            paymentHistoryDetailsFragment.f327863m0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
