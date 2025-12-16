package com.avito.android.calendar_select.presentation.mvicalendarselect.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarSelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113414a;

    public d(u uVar) {
        this.f113414a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.calendar_select.domain.e) this.f113414a.get());
    }
}
