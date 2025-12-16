package com.avito.android.loyalty.ui.quality_service;

import bX.InterfaceC25576a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f183965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f183966b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f183967c;

    /* renamed from: d, reason: collision with root package name */
    public final j f183968d;

    public l(Provider provider, Provider provider2, dagger.internal.l lVar, j jVar) {
        this.f183965a = provider;
        this.f183966b = provider2;
        this.f183967c = lVar;
        this.f183968d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC25576a interfaceC25576a = this.f183965a.get();
        R0 r02 = this.f183966b.get();
        QualityServiceArgs qualityServiceArgs = (QualityServiceArgs) this.f183967c.f393949a;
        this.f183968d.getClass();
        return new k(interfaceC25576a, r02, qualityServiceArgs, new i());
    }
}
