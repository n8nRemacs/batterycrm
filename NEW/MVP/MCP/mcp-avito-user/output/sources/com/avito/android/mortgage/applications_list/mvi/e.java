package com.avito.android.mortgage.applications_list.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationsListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f198440a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<QZ.b> f198441b;

    public e(u uVar, Provider provider) {
        this.f198440a = uVar;
        this.f198441b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.mortgage.applications_list.c) this.f198440a.get(), this.f198441b.get());
    }
}
