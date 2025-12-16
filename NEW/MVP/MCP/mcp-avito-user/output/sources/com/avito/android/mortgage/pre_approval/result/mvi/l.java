package com.avito.android.mortgage.pre_approval.result.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalResultReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.pre_approval.result.mvi.builders.e> f202149a;

    /* renamed from: b, reason: collision with root package name */
    public final u f202150b;

    public l(u uVar, Provider provider) {
        this.f202149a = provider;
        this.f202150b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f202149a.get(), (U00.c) this.f202150b.get());
    }
}
