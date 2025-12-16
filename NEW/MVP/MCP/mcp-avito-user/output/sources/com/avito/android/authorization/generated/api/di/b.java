package com.avito.android.authorization.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import je.InterfaceC42365c;
import ke.InterfaceC42674c;
import kotlin.collections.C42756l;
import le.InterfaceC43738c;
import me.InterfaceC44071d;

/* compiled from: AuthorizationJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class b implements h<Set<r>> {

    /* compiled from: AuthorizationJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f93858a = new b();
    }

    public static b a() {
        return a.f93858a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.authorization.generated.api.di.a.f93857a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC42365c.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42365c.a.class, "incorrect-data");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC42365c.b.class, "ok");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(InterfaceC42674c.class, InterfaceC42674c.a.class, "incorrect-data", InterfaceC42674c.b.class, "ok"), D8.k(InterfaceC43738c.class, InterfaceC43738c.a.class, "registerProfileListErrorV2ResponseObject", InterfaceC43738c.b.class, "registerProfileListV3ResponseObject"), D8.k(InterfaceC44071d.class, InterfaceC44071d.a.class, "incorrectData", InterfaceC44071d.b.class, "success")});
        t.d(setL0);
        return setL0;
    }
}
