package com.avito.android.comfortable_deal_invite.generated.api.di;

import com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.LeadCreateApiV1ResponseOkTypeAdapterFactory;
import com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.LeadCreateApiV1ResponseWrongItemTypeAdapterFactory;
import com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ComfortableDealInviteJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ComfortableDealInviteJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f123511a = new b();
    }

    public static b a() {
        return a.f123511a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.comfortable_deal_invite.generated.api.di.a.f123510a.getClass();
        Set setL0 = C42756l.l0(new r[]{new LeadCreateApiV1ResponseOkTypeAdapterFactory(), new LeadCreateApiV1ResponseWrongItemTypeAdapterFactory(), new LeadCreateApiV1ResponseWrongLiquidityTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
