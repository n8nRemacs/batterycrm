package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.MortgageManagerUspLink;
import com.avito.android.mortgage.deeplink.Y;
import com.avito.android.mortgage.deeplink.Z;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageManagerUspLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final Y f198914a;

    public k(Y y12) {
        this.f198914a = y12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y y12 = this.f198914a;
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageManagerUspLink.class, new Z(), new C43834a.b.C11809b(y12));
    }
}
