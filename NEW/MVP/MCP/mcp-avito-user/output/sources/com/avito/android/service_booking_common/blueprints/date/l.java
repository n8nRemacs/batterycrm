package com.avito.android.service_booking_common.blueprints.date;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbDateItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.date.date_list.e> f276364a;

    /* renamed from: b, reason: collision with root package name */
    public final u f276365b;

    public l(u uVar, Provider provider) {
        this.f276364a = provider;
        this.f276365b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f276364a.get(), (com.avito.android.service_booking_common.blueprints.date.timeslot_list.d) this.f276365b.get());
    }
}
