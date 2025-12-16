package com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder;

import NN0.d;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room_client_creation.clients.model.PagingState;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: ClientsViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/builder/b;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/builder/a;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.a
    @k
    public final NN0.c a(@k NN0.c cVar) {
        PagingState pagingState;
        boolean z12 = cVar.f11406d;
        List<PN0.a> list = cVar.f11404b;
        if (z12) {
            pagingState = PagingState.f326634h;
        } else {
            boolean z13 = cVar.f11405c;
            if (list == null && z13) {
                pagingState = PagingState.f326629c;
            } else if (O2.a(list) && z13) {
                pagingState = PagingState.f326630d;
            } else {
                String str = cVar.f11408f;
                if (list != null && list.isEmpty() && !C43066x.K(str)) {
                    pagingState = PagingState.f326632f;
                } else if (list != null && list.isEmpty() && C43066x.K(str)) {
                    pagingState = PagingState.f326631e;
                } else if (cVar.f11407e) {
                    pagingState = PagingState.f326628b;
                } else if (O2.a(list)) {
                    pagingState = PagingState.f326633g;
                } else {
                    V2.f318762a.d("VDRClients", "error at creating PagingState for " + cVar);
                    pagingState = PagingState.f326634h;
                }
            }
        }
        PagingState pagingState2 = pagingState;
        List<PN0.a> list2 = list == null ? C42784z0.f406748b : list;
        PagingState pagingState3 = PagingState.f326633g;
        return NN0.c.a(cVar, null, false, false, false, null, new d(pagingState2, list2, cVar.f11408f, pagingState2 == pagingState3, pagingState2 == pagingState3 || pagingState2 == PagingState.f326630d || (pagingState2 == PagingState.f326634h && list != null && (list.isEmpty() ^ true)) || pagingState2 == PagingState.f326628b), 0, 95);
    }
}
