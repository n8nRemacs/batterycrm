package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplink;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealClientsDeeplink;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealDeeplink;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealOfferDeeplink;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealRouteDeeplink;
import com.avito.android.comfortable_deal.deeplink.CommissionCalculationDetailsDeeplink;
import com.avito.android.comfortable_deal.deeplink.DealIncomeDetailsDeeplink;
import com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.comfortable_deal.deeplink.PromoDeeplink;
import com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_comfortable_deal_publicGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_comfortable_deal_publicGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_comfortable_deal_publicGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_comfortable_deal_publicGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(ComfortableDealClientRoomDeeplink.class, new C14159a(1, "/comfortable-deal/client-room", C42756l.l0(new Region[]{region, region2}), false)), new Q(ComfortableDealClientsDeeplink.class, new C14159a(1, "/comfortable-deal/clients", C42756l.l0(new Region[]{region, region2}), false)), new Q(ComfortableDealDeeplink.class, new C14159a(1, "/comfortable-deal", C42756l.l0(new Region[]{region, region2}), true)), new Q(ComfortableDealOfferDeeplink.class, new C14159a(1, "/comfortable-deal-offer", C42756l.l0(new Region[]{region, region2}), false)), new Q(ComfortableDealRouteDeeplink.class, new C14159a(1, "/comfortable-deal/route", C42756l.l0(new Region[]{region, region2}), false)), new Q(CommissionCalculationDetailsDeeplink.class, new C14159a(1, "/comfortable-deal/commission-calculation-details", C42756l.l0(new Region[]{region, region2}), false)), new Q(DealIncomeDetailsDeeplink.class, new C14159a(1, "/comfortable-deal/deal-income-details", C42756l.l0(new Region[]{region, region2}), false)), new Q(OrderCallDeeplink.class, new C14159a(1, "/comfortable-deal/request-call", C42756l.l0(new Region[]{region, region2}), false)), new Q(PpRecallDeeplink.class, new C14159a(1, "/item/premierPartner/recall", C42756l.l0(new Region[]{region, region2}), false)), new Q(PromoDeeplink.class, new C14159a(1, "/comfortable-deal/promo", C42756l.l0(new Region[]{region, region2}), false)), new Q(SubmittingSelectDeeplink.class, new C14159a(1, "/comfortable-deal/deal-select", C42756l.l0(new Region[]{region, region2}), false)), new Q(SubmittingSuccessLink.class, new C14159a(1, "/comfortable-deal/success", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
