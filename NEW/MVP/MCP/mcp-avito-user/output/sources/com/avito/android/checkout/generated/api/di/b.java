package com.avito.android.checkout.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import uo.InterfaceC49084a;

/* compiled from: CheckoutJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<Set<r>> {

    /* compiled from: CheckoutJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f118330a = new b();
    }

    public static b a() {
        return a.f118330a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.checkout.generated.api.di.a.f118329a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC49084a.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC49084a.C12729a.class, "ok");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC49084a.b.class, "payment-required");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
