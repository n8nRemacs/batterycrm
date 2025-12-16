package com.avito.android.safety.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import jo0.InterfaceC42407c;
import ko0.InterfaceC42723b;
import kotlin.collections.C42756l;
import lo0.InterfaceC43811a;
import mo0.InterfaceC44112a;
import no0.InterfaceC44459b;
import oo0.InterfaceC44834b;

/* compiled from: SafetyJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class b implements h<Set<r>> {

    /* compiled from: SafetyJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f257202a = new b();
    }

    public static b a() {
        return a.f257202a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safety.generated.api.di.a.f257201a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC42407c.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42407c.a.class, "password");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42407c.b.class, "sessions");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42407c.C11580c.class, "tfa");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(InterfaceC42723b.class, InterfaceC42723b.a.class, "incorrect-data", InterfaceC42723b.C11627b.class, "ok");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(InterfaceC43811a.class, InterfaceC43811a.C11804a.class, "need-confirm", InterfaceC43811a.b.class, "ok");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK3 = D8.k(InterfaceC44112a.class, InterfaceC44112a.C11841a.class, "need-confirm", InterfaceC44112a.b.class, "ok");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK4 = D8.k(InterfaceC44459b.class, InterfaceC44459b.a.class, "incorrect-data", InterfaceC44459b.C12151b.class, "ok");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK5 = D8.k(InterfaceC44834b.class, InterfaceC44834b.a.class, "incorrect-data", InterfaceC44834b.C12197b.class, "need-confirm");
        optimalRuntimeTypeAdapterFactoryK5.b(InterfaceC44834b.c.class, "ok");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2, optimalRuntimeTypeAdapterFactoryK3, optimalRuntimeTypeAdapterFactoryK4, optimalRuntimeTypeAdapterFactoryK5});
        t.d(setL0);
        return setL0;
    }
}
