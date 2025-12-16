package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EquipmentsDialogFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f83489a;

    /* renamed from: b, reason: collision with root package name */
    public final n f83490b;

    public c(Provider provider, n nVar) {
        this.f83489a = provider;
        this.f83490b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f83489a.get(), (m) this.f83490b.get());
    }
}
