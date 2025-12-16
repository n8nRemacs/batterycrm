package com.avito.android.tariff_lf.edit_info.di;

import com.avito.android.tariff_lf.edit_info.deeplink.TariffEditInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffEditInfoFragmentMappingsModule_ProvideTariffEditInfoFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<A50.a> {

    /* compiled from: TariffEditInfoFragmentMappingsModule_ProvideTariffEditInfoFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f298870a = new r();
    }

    public static r a() {
        return a.f298870a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q.f298869a.getClass();
        return new A50.a(m0.f406844a.b(TariffEditInfoLink.class), new com.avito.android.tariff_lf.edit_info.j());
    }
}
