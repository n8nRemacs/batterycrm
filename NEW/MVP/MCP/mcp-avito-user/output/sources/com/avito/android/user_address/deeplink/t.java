package com.avito.android.user_address.deeplink;

import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideUserAddressAddNewRealtyAddressDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35342c f307285a;

    public t(C35342c c35342c) {
        this.f307285a = c35342c;
    }

    public static C43834a a(C35342c c35342c) {
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserAddressAddNewRealtyAddressLink.class, new C35343d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UserAddressAddNewRealtyAddressLink.class), c35342c));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f307285a);
    }
}
