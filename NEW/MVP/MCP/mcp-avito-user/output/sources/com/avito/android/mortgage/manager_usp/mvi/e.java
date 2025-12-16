package com.avito.android.mortgage.manager_usp.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ManagerUspBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f200423a;

    public e(u uVar) {
        this.f200423a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.mortgage.manager_usp.interactor.a) this.f200423a.get());
    }
}
