package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ClientsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "LNN0/c;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<ClientsInternalAction, NN0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.a f326669b;

    @Inject
    public k(@Y61.k com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.a aVar) {
        this.f326669b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final NN0.c a(ClientsInternalAction clientsInternalAction, NN0.c cVar) {
        ArrayList arrayListH0;
        ClientsInternalAction clientsInternalAction2 = clientsInternalAction;
        NN0.c cVarA = cVar;
        if (!clientsInternalAction2.equals(ClientsInternalAction.ClientAddClicked.f326648b) && !(clientsInternalAction2 instanceof ClientsInternalAction.ClientClicked)) {
            boolean z12 = clientsInternalAction2 instanceof ClientsInternalAction.Content;
            List<PN0.a> list = cVarA.f11404b;
            if (z12) {
                if (list != null) {
                    arrayListH0 = C42745f0.h0(((ClientsInternalAction.Content) clientsInternalAction2).f326651b, list);
                } else {
                    arrayListH0 = ((ClientsInternalAction.Content) clientsInternalAction2).f326651b;
                }
                ClientsInternalAction.Content content = (ClientsInternalAction.Content) clientsInternalAction2;
                cVarA = NN0.c.a(cVarA, arrayListH0, false, false, content.f326653d, null, null, content.f326652c, 48);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.Error) {
                cVarA = NN0.c.a(cVarA, null, false, true, false, null, null, 0, 113);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.Loading) {
                if (((ClientsInternalAction.Loading) clientsInternalAction2).f326656d) {
                    list = null;
                }
                cVarA = NN0.c.a(cVarA, list, true, false, false, null, null, 0, 112);
            } else if (clientsInternalAction2 instanceof ClientsInternalAction.SearchInput) {
                cVarA = NN0.c.a(cVarA, null, false, false, false, ((ClientsInternalAction.SearchInput) clientsInternalAction2).f326657b, null, 0, 111);
            } else if (!clientsInternalAction2.equals(ClientsInternalAction.CloseClicked.f326650b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return this.f326669b.a(cVarA);
    }
}
