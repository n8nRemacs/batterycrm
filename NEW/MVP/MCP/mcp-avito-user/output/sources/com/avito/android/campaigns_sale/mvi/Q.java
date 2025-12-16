package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gm.C40705b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CampaignsSaleReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Q {
    public static final CampaignsSaleState.AddBlockButtonState a(CampaignsSaleState campaignsSaleState, List list) {
        if (campaignsSaleState.f114201o) {
            return CampaignsSaleState.AddBlockButtonState.f114207d;
        }
        int size = campaignsSaleState.f114199m.f114218a.size();
        Iterator it = list.iterator();
        int size2 = 0;
        while (it.hasNext()) {
            List<Long> list2 = ((C40705b) it.next()).f396777f;
            size2 += list2 != null ? list2.size() : 0;
        }
        return size - size2 > 0 ? CampaignsSaleState.AddBlockButtonState.f114205b : CampaignsSaleState.AddBlockButtonState.f114206c;
    }
}
