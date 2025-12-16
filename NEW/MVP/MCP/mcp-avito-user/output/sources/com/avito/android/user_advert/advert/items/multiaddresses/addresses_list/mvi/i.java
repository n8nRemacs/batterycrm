package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlin.G0;

/* compiled from: MyAdvertAddressesListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f309719a;

    /* renamed from: b, reason: collision with root package name */
    public final e f309720b;

    public i(c cVar, e eVar) {
        this.f309719a = cVar;
        this.f309720b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f309719a.getClass();
        b bVar = new b();
        this.f309720b.getClass();
        return new g("MyAdvertAddressesList", G0.f406611a, new f(bVar, new d()));
    }
}
