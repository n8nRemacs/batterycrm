package com.avito.android.vas_discount.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wJ0.InterfaceC49522c;
import xJ0.InterfaceC49849a;

/* compiled from: PickerModule_ProvideUserAdvertPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<TV0.d<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319672a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49849a> f319673b;

    public o(i iVar, Provider<InterfaceC49849a> provider) {
        this.f319672a = iVar;
        this.f319673b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49849a interfaceC49849a = this.f319673b.get();
        this.f319672a.getClass();
        InterfaceC49522c interfaceC49522cB = interfaceC49849a.b();
        t.d(interfaceC49522cB);
        return interfaceC49522cB;
    }
}
