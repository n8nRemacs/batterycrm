package com.avito.android.position_in_search.stats.generated.api.di;

import Q80.d;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: StatsJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes15.dex */
public final class b implements h<Set<r>> {

    /* compiled from: StatsJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f220356a = new b();
    }

    public static b a() {
        return a.f220356a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.position_in_search.stats.generated.api.di.a.f220355a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, d.class);
        optimalRuntimeTypeAdapterFactoryA.b(d.a.class, "screenData");
        optimalRuntimeTypeAdapterFactoryA.b(d.b.class, "searchQueriesPortion");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
