package com.avito.android.service_booking_details.di;

import android.app.Activity;
import android.content.SharedPreferences;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsModule_ProvideSharedPreferencesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277315a;

    public k(dagger.internal.l lVar) {
        this.f277315a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f277315a.f393949a;
        e.f277307a.getClass();
        return activity.getSharedPreferences("SRV_BOOKING_ITEM_DETAILS_PREFERENCES", 0);
    }
}
