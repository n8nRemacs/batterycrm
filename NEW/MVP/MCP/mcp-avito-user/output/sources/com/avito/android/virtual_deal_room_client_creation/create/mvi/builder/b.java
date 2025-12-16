package com.avito.android.virtual_deal_room_client_creation.create.mvi.builder;

import RN0.d;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ClientsViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/builder/b;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/builder/a;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.a
    @k
    public final RN0.c a(@k RN0.c cVar) {
        List<PN0.a> list = cVar.f14434i;
        List<PN0.a> list2 = list == null ? C42784z0.f406748b : list;
        List<PN0.a> list3 = list;
        boolean z12 = (list3 == null || list3.isEmpty()) && !cVar.f14431f;
        Integer numValueOf = (list3 == null || list3.isEmpty()) ? null : list.size() == 1 ? Integer.valueOf(R.string.virtual_deal_room_client_creation_client_create_client_looks_like_client) : Integer.valueOf(R.string.virtual_deal_room_client_creation_client_create_client_looks_like_clients);
        return RN0.c.a(cVar, null, null, null, null, false, false, null, new d(z12, cVar.f14433h, cVar.f14431f, cVar.f14427b, cVar.f14428c, cVar.f14429d, cVar.f14430e, list2, numValueOf != null ? com.avito.android.printable_text.b.c(numValueOf.intValue(), new Serializable[0]) : null), 255);
    }
}
