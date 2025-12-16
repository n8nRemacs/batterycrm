package com.avito.android.comfortable_deal.contract_sign.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import op.InterfaceC44835a;

/* compiled from: ContractSignActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f120850a;

    /* renamed from: b, reason: collision with root package name */
    public final u f120851b;

    public d(com.avito.android.comfortable_deal.repository.l lVar, u uVar) {
        this.f120850a = lVar;
        this.f120851b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.comfortable_deal.repository.a) this.f120850a.get(), (InterfaceC44835a) this.f120851b.get());
    }
}
