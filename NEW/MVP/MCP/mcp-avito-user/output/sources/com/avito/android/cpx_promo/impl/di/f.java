package com.avito.android.cpx_promo.impl.di;

import com.avito.android.cpx_promo.common.deeplink.CpxPromoLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpxPromoFragmentMappingsModule_ProvideCpxPromoMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: CpxPromoFragmentMappingsModule_ProvideCpxPromoMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f126948a = new f();
    }

    public static f a() {
        return a.f126948a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f126947a.getClass();
        return new A50.a(m0.f406844a.b(CpxPromoLink.class), new com.avito.android.cpx_promo.impl.e());
    }
}
