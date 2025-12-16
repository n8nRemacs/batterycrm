package com.avito.android.imv_cars_details.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.imv_cars_details.domain.a> f169998a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.imv_cars_details.domain.d> f169999b;

    /* renamed from: c, reason: collision with root package name */
    public final u f170000c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f169998a = provider;
        this.f169999b = provider2;
        this.f170000c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f169998a.get(), this.f169999b.get(), (com.avito.android.imv_cars_details.presentation.f) this.f170000c.get());
    }
}
