package com.avito.android.mortgage.manager_usp.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ManagerUspActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f200417a;

    public c(u uVar) {
        this.f200417a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage.manager_usp.interactor.a) this.f200417a.get());
    }
}
