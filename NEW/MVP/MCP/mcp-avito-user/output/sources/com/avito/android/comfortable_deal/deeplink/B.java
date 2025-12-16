package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.deal_income_details.model.DealIncomeDetailsDialogArguments;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealIncomeDetailsDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/B;", "Lev/b;", "Lcom/avito/android/comfortable_deal/deeplink/DealIncomeDetailsDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B extends AbstractC40162b<DealIncomeDetailsDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f121843d;

    @Inject
    public B(@Y61.k a.d dVar) {
        this.f121843d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments = bundle != null ? (DealIncomeDetailsDialogArguments) bundle.getParcelable("DealIncomeDetailsArguments") : null;
        if (dealIncomeDetailsDialogArguments == null) {
            return AbstractC14250d.b.f9170c;
        }
        this.f121843d.D0("DealIncomeDetailsTag", new A(dealIncomeDetailsDialogArguments, (CommissionDetailsDialogArguments) bundle.getParcelable("CommissionCalculationDetailsArguments")));
        return AbstractC14250d.c.f9171c;
    }
}
