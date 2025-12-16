package com.avito.android.advert.item.equipmentsTile;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.L0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsEquipmentsTilePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75344a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f75345b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.equipments.redesign.bottom_sheet.a> f75346c;

    /* renamed from: d, reason: collision with root package name */
    public final u f75347d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f75348e;

    public h(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f75344a = provider;
        this.f75345b = provider2;
        this.f75346c = provider3;
        this.f75347d = uVar;
        this.f75348e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f75344a.get(), this.f75345b.get(), this.f75346c.get(), (j) this.f75347d.get(), this.f75348e.get());
    }
}
