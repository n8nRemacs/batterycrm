package com.avito.android.mortgage.root.mvi.domain;

import javax.inject.Provider;

/* compiled from: InitialLoadApplicationUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f203145a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f203146b;

    public v(dagger.internal.u uVar, Provider provider) {
        this.f203145a = provider;
        this.f203146b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f203145a.get(), (w) this.f203146b.get());
    }
}
