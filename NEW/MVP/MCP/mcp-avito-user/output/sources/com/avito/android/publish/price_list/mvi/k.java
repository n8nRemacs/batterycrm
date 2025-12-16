package com.avito.android.publish.price_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238902a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.p f238903b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.b f238904c;

    public k(Provider provider, com.avito.android.publish.price_list.domain.use_case.p pVar, com.avito.android.publish.price_list.domain.b bVar) {
        this.f238902a = provider;
        this.f238903b = pVar;
        this.f238904c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f238902a.get(), (com.avito.android.publish.price_list.domain.use_case.o) this.f238903b.get(), (com.avito.android.publish.price_list.domain.a) this.f238904c.get());
    }
}
