package com.avito.android.loyalty.ui.quality_service.items.plate;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlateItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f183934a;

    public b(d dVar) {
        this.f183934a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f183934a.get());
    }
}
