package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.PreApprovalFormLink;
import com.avito.android.mortgage.deeplink.g0;
import com.avito.android.mortgage.deeplink.h0;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvidePreApprovalFormLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f198917a;

    public n(g0 g0Var) {
        this.f198917a = g0Var;
    }

    public static C43834a a(g0 g0Var) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PreApprovalFormLink.class, new h0(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PreApprovalFormLink.class), g0Var));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198917a);
    }
}
