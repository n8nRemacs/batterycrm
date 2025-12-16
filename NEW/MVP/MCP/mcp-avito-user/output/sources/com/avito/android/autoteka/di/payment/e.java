package com.avito.android.autoteka.di.payment;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaPaymentModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96474a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96475b;

    public e(u uVar, Provider provider) {
        this.f96474a = uVar;
        this.f96475b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96474a.get();
        com.avito.konveyor.a aVar2 = this.f96475b.get();
        b.f96468a.getClass();
        return new j(aVar, aVar2);
    }
}
