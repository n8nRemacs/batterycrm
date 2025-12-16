package com.avito.android.service_booking_day_settings.daysettings.data.preferences;

import android.content.SharedPreferences;
import com.avito.android.service_booking_day_settings.di.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DaySchedulePreferencesStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f276755a;

    public c(k kVar) {
        this.f276755a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SharedPreferences) this.f276755a.get());
    }
}
