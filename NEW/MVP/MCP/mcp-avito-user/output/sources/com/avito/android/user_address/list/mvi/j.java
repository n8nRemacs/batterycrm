package com.avito.android.user_address.list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAddressListMviBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_address.list.domain.e f307421a;

    public j(com.avito.android.user_address.list.domain.e eVar) {
        this.f307421a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.user_address.list.domain.c) this.f307421a.get());
    }
}
