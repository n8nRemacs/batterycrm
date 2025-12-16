package com.avito.android.service_booking_day_settings.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingDaySettingsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f277161a;

    public p(C30102l3 c30102l3) {
        this.f277161a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Context) this.f277161a.get());
    }
}
