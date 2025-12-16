package com.avito.android.cpx_promo.v2.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoV2Link;
import com.avito.android.cpx_promo.v2.n;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpxPromoV2FragmentMappingsModule_ProvideCpxPromoV2MappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<A50.a> {

    /* compiled from: CpxPromoV2FragmentMappingsModule_ProvideCpxPromoV2MappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f127424a = new h();
    }

    public static h a() {
        return a.f127424a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f127423a.getClass();
        return new A50.a(m0.f406844a.b(CpxPromoV2Link.class), new n());
    }
}
