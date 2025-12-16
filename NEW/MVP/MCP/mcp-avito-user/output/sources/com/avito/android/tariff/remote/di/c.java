package com.avito.android.tariff.remote.di;

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

/* compiled from: TariffJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class c implements h<Set<r>> {

    /* compiled from: TariffJsonModule_ProvideTariffTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f297483a = new c();
    }

    public static c a() {
        return a.f297483a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.remote.di.a.f297481a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, XB0.c.class);
        optimalRuntimeTypeAdapterFactoryA.b(XB0.d.class, "textSection");
        optimalRuntimeTypeAdapterFactoryA.b(XB0.b.class, "iconSection");
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
