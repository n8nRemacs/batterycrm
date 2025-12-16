package com.avito.android.suggest_addresses.domain.adapter.addresses;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestAddressesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f291827a;

    public b(f fVar) {
        this.f291827a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f291827a.get());
    }
}
