package com.avito.android.mortgage.di;

import com.avito.android.mortgage.deeplink.J;
import com.avito.android.mortgage.deeplink.M;
import com.avito.android.mortgage.deeplink.MortgageFormLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageDeeplinkModule_ProvideMortgageFormLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final J f198911a;

    public h(J j12) {
        this.f198911a = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J j12 = this.f198911a;
        a.f198904a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageFormLink.class, new M(), new C43834a.b.C11809b(j12));
    }
}
