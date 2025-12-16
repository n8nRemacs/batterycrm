package com.avito.android.autoteka.di.choosingPurchase;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaFullscreenChoosingPurchaseModule_Companion_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96348a;

    public h(u uVar) {
        this.f96348a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f96348a.get();
        g.f96346a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
