package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.deep_linking.links.UniversalDeliveryCourierLocationSelectLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SafeDealDeeplinkHandlerModule_ProvideUniversalDeliveryCourierLocationSelectDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f256596a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.courier.select_location.e f256597b;

    public d(b bVar, com.avito.android.safedeal.universal_delivery_type.courier.select_location.e eVar) {
        this.f256596a = bVar;
        this.f256597b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.universal_delivery_type.courier.select_location.e eVar = this.f256597b;
        this.f256596a.getClass();
        return new C43834a(UniversalDeliveryCourierLocationSelectLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UniversalDeliveryCourierLocationSelectLink.class), eVar));
    }
}
