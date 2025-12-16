package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinRealEstateFilterReloadActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class H0 implements dagger.internal.h<F0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100079a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100080b;

    public H0(dagger.internal.f fVar, Provider provider) {
        this.f100079a = provider;
        this.f100080b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F0(this.f100079a.get(), dagger.internal.g.b(this.f100080b));
    }
}
