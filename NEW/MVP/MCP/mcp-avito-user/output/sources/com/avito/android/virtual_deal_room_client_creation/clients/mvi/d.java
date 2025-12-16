package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<ClientsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_client_creation.clients.interactor.a f326646a;

    @Inject
    public d(@Y61.k com.avito.android.virtual_deal_room_client_creation.clients.interactor.a aVar) {
        this.f326646a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ClientsInternalAction> a() {
        return this.f326646a.b(0, "");
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
