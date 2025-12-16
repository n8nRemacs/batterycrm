package com.avito.android.comfortable_deal.deal_income_details;

import android.os.Bundle;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.deal_income_details.DealIncomeDetailsDialog;
import com.avito.android.comfortable_deal.deeplink.CommissionCalculationDetailsDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealIncomeDetailsDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DealIncomeDetailsDialog f121815l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DealIncomeDetailsDialog dealIncomeDetailsDialog) {
        super(1);
        this.f121815l = dealIncomeDetailsDialog;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        Bundle bundle;
        DeepLink deepLink2 = deepLink;
        DealIncomeDetailsDialog.a aVar = DealIncomeDetailsDialog.f121803m0;
        DealIncomeDetailsDialog dealIncomeDetailsDialog = this.f121815l;
        if (deepLink2 instanceof CommissionCalculationDetailsDeeplink) {
            bundle = new Bundle();
            bundle.putParcelable("CommissionCalculationDetailsArguments", (CommissionDetailsDialogArguments) dealIncomeDetailsDialog.f121808l0.getValue());
        } else {
            bundle = null;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = dealIncomeDetailsDialog.f121806j0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        b.a.a(aVar2, deepLink2, null, bundle, 2);
        return G0.f406611a;
    }
}
