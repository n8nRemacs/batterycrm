package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressListRefreshLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressListRefreshLinkDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35167g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final F f292824a;

    public C35167g(F f12) {
        this.f292824a = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressListRefreshLink.class, new G(), new C43834a.b.C11809b(this.f292824a));
    }
}
