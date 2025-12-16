package com.avito.android.user_advert.di;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import javax.inject.Provider;

/* compiled from: MyAdvertMultiItemsBlockModule_ParamChipsBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class M implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14873a> f310890a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14875c> f310891b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310892c;

    public M(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f310890a = provider;
        this.f310891b = provider2;
        this.f310892c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14873a interfaceC14873a = this.f310890a.get();
        InterfaceC14875c interfaceC14875c = this.f310891b.get();
        com.avito.android.advert_multi_items.param_chips.b bVar = (com.avito.android.advert_multi_items.param_chips.b) this.f310892c.get();
        K.f310886a.getClass();
        return bVar.a(interfaceC14873a, interfaceC14875c);
    }
}
