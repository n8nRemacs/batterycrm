package com.avito.android.tariff.cpx.configure.landing.di;

import com.avito.android.tariff.cpx.configure.landing.deeplink.TariffCpxConfigureLandingLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpxConfigureLandingFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<A50.a> {

    /* compiled from: CpxConfigureLandingFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f295898a = new e();
    }

    public static e a() {
        return a.f295898a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f295897a.getClass();
        return new A50.a(m0.f406844a.b(TariffCpxConfigureLandingLink.class), new com.avito.android.tariff.cpx.configure.landing.d());
    }
}
