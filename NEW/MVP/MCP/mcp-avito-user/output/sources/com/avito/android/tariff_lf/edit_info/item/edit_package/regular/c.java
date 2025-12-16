package com.avito.android.tariff_lf.edit_info.item.edit_package.regular;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegularEditPackageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f298975a;

    /* renamed from: b, reason: collision with root package name */
    public final u f298976b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298977c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f298975a = provider;
        this.f298976b = uVar;
        this.f298977c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f298975a.get(), (com.avito.konveyor.adapter.a) this.f298976b.get(), this.f298977c.get());
    }
}
