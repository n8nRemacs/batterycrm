package com.avito.android.service_booking_common.blueprints.input;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbInputBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276440a;

    public b(u uVar) {
        this.f276440a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f276440a.get());
    }
}
