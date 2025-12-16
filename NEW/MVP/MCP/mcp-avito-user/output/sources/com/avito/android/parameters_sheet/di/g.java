package com.avito.android.parameters_sheet.di;

import com.avito.android.Q1;
import com.avito.android.parameters_sheet.di.a;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideChipsSelectItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.android.blueprints.chips.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f210765a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f210766b;

    public g(dagger.internal.u uVar, Provider provider) {
        this.f210765a = uVar;
        this.f210766b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = (InterfaceC35807h4) this.f210765a.get();
        Q1 q12 = (Q1) ((a.c.f) this.f210766b).get();
        d.f210761a.getClass();
        return new com.avito.android.blueprints.chips.e(interfaceC35807h4, q12, null, 4, null);
    }
}
