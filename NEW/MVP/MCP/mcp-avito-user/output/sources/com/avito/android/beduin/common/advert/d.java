package com.avito.android.beduin.common.advert;

import javax.inject.Provider;

/* compiled from: BeduinAdvertSaturatorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f100538a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100539b;

    public d(dagger.internal.u uVar, Provider provider) {
        this.f100538a = provider;
        this.f100539b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f100538a.get(), (com.avito.android.advert.viewed.d) this.f100539b.get());
    }
}
