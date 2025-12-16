package com.avito.android.profile.deep_linking;

import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideCloseBannerDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33311c f221922a;

    public o(C33311c c33311c) {
        this.f221922a = c33311c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C33311c c33311c = this.f221922a;
        n.f221921a.getClass();
        return new C43834a(CloseInternalBannerRotationDeepLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CloseInternalBannerRotationDeepLink.class), c33311c));
    }
}
