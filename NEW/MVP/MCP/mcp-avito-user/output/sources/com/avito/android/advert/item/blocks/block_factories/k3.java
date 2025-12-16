package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: ReviewsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class k3 implements dagger.internal.h<j3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D6.a> f73597a;

    public k3(Provider<D6.a> provider) {
        this.f73597a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j3(this.f73597a.get());
    }
}
