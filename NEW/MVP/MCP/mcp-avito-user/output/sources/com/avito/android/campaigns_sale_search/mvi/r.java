package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import um.c;

/* compiled from: CampaignsSaleSearchOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lum/c;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements com.avito.android.arch.mvi.t<CampaignsSaleSearchInternalAction, um.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f114790b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f114791c;

    @Inject
    public r(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f114790b = interfaceC28373a;
        this.f114791c = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final um.c b(CampaignsSaleSearchInternalAction campaignsSaleSearchInternalAction) {
        um.c dVar;
        CampaignsSaleSearchInternalAction campaignsSaleSearchInternalAction2 = campaignsSaleSearchInternalAction;
        if (campaignsSaleSearchInternalAction2.equals(CampaignsSaleSearchInternalAction.NavigateBack.f114725b)) {
            return c.b.f440253a;
        }
        if (campaignsSaleSearchInternalAction2.equals(CampaignsSaleSearchInternalAction.ShowKeyboard.f114738b)) {
            return c.C12728c.f440254a;
        }
        if (campaignsSaleSearchInternalAction2.equals(CampaignsSaleSearchInternalAction.HideKeyboard.f114716b)) {
            return c.a.f440252a;
        }
        if (campaignsSaleSearchInternalAction2 instanceof CampaignsSaleSearchInternalAction.SearchItemClicked) {
            dVar = new c.f(((CampaignsSaleSearchInternalAction.SearchItemClicked) campaignsSaleSearchInternalAction2).f114733b);
        } else if (campaignsSaleSearchInternalAction2 instanceof CampaignsSaleSearchInternalAction.ShowToast) {
            CampaignsSaleSearchInternalAction.ShowToast showToast = (CampaignsSaleSearchInternalAction.ShowToast) campaignsSaleSearchInternalAction2;
            dVar = new c.e(showToast.f114742b, showToast.f114743c, showToast.f114744d);
        } else {
            if (!(campaignsSaleSearchInternalAction2 instanceof CampaignsSaleSearchInternalAction.ShowOnDeleteAlertDialog)) {
                if (campaignsSaleSearchInternalAction2 instanceof CampaignsSaleSearchInternalAction.TrackClickStreamEvent) {
                    this.f114790b.c(((CampaignsSaleSearchInternalAction.TrackClickStreamEvent) campaignsSaleSearchInternalAction2).f114745b);
                } else if (campaignsSaleSearchInternalAction2 instanceof CampaignsSaleSearchInternalAction.HandleDeeplink) {
                    b.a.a(this.f114791c, ((CampaignsSaleSearchInternalAction.HandleDeeplink) campaignsSaleSearchInternalAction2).f114715b, null, null, 6);
                }
                return null;
            }
            dVar = new c.d(((CampaignsSaleSearchInternalAction.ShowOnDeleteAlertDialog) campaignsSaleSearchInternalAction2).f114740b);
        }
        return dVar;
    }
}
