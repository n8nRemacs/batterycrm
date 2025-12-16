package com.avito.android.service_booking_common.blueprints.date.timeslot_list;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbTimeslotListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f276391a;

    /* renamed from: b, reason: collision with root package name */
    public final u f276392b;

    public b(u uVar, Provider provider) {
        this.f276391a = provider;
        this.f276392b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276391a.get(), (InterfaceC35945t1) this.f276392b.get());
    }
}
