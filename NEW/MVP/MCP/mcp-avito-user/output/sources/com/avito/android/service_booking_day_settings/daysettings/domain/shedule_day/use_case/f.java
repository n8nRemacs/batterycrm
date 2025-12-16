package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ut0.InterfaceC49110a;

/* compiled from: SaveDayScheduleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49110a> f276864a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f276865b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.breaks.a> f276866c;

    /* renamed from: d, reason: collision with root package name */
    public final u f276867d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<a> f276868e;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f276864a = provider;
        this.f276865b = provider2;
        this.f276866c = provider3;
        this.f276867d = uVar;
        this.f276868e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(g.b(this.f276864a), this.f276865b.get(), this.f276866c.get(), (com.avito.android.service_booking_utils.ux_feedback.h) this.f276867d.get(), this.f276868e.get());
    }
}
