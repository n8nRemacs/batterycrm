package com.avito.android.bundles.di;

/* compiled from: VasBundlesModule_ProvideBundleBenefitAdapterPresenter$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f108316a;

    public u(dagger.internal.u uVar) {
        this.f108316a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f108316a.get();
        t.f108315a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
