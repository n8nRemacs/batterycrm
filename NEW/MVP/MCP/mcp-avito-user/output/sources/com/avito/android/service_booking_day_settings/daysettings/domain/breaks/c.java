package com.avito.android.service_booking_day_settings.daysettings.domain.breaks;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BreakFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f276762a;

    public c(Provider<InterfaceC35863o4> provider) {
        this.f276762a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f276762a.get());
    }
}
