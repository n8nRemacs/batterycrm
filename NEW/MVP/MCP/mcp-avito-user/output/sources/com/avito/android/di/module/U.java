package com.avito.android.di.module;

import com.avito.android.enabler.TogglesStorage;

/* compiled from: AnalyticFeaturesModule_ProvideAnalyticFeaturesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U implements dagger.internal.h<com.avito.android.analytics.features.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144143a;

    public U(dagger.internal.u uVar) {
        this.f144143a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TogglesStorage togglesStorage = (TogglesStorage) this.f144143a.get();
        int i12 = T.f144138a;
        return new com.avito.android.analytics.features.a(togglesStorage);
    }
}
