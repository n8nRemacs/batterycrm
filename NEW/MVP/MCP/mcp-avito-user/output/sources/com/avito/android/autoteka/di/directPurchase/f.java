package com.avito.android.autoteka.di.directPurchase;

import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.autoteka.di.directPurchase.a;
import com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import yf.l;

/* compiled from: DaggerAutotekaDirectPurchaseComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAutotekaDirectPurchaseComponent.java */
    public static final class b implements com.avito.android.autoteka.di.directPurchase.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96421a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.directPurchase.mvi.c f96422b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.directPurchase.d f96423c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96424d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96425e;

        /* renamed from: f, reason: collision with root package name */
        public final u<j> f96426f;

        /* compiled from: DaggerAutotekaDirectPurchaseComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96427a;

            public a(cv.b bVar) {
                this.f96427a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96427a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, DirectPurchaseDetails directPurchaseDetails, Y41.l lVar2, a aVar) {
            this.f96422b = new com.avito.android.autoteka.presentation.directPurchase.mvi.c(new a(bVar));
            this.f96423c = new com.avito.android.autoteka.presentation.directPurchase.d(new com.avito.android.autoteka.presentation.directPurchase.mvi.f(this.f96422b, dagger.internal.l.a(directPurchaseDetails)));
            u<com.avito.konveyor.a> uVarD = g.d(new d(new com.avito.android.autoteka.items.directPurchase.b(new com.avito.android.autoteka.items.directPurchase.g(dagger.internal.l.a(lVar2)))));
            this.f96424d = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = g.d(new com.avito.android.autoteka.di.directPurchase.c(uVarD));
            this.f96425e = uVarD2;
            this.f96426f = g.d(new e(uVarD2, this.f96424d));
        }

        @Override // com.avito.android.autoteka.di.directPurchase.a
        public final void a(AutotekaDirectPurchaseActivity autotekaDirectPurchaseActivity) {
            autotekaDirectPurchaseActivity.f97273m = this.f96423c;
            autotekaDirectPurchaseActivity.f97275o = this.f96426f.get();
            autotekaDirectPurchaseActivity.f97276p = this.f96425e.get();
        }
    }

    /* compiled from: DaggerAutotekaDirectPurchaseComponent.java */
    public static final class c implements a.InterfaceC2856a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.directPurchase.a.InterfaceC2856a
        public final com.avito.android.autoteka.di.directPurchase.a a(l lVar, InterfaceC39417a interfaceC39417a, DirectPurchaseDetails directPurchaseDetails, Y41.l lVar2) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, directPurchaseDetails, lVar2, null);
        }
    }

    public static a.InterfaceC2856a a() {
        return new c();
    }
}
