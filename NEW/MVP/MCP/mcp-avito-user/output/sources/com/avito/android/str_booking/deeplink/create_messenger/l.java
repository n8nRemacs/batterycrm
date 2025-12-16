package com.avito.android.str_booking.deeplink.create_messenger;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrCreateMessengerModule_ProvideStrBookingDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f285438a;

    /* renamed from: b, reason: collision with root package name */
    public final h f285439b;

    public l(j jVar, h hVar) {
        this.f285438a = jVar;
        this.f285439b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f285438a.getClass();
        i iVar = new i();
        k.f285437a.getClass();
        return new C43834a(StrCreateMessengerDeeplink.class, iVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrCreateMessengerDeeplink.class), this.f285439b));
    }
}
