package com.avito.android.publish.slots.no_car;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NoCarModule_ProvideNoCarSlotBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<com.avito.android.publish.slots.no_car.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.no_car.item.c> f244649a;

    public b(Provider<com.avito.android.publish.slots.no_car.item.c> provider) {
        this.f244649a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.no_car.item.c cVar = this.f244649a.get();
        a.f244648a.getClass();
        return new com.avito.android.publish.slots.no_car.item.a(cVar);
    }
}
