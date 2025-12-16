package com.avito.android.loyalty.di.quality_service_gray;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QualityServiceGrayModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183205a;

    public f(u uVar) {
        this.f183205a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f183205a.get();
        d.f183202a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
