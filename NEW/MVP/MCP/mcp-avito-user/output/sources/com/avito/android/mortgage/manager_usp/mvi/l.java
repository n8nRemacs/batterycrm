package com.avito.android.mortgage.manager_usp.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ManagerUspReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.manager_usp.mvi.builder.c f200440a;

    public l(com.avito.android.mortgage.manager_usp.mvi.builder.c cVar) {
        this.f200440a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.mortgage.manager_usp.mvi.builder.a) this.f200440a.get());
    }
}
