package com.avito.android.user_address.list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAddressListMviActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_address.list.domain.i f307418a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_address.list.domain.e f307419b;

    public h(com.avito.android.user_address.list.domain.i iVar, com.avito.android.user_address.list.domain.e eVar) {
        this.f307418a = iVar;
        this.f307419b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.user_address.list.domain.f) this.f307418a.get(), (com.avito.android.user_address.list.domain.c) this.f307419b.get());
    }
}
