package com.avito.android.advert_stats.item;

import javax.inject.Provider;

/* compiled from: StatisticsToItemsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D> f86697a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f86698b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f86699c;

    public M(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f86697a = provider;
        this.f86698b = provider2;
        this.f86699c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L(this.f86697a.get(), this.f86698b.get(), (z) this.f86699c.get());
    }
}
