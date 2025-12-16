package com.avito.android.advert.item.select.booking;

import dagger.internal.x;
import dagger.internal.y;
import lf.InterfaceC43762a;

/* compiled from: AutoSelectBookingBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f79374a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f79375b;

    public b(e eVar, dagger.internal.f fVar) {
        this.f79374a = eVar;
        this.f79375b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f79374a.get(), (InterfaceC43762a) this.f79375b.get());
    }
}
