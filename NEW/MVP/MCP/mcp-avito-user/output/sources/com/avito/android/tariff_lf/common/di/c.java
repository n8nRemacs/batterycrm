package com.avito.android.tariff_lf.common.di;

import cD0.C27014h;
import cD0.C27016j;
import cD0.C27017k;
import cD0.InterfaceC27010d;
import com.adjust.sdk.Constants;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: TariffLfJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class c implements h<Set<r>> {

    /* compiled from: TariffLfJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f298741a = new c();
    }

    public static c a() {
        return a.f298741a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f298740a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC27010d.class);
        optimalRuntimeTypeAdapterFactoryA.b(C27017k.class, "regularPackage");
        optimalRuntimeTypeAdapterFactoryA.b(C27016j.class, "realtyPlusPackage");
        optimalRuntimeTypeAdapterFactoryA.b(C27014h.class, "headerInfoBar");
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(TariffAlertAction.class);
        runtimeTypeAdapterFactory.b(com.avito.android.tariff.remote.model.edit.a.class, Constants.DEEPLINK, null);
        runtimeTypeAdapterFactory.b(com.avito.android.tariff.remote.model.edit.c.class, "tariffSheet", null);
        runtimeTypeAdapterFactory.b(com.avito.android.tariff.remote.model.edit.b.class, "showNext", null);
        Set setL0 = C42756l.l0(new r[]{optimalRuntimeTypeAdapterFactoryA, runtimeTypeAdapterFactory});
        t.d(setL0);
        return setL0;
    }
}
