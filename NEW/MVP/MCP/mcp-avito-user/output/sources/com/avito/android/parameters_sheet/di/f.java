package com.avito.android.parameters_sheet.di;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideChipsMultiselectItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.android.blueprints.chips_multiselect.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f210763a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f210764b;

    public f(Provider<InterfaceC35807h4> provider, Provider<Q1> provider2) {
        this.f210763a = provider;
        this.f210764b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f210763a.get();
        Q1 q12 = this.f210764b.get();
        d.f210761a.getClass();
        return new com.avito.android.blueprints.chips_multiselect.f(interfaceC35807h4, q12);
    }
}
