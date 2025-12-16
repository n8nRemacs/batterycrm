package com.avito.android.tariff_lf.package_info.recycler;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffPackageBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f299236a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299237b;

    /* renamed from: c, reason: collision with root package name */
    public final u f299238c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f299236a = provider;
        this.f299237b = provider2;
        this.f299238c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f299236a.get(), this.f299237b.get(), (com.avito.konveyor.adapter.a) this.f299238c.get());
    }
}
