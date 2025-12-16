package com.avito.android.vas_discount.v2.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wJ0.InterfaceC49522c;
import xJ0.InterfaceC49849a;

/* compiled from: VasDiscountV2Module_ProvideUserAdvertPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<TV0.d<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49849a> f319790a;

    public l(Provider<InterfaceC49849a> provider) {
        this.f319790a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49849a interfaceC49849a = this.f319790a.get();
        d.f319779a.getClass();
        InterfaceC49522c interfaceC49522cB = interfaceC49849a.b();
        t.d(interfaceC49522cB);
        return interfaceC49522cB;
    }
}
