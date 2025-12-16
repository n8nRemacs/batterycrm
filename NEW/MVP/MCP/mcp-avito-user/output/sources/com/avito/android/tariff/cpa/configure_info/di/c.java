package com.avito.android.tariff.cpa.configure_info.di;

import com.avito.android.tariff.cpa.configure_info.deeplink.CpaConfigureInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CpaConfigureInfoFragmentMappingsModule_ProvideCpaConfigureInfoMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<A50.a> {

    /* compiled from: CpaConfigureInfoFragmentMappingsModule_ProvideCpaConfigureInfoMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f294462a = new c();
    }

    public static c a() {
        return a.f294462a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f294461a.getClass();
        return new A50.a(m0.f406844a.b(CpaConfigureInfoLink.class), new com.avito.android.tariff.cpa.configure_info.f());
    }
}
