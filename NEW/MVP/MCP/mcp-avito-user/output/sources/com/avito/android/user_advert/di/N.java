package com.avito.android.user_advert.di;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import javax.inject.Provider;

/* compiled from: MyAdvertMultiItemsBlockModule_ParamImagesBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class N implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14873a> f310893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14875c> f310894b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310895c;

    public N(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f310893a = provider;
        this.f310894b = provider2;
        this.f310895c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14873a interfaceC14873a = this.f310893a.get();
        InterfaceC14875c interfaceC14875c = this.f310894b.get();
        com.avito.android.advert_multi_items.param_images.b bVar = (com.avito.android.advert_multi_items.param_images.b) this.f310895c.get();
        K.f310886a.getClass();
        return bVar.a(interfaceC14873a, interfaceC14875c);
    }
}
