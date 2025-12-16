package com.avito.android.parameters_sheet.di;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideRadioGroupSelectItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<com.avito.android.blueprints.radiogroup.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f210806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f210807b;

    public t(Provider<InterfaceC35807h4> provider, Provider<Q1> provider2) {
        this.f210806a = provider;
        this.f210807b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f210806a.get();
        Q1 q12 = this.f210807b.get();
        d.f210761a.getClass();
        return new com.avito.android.blueprints.radiogroup.g(interfaceC35807h4, q12);
    }
}
