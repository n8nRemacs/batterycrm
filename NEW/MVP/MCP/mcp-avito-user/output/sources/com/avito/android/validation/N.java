package com.avito.android.validation;

import android.content.res.Resources;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideLocalPretendInteractorResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class N implements dagger.internal.h<g1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f319277a;

    public N(Provider<Resources> provider) {
        this.f319277a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = this.f319277a.get();
        A.f319242a.getClass();
        return new h1(resources);
    }
}
