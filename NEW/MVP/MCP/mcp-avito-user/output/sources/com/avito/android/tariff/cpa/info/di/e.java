package com.avito.android.tariff.cpa.info.di;

import com.avito.android.tariff.deeplink.TariffCpaInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpaInfoFragmentMappingsModule_ProvideCpaInfoFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<A50.a> {

    /* compiled from: CpaInfoFragmentMappingsModule_ProvideCpaInfoFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f294638a = new e();
    }

    public static e a() {
        return a.f294638a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f294637a.getClass();
        return new A50.a(m0.f406844a.b(TariffCpaInfoLink.class), new com.avito.android.tariff.cpa.info.f());
    }
}
