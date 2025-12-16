package com.avito.android.sx_address.entry.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressEntryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.sx_address.entry.domain.d f292953a;

    public b(com.avito.android.sx_address.entry.domain.d dVar) {
        this.f292953a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.sx_address.entry.domain.c) this.f292953a.get());
    }
}
