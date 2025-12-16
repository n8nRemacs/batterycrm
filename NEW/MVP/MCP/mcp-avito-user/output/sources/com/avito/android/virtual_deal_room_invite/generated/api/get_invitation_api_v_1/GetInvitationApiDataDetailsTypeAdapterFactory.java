package com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1;

import Y61.k;
import Y61.l;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetInvitationApiDataDetailsTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiDataDetailsTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "GetInvitationApiDataDetailsTypeAdapter", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetInvitationApiDataDetailsTypeAdapterFactory implements r {

    /* compiled from: GetInvitationApiDataDetailsTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiDataDetailsTypeAdapterFactory$GetInvitationApiDataDetailsTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/a;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetInvitationApiDataDetailsTypeAdapter extends TypeAdapter<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<a> f326925a;

        public GetInvitationApiDataDetailsTypeAdapter(@k TypeAdapter<a> typeAdapter) {
            this.f326925a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a read(com.google.gson.stream.a aVar) {
            a aVar2 = this.f326925a.read(aVar);
            return aVar2 == null ? a.f.f326930a : aVar2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a aVar) {
            this.f326925a.write(cVar, aVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.class)) {
            return new GetInvitationApiDataDetailsTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(a.class)));
        }
        return null;
    }
}
