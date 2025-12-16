package com.avito.android.mortgage.pre_approval.result.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalResultActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.pre_approval.result.mvi.domain.b f202093a;

    /* renamed from: b, reason: collision with root package name */
    public final u f202094b;

    public c(com.avito.android.mortgage.pre_approval.result.mvi.domain.b bVar, u uVar) {
        this.f202093a = bVar;
        this.f202094b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.pre_approval.result.mvi.domain.a) this.f202093a.get(), (com.avito.android.mortgage.pre_approval.result.mvi.domain.d) this.f202094b.get());
    }
}
