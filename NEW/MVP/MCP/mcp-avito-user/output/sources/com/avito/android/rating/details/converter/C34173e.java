package com.avito.android.rating.details.converter;

import javax.inject.Provider;

/* compiled from: RatingDetailsBuyerReviewConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.rating.details.converter.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34173e implements dagger.internal.h<C34172d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A> f246924a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<q> f246925b;

    public C34173e(Provider<A> provider, Provider<q> provider2) {
        this.f246924a = provider;
        this.f246925b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34172d(this.f246924a.get(), this.f246925b.get());
    }
}
