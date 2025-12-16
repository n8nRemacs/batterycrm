package com.avito.android.beduin.common.advert;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinViewedAdvertManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class A implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.d> f100532a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.a> f100533b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100534c;

    public A(Provider<com.avito.android.advert.viewed.d> provider, Provider<com.avito.android.advert.viewed.a> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f100532a = provider;
        this.f100533b = provider2;
        this.f100534c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f100532a.get(), this.f100533b.get(), this.f100534c.get());
    }
}
