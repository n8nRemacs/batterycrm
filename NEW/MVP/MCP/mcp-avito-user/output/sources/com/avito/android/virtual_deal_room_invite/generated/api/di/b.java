package com.avito.android.virtual_deal_room_invite.generated.api.di;

import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiDataDetailsTypeAdapterFactory;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1ResponseStatusTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: VirtualDealRoomInviteJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes5.dex */
public final class b implements h<Set<r>> {

    /* compiled from: VirtualDealRoomInviteJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f326923a = new b();
    }

    public static b a() {
        return a.f326923a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.virtual_deal_room_invite.generated.api.di.a.f326922a.getClass();
        Set setL0 = C42756l.l0(new r[]{new GetInvitationApiDataDetailsTypeAdapterFactory(), new GetInvitationApiV1ResponseStatusTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
