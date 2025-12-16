package com.avito.android.service_booking.mvi.step.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingMviStepModule_ProvideSharedPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f274631a;

    public j(dagger.internal.l lVar) {
        this.f274631a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f274631a.f393949a;
        d.f274623a.getClass();
        return context.getSharedPreferences("SRV_BOOKING_FLOW_PREFERENCES", 0);
    }
}
