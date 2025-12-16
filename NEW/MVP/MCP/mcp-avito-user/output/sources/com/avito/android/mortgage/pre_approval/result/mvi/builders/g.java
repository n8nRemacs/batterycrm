package com.avito.android.mortgage.pre_approval.result.mvi.builders;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalResultViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f202092a;

    public g(u uVar) {
        this.f202092a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a) this.f202092a.get());
    }
}
