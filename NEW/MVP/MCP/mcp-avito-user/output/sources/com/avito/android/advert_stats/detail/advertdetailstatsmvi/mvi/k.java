package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import Za.InterfaceC19521a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailStatsMVIReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f86132a;

    /* renamed from: b, reason: collision with root package name */
    public final l f86133b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC19521a> f86134c;

    public k(l lVar, l lVar2, Provider provider) {
        this.f86132a = lVar;
        this.f86133b = lVar2;
        this.f86134c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((String) this.f86132a.f393949a, (String) this.f86133b.f393949a, this.f86134c.get());
    }
}
