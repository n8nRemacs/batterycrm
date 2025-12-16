package com.avito.android.loyalty.di.quality_service_gray;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceGrayModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183203a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f183204b;

    public e(u uVar, Provider provider) {
        this.f183203a = uVar;
        this.f183204b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f183203a.get();
        com.avito.konveyor.a aVar = this.f183204b.get();
        d.f183202a.getClass();
        return new j(hVar, aVar);
    }
}
