package com.avito.android.service_booking_common.blueprints.specialist;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbSpecialistBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276486a;

    public b(u uVar) {
        this.f276486a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f276486a.get());
    }
}
