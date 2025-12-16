package com.avito.android.safedeal.universal_delivery_type.mvi;

import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f256721a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.domain.b f256722b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.di.m f256723c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f256724d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.safedeal.universal_delivery_type.beduin.a> f256725e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Wi.b> f256726f;

    public r(dagger.internal.l lVar, com.avito.android.safedeal.universal_delivery_type.domain.b bVar, com.avito.android.safedeal.universal_delivery_type.di.m mVar, Provider provider, Provider provider2, Provider provider3) {
        this.f256721a = lVar;
        this.f256722b = bVar;
        this.f256723c = mVar;
        this.f256724d = provider;
        this.f256725e = provider2;
        this.f256726f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((UniversalDeliveryTypeParams) this.f256721a.f393949a, (com.avito.android.safedeal.universal_delivery_type.domain.a) this.f256722b.get(), (InterfaceC40691b) this.f256723c.get(), this.f256724d.get(), this.f256725e.get(), this.f256726f.get());
    }
}
