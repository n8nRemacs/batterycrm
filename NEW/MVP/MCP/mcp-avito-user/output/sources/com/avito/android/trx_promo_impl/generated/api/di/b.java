package com.avito.android.trx_promo_impl.generated.api.di;

import VF0.a;
import YF0.o;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: TrxPromoJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<r>> {

    /* compiled from: TrxPromoJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f304197a = new b();
    }

    public static b a() {
        return a.f304197a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.trx_promo_impl.generated.api.di.a.f304196a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, VF0.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C1169a.class, "action");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "ok");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(o.class, o.a.class, "action", o.b.class, "ok")});
        t.d(setL0);
        return setL0;
    }
}
