package com.avito.android.user_address.deeplink;

import com.avito.android.SxAddressAddLink;
import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideSxAddAddressDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_address.deeplink.sx_new_address.c f307267a;

    public s(com.avito.android.user_address.deeplink.sx_new_address.c cVar) {
        this.f307267a = cVar;
    }

    public static C43834a a(com.avito.android.user_address.deeplink.sx_new_address.c cVar) {
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressAddLink.class, new com.avito.android.user_address.deeplink.sx_new_address.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressAddLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f307267a);
    }
}
