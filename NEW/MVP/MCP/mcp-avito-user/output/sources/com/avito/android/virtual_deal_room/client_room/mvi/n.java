package com.avito.android.virtual_deal_room.client_room.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "LEN0/c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements u<ClientRoomInternalAction, EN0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room.client_room.mvi.builder.a f326415b;

    @Inject
    public n(@Y61.k com.avito.android.virtual_deal_room.client_room.mvi.builder.a aVar) {
        this.f326415b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final EN0.c a(ClientRoomInternalAction clientRoomInternalAction, EN0.c cVar) {
        ClientRoomInternalAction clientRoomInternalAction2 = clientRoomInternalAction;
        EN0.c cVarA = cVar;
        if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.Content) {
            ClientRoomInternalAction.Content content = (ClientRoomInternalAction.Content) clientRoomInternalAction2;
            cVarA = EN0.c.a(cVarA, content.f326382l, content.f326383m, new DN0.a(content.f326374d, content.f326375e), content.f326372b, content.f326373c, content.f326377g, content.f326378h, content.f326379i, content.f326380j, content.f326381k, content.f326376f, false, null, null, 98314);
        } else if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.Error) {
            cVarA = EN0.c.a(cVarA, null, null, null, null, null, null, null, null, null, null, false, false, ((ClientRoomInternalAction.Error) clientRoomInternalAction2).f326391b, null, 106495);
        } else if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.Loading) {
            cVarA = EN0.c.a(cVarA, null, null, null, null, null, null, null, null, null, null, false, true, null, null, 106495);
        } else if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.TabSelect) {
            cVarA = EN0.c.a(cVarA, null, ((ClientRoomInternalAction.TabSelect) clientRoomInternalAction2).f326394b, null, null, null, null, null, null, null, null, false, false, null, null, 131067);
        } else if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.ClientEdited) {
            ClientRoomInternalAction.ClientEdited clientEdited = (ClientRoomInternalAction.ClientEdited) clientRoomInternalAction2;
            cVarA = EN0.c.a(cVarA, null, null, null, clientEdited.f326365b, clientEdited.f326369f, null, clientEdited.f326366c, clientEdited.f326367d, clientEdited.f326368e, clientEdited.f326370g, false, false, null, null, 94367);
        } else if (clientRoomInternalAction2 instanceof ClientRoomInternalAction.CategoryUpdated) {
            cVarA = EN0.c.a(cVarA, null, null, null, null, null, null, null, null, null, null, false, false, null, null, 98303);
        }
        return this.f326415b.a(cVarA);
    }
}
