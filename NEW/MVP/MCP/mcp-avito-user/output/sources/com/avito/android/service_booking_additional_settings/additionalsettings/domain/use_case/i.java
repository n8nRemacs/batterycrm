package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostBookingToggleUseCaseMviImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f274911a;

    /* renamed from: b, reason: collision with root package name */
    public final g f274912b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f274913c;

    public i(Provider provider, g gVar, Provider provider2) {
        this.f274911a = provider;
        this.f274912b = gVar;
        this.f274913c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f274911a.get(), (f) this.f274912b.get(), this.f274913c.get());
    }
}
