package com.avito.android.bundles.ui.recycler.item.bundle;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasBundleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f108395a;

    /* renamed from: b, reason: collision with root package name */
    public final u f108396b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f108397c;

    /* renamed from: d, reason: collision with root package name */
    public final u f108398d;

    public b(u uVar, u uVar2, Provider provider, Provider provider2) {
        this.f108395a = provider;
        this.f108396b = uVar;
        this.f108397c = provider2;
        this.f108398d = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f108395a.get(), (com.avito.android.util.text.a) this.f108396b.get(), this.f108397c.get(), (com.avito.konveyor.adapter.a) this.f108398d.get());
    }
}
