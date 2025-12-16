package com.google.android.gms.maps;

import dY0.AbstractBinderC39644D;
import dY0.InterfaceC39647b;

/* renamed from: com.google.android.gms.maps.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC36837z extends AbstractBinderC39644D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36810g f354497a;

    public BinderC36837z(InterfaceC36810g interfaceC36810g) {
        this.f354497a = interfaceC36810g;
    }

    @Override // dY0.InterfaceC39643C
    public final void E(InterfaceC39647b interfaceC39647b) {
        this.f354497a.onMapReady(new C36806c(interfaceC39647b));
    }
}
