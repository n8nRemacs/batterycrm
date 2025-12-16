package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressVideoVerificationLink;
import lv.C43834a;

/* compiled from: DeeplinkHandlerModule_ProvideSxAddressVideoVerificationLinkHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.sx_address.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35169i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final N f292826a;

    public C35169i(N n12) {
        this.f292826a = n12;
    }

    public static C43834a a(N n12) {
        C35161a.f292818a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SxAddressVideoVerificationLink.class, new O(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SxAddressVideoVerificationLink.class), n12));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f292826a);
    }
}
