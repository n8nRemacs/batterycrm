package com.avito.android.bundles.vas_union.item.performance.vas;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f108641a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f108642b;

    public b(u uVar, Provider provider) {
        this.f108641a = uVar;
        this.f108642b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f108641a.get(), this.f108642b.get());
    }
}
