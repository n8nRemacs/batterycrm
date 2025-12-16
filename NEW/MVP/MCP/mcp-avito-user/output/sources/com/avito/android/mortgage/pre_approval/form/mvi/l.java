package com.avito.android.mortgage.pre_approval.form.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalFormReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.form.mvi.builders.k f201951a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.form.mvi.builders.d f201952b;

    /* renamed from: c, reason: collision with root package name */
    public final M00.d f201953c;

    public l(com.avito.android.mortgage.pre_approval.form.mvi.builders.k kVar, com.avito.android.mortgage.pre_approval.form.mvi.builders.d dVar, M00.d dVar2) {
        this.f201951a = kVar;
        this.f201952b = dVar;
        this.f201953c = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.pre_approval.form.mvi.builders.i iVar = (com.avito.android.mortgage.pre_approval.form.mvi.builders.i) this.f201951a.get();
        this.f201952b.getClass();
        return new k(iVar, new com.avito.android.mortgage.pre_approval.form.mvi.builders.c(), (M00.b) this.f201953c.get());
    }
}
