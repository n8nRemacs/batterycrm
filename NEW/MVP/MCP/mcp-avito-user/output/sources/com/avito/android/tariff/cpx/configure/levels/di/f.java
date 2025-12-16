package com.avito.android.tariff.cpx.configure.levels.di;

import com.avito.android.tariff.cpx.configure.levels.deeplink.TariffCpxConfigureLevelsLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffCpxConfigureLevelsFragmentMappingsModule_ProvideTariffCpxConfigureLevelsMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: TariffCpxConfigureLevelsFragmentMappingsModule_ProvideTariffCpxConfigureLevelsMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f296114a = new f();
    }

    public static f a() {
        return a.f296114a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f296113a.getClass();
        return new A50.a(m0.f406844a.b(TariffCpxConfigureLevelsLink.class), new com.avito.android.tariff.cpx.configure.levels.f());
    }
}
