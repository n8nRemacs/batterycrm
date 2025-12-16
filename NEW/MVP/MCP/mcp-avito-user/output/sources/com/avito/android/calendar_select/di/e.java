package com.avito.android.calendar_select.di;

import Ul.InterfaceC15532a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarSelectRecyclerModule_ProvideAdapterPresenter$_avito_calendar_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113325a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f113326b;

    public e(u uVar, Provider provider) {
        this.f113325a = uVar;
        this.f113326b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC15532a interfaceC15532a = (InterfaceC15532a) this.f113325a.get();
        com.avito.konveyor.a aVar = this.f113326b.get();
        int i12 = d.f113324a;
        return new com.avito.konveyor.adapter.h(interfaceC15532a, aVar, null, 4, null);
    }
}
