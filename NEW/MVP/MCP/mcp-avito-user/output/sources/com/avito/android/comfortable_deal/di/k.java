package com.avito.android.comfortable_deal.di;

import com.avito.android.comfortable_deal.deeplink.K;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PremierPartnerDeeplinkHandlerModule_ProvidePpRecallDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final K f122000a;

    public k(K k12) {
        this.f122000a = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        K k12 = this.f122000a;
        c.f121992a.getClass();
        return new C43834a(PpRecallDeeplink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PpRecallDeeplink.class), k12));
    }
}
