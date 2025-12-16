package com.avito.android.tariff_lf_constructor.configure.locations.di;

import com.avito.android.tariff_lf_constructor.configure.locations.di.j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureLocationsModule_ProvideFilterCheckboxesInteractor$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299881a;

    public d(Provider<InterfaceC35745a5> provider) {
        this.f299881a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((j.b.a) this.f299881a).get();
        b bVar = b.f299879a;
        return new com.avito.android.tariff_lf_constructor.configure.checkbox_selector.j(interfaceC35745a5);
    }
}
