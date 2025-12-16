package com.avito.android.master_plan.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import pY.InterfaceC47032c;

/* compiled from: MasterPlanActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186058a;

    public b(u uVar) {
        this.f186058a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC47032c) this.f186058a.get());
    }
}
