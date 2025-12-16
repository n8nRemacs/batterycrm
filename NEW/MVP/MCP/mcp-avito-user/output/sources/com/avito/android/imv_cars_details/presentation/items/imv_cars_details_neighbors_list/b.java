package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsNeighborsListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f170127a;

    /* renamed from: b, reason: collision with root package name */
    public final u f170128b;

    public b(d dVar, u uVar) {
        this.f170127a = dVar;
        this.f170128b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f170127a.get(), (j) this.f170128b.get());
    }
}
