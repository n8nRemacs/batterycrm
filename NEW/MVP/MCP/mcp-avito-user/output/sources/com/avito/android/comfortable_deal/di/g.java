package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.CommissionCalculationDetailsDeeplink;
import com.avito.android.comfortable_deal.deeplink.z;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvideCommissionCalculationDetailsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.deeplink.y f121996a;

    public g(com.avito.android.comfortable_deal.deeplink.y yVar) {
        this.f121996a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.comfortable_deal.deeplink.y yVar = this.f121996a;
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CommissionCalculationDetailsDeeplink.class, new z(), new C43834a.b.C11809b(yVar));
    }
}
