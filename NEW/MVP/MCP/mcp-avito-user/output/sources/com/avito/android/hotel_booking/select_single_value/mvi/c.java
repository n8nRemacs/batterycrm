package com.avito.android.hotel_booking.select_single_value.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSingleValueActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f164099a;

    public c(u uVar) {
        this.f164099a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((UI.a) this.f164099a.get());
    }
}
