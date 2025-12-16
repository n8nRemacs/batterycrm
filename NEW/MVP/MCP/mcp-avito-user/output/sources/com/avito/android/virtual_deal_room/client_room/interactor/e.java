package com.avito.android.virtual_deal_room.client_room.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientRoomInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/interactor/e;", "", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e {
    @k
    InterfaceC43160i a(boolean z12, @l DN0.b bVar);

    @k
    InterfaceC43160i<ClientRoomInternalAction> b(@k ClientEditDeeplink.b bVar, @l String str);
}
