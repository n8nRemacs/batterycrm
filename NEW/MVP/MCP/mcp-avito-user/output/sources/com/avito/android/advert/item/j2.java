package com.avito.android.advert.item;

import javax.inject.Provider;

/* compiled from: BlocksLoggerRequestBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class j2 implements dagger.internal.h<i2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<fa.d> f77196a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f77197b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f77198c;

    public j2(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f77196a = provider;
        this.f77197b = lVar;
        this.f77198c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i2(dagger.internal.g.b(this.f77196a), (String) this.f77197b.f393949a, this.f77198c.get());
    }
}
