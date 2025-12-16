package com.avito.android.comfortable_deal_info.di;

import com.avito.android.comfortable_deal_info.deeplink.ComfortableDealInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ComfortableDealInfoDeepLinkModule_ProvideComfortableDealInfoLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal_info.deeplink.d f123471a;

    public c(com.avito.android.comfortable_deal_info.deeplink.d dVar) {
        this.f123471a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.comfortable_deal_info.deeplink.d dVar = this.f123471a;
        b.f123470a.getClass();
        return new C43834a(ComfortableDealInfoLink.class, null, new C43834a.b.C11809b(dVar));
    }
}
