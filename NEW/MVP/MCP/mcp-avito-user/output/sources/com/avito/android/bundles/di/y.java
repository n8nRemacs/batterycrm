package com.avito.android.bundles.di;

/* compiled from: VasBundlesModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f108321a;

    public y(dagger.internal.u uVar) {
        this.f108321a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = (com.avito.android.recycler.data_aware.b) this.f108321a.get();
        t tVar = t.f108315a;
        return new com.avito.android.recycler.data_aware.i(bVar, new com.avito.android.recycler.data_aware.j(), true, null, 8, null);
    }
}
