package com.avito.android.service_fee_conditions.di;

import com.avito.android.service_fee_conditions.deeplink.ServiceFeeConditionsLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: ServiceFeeConditionsFragmentMappingsModule_ProvideServiceFeeConditionsFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* compiled from: ServiceFeeConditionsFragmentMappingsModule_ProvideServiceFeeConditionsFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f278426a = new i();
    }

    public static i a() {
        return a.f278426a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h.f278425a.getClass();
        return new A50.a(m0.f406844a.b(ServiceFeeConditionsLink.class), new com.avito.android.service_fee_conditions.ui.e());
    }
}
