package com.avito.android.service_booking_common.blueprints.contact;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbContactBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276286a;

    public b(u uVar) {
        this.f276286a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f276286a.get());
    }
}
