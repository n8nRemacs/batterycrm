package com.avito.android.credits;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragmentData;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragmentParams;
import com.avito.android.credits.landing.CreditProductsLandingArguments;
import com.avito.android.credits.landing.CreditProductsLandingFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditBrokerIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/g;", "Lcom/avito/android/credits/f;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f128860a;

    @Inject
    public g(@Y61.k L l12) {
        this.f128860a = l12;
    }

    @Override // com.avito.android.credits.f
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l Uri uri, @Y61.l NavigationTabSetItem navigationTabSetItem, @Y61.l String str2, @Y61.l String str3) {
        CreditPartnerFragmentParams creditPartnerFragmentParams = new CreditPartnerFragmentParams(uri, str, str2, str3);
        if (navigationTabSetItem == null) {
            navigationTabSetItem = NavigationTab.f106970f;
        }
        return this.f128860a.d(new CreditPartnerFragmentData(creditPartnerFragmentParams, navigationTabSetItem));
    }

    @Override // com.avito.android.credits.f
    @Y61.k
    public final Intent b(@Y61.k Uri uri, @Y61.l String str, @Y61.l NavigationTabSetItem navigationTabSetItem) {
        CreditProductsLandingArguments creditProductsLandingArguments = new CreditProductsLandingArguments(uri, str);
        if (navigationTabSetItem == null) {
            navigationTabSetItem = NavigationTab.f106970f;
        }
        return this.f128860a.d(new CreditProductsLandingFragmentData(creditProductsLandingArguments, navigationTabSetItem));
    }
}
