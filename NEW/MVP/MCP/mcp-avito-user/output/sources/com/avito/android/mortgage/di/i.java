package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.MortgageLandingLink;
import com.avito.android.mortgage.deeplink.O;
import com.avito.android.mortgage.deeplink.P;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageLandingLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final O f198912a;

    public i(O o12) {
        this.f198912a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O o12 = this.f198912a;
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageLandingLink.class, new P(), new C43834a.b.C11809b(o12));
    }
}
