package com.avito.android.cpx_promo.delayedstart.di;

import com.avito.android.cpx_promo.delayedstart.deeplink.CpxPromoDelayedStartLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpxPromoDelayedStartFragmentMappingsModule_ProvideCpxPromoDelayedStartMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<A50.a> {

    /* compiled from: CpxPromoDelayedStartFragmentMappingsModule_ProvideCpxPromoDelayedStartMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f126839a = new e();
    }

    public static e a() {
        return a.f126839a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f126838a.getClass();
        return new A50.a(m0.f406844a.b(CpxPromoDelayedStartLink.class), new com.avito.android.cpx_promo.delayedstart.b());
    }
}
