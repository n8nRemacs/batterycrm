package com.avito.android.rating.details.converter;

import javax.inject.Provider;

/* compiled from: RatingDetailsModelReviewConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f246943a;

    public o(Provider<u> provider) {
        this.f246943a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f246943a.get());
    }
}
