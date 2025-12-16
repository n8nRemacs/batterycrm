package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureAdvanceLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CprConfigureFragmentMappingsModule_ProvideCprConfigureAdvanceFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<A50.a> {

    /* compiled from: CprConfigureFragmentMappingsModule_ProvideCprConfigureAdvanceFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f295206a = new d();
    }

    public static d a() {
        return a.f295206a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f295205a.getClass();
        return new A50.a(m0.f406844a.b(TariffCprConfigureAdvanceLink.class), new com.avito.android.tariff.cpr.configure.advance.d());
    }
}
