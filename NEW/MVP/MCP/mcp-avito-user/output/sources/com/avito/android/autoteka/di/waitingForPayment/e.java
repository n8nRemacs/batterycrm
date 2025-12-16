package com.avito.android.autoteka.di.waitingForPayment;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaWaitingForPaymentModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96607a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96608b;

    public e(u uVar, Provider provider) {
        this.f96607a = uVar;
        this.f96608b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96607a.get();
        com.avito.konveyor.a aVar2 = this.f96608b.get();
        b.f96601a.getClass();
        return new j(aVar, aVar2);
    }
}
