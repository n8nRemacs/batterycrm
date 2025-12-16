package com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1;

import Y61.k;
import Y61.l;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetInvitationApiV1ResponseStatusTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1ResponseStatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "GetInvitationApiV1ResponseStatusTypeAdapter", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetInvitationApiV1ResponseStatusTypeAdapterFactory implements r {

    /* compiled from: GetInvitationApiV1ResponseStatusTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1ResponseStatusTypeAdapterFactory$GetInvitationApiV1ResponseStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response$Status;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetInvitationApiV1ResponseStatusTypeAdapter extends TypeAdapter<GetInvitationApiV1Response.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<GetInvitationApiV1Response.Status> f326929a;

        public GetInvitationApiV1ResponseStatusTypeAdapter(@k TypeAdapter<GetInvitationApiV1Response.Status> typeAdapter) {
            this.f326929a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final GetInvitationApiV1Response.Status read(com.google.gson.stream.a aVar) {
            GetInvitationApiV1Response.Status status = this.f326929a.read(aVar);
            return status == null ? GetInvitationApiV1Response.Status.Outdated : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, GetInvitationApiV1Response.Status status) {
            this.f326929a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), GetInvitationApiV1Response.Status.class)) {
            return new GetInvitationApiV1ResponseStatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(GetInvitationApiV1Response.Status.class)));
        }
        return null;
    }
}
