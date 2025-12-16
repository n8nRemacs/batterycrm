package com.avito.android.loyalty.di.criteria_gray;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaGrayModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183080a;

    public e(u uVar) {
        this.f183080a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f183080a.get();
        c.f183077a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
