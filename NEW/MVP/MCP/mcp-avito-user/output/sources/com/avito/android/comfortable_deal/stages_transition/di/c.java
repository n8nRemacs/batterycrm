package com.avito.android.comfortable_deal.stages_transition.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StagesTransitionAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f122854a;

    public c(u uVar) {
        this.f122854a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f122854a.get();
        int i12 = b.f122853a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
