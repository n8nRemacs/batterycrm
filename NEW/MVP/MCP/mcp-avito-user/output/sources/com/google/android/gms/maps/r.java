package com.google.android.gms.maps;

import dY0.AbstractBinderC39644D;
import dY0.InterfaceC39647b;

/* loaded from: classes6.dex */
final class r extends AbstractBinderC39644D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36810g f354495a;

    public r(InterfaceC36810g interfaceC36810g) {
        this.f354495a = interfaceC36810g;
    }

    @Override // dY0.InterfaceC39643C
    public final void E(InterfaceC39647b interfaceC39647b) {
        this.f354495a.onMapReady(new C36806c(interfaceC39647b));
    }
}
