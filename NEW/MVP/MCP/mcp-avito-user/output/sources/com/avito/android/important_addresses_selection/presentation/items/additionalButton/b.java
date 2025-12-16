package com.avito.android.important_addresses_selection.presentation.items.additionalButton;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionAdditionalActionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f169829a;

    /* renamed from: b, reason: collision with root package name */
    public final l f169830b;

    /* renamed from: c, reason: collision with root package name */
    public final d f169831c;

    public b(Provider provider, l lVar, d dVar) {
        this.f169829a = provider;
        this.f169830b = lVar;
        this.f169831c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f169829a.get();
        Y41.l lVar = (Y41.l) this.f169830b.f393949a;
        this.f169831c.getClass();
        return new a(aVar, lVar, new c());
    }
}
