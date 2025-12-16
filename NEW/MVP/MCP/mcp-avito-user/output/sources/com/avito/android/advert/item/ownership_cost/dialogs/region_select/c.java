package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import com.avito.android.remote.model.OwnershipCostResponse;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;

/* compiled from: RegionSelectDialogFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f77908a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region>> f77909b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f77910c;

    /* renamed from: d, reason: collision with root package name */
    public final u f77911d;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f77908a = provider;
        this.f77909b = provider2;
        this.f77910c = provider3;
        this.f77911d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f77908a.get(), this.f77909b.get(), this.f77910c.get(), (com.avito.konveyor.adapter.h) this.f77911d.get());
    }
}
