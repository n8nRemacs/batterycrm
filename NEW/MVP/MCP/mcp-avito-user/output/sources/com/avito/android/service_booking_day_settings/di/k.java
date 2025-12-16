package com.avito.android.service_booking_day_settings.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DaySettingsModule_ProvideSharedPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f277157a;

    public k(Provider<Application> provider) {
        this.f277157a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f277157a.get();
        j.f277156a.getClass();
        return application.getSharedPreferences("DAY_SCHEDULE_PREFERENCES", 0);
    }
}
