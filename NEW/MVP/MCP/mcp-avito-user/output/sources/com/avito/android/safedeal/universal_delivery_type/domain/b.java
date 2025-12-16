package com.avito.android.safedeal.universal_delivery_type.domain;

import Sn0.InterfaceC15206a;
import Sn0.d;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256624a;

    /* renamed from: b, reason: collision with root package name */
    public final d f256625b;

    public b(l lVar, d dVar) {
        this.f256624a = lVar;
        this.f256625b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((UniversalDeliveryTypeParams) this.f256624a.f393949a, (InterfaceC15206a) this.f256625b.get());
    }
}
