package com.avito.android.parameters_sheet.di;

import com.avito.android.parameters_sheet.di.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideParametersListDialogPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<com.avito.android.parameters_sheet.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f210800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f210801b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Set<TV0.d<?, ?>>> f210802c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f210803d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f210804e;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f210800a = lVar;
        this.f210801b = provider;
        this.f210802c = provider2;
        this.f210803d = lVar2;
        this.f210804e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        List list = (List) this.f210800a.f393949a;
        com.avito.konveyor.adapter.a aVar = this.f210801b.get();
        Set<TV0.d<?, ?>> set = this.f210802c.get();
        com.avito.android.category_parameters.h hVar = (com.avito.android.category_parameters.h) this.f210803d.f393949a;
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.i) this.f210804e).get();
        d.f210761a.getClass();
        return new com.avito.android.parameters_sheet.g(list, aVar, set, hVar, interfaceC35745a5);
    }
}
