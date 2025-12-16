package com.avito.android.service_booking_common.blueprints.check_price_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbCheckPriceListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276247a;

    public b(u uVar) {
        this.f276247a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f276247a.get());
    }
}
