package com.avito.android.di.module;

import android.content.res.Resources;

/* compiled from: AdvertItemPresenterModule_ProvideMultipleGridItemDimensionProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K implements dagger.internal.h<com.avito.android.serp.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144023a;

    public K(dagger.internal.l lVar) {
        this.f144023a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f144023a.f393949a;
        D d12 = D.f143878a;
        return new com.avito.android.serp.f(resources);
    }
}
