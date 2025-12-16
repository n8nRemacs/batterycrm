package com.avito.android.virtual_deal_room.deeplink;

import Ju.InterfaceC14249c;
import com.avito.android.virtual_deal_room.deeplink.ClientRoomDeeplink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClientRoomDeeplinkResultConverter.kt */
@C11.a
@InterfaceC42189a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/m;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public m() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        return new com.avito.beduin.v2.interaction.launch.flow.j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return ((bVar instanceof ClientRoomDeeplink.b) && ((ClientRoomDeeplink.b) bVar).f326438b) ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
