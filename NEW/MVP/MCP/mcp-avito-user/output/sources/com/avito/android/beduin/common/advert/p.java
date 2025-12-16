package com.avito.android.beduin.common.advert;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinFavoriteAdvertManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite.m f100561a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100562b;

    public p(com.avito.android.favorite.m mVar, Provider provider) {
        this.f100561a = mVar;
        this.f100562b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.favorite.h) this.f100561a.get(), this.f100562b.get());
    }
}
