package com.avito.android.mortgage.applications_list.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationsListReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final u f198478a;

    public r(u uVar) {
        this.f198478a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((k) this.f198478a.get());
    }
}
