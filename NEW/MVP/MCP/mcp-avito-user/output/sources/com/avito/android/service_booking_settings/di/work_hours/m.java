package com.avito.android.service_booking_settings.di.work_hours;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursModule_ProvideSharedPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277843a;

    public m(dagger.internal.l lVar) {
        this.f277843a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f277843a.f393949a;
        g.f277835a.getClass();
        return context.getSharedPreferences("WH_SHARED_PREFERENCES_KEY", 0);
    }
}
