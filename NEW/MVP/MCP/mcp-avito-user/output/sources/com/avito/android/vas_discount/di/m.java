package com.avito.android.vas_discount.di;

import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import wJ0.InterfaceC49521b;
import xJ0.InterfaceC49849a;

/* compiled from: PickerModule_ProvideUserAdvertItemListBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319667a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319668b;

    public m(i iVar, u uVar) {
        this.f319667a = iVar;
        this.f319668b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49849a interfaceC49849a = (InterfaceC49849a) this.f319668b.get();
        this.f319667a.getClass();
        InterfaceC49521b interfaceC49521bA = interfaceC49849a.a();
        t.d(interfaceC49521bA);
        return interfaceC49521bA;
    }
}
