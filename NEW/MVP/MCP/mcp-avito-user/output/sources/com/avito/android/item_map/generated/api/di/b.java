package com.avito.android.item_map.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import tO.InterfaceC48584a;

/* compiled from: ItemMapJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ItemMapJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f173338a = new b();
    }

    public static b a() {
        return a.f173338a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.item_map.generated.api.di.a.f173337a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC48584a.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC48584a.C12670a.class, "markers");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC48584a.b.class, "polygons");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
