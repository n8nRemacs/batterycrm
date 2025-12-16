package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleSearchReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class t extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleSearchInternalAction f114794l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CampaignsSaleSearchInternalAction campaignsSaleSearchInternalAction) {
        super(0);
        this.f114794l = campaignsSaleSearchInternalAction;
    }

    @Override // Y41.a
    public final Integer invoke() {
        return ((CampaignsSaleSearchInternalAction.DiscountForItemChosen) this.f114794l).f114712b;
    }
}
