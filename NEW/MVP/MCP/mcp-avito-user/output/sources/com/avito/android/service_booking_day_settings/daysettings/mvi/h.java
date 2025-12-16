package com.avito.android.service_booking_day_settings.daysettings.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DaySettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277048a;

    /* renamed from: b, reason: collision with root package name */
    public final u f277049b;

    public h(dagger.internal.l lVar, u uVar) {
        this.f277048a = lVar;
        this.f277049b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((String) this.f277048a.f393949a, (com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a) this.f277049b.get());
    }
}
