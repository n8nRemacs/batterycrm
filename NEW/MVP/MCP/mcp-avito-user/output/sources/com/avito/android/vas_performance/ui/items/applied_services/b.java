package com.avito.android.vas_performance.ui.items.applied_services;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliedServiceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f321568a;

    public b(Provider<e> provider) {
        this.f321568a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f321568a.get());
    }
}
