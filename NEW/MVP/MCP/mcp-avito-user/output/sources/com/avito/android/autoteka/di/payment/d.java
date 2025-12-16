package com.avito.android.autoteka.di.payment;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPaymentModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.payment.b f96471a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.payment.b f96472b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.skeleton.payment.b f96473c;

    public d(com.avito.android.autoteka.items.payment.b bVar, com.avito.android.autoteka.items.fullScreenError.payment.b bVar2, com.avito.android.autoteka.items.skeleton.payment.b bVar3) {
        this.f96471a = bVar;
        this.f96472b = bVar2;
        this.f96473c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.payment.a aVar = (com.avito.android.autoteka.items.payment.a) this.f96471a.get();
        com.avito.android.autoteka.items.fullScreenError.payment.a aVar2 = (com.avito.android.autoteka.items.fullScreenError.payment.a) this.f96472b.get();
        com.avito.android.autoteka.items.skeleton.payment.a aVar3 = (com.avito.android.autoteka.items.skeleton.payment.a) this.f96473c.get();
        b.f96468a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
