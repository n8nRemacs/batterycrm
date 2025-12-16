package com.avito.android.review.report.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComfortableDealReviewBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.review.data_source.a> f255408a;

    public b(Provider<com.avito.android.review.data_source.a> provider) {
        this.f255408a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f255408a.get());
    }
}
