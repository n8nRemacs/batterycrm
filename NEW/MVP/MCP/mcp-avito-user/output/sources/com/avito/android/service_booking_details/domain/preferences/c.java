package com.avito.android.service_booking_details.domain.preferences;

import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsPreferencesStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277349a;

    public c(u uVar) {
        this.f277349a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SharedPreferences) this.f277349a.get());
    }
}
