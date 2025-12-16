package com.avito.android.suggest_addresses.domain.adapter.chips;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectedAddressesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f291848a;

    public b(g gVar) {
        this.f291848a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f291848a.get());
    }
}
