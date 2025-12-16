package com.avito.android.user_address.suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressSuggestMviActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f308143a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.a> f308144b;

    public o(dagger.internal.u uVar, Provider provider) {
        this.f308143a = uVar;
        this.f308144b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.user_address.suggest.domain.a) this.f308143a.get(), this.f308144b.get());
    }
}
