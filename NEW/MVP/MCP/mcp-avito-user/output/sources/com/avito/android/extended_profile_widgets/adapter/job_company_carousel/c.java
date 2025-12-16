package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCompanyCarouselBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f154495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f154496b;

    /* renamed from: c, reason: collision with root package name */
    public final FB.d f154497c;

    public c(Provider provider, Provider provider2, FB.d dVar) {
        this.f154495a = provider;
        this.f154496b = provider2;
        this.f154497c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154495a.get(), this.f154496b, this.f154497c);
    }
}
