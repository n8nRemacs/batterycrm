package com.avito.android.mortgage.pre_approval.form.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalFormBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.form.mvi.domain.b f201914a;

    public e(com.avito.android.mortgage.pre_approval.form.mvi.domain.b bVar) {
        this.f201914a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.mortgage.pre_approval.form.mvi.domain.a) this.f201914a.get());
    }
}
