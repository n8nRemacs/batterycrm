package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import javax.inject.Provider;
import pK.InterfaceC46970a;
import xK.InterfaceC49851a;

/* compiled from: IacCallScreenViewFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46970a> f166351a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49851a> f166352b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f166353c;

    public x(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f166351a = provider;
        this.f166352b = provider2;
        this.f166353c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f166351a.get(), this.f166352b.get(), (com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a) this.f166353c.get());
    }
}
