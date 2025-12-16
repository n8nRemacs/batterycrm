package com.avito.android.parameters_sheet.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.parameters_sheet.di.a;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideSelectWithSuggestedOptionsItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<com.avito.android.blueprints.withSuggestedOptions.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f210810a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f210811b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f210812c;

    public v(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f210810a = provider;
        this.f210811b = provider2;
        this.f210812c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35807h4 interfaceC35807h4 = this.f210810a.get();
        Q1 q12 = (Q1) ((a.c.f) this.f210811b).get();
        Resources resources = (Resources) this.f210812c.f393949a;
        d.f210761a.getClass();
        return new com.avito.android.blueprints.withSuggestedOptions.e(interfaceC35807h4, q12, resources);
    }
}
