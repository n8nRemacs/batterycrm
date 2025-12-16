package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Ss0.InterfaceC15219a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostTechBreakSettingUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15219a> f274926a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f274927b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f274928c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x> f274929d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Ls0.c> f274930e;

    public l(Provider<InterfaceC15219a> provider, Provider<R0> provider2, Provider<a> provider3, Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x> provider4, Provider<Ls0.c> provider5) {
        this.f274926a = provider;
        this.f274927b = provider2;
        this.f274928c = provider3;
        this.f274929d = provider4;
        this.f274930e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.b(this.f274926a), this.f274927b.get(), this.f274928c.get(), this.f274929d.get(), this.f274930e.get());
    }
}
