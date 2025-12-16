package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import javax.inject.Provider;

/* compiled from: UserAdvertsListReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.tab_screens.converters.j> f315269a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f315270b;

    public V(dagger.internal.u uVar, Provider provider) {
        this.f315269a = provider;
        this.f315270b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U(this.f315269a.get(), (com.avito.android.user_adverts.tab_screens.converters.g) this.f315270b.get());
    }
}
