package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressDeleteLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressDeleteDeeplinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35163c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f292820a;

    public C35163c(p pVar) {
        this.f292820a = pVar;
    }

    public static C43834a a(p pVar) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressDeleteLink.class, new q(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressDeleteLink.class), pVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292820a);
    }
}
