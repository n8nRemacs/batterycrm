package com.avito.android.publish.slots.advantage_banners.container;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvantageContainerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f243005a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f243006b;

    /* renamed from: c, reason: collision with root package name */
    public final u f243007c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f243005a = provider;
        this.f243006b = provider2;
        this.f243007c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243005a.get(), this.f243006b.get(), (j) this.f243007c.get());
    }
}
