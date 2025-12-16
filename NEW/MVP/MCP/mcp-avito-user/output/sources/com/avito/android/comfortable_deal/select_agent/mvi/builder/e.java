package com.avito.android.comfortable_deal.select_agent.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import dq.d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SelectAgentViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/builder/e;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/builder/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.comfortable_deal.select_agent.mvi.builder.d
    @k
    public final dq.c a(@k dq.c cVar) {
        dq.d dVar;
        dq.d bVar;
        if (cVar.f394086f) {
            dVar = d.C11037d.f394094a;
        } else if (cVar.f394085e) {
            dVar = d.a.f394089a;
        } else {
            List list = cVar.f394082b;
            if (list != null && list.isEmpty()) {
                dVar = d.c.f394093a;
            } else {
                if (O2.a(list)) {
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    bVar = new d.b(list, cVar.f394087g, cVar.f394083c != null);
                    return dq.c.a(cVar, null, null, null, false, false, false, bVar, 63);
                }
                V2.f318762a.d("SelectAgent", "wrong view state");
                dVar = d.a.f394089a;
            }
        }
        bVar = dVar;
        return dq.c.a(cVar, null, null, null, false, false, false, bVar, 63);
    }
}
