package com.avito.android.advert_core.equipments.redesign;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import x9.InterfaceC49794a;

/* compiled from: RedesignedEquipmentsItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49794a> f83543a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l> f83544b;

    /* renamed from: c, reason: collision with root package name */
    public final u f83545c;

    /* renamed from: d, reason: collision with root package name */
    public final u f83546d;

    public e(u uVar, u uVar2, Provider provider, Provider provider2) {
        this.f83543a = provider;
        this.f83544b = provider2;
        this.f83545c = uVar;
        this.f83546d = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f83543a.get(), this.f83544b.get(), (com.avito.android.advert_core.equipments.redesign.bottom_sheet.a) this.f83545c.get(), (InterfaceC28373a) this.f83546d.get());
    }
}
