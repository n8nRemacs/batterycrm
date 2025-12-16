package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case;

import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.k;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.n;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.r;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.u;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vt0.InterfaceC49381a;

/* compiled from: GetDayScheduleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49381a> f276833a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f276834b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<k> f276835c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.h> f276836d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.a> f276837e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u> f276838f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<r> f276839g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.data.preferences.a> f276840h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.e> f276841i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f276842j;

    public c(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f276833a = provider;
        this.f276834b = provider2;
        this.f276835c = provider3;
        this.f276836d = provider4;
        this.f276837e = provider5;
        this.f276838f = provider6;
        this.f276839g = provider7;
        this.f276840h = provider8;
        this.f276841i = provider9;
        this.f276842j = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.b(this.f276833a), this.f276834b.get(), this.f276835c.get(), this.f276836d.get(), this.f276837e.get(), this.f276838f.get(), this.f276839g.get(), this.f276840h.get(), this.f276841i.get(), (n) this.f276842j.get());
    }
}
