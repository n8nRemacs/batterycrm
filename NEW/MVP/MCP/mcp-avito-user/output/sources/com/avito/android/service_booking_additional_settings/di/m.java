package com.avito.android.service_booking_additional_settings.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingAdditionalSettingsFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f275219a;

    public m(C30102l3 c30102l3) {
        this.f275219a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Context) this.f275219a.get());
    }
}
