package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34901y;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideAdvertListItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I implements dagger.internal.h<InterfaceC34901y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34863v> f143996a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f143997b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f143998c;

    public I(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f143996a = provider;
        this.f143997b = uVar;
        this.f143998c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f143996a);
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f143997b.get();
        C36135w2 c36135w2 = (C36135w2) this.f143998c.get();
        D d12 = D.f143878a;
        return new com.avito.android.serp.adapter.D(eVarB, interfaceC28373a, c36135w2);
    }
}
