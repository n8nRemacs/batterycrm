package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpInteractorModule_ProviderPermanentWarningStateStorage$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X7 implements dagger.internal.h<com.avito.android.serp.warning.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.l> f144192a;

    public X7(Provider<AK0.l> provider) {
        this.f144192a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = this.f144192a.get();
        int i12 = R7.f144121a;
        return new com.avito.android.serp.warning.b(lVar);
    }
}
