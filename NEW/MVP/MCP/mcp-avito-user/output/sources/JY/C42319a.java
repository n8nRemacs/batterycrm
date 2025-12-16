package jY;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.marketplace.FinanceMarketplaceActivity;
import com.avito.android.marketplace.FinanceMarketplaceOpenParams;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceLink;
import com.avito.android.marketplace.p;
import com.avito.android.util.C35961v3;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FinanceMarketplaceLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LjY/a;", "Lev/b;", "Lcom/avito/android/marketplace/deeplink/FinanceMarketplaceLink;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42319a extends AbstractC40162b<FinanceMarketplaceLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f405631d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f405632e;

    @Inject
    public C42319a(@k p pVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f405631d = pVar;
        this.f405632e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        FinanceMarketplaceLink financeMarketplaceLink = (FinanceMarketplaceLink) deepLink;
        p pVar = this.f405631d;
        pVar.getClass();
        Intent intent = new Intent(pVar.f185953a, (Class<?>) FinanceMarketplaceActivity.class);
        Boolean bool = financeMarketplaceLink.f185892h;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = financeMarketplaceLink.f185893i;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = financeMarketplaceLink.f185894j;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = financeMarketplaceLink.f185895k;
        C35961v3.b(intent, new FinanceMarketplaceOpenParams(financeMarketplaceLink.f185886b, financeMarketplaceLink.f185887c, financeMarketplaceLink.f185888d, financeMarketplaceLink.f185889e, financeMarketplaceLink.f185890f, financeMarketplaceLink.f185891g, zBooleanValue, zBooleanValue2, zBooleanValue3, bool4 != null ? bool4.booleanValue() : true, financeMarketplaceLink.f185896l, financeMarketplaceLink.f185897m));
        this.f405632e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
