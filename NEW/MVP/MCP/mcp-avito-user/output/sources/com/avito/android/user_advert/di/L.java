package com.avito.android.user_advert.di;

import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import Ta.InterfaceC15346a;
import javax.inject.Provider;

/* compiled from: MyAdvertMultiItemsBlockModule_CopyBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class L implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14873a> f310887a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14875c> f310888b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310889c;

    public L(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f310887a = provider;
        this.f310888b = provider2;
        this.f310889c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14873a interfaceC14873a = this.f310887a.get();
        InterfaceC14875c interfaceC14875c = this.f310888b.get();
        InterfaceC15346a interfaceC15346a = (InterfaceC15346a) this.f310889c.get();
        K.f310886a.getClass();
        return interfaceC15346a.a(interfaceC14873a, interfaceC14875c);
    }
}
