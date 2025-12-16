package com.avito.android.service_booking_settings.data.preferences;

import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursPreferencesStorage_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277783a;

    public b(u uVar) {
        this.f277783a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((SharedPreferences) this.f277783a.get());
    }
}
