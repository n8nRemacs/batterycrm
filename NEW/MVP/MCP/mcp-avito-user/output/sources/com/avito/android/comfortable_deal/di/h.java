package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.D;
import com.avito.android.comfortable_deal.deeplink.DealIncomeDetailsDeeplink;
import com.avito.android.comfortable_deal.deeplink.E;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvideDealIncomeDetailsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D f121997a;

    public h(D d12) {
        this.f121997a = d12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = this.f121997a;
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DealIncomeDetailsDeeplink.class, new E(), new C43834a.b.C11809b(d12));
    }
}
