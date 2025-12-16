package com.avito.android.vas_planning_checkout.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import lM0.C43657b;
import lM0.InterfaceC43656a;

/* compiled from: VasPlanningCheckoutJsonModule_ProvideVasPlanningCheckoutTypeAdapterFactoriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<Set<r>> {

    /* compiled from: VasPlanningCheckoutJsonModule_ProvideVasPlanningCheckoutTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f322883a = new p();
    }

    public static p a() {
        return a.f322883a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = o.f322882a;
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC43656a.class);
        optimalRuntimeTypeAdapterFactoryA.b(C43657b.class, "service");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
