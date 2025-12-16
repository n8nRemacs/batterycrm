package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.B2;
import javax.inject.Provider;

/* compiled from: AdditionalSettingsElementsContentConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f274852a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f274853b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f274854c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<B2> f274855d;

    public p(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f274852a = provider;
        this.f274853b = provider2;
        this.f274854c = uVar;
        this.f274855d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f274852a.get(), this.f274853b.get(), (u) this.f274854c.get(), this.f274855d.get());
    }
}
