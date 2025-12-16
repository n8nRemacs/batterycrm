package com.avito.android.comfortable_deal.generated.api.di;

import Np.InterfaceC14600a;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ComfortableDealJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ComfortableDealJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f122404a = new b();
    }

    public static b a() {
        return a.f122404a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.comfortable_deal.generated.api.di.a.f122403a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC14600a.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.C0763a.class, "deal-not-found");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.b.class, "empty-item-category");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.c.class, "item-coordinates-not-found");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.d.class, "item-location-not-found");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.e.class, "ok");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.f.class, "seller-without-item");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC14600a.g.class, "unsupported-item-category");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(InterfaceC14600a.e.class);
        optimalRuntimeTypeAdapterFactory.b(InterfaceC14600a.e.C0764a.class, "v1");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactory});
        t.d(setL0);
        return setL0;
    }
}
