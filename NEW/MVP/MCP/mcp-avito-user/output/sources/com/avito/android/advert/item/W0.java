package com.avito.android.advert.item;

import com.avito.android.advert.item.address_centrity.i;
import com.avito.android.advert.item.amenities.c;
import com.avito.android.advert.item.autoteka.teaser.i;
import com.avito.android.advert.item.autoteka.teaser_v2.c;
import com.avito.android.advert.item.autoteka.teaser_v3.c;
import com.avito.android.advert.item.autoteka_select.teaser.c;
import com.avito.android.advert.item.b2c.h;
import com.avito.android.advert.item.compatibility.v3.k;
import com.avito.android.advert.item.domoteka.conveyor.d;
import com.avito.android.advert.item.early_access_fakedoor.konveyor.c;
import com.avito.android.advert.item.icebreakers_redesign.d;
import com.avito.android.advert.item.note.c;
import com.avito.android.advert.item.rating_publish.c;
import com.avito.android.advert.item.reusable_amenities.g;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.sellersubscription.p;
import com.avito.android.advert.item.service_app_filling.a;
import com.avito.android.advert.item.service_booking.m;
import com.avito.android.advert.item.service_order_request.n;
import com.avito.android.advert.item.services_review_volunteers.e;
import com.avito.android.advert_core.advert_badge_bar.e;
import com.avito.android.advert_core.body_condition.f;
import com.avito.android.advert_core.development_offers.f;
import com.avito.android.advert_core.information_about.c;
import com.avito.android.advert_core.offers.c;
import com.avito.android.advert_core.price_list.preview.f;
import com.avito.android.advert_details_items.search_suggests.c;
import com.avito.android.favorite_sellers.adapter.recommendation.h;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRouter.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e2\u00020\u001f2\u00020 2\u00020!2\u00020\"¨\u0006#"}, d2 = {"Lcom/avito/android/advert/item/W0;", "Lcom/avito/android/advert_core/advert/b;", "Lcom/avito/android/advert/item/note/c$a;", "Lcom/avito/android/advert/c0;", "Lcom/avito/android/advert/item/safedeal/a$a;", "Lcom/avito/android/advert/item/b2c/h$a;", "Lcom/avito/android/advert/item/address_centrity/i$a;", "Lcom/avito/android/advert/item/autoteka/teaser/i$b;", "Lcom/avito/android/advert/item/autoteka/teaser_v2/c$a;", "Lcom/avito/android/advert/item/autoteka/teaser_v3/c$a;", "Lcom/avito/android/advert/item/autoteka_select/teaser/c$b;", "Lcom/avito/android/advert/item/domoteka/conveyor/d$a;", "Lcom/avito/android/advert/item/sellersubscription/p$a;", "Lcom/avito/android/advert/item/rating_publish/c$a;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/h$a;", "Lcom/avito/android/advert_core/advert_badge_bar/e$a;", "Lcom/avito/android/credits/j;", "Lcom/avito/android/advert/item/service_app_filling/a$a;", "Lcom/avito/android/deal_confirmation/k;", "Lcom/avito/android/advert_core/body_condition/f$a;", "Lcom/avito/android/advert/item/compatibility/v3/k$a;", "Lcom/avito/android/advert/item/service_booking/m$a;", "Lcom/avito/android/advert/item/service_order_request/n$a;", "Lcom/avito/android/advert_core/development_offers/f$a;", "Lcom/avito/android/advert_core/offers/c$a;", "Lcom/avito/android/advert/item/additionalSeller/v;", "Lcom/avito/android/advert_core/information_about/c$a;", "Lcom/avito/android/advert_core/price_list/preview/f$a;", "Lcom/avito/android/advert/item/services_review_volunteers/e$a;", "Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/c$a;", "Lcom/avito/android/advert/item/amenities/c$a;", "Lcom/avito/android/advert/item/reusable_amenities/g$a;", "Lcom/avito/android/advert/item/hotel/hotel_offer/i;", "Lcom/avito/android/advert_details_items/search_suggests/c$a;", "Lcom/avito/android/advert/item/icebreakers_redesign/d$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface W0 extends com.avito.android.advert_core.advert.b, c.a, com.avito.android.advert.c0, InterfaceC28173a.InterfaceC2325a, h.a, i.a, i.b, c.a, c.a, c.b, d.a, p.a, c.a, h.a, e.a, com.avito.android.credits.j, a.InterfaceC2352a, com.avito.android.deal_confirmation.k, f.a, k.a, m.a, n.a, f.a, c.a, com.avito.android.advert.item.additionalSeller.v, c.a, f.a, e.a, c.a, c.a, g.a, com.avito.android.advert.item.hotel.hotel_offer.i, c.a, d.a {

    /* compiled from: AdvertDetailsRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}
