package com.avito.android.di.module;

import Vj.InterfaceC15686a;
import com.avito.android.analytics.clickstream.C28400z;
import com.avito.android.analytics.clickstream.InterfaceC28399y;
import fz.InterfaceC40498a;
import javax.inject.Provider;
import w40.InterfaceC49441a;

/* compiled from: ClickStreamModule_ProvideClickStreamEventSaturatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F2 implements dagger.internal.h<InterfaceC28399y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f143948a;

    /* renamed from: b, reason: collision with root package name */
    public final Uy.e f143949b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.home.bottom_navigation.u f143950c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC49441a> f143951d;

    public F2(Provider provider, Uy.e eVar, com.avito.android.home.bottom_navigation.u uVar, Provider provider2) {
        this.f143948a = provider;
        this.f143949b = eVar;
        this.f143950c = uVar;
        this.f143951d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.E e12 = this.f143948a.get();
        InterfaceC40498a interfaceC40498a = (InterfaceC40498a) this.f143949b.get();
        InterfaceC15686a interfaceC15686a = (InterfaceC15686a) this.f143950c.get();
        InterfaceC49441a interfaceC49441a = this.f143951d.get();
        E2 e22 = E2.f143902a;
        return new C28400z(e12, interfaceC40498a, interfaceC15686a, interfaceC49441a);
    }
}
