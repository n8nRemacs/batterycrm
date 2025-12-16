package com.avito.android.campaigns_sale_search.network;

import Y61.k;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleSearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/network/a;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @k
    InterfaceC43160i a(@k String str, @k Filter filter);

    @k
    InterfaceC43160i<CampaignsSaleSearchInternalAction> b(@k String str);

    @k
    InterfaceC43160i c(int i12, @k String str);

    @k
    InterfaceC43160i d(int i12, @k List list);
}
