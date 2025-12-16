package com.avito.android.comfortable_deal.deal.mvi;

import javax.inject.Provider;

/* compiled from: DealOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f121570a;

    public C(Provider<String> provider) {
        this.f121570a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f121570a.get());
    }
}
