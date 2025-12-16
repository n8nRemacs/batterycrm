package com.avito.android.safedeal.universal_delivery_type.mvi;

import gj.InterfaceC40691b;

/* compiled from: UniversalDeliveryTypeActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.domain.b f256665a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.di.m f256666b;

    public e(com.avito.android.safedeal.universal_delivery_type.domain.b bVar, com.avito.android.safedeal.universal_delivery_type.di.m mVar) {
        this.f256665a = bVar;
        this.f256666b = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.safedeal.universal_delivery_type.domain.a) this.f256665a.get(), (InterfaceC40691b) this.f256666b.get());
    }
}
