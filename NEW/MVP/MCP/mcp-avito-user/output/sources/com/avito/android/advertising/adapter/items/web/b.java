package com.avito.android.advertising.adapter.items.web;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44740d;

/* compiled from: CommercialHtmlBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87653a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87654b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.a> f87655c;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f87653a = provider;
        this.f87654b = lVar;
        this.f87655c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87653a.get(), (InterfaceC44740d) this.f87654b.f393949a, this.f87655c.get());
    }
}
