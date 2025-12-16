package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.ComfortableDealRouteDeeplink;
import com.avito.android.comfortable_deal.deeplink.s;
import com.avito.android.comfortable_deal.deeplink.t;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvideComfortableDealRouteDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final s f121995a;

    public f(s sVar) {
        this.f121995a = sVar;
    }

    public static C43834a a(s sVar) {
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealRouteDeeplink.class, new t(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComfortableDealRouteDeeplink.class), sVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f121995a);
    }
}
