package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.deep_linking.links.UniversalDeliveryTypeDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SafeDealDeeplinkHandlerModule_ProvideUniversalDeliveryTypeDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f256598a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.j f256599b;

    public e(b bVar, com.avito.android.safedeal.universal_delivery_type.j jVar) {
        this.f256598a = bVar;
        this.f256599b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.universal_delivery_type.j jVar = this.f256599b;
        this.f256598a.getClass();
        return new C43834a(UniversalDeliveryTypeDeeplink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UniversalDeliveryTypeDeeplink.class), jVar));
    }
}
