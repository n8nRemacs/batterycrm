package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.C29463d;
import com.avito.android.comfortable_deal.deeplink.C29464e;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvideComfortableDealClientRoomDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C29463d f121993a;

    public d(C29463d c29463d) {
        this.f121993a = c29463d;
    }

    public static C43834a a(C29463d c29463d) {
        c.f121992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ComfortableDealClientRoomDeeplink.class, new C29464e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ComfortableDealClientRoomDeeplink.class), c29463d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f121993a);
    }
}
