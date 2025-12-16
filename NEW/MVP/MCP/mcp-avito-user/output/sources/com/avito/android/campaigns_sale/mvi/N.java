package com.avito.android.campaigns_sale.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import gj.InterfaceC40691b;
import im.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CampaignsSaleOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/N;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lim/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class N implements com.avito.android.arch.mvi.t<CampaignsSaleInternalAction, im.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f114110b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f114111c;

    @Inject
    public N(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f114110b = interfaceC28373a;
        this.f114111c = interfaceC40691b;
    }

    @Override // com.avito.android.arch.mvi.t
    public final im.b b(CampaignsSaleInternalAction campaignsSaleInternalAction) {
        im.b gVar;
        CampaignsSaleInternalAction campaignsSaleInternalAction2 = campaignsSaleInternalAction;
        if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.OpenSearchScreen) {
            return b.c.f398743a;
        }
        if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.CloseScreen) {
            return b.a.f398741a;
        }
        if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.ShowAlert) {
            gVar = new b.e(((CampaignsSaleInternalAction.ShowAlert) campaignsSaleInternalAction2).f114179b);
        } else if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.ShowToast) {
            gVar = new b.h(((CampaignsSaleInternalAction.ShowToast) campaignsSaleInternalAction2).f114183b);
        } else {
            if (!(campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.HandleDeepLink)) {
                if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.HandleBeduinActions) {
                    com.avito.android.beduin_shared.model.utils.a.a(this.f114111c, ((CampaignsSaleInternalAction.HandleBeduinActions) campaignsSaleInternalAction2).f114163b);
                } else {
                    if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.BlockAdded) {
                        return b.d.f398744a;
                    }
                    if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.TrackClickStreamEvent) {
                        this.f114110b.c(((CampaignsSaleInternalAction.TrackClickStreamEvent) campaignsSaleInternalAction2).f114184b);
                    } else if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.ShowOnDeleteBlockToast) {
                        CampaignsSaleInternalAction.ShowOnDeleteBlockToast showOnDeleteBlockToast = (CampaignsSaleInternalAction.ShowOnDeleteBlockToast) campaignsSaleInternalAction2;
                        gVar = new b.g(showOnDeleteBlockToast.f114181b, showOnDeleteBlockToast.f114182c);
                    } else if (campaignsSaleInternalAction2 instanceof CampaignsSaleInternalAction.ShowExitSaleUxFeedbackPoll) {
                        return b.f.f398746a;
                    }
                }
                return null;
            }
            gVar = new b.C11393b(((CampaignsSaleInternalAction.HandleDeepLink) campaignsSaleInternalAction2).f114164b);
        }
        return gVar;
    }
}
