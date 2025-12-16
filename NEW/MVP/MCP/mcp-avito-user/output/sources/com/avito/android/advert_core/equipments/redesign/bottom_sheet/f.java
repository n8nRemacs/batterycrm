package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import x9.InterfaceC49794a;

/* compiled from: EquipmentsDialogItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49794a> f83492a;

    public f(Provider<InterfaceC49794a> provider) {
        this.f83492a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f83492a.get());
    }
}
