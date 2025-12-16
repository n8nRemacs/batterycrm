package com.avito.android.delivery_location_suggest.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryLocationSuggestModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f135095a;

    public h(u uVar) {
        this.f135095a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f135095a.get();
        g.f135094a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
