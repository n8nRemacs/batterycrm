package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.MortgageSignLink;
import com.avito.android.mortgage.deeplink.b0;
import com.avito.android.mortgage.deeplink.c0;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageSignLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f198915a;

    public l(b0 b0Var) {
        this.f198915a = b0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = this.f198915a;
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageSignLink.class, new c0(), new C43834a.b.C11809b(b0Var));
    }
}
