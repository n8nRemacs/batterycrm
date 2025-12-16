package com.avito.android.vas_performance.ui.items.vas;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PerformanceVasBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321792a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f321793b;

    public b(u uVar, Provider provider) {
        this.f321792a = uVar;
        this.f321793b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f321792a.get(), this.f321793b.get());
    }
}
