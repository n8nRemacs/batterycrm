package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import com.avito.android.remote.model.Image;
import gm.C40704a;
import gm.C40705b;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleBlocksResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/z;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface z {

    /* compiled from: CampaignsSaleBlocksResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    C40705b a(@Y61.k CampaignsSaleState.c cVar, @Y61.k C40704a c40704a, @Y61.k String str, @Y61.l List<Long> list, @Y61.l List<Image> list2, @Y61.l Integer num, @Y61.l List<Long> list3, boolean z12, boolean z13);

    @Y61.k
    InterfaceC43160i<CampaignsSaleInternalAction> b(@Y61.k CampaignsSaleState.c cVar, @Y61.k List<C40705b> list);
}
