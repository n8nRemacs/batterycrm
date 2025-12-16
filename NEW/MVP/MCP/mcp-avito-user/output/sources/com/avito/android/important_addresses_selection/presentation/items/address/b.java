package com.avito.android.important_addresses_selection.presentation.items.address;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImportantAddressesSelectionAddressBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f169849a;

    /* renamed from: b, reason: collision with root package name */
    public final d f169850b;

    public b(l lVar, d dVar) {
        this.f169849a = lVar;
        this.f169850b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f169849a.f393949a;
        this.f169850b.getClass();
        return new a(lVar, new c());
    }
}
