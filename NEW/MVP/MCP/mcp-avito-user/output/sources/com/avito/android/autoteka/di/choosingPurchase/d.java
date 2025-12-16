package com.avito.android.autoteka.di.choosingPurchase;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaChoosingPurchaseModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.error.choosingTypePurchase.b f96338a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b f96339b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.purchaseViaPackage.b f96340c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.autoteka.items.buyAgain.b f96341d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.autoteka.items.choosingProduct.b f96342e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.autoteka.items.purchaseViaStandalone.b f96343f;

    public d(com.avito.android.autoteka.items.error.choosingTypePurchase.b bVar, com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b bVar2, com.avito.android.autoteka.items.purchaseViaPackage.b bVar3, com.avito.android.autoteka.items.buyAgain.b bVar4, com.avito.android.autoteka.items.choosingProduct.b bVar5, com.avito.android.autoteka.items.purchaseViaStandalone.b bVar6) {
        this.f96338a = bVar;
        this.f96339b = bVar2;
        this.f96340c = bVar3;
        this.f96341d = bVar4;
        this.f96342e = bVar5;
        this.f96343f = bVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.error.choosingTypePurchase.a aVar = (com.avito.android.autoteka.items.error.choosingTypePurchase.a) this.f96338a.get();
        com.avito.android.autoteka.items.skeleton.choosingTypePurchase.a aVar2 = (com.avito.android.autoteka.items.skeleton.choosingTypePurchase.a) this.f96339b.get();
        com.avito.android.autoteka.items.purchaseViaPackage.a aVar3 = (com.avito.android.autoteka.items.purchaseViaPackage.a) this.f96340c.get();
        com.avito.android.autoteka.items.buyAgain.a aVar4 = (com.avito.android.autoteka.items.buyAgain.a) this.f96341d.get();
        com.avito.android.autoteka.items.choosingProduct.a aVar5 = (com.avito.android.autoteka.items.choosingProduct.a) this.f96342e.get();
        com.avito.android.autoteka.items.purchaseViaStandalone.a aVar6 = (com.avito.android.autoteka.items.purchaseViaStandalone.a) this.f96343f.get();
        b.f96335a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        return c10493a.a();
    }
}
