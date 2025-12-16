package com.avito.android.str_seller_orders.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import jz0.InterfaceC42456b;
import jz0.InterfaceC42458d;
import kotlin.collections.C42756l;

/* compiled from: StrSellerOrdersJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<r>> {

    /* compiled from: StrSellerOrdersJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f288807a = new b();
    }

    public static b a() {
        return a.f288807a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_seller_orders.generated.api.di.a.f288806a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC42456b.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42456b.a.class, "chip");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42456b.C11598b.class, "multiselect");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42456b.c.class, "select");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(InterfaceC42458d.class, InterfaceC42458d.a.class, "bookingInfo", InterfaceC42458d.b.class, "infoBlock")});
        t.d(setL0);
        return setL0;
    }
}
