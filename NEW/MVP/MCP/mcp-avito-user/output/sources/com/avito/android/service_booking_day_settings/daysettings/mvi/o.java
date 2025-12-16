package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iu0.InterfaceC42113b;
import javax.inject.Provider;
import wt0.InterfaceC49682a;

/* compiled from: DaySettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.data.preferences.a> f277068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.data.preferences.a> f277069b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC49682a> f277070c;

    /* renamed from: d, reason: collision with root package name */
    public final iu0.d f277071d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f277072e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.d> f277073f;

    /* renamed from: g, reason: collision with root package name */
    public final u f277074g;

    public o(Provider provider, Provider provider2, Provider provider3, iu0.d dVar, Provider provider4, Provider provider5, u uVar) {
        this.f277068a = provider;
        this.f277069b = provider2;
        this.f277070c = provider3;
        this.f277071d = dVar;
        this.f277072e = provider4;
        this.f277073f = provider5;
        this.f277074g = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f277068a.get(), this.f277069b.get(), this.f277070c.get(), (InterfaceC42113b) this.f277071d.get(), this.f277072e.get(), this.f277073f.get(), (com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.a) this.f277074g.get());
    }
}
