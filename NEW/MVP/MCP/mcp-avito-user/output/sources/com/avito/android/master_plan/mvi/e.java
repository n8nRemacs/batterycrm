package com.avito.android.master_plan.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pY.InterfaceC47032c;
import wY.C49575a;

/* compiled from: MasterPlanBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f186065a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.master_plan.h> f186066b;

    /* renamed from: c, reason: collision with root package name */
    public final u f186067c;

    public e(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f186065a = lVar;
        this.f186066b = provider;
        this.f186067c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C49575a) this.f186065a.f393949a, this.f186066b.get(), (InterfaceC47032c) this.f186067c.get());
    }
}
