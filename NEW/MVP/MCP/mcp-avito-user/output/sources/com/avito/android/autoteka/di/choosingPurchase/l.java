package com.avito.android.autoteka.di.choosingPurchase;

import If.C14098c;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.di.choosingPurchase.f;
import com.avito.android.autoteka.items.choosingProduct.m;
import com.avito.android.autoteka.presentation.choosingPurchase.AutotekaFullscreenChoosingPurchaseActivity;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.o;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.r;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import xj0.InterfaceC49957a;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class l {

    /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
    public static final class b implements com.avito.android.autoteka.di.choosingPurchase.f {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f96383a;

        /* renamed from: b, reason: collision with root package name */
        public final yf.l f96384b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC49957a> f96385c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC50257a> f96386d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.autoteka.data.j f96387e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.choosingProduct.a> f96388f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96389g;

        /* renamed from: h, reason: collision with root package name */
        public final u<u3.f<ChoosingPurchaseTestGroup>> f96390h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.choosingPurchase.mvi.h f96391i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.choosingPurchase.mvi.c f96392j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.a> f96393k;

        /* renamed from: l, reason: collision with root package name */
        public final o f96394l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f96395m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96396n;

        /* renamed from: o, reason: collision with root package name */
        public final r f96397o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f96398p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.autoteka.items.error.choosingTypePurchase.b f96399q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96400r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96401s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96402t;

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        public static final class a implements u<com.avito.android.autoteka.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96403a;

            public a(yf.l lVar) {
                this.f96403a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.autoteka.data.a aVarT1 = this.f96403a.T1();
                t.c(aVarT1);
                return aVarT1;
            }
        }

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        /* renamed from: com.avito.android.autoteka.di.choosingPurchase.l$b$b, reason: collision with other inner class name */
        public static final class C2852b implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96404a;

            public C2852b(yf.l lVar) {
                this.f96404a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96404a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        public static final class c implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96405a;

            public c(yf.l lVar) {
                this.f96405a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96405a.Za();
                t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        public static final class d implements u<u3.f<ChoosingPurchaseTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96406a;

            public d(yf.l lVar) {
                this.f96406a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.f<ChoosingPurchaseTestGroup> fVarAg = this.f96406a.ag();
                t.c(fVarAg);
                return fVarAg;
            }
        }

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final yf.l f96407a;

            public e(yf.l lVar) {
                this.f96407a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96407a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96408a;

            public f(cv.b bVar) {
                this.f96408a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96408a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(yf.l lVar, cv.b bVar, Y41.l lVar2, ChoosingPurchaseDetails choosingPurchaseDetails, C28478k c28478k, a aVar) {
            this.f96383a = bVar;
            this.f96384b = lVar;
            com.avito.android.autoteka.data.j jVar = new com.avito.android.autoteka.data.j(new c(lVar), new C2852b(lVar));
            this.f96387e = jVar;
            this.f96388f = dagger.internal.g.d(new com.avito.android.autoteka.data.choosingProduct.d(jVar));
            dagger.internal.l lVarA = dagger.internal.l.a(choosingPurchaseDetails);
            f fVar = new f(bVar);
            C14098c c14098c = new C14098c(new d(lVar));
            If.e eVar = new If.e(c14098c);
            If.g gVar = new If.g(eVar);
            u<com.avito.android.autoteka.data.choosingProduct.a> uVar = this.f96388f;
            this.f96391i = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.h(uVar, lVarA, fVar, gVar);
            this.f96392j = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.c(this.f96387e, lVarA, uVar, c14098c, eVar);
            this.f96394l = new o(lVarA, new a(lVar), fVar);
            this.f96395m = new e(lVar);
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96395m);
            this.f96396n = uVarD;
            this.f96397o = new r(new com.avito.android.autoteka.presentation.choosingPurchase.mvi.k(this.f96391i, this.f96392j, this.f96394l, uVarD));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            this.f96398p = lVarA2;
            this.f96399q = new com.avito.android.autoteka.items.error.choosingTypePurchase.b(new com.avito.android.autoteka.items.error.choosingTypePurchase.e(lVarA2));
            com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b bVar2 = new com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b(com.avito.android.autoteka.items.skeleton.choosingTypePurchase.d.a());
            dagger.internal.l lVar3 = this.f96398p;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new i(this.f96399q, bVar2, new com.avito.android.autoteka.items.purchaseViaPackage.b(new com.avito.android.autoteka.items.purchaseViaPackage.f(lVar3)), new com.avito.android.autoteka.items.buyAgain.b(new com.avito.android.autoteka.items.buyAgain.e(lVar3)), new com.avito.android.autoteka.items.choosingProduct.j(new m(lVar3)), new com.avito.android.autoteka.items.purchaseViaStandalone.b(new com.avito.android.autoteka.items.purchaseViaStandalone.f(lVar3))));
            this.f96400r = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new h(uVarD2));
            this.f96401s = uVarD3;
            this.f96402t = dagger.internal.g.d(new j(uVarD3, this.f96400r));
        }

        @Override // com.avito.android.autoteka.di.choosingPurchase.f
        public final void a(AutotekaFullscreenChoosingPurchaseActivity autotekaFullscreenChoosingPurchaseActivity) {
            autotekaFullscreenChoosingPurchaseActivity.f97092m = this.f96397o;
            autotekaFullscreenChoosingPurchaseActivity.f97094o = this.f96402t.get();
            autotekaFullscreenChoosingPurchaseActivity.f97095p = this.f96401s.get();
            cv.b bVar = this.f96383a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            autotekaFullscreenChoosingPurchaseActivity.f97096q = aVarU4;
            yf.l lVar = this.f96384b;
            autotekaFullscreenChoosingPurchaseActivity.f97097r = lVar.x();
            autotekaFullscreenChoosingPurchaseActivity.f97098s = this.f96396n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            autotekaFullscreenChoosingPurchaseActivity.f97099t = new com.avito.android.autoteka.presentation.choosingPurchase.mvi.l(aVarU42, lVar.x());
        }
    }

    /* compiled from: DaggerAutotekaFullscreenChoosingPurchaseComponent.java */
    public static final class c implements f.a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.choosingPurchase.f.a
        public final f a(yf.l lVar, InterfaceC39417a interfaceC39417a, Y41.l lVar2, ChoosingPurchaseDetails choosingPurchaseDetails, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, lVar2, choosingPurchaseDetails, c28478k, null);
        }
    }

    public static f.a a() {
        return new c();
    }
}
