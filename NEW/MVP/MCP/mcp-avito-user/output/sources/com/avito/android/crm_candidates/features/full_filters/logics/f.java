package com.avito.android.crm_candidates.features.full_filters.logics;

import Us.InterfaceC15563a;
import dagger.internal.x;
import dagger.internal.y;
import iP.InterfaceC41329a;
import javax.inject.Provider;

/* compiled from: FiltersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15563a> f129604a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41329a> f129605b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f129606c;

    public f(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f129604a = provider;
        this.f129605b = provider2;
        this.f129606c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f129604a.get(), dagger.internal.g.b(this.f129605b), (com.avito.android.crm_candidates.domain.o) this.f129606c.get());
    }
}
