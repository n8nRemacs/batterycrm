package com.avito.android.campaigns_sale.konveyor.editBlock;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fm.InterfaceC40441a;
import javax.inject.Provider;
import vm.InterfaceC49348c;

/* compiled from: SaleEditBlockItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f113992a;

    /* renamed from: b, reason: collision with root package name */
    public final u f113993b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC49348c> f113994c;

    public m(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f113992a = lVar;
        this.f113993b = uVar;
        this.f113994c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Y41.l) this.f113992a.f393949a, (InterfaceC40441a) this.f113993b.get(), this.f113994c.get());
    }
}
