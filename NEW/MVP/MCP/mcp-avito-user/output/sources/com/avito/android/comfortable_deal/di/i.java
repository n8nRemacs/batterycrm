package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.ComfortableDealDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvidePpComfortableDealDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.deeplink.m f121998a;

    public i(com.avito.android.comfortable_deal.deeplink.m mVar) {
        this.f121998a = mVar;
    }

    public static C43834a a(com.avito.android.comfortable_deal.deeplink.m mVar) {
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealDeeplink.class, new com.avito.android.comfortable_deal.deeplink.n(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComfortableDealDeeplink.class), mVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f121998a);
    }
}
