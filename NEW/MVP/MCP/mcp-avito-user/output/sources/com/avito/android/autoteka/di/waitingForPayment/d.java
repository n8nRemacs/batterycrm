package com.avito.android.autoteka.di.waitingForPayment;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaWaitingForPaymentModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.waitingForPayment.b f96604a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.b f96605b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.items.waitingForPaymentResponseItem.b f96606c;

    public d(com.avito.android.autoteka.items.waitingForPayment.b bVar, com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.b bVar2, com.avito.android.autoteka.items.waitingForPaymentResponseItem.b bVar3) {
        this.f96604a = bVar;
        this.f96605b = bVar2;
        this.f96606c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.waitingForPayment.a aVar = (com.avito.android.autoteka.items.waitingForPayment.a) this.f96604a.get();
        com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.a aVar2 = (com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError.a) this.f96605b.get();
        com.avito.android.autoteka.items.waitingForPaymentResponseItem.a aVar3 = (com.avito.android.autoteka.items.waitingForPaymentResponseItem.a) this.f96606c.get();
        b.f96601a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
