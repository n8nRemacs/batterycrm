package com.avito.android.service_booking_calendar.flexible.header.recycler.week;

import com.avito.android.service_booking_calendar.flexible.header.recycler.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WeekItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276076a;

    public b(u uVar) {
        this.f276076a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f276076a.get());
    }
}
