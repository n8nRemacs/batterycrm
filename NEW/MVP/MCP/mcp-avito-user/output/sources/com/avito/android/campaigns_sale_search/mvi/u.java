package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleSearchReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class u extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleSearchInternalAction f114795l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CampaignsSaleSearchInternalAction campaignsSaleSearchInternalAction) {
        super(0);
        this.f114795l = campaignsSaleSearchInternalAction;
    }

    @Override // Y41.a
    public final String invoke() {
        return ((CampaignsSaleSearchInternalAction.SetBottomsheetValidationText) this.f114795l).f114734b;
    }
}
