package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.MortgageLandingV2Link;
import com.avito.android.mortgage.deeplink.U;
import com.avito.android.mortgage.deeplink.V;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageLandingV2LinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final U f198913a;

    public j(U u12) {
        this.f198913a = u12;
    }

    public static C43834a a(U u12) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageLandingV2Link.class, new V(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageLandingV2Link.class), u12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198913a);
    }
}
