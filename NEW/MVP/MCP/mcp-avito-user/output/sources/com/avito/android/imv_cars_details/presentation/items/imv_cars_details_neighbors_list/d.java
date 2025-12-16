package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsNeighborsListPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f170131a;

    /* renamed from: b, reason: collision with root package name */
    public final u f170132b;

    public d(u uVar, Provider provider) {
        this.f170131a = provider;
        this.f170132b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f170131a.get(), (j) this.f170132b.get());
    }
}
