package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressEditLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressEditDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35164d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final s f292821a;

    public C35164d(s sVar) {
        this.f292821a = sVar;
    }

    public static C43834a a(s sVar) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressEditLink.class, new t(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressEditLink.class), sVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292821a);
    }
}
