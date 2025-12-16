package com.avito.android.publish.details;

import javax.inject.Provider;

/* compiled from: PublishDetailsInfoProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class U0 implements dagger.internal.h<T0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.C0> f233167a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f233168b;

    public U0(dagger.internal.l lVar, Provider provider) {
        this.f233167a = provider;
        this.f233168b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new T0(this.f233167a.get(), ((Integer) this.f233168b.f393949a).intValue());
    }
}
