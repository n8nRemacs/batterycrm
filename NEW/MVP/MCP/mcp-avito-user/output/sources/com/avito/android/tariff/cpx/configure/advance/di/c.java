package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpxConfigureAdvanceFragmentMappingsModule_ProvideCpxConfigureAdvanceMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<A50.a> {

    /* compiled from: CpxConfigureAdvanceFragmentMappingsModule_ProvideCpxConfigureAdvanceMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f295584a = new c();
    }

    public static c a() {
        return a.f295584a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f295583a.getClass();
        return new A50.a(m0.f406844a.b(TariffCpxConfigureAdvanceDeepLink.class), new com.avito.android.tariff.cpx.configure.advance.c());
    }
}
