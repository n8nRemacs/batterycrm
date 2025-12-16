package com.avito.android.delivery_location_suggest.di;

import com.avito.android.delivery_location_suggest.deeplink.DeliveryAddressSelectDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DeliveryAddressSelectDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f135092a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.deeplink.b f135093b;

    public c(b bVar, com.avito.android.delivery_location_suggest.deeplink.b bVar2) {
        this.f135092a = bVar;
        this.f135093b = bVar2;
    }

    public static C43834a a(b bVar, com.avito.android.delivery_location_suggest.deeplink.b bVar2) {
        bVar.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DeliveryAddressSelectDeeplink.class, new com.avito.android.delivery_location_suggest.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryAddressSelectDeeplink.class), bVar2));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f135092a, this.f135093b);
    }
}
