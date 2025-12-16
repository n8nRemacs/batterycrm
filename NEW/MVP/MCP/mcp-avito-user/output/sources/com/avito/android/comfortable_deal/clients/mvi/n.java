package com.avito.android.comfortable_deal.clients.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.clients.mvi.entity.ClientsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kp.InterfaceC43480f;

/* compiled from: ClientsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/clients/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/clients/mvi/entity/ClientsInternalAction;", "Lkp/f;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements t<ClientsInternalAction, InterfaceC43480f> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43480f b(ClientsInternalAction clientsInternalAction) {
        ClientsInternalAction clientsInternalAction2 = clientsInternalAction;
        if (clientsInternalAction2 instanceof ClientsInternalAction.OpenDeal) {
            return new InterfaceC43480f.b(((ClientsInternalAction.OpenDeal) clientsInternalAction2).f120329b);
        }
        if (clientsInternalAction2 instanceof ClientsInternalAction.HandleDeeplink) {
            return new InterfaceC43480f.a(((ClientsInternalAction.HandleDeeplink) clientsInternalAction2).f120318b);
        }
        return null;
    }
}
