package com.avito.android.tariff.cpr.remote.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iB0.g;
import iB0.i;
import java.util.Collections;
import java.util.Set;

/* compiled from: TariffCprJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class c implements h<Set<r>> {

    /* compiled from: TariffCprJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f295526a = new c();
    }

    public static c a() {
        return a.f295526a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpr.remote.di.a.f295524a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, iB0.h.class);
        optimalRuntimeTypeAdapterFactoryA.b(g.class, "click");
        optimalRuntimeTypeAdapterFactoryA.b(i.class, "select");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
