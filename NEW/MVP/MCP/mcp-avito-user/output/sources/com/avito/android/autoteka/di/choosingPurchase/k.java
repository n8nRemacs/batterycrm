package com.avito.android.autoteka.di.choosingPurchase;

import If.C14098c;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.di.choosingPurchase.a;
import com.avito.android.autoteka.presentation.choosingPurchase.AutotekaChoosingPurchaseActivity;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.o;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.r;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import xj0.InterfaceC49957a;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class k {

    /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
    public static final class b implements com.avito.android.autoteka.di.choosingPurchase.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f96357a;

        /* renamed from: b, reason: collision with root package name */
        public final yf.l f96358b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC49957a> f96359c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC50257a> f96360d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.autoteka.data.j f96361e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.choosingProduct.a> f96362f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96363g;

        /* renamed from: h, reason: collision with root package name */
        public final u<u3.f<ChoosingPurchaseTestGroup>> f96364h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.choosingPurchase.mvi.h f96365i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.choosingPurchase.mvi.c f96366j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.a> f96367k;

        /* renamed from: l, reason: collision with root package name */
        public final o f96368l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f96369m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96370n;

        /* renamed from: o, reason: collision with root package name */
        public final r f96371o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f96372p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.autoteka.items.error.choosingTypePurchase.b f96373q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96374r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96375s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96376t;

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        public static final class a implements u<com.avito.android.autoteka.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96377a;

            public a(yf.l lVar) {
                this.f96377a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.autoteka.data.a aVarT1 = this.f96377a.T1();
                t.c(aVarT1);
                return aVarT1;
            }
        }

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        /* renamed from: com.avito.android.autoteka.di.choosingPurchase.k$b$b, reason: collision with other inner class name */
        public static final class C2851b implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96378a;

            public C2851b(yf.l lVar) {
                this.f96378a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96378a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        public static final class c implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96379a;

            public c(yf.l lVar) {
                this.f96379a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96379a.Za();
                t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        public static final class d implements u<u3.f<ChoosingPurchaseTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96380a;

            public d(yf.l lVar) {
                this.f96380a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.f<ChoosingPurchaseTestGroup> fVarAg = this.f96380a.ag();
                t.c(fVarAg);
                return fVarAg;
            }
        }

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96381a;

            public e(yf.l lVar) {
                this.f96381a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96381a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96382a;

            public f(cv.b bVar) {
                this.f96382a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96382a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(yf.l lVar, cv.b bVar, Y41.l lVar2, ChoosingPurchaseDetails choosingPurchaseDetails, C28478k c28478k, a aVar) {
            this.f96357a = bVar;
            this.f96358b = lVar;
            com.avito.android.autoteka.data.j jVar = new com.avito.android.autoteka.data.j(new c(lVar), new C2851b(lVar));
            this.f96361e = jVar;
            this.f96362f = dagger.internal.g.d(new com.avito.android.autoteka.data.choosingProduct.d(jVar));
            dagger.internal.l lVarA = dagger.internal.l.a(choosingPurchaseDetails);
            f fVar = new f(bVar);
            C14098c c14098c = new C14098c(new d(lVar));
            If.e eVar = new If.e(c14098c);
            If.g gVar = new If.g(eVar);
            u<com.avito.android.autoteka.data.choosingProduct.a> uVar = this.f96362f;
            this.f96365i = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.h(uVar, lVarA, fVar, gVar);
            this.f96366j = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.c(this.f96361e, lVarA, uVar, c14098c, eVar);
            this.f96368l = new o(lVarA, new a(lVar), fVar);
            this.f96369m = new e(lVar);
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96369m);
            this.f96370n = uVarD;
            this.f96371o = new r(new com.avito.android.autoteka.presentation.choosingPurchase.mvi.k(this.f96365i, this.f96366j, this.f96368l, uVarD));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            this.f96372p = lVarA2;
            this.f96373q = new com.avito.android.autoteka.items.error.choosingTypePurchase.b(new com.avito.android.autoteka.items.error.choosingTypePurchase.e(lVarA2));
            com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b bVar2 = new com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b(com.avito.android.autoteka.items.skeleton.choosingTypePurchase.d.a());
            dagger.internal.l lVar3 = this.f96372p;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.autoteka.di.choosingPurchase.d(this.f96373q, bVar2, new com.avito.android.autoteka.items.purchaseViaPackage.b(new com.avito.android.autoteka.items.purchaseViaPackage.f(lVar3)), new com.avito.android.autoteka.items.buyAgain.b(new com.avito.android.autoteka.items.buyAgain.e(lVar3)), new com.avito.android.autoteka.items.choosingProduct.b(new com.avito.android.autoteka.items.choosingProduct.f(lVar3)), new com.avito.android.autoteka.items.purchaseViaStandalone.b(new com.avito.android.autoteka.items.purchaseViaStandalone.f(lVar3))));
            this.f96374r = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.autoteka.di.choosingPurchase.c(uVarD2));
            this.f96375s = uVarD3;
            this.f96376t = dagger.internal.g.d(new com.avito.android.autoteka.di.choosingPurchase.e(uVarD3, this.f96374r));
        }

        @Override // com.avito.android.autoteka.di.choosingPurchase.a
        public final void a(AutotekaChoosingPurchaseActivity autotekaChoosingPurchaseActivity) {
            autotekaChoosingPurchaseActivity.f97073m = this.f96371o;
            autotekaChoosingPurchaseActivity.f97075o = this.f96376t.get();
            cv.b bVar = this.f96357a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            autotekaChoosingPurchaseActivity.f97076p = aVarU4;
            autotekaChoosingPurchaseActivity.f97077q = this.f96375s.get();
            yf.l lVar = this.f96358b;
            autotekaChoosingPurchaseActivity.f97078r = lVar.G6();
            autotekaChoosingPurchaseActivity.f97079s = lVar.x();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            autotekaChoosingPurchaseActivity.f97080t = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.l(aVarU42, lVar.x());
            autotekaChoosingPurchaseActivity.f97082v = this.f96370n.get();
        }
    }

    /* compiled from: DaggerAutotekaChoosingPurchaseComponent.java */
    public static final class c implements a.InterfaceC2850a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.choosingPurchase.a.InterfaceC2850a
        public final com.avito.android.autoteka.di.choosingPurchase.a a(yf.l lVar, InterfaceC39417a interfaceC39417a, Y41.l lVar2, ChoosingPurchaseDetails choosingPurchaseDetails, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, lVar2, choosingPurchaseDetails, c28478k, null);
        }
    }

    public static a.InterfaceC2850a a() {
        return new c();
    }
}
