package com.avito.android.mortgage.pre_approval.form.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.form.mvi.domain.b f201870a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.form.mvi.domain.g f201871b;

    public c(com.avito.android.mortgage.pre_approval.form.mvi.domain.b bVar, com.avito.android.mortgage.pre_approval.form.mvi.domain.g gVar) {
        this.f201870a = bVar;
        this.f201871b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage.pre_approval.form.mvi.domain.a) this.f201870a.get(), (com.avito.android.mortgage.pre_approval.form.mvi.domain.e) this.f201871b.get());
    }
}
