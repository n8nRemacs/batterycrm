package com.avito.android.autoteka.di.choosingPurchase;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaFullscreenChoosingPurchaseModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.error.choosingTypePurchase.b f96349a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b f96350b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.purchaseViaPackage.b f96351c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.autoteka.items.buyAgain.b f96352d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.autoteka.items.choosingProduct.j f96353e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.autoteka.items.purchaseViaStandalone.b f96354f;

    public i(com.avito.android.autoteka.items.error.choosingTypePurchase.b bVar, com.avito.android.autoteka.items.skeleton.choosingTypePurchase.b bVar2, com.avito.android.autoteka.items.purchaseViaPackage.b bVar3, com.avito.android.autoteka.items.buyAgain.b bVar4, com.avito.android.autoteka.items.choosingProduct.j jVar, com.avito.android.autoteka.items.purchaseViaStandalone.b bVar5) {
        this.f96349a = bVar;
        this.f96350b = bVar2;
        this.f96351c = bVar3;
        this.f96352d = bVar4;
        this.f96353e = jVar;
        this.f96354f = bVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.error.choosingTypePurchase.a aVar = (com.avito.android.autoteka.items.error.choosingTypePurchase.a) this.f96349a.get();
        com.avito.android.autoteka.items.skeleton.choosingTypePurchase.a aVar2 = (com.avito.android.autoteka.items.skeleton.choosingTypePurchase.a) this.f96350b.get();
        com.avito.android.autoteka.items.purchaseViaPackage.a aVar3 = (com.avito.android.autoteka.items.purchaseViaPackage.a) this.f96351c.get();
        com.avito.android.autoteka.items.buyAgain.a aVar4 = (com.avito.android.autoteka.items.buyAgain.a) this.f96352d.get();
        com.avito.android.autoteka.items.choosingProduct.i iVar = (com.avito.android.autoteka.items.choosingProduct.i) this.f96353e.get();
        com.avito.android.autoteka.items.purchaseViaStandalone.a aVar5 = (com.avito.android.autoteka.items.purchaseViaStandalone.a) this.f96354f.get();
        g.f96346a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(iVar);
        c10493a.b(aVar5);
        return c10493a.a();
    }
}
