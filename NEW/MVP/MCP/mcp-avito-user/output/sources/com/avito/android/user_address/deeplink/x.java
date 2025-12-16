package com.avito.android.user_address.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideUserAddressMapDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class x implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D f307289a;

    public x(D d12) {
        this.f307289a = d12;
    }

    public static C43834a a(D d12) {
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserAddressLink.Map.class, new E(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UserAddressLink.Map.class), d12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f307289a);
    }
}
