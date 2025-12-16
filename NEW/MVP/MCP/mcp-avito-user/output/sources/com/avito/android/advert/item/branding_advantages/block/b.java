package com.avito.android.advert.item.branding_advantages.block;

import Oi0.C14700d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingAdvantagesBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f74183a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f74184b;

    /* renamed from: c, reason: collision with root package name */
    public final u f74185c;

    public b(f fVar, Provider provider, u uVar) {
        this.f74183a = fVar;
        this.f74184b = provider;
        this.f74185c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f74183a.get(), this.f74184b.get(), (C14700d) this.f74185c.get());
    }
}
