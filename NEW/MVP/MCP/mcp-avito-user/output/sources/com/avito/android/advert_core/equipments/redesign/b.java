package com.avito.android.advert_core.equipments.redesign;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RedesignedEquipmentsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f83485a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83486b;

    public b(e eVar, u uVar) {
        this.f83485a = eVar;
        this.f83486b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f83485a.get(), (i) this.f83486b.get());
    }
}
