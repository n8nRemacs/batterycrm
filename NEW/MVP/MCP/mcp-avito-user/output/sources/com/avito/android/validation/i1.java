package com.avito.android.validation;

import android.content.res.Resources;

/* compiled from: ParametersValidatorResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class i1 implements dagger.internal.h<h1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f319387a;

    public i1(dagger.internal.l lVar) {
        this.f319387a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h1((Resources) this.f319387a.f393949a);
    }
}
