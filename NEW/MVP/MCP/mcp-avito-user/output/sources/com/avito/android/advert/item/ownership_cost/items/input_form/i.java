package com.avito.android.advert.item.ownership_cost.items.input_form;

import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;

/* compiled from: OwnershipCostInputsItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.ownership_cost.dialogs.region_select.a> f78003a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region>> f78004b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.ownership_cost.f> f78005c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78006d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f78007e;

    /* renamed from: f, reason: collision with root package name */
    public final u f78008f;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f78003a = provider;
        this.f78004b = provider2;
        this.f78005c = provider3;
        this.f78006d = provider4;
        this.f78007e = provider5;
        this.f78008f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f78003a.get(), this.f78004b.get(), this.f78005c.get(), this.f78006d.get(), this.f78007e.get(), (k6.b) this.f78008f.get());
    }
}
