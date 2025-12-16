package com.avito.android.publish.slots.cpa_tariff;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaTariffModule_ProvideCpaTariffSlotBlueprintFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<com.avito.android.publish.slots.cpa_tariff.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.cpa_tariff.item.c> f243369a;

    public b(Provider<com.avito.android.publish.slots.cpa_tariff.item.c> provider) {
        this.f243369a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.cpa_tariff.item.c cVar = this.f243369a.get();
        a.f243368a.getClass();
        return new com.avito.android.publish.slots.cpa_tariff.item.a(cVar);
    }
}
