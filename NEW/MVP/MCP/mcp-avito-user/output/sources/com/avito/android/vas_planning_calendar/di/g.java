package com.avito.android.vas_planning_calendar.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import hM0.InterfaceC40853a;
import javax.inject.Provider;

/* compiled from: VasPlanCalendarModule_ProvideAdapterPresenter$_avito_vas_planning_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322644a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f322645b;

    public g(u uVar, Provider provider) {
        this.f322644a = uVar;
        this.f322645b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40853a interfaceC40853a = (InterfaceC40853a) this.f322644a.get();
        com.avito.konveyor.a aVar = this.f322645b.get();
        int i12 = f.f322643a;
        return new com.avito.konveyor.adapter.h(interfaceC40853a, aVar, null, 4, null);
    }
}
