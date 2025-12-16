package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.C32605u;
import com.avito.android.mortgage.deeplink.C32606v;
import com.avito.android.mortgage.deeplink.MortgageConsultationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageConsultationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32605u f198908a;

    public e(C32605u c32605u) {
        this.f198908a = c32605u;
    }

    public static C43834a a(C32605u c32605u) {
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageConsultationLink.class, new C32606v(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageConsultationLink.class), c32605u));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f198908a);
    }
}
