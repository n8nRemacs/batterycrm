package com.avito.android.comfortable_deal_invite.generated.api.di;

import com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.a;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ComfortableDealInviteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class c implements h<Set<r>> {

    /* compiled from: ComfortableDealInviteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f123512a = new c();
    }

    public static c a() {
        return a.f123512a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.comfortable_deal_invite.generated.api.di.a.f123510a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C3692a.class, "ok");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "wrong-item");
        optimalRuntimeTypeAdapterFactoryA.b(a.c.class, "wrong-liquidity");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
