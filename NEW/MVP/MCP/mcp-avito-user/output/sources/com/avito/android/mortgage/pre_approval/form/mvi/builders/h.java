package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalFormListBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final n f201862a;

    public h(n nVar) {
        this.f201862a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((l) this.f201862a.get());
    }
}
