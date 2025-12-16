package com.avito.android.early_access.mvi;

import Nx.InterfaceC14620a;

/* compiled from: EarlyAccessReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.early_access.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30308z implements dagger.internal.h<C30307y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f145566a;

    public C30308z(dagger.internal.u uVar) {
        this.f145566a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30307y((InterfaceC14620a) this.f145566a.get());
    }
}
