package com.avito.android.sx_address.entry.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressEntryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.sx_address.entry.mvi.builder.c f292974a;

    public k(com.avito.android.sx_address.entry.mvi.builder.c cVar) {
        this.f292974a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.sx_address.entry.mvi.builder.a) this.f292974a.get());
    }
}
