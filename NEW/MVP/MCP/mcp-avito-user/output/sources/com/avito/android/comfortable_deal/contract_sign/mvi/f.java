package com.avito.android.comfortable_deal.contract_sign.mvi;

import com.avito.android.comfortable_deal.contract_sign.model.ContractSignArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import op.InterfaceC44835a;

/* compiled from: ContractSignBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f120866a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.contract_sign.l> f120867b;

    /* renamed from: c, reason: collision with root package name */
    public final u f120868c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f120866a = lVar;
        this.f120867b = provider;
        this.f120868c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ContractSignArguments) this.f120866a.f393949a, this.f120867b.get(), (InterfaceC44835a) this.f120868c.get());
    }
}
