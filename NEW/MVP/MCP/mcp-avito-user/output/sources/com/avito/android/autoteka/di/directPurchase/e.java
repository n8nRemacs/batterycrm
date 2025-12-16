package com.avito.android.autoteka.di.directPurchase;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaDirectPurchaseModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96419a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96420b;

    public e(u uVar, Provider provider) {
        this.f96419a = uVar;
        this.f96420b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96419a.get();
        com.avito.konveyor.a aVar2 = this.f96420b.get();
        b.f96415a.getClass();
        return new j(aVar, aVar2);
    }
}
