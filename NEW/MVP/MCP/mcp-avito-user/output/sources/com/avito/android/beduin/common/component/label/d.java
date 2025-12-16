package com.avito.android.beduin.common.component.label;

import Ph.C14786c;
import Ph.InterfaceC14784a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinLabelComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C14786c f101663a;

    public d(C14786c c14786c) {
        this.f101663a = c14786c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC14784a) this.f101663a.get());
    }
}
