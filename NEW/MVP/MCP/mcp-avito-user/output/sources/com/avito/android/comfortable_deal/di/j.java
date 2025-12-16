package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.ComfortableDealOfferDeeplink;
import com.avito.android.comfortable_deal.deeplink.p;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvidePpComfortableDealOfferDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f121999a;

    public j(p pVar) {
        this.f121999a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = this.f121999a;
        c.f121992a.getClass();
        return new C43834a(ComfortableDealOfferDeeplink.class, null, new C43834a.b.C11809b(pVar));
    }
}
