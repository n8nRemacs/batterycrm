package com.avito.android.user_address.list;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: UserAddressListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_address.list.mvi.c f307379a;

    public i(com.avito.android.user_address.list.mvi.c cVar) {
        this.f307379a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_address.list.mvi.b bVar = (com.avito.android.user_address.list.mvi.b) this.f307379a.get();
        i2.f411430a.getClass();
        return new h(bVar, i2.a.f411433c);
    }
}
