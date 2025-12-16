package com.avito.android.publish.slots.imv.item;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstantMarketValueBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f244272a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244273b;

    public b(u uVar, Provider provider) {
        this.f244272a = provider;
        this.f244273b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f244272a.get(), (com.avito.android.util.text.a) this.f244273b.get());
    }
}
