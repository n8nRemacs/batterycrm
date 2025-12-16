package com.avito.android.virtual_deal_room_invite.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: VirtualDealRoomInviteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class c implements h<Set<r>> {

    /* compiled from: VirtualDealRoomInviteJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f326924a = new c();
    }

    public static c a() {
        return a.f326924a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.virtual_deal_room_invite.generated.api.di.a.f326922a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C10115a.class, "acceptedDetails");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "activeDetails");
        optimalRuntimeTypeAdapterFactoryA.b(a.c.class, "outdatedDetails");
        optimalRuntimeTypeAdapterFactoryA.b(a.d.class, "rejectedDetails");
        optimalRuntimeTypeAdapterFactoryA.b(a.e.class, "withdrawnDetails");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
