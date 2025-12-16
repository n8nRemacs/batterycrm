package com.avito.android.sx_address.entry.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressEntryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.sx_address.entry.domain.d f292957a;

    /* renamed from: b, reason: collision with root package name */
    public final CA0.c f292958b;

    public d(com.avito.android.sx_address.entry.domain.d dVar, CA0.c cVar) {
        this.f292957a = dVar;
        this.f292958b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.sx_address.entry.domain.c) this.f292957a.get(), (CA0.a) this.f292958b.get());
    }
}
