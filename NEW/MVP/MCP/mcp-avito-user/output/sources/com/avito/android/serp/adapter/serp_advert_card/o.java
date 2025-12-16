package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: SerpAdvertSaleCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/o;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface o extends AsyncViewportTracker {

    /* compiled from: SerpAdvertSaleCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void B1(long j12);

    void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from);

    void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo);

    void C(@Y61.l String str);

    void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void E0(@Y61.l String str);

    void Ed(@Y61.k SerpDisplayType serpDisplayType, boolean z12);

    void F0(@Y61.k Y41.a<G0> aVar);

    void Fc(@Y61.l String str, @Y61.l UniversalColor universalColor, boolean z12, @Y61.l UniversalColor universalColor2);

    void H2(@Y61.l Y41.a<G0> aVar);

    void IU(@Y61.l UniversalColor universalColor, @Y61.l UniversalColor universalColor2);

    void K9(@Y61.l BadgeSticker badgeSticker, boolean z12);

    void L6(@Y61.k Y41.l lVar, @Y61.l BuyWithDeliveryButton buyWithDeliveryButton);

    void M1(@Y61.l String str);

    void N5(@Y61.l SellerRating sellerRating);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void O5(boolean z12, boolean z13);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void S0(@Y61.l String str);

    void V(@Y61.l String str);

    void W9(@Y61.k ShownItemsAbTestGroup shownItemsAbTestGroup);

    void X2(@Y61.l UniversalColor universalColor, @Y61.k String str);

    void X3(@Y61.l String str);

    void Y4();

    void a7();

    void b2(@Y61.l String str);

    void c(@Y61.k Y41.a<G0> aVar);

    void d1(boolean z12);

    void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);

    void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo);

    void e1(@Y61.k Badge badge);

    void e7(@Y61.l String str);

    void f1(@Y61.l String str);

    void hZ(boolean z12);

    void hf(float f12);

    void i1(@Y61.l String str);

    void k1(@Y61.l String str);

    void k5(boolean z12, boolean z13);

    void ka(@Y61.k Y41.a aVar, boolean z12);

    void l3(@Y61.l String str);

    void l6(@Y61.k Y41.a aVar, boolean z12);

    void m1(@Y61.l String str);

    void o1(boolean z12);

    void o2(@Y61.l String str);

    void o3(@Y61.l String str);

    void setActive(boolean z12);

    void setViewed(boolean z12);

    void w0();

    void w1(boolean z12);

    void z0(boolean z12);
}
