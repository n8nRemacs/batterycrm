package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/network/a;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CampaignsSaleInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale.network.a$a, reason: collision with other inner class name */
    public static final class C3340a {
    }

    @Y61.k
    InterfaceC43160i<CampaignsSaleInternalAction> a();

    @Y61.k
    InterfaceC43160i b(@Y61.k ArrayList arrayList, boolean z12, @Y61.l DeepLink deepLink);

    @Y61.k
    InterfaceC43160i c(@Y61.k String str, @Y61.k List list);

    @Y61.k
    InterfaceC43160i d(@Y61.k ArrayList arrayList);

    @Y61.k
    InterfaceC43160i e(@Y61.k ArrayList arrayList, @Y61.l DeepLink deepLink);

    @Y61.k
    InterfaceC43160i<CampaignsSaleInternalAction> f();
}
