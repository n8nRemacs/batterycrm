package com.avito.android.vas_performance.di.competitive;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319954a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319955b;

    public m(l lVar, u uVar) {
        this.f319954a = lVar;
        this.f319955b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f319955b.get();
        this.f319954a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
