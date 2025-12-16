package com.avito.android.publish.input_vin.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: InputVinModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.input_vin.items.scan_button.d> f236578a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.input.d> f236579b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g> f236580c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.input.c> f236581d;

    public h(Provider<com.avito.android.publish.input_vin.items.scan_button.d> provider, Provider<com.avito.android.blueprints.input.d> provider2, Provider<com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g> provider3, Provider<com.avito.android.blueprint.input.c> provider4) {
        this.f236578a = provider;
        this.f236579b = provider2;
        this.f236580c = provider3;
        this.f236581d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.input_vin.items.scan_button.d dVar = this.f236578a.get();
        com.avito.android.blueprints.input.d dVar2 = this.f236579b.get();
        com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g gVar = this.f236580c.get();
        com.avito.android.blueprint.input.c cVar = this.f236581d.get();
        d dVar3 = d.f236567a;
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, gVar, dVar2, cVar});
        t.d(setL0);
        return setL0;
    }
}
