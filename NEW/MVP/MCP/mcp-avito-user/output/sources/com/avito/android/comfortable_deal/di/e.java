package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.C29468i;
import com.avito.android.comfortable_deal.deeplink.C29469j;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvideComfortableDealClientsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29468i f121994a;

    public e(C29468i c29468i) {
        this.f121994a = c29468i;
    }

    public static C43834a a(C29468i c29468i) {
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealClientsDeeplink.class, new C29469j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComfortableDealClientsDeeplink.class), c29468i));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f121994a);
    }
}
