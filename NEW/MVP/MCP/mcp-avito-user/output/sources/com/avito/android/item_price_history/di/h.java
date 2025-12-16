package com.avito.android.item_price_history.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPriceHistoryModule_ProvideDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f173681a;

    public h(u uVar) {
        this.f173681a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f173681a.get();
        e.f173676a.getClass();
        return new C14699c(aVar);
    }
}
