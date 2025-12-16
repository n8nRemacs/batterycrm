package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressListLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressListDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35166f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f292823a;

    public C35166f(C c12) {
        this.f292823a = c12;
    }

    public static C43834a a(C c12) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressListLink.class, new D(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressListLink.class), c12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292823a);
    }
}
