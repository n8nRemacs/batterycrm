package com.avito.android.mandatory_verification.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RetrieveDataUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.data.d> f184579a;

    public h(Provider<com.avito.android.mandatory_verification.data.d> provider) {
        this.f184579a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f184579a.get());
    }
}
