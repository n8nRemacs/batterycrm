package com.avito.android.user_address.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideUserAddressEditDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35345f f307286a;

    public u(C35345f c35345f) {
        this.f307286a = c35345f;
    }

    public static C43834a a(C35345f c35345f) {
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserAddressLink.Edit.class, new C35346g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UserAddressLink.Edit.class), c35345f));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f307286a);
    }
}
