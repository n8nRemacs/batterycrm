package com.avito.android.user_address.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideMultiGeoSuggestDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_address.deeplink.multigeo.g f307266a;

    public r(com.avito.android.user_address.deeplink.multigeo.g gVar) {
        this.f307266a = gVar;
    }

    public static C43834a a(com.avito.android.user_address.deeplink.multigeo.g gVar) {
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserAddressLink.MultiGeoSuggest.class, new com.avito.android.user_address.deeplink.multigeo.j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UserAddressLink.MultiGeoSuggest.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f307266a);
    }
}
