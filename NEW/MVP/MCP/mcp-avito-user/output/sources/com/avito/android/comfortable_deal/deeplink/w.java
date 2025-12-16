package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommissionCalculationDetailsDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/w;", "Lev/b;", "Lcom/avito/android/comfortable_deal/deeplink/CommissionCalculationDetailsDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w extends AbstractC40162b<CommissionCalculationDetailsDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f121990d;

    @Inject
    public w(@Y61.k a.d dVar) {
        this.f121990d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CommissionDetailsDialogArguments commissionDetailsDialogArguments = bundle != null ? (CommissionDetailsDialogArguments) bundle.getParcelable("CommissionCalculationDetailsArguments") : null;
        if (commissionDetailsDialogArguments == null) {
            return AbstractC14250d.b.f9170c;
        }
        this.f121990d.D0("CommissionCalculationDetailsTag", new v(commissionDetailsDialogArguments));
        return AbstractC14250d.c.f9171c;
    }
}
