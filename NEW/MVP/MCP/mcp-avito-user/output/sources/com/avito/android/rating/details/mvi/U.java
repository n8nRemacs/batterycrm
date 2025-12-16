package com.avito.android.rating.details.mvi;

import javax.inject.Provider;
import tg0.InterfaceC48669b;

/* compiled from: RatingDetailsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f247268a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.converter.q> f247269b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC48669b> f247270c;

    public U(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f247268a = uVar;
        this.f247269b = provider;
        this.f247270c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T((com.avito.android.rating.details.converter.g) this.f247268a.get(), this.f247269b.get(), this.f247270c.get());
    }
}
