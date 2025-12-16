package com.avito.android.auto_reseller_contacts.deepLink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.BuyContactBottomSheet;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.data.BuyContactOpenParams;
import com.avito.android.deep_linking.links.BuyContactsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BuyContactsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/deepLink/d;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BuyContactsLink;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC40162b<BuyContactsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f95731d;

    @Inject
    public d(@Y61.k a.d dVar) {
        this.f95731d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BuyContactBottomSheet.a aVar = BuyContactBottomSheet.f95685r0;
        BuyContactOpenParams buyContactOpenParams = new BuyContactOpenParams(((BuyContactsLink) deepLink).f133063b);
        aVar.getClass();
        BuyContactBottomSheet buyContactBottomSheet = new BuyContactBottomSheet();
        buyContactBottomSheet.f95687h0.setValue(buyContactBottomSheet, BuyContactBottomSheet.f95686s0[0], buyContactOpenParams);
        this.f95731d.w1(buyContactBottomSheet, "BuyContactBottomSheet");
        return AbstractC14250d.c.f9171c;
    }
}
