package com.avito.android.fees_methods.generated.api.di;

import CE.a;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: FeesMethodsJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes13.dex */
public final class b implements h<Set<r>> {

    /* compiled from: FeesMethodsJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157960a = new b();
    }

    public static b a() {
        return a.f157960a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.fees_methods.generated.api.di.a.f157959a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, CE.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C0095a.class, "action");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "ok");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
