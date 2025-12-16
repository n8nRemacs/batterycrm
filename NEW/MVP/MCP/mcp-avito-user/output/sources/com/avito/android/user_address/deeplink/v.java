package com.avito.android.user_address.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import lv.C43834a;

/* compiled from: UserAddressLinkHandlerModule_ProvideUserAddressForceExitDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f307287a;

    public v(i iVar) {
        this.f307287a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f307287a;
        p.f307264a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UserAddressLink.ForceExit.class, new j(), new C43834a.b.C11809b(iVar));
    }
}
