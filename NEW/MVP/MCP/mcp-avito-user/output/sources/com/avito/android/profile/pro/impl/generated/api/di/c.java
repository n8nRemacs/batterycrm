package com.avito.android.profile.pro.impl.generated.api.di;

import com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ProfileProJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class c implements h<Set<r>> {

    /* compiled from: ProfileProJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f222666a = new c();
    }

    public static c a() {
        return a.f222666a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.pro.impl.generated.api.di.a.f222664a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.c.class, "avatar");
        optimalRuntimeTypeAdapterFactoryA.b(a.d.class, "avitoFinance");
        optimalRuntimeTypeAdapterFactoryA.b(a.e.class, "booking");
        optimalRuntimeTypeAdapterFactoryA.b(a.f.class, "dashboard");
        optimalRuntimeTypeAdapterFactoryA.b(a.g.class, "dashboardBeduin");
        optimalRuntimeTypeAdapterFactoryA.b(a.h.class, "deliveryRestrictionBanner");
        optimalRuntimeTypeAdapterFactoryA.b(a.i.class, "employeeCompany");
        optimalRuntimeTypeAdapterFactoryA.b(a.j.class, "employeeLimits");
        optimalRuntimeTypeAdapterFactoryA.b(a.k.class, "employeeModeButton");
        optimalRuntimeTypeAdapterFactoryA.b(a.l.class, "geoBanner");
        optimalRuntimeTypeAdapterFactoryA.b(a.C6737a.class, "grid");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "group");
        optimalRuntimeTypeAdapterFactoryA.b(a.m.class, "name");
        optimalRuntimeTypeAdapterFactoryA.b(a.n.class, "orders");
        optimalRuntimeTypeAdapterFactoryA.b(a.s.class, "passport");
        optimalRuntimeTypeAdapterFactoryA.b(a.o.class, "rating");
        optimalRuntimeTypeAdapterFactoryA.b(a.p.class, "recommendationBlock");
        optimalRuntimeTypeAdapterFactoryA.b(a.q.class, "reputationAndRating");
        optimalRuntimeTypeAdapterFactoryA.b(a.r.class, "walletAndPrepayment");
        optimalRuntimeTypeAdapterFactoryA.b(a.u.class, "widgetGroup");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
