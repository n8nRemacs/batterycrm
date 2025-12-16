package hm;

import Y61.k;
import com.avito.android.campaigns_sale.model.CampaignsSaleBlockWithId;
import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleBlock;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pm.C47111b;

/* compiled from: CampaignsSaleBlockWithId.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: hm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40960b {
    @k
    public static final ArrayList a(@k List list) {
        List<CampaignsSaleBlockWithId> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CampaignsSaleBlockWithId campaignsSaleBlockWithId : list2) {
            arrayList.add(new C47111b(campaignsSaleBlockWithId.f114053b, campaignsSaleBlockWithId.f114054c, campaignsSaleBlockWithId.f114055d));
        }
        return arrayList;
    }

    @k
    public static final ArrayList b(@k List list) {
        List<CampaignsSaleBlock> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CampaignsSaleBlock campaignsSaleBlock : list2) {
            arrayList.add(new CampaignsSaleBlockWithId(campaignsSaleBlock.getDiscount(), UUID.randomUUID().toString(), campaignsSaleBlock.d(), campaignsSaleBlock.getImages()));
        }
        return arrayList;
    }
}
