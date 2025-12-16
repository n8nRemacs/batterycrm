package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideAutoEarlyAccessSelectBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class D implements dagger.internal.h<com.avito.android.blueprints.auto_early_access.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.auto_early_access.c> f319249a;

    public D(Provider<com.avito.android.blueprints.auto_early_access.c> provider) {
        this.f319249a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.auto_early_access.c cVar = this.f319249a.get();
        A.f319242a.getClass();
        return new com.avito.android.blueprints.auto_early_access.a(cVar);
    }
}
