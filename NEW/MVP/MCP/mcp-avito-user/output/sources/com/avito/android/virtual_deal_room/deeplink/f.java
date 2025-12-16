package com.avito.android.virtual_deal_room.deeplink;

import Ju.InterfaceC14249c;
import com.avito.android.virtual_deal_room.deeplink.ClientEditDeeplink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEditDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/deeplink/f;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes5.dex */
public final class f implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public f() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof ClientEditDeeplink.b.C10089b) {
            ClientEditDeeplink.b.C10089b c10089b = (ClientEditDeeplink.b.C10089b) bVar;
            Map mapG = P0.g(new Q("clientId", c10089b.f326428b), new Q("firstName", c10089b.f326429c), new Q("lastName", c10089b.f326430d), new Q("middleName", c10089b.f326431e), new Q("phone", c10089b.f326432f), new Q("email", c10089b.f326433g));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapG.entrySet()) {
                arrayList.add(new com.avito.beduin.v2.interaction.launch.flow.k((String) entry.getKey(), (String) entry.getValue()));
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof ClientEditDeeplink.b.C10089b ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
