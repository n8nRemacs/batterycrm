package com.avito.android.advert.item;

import Qa.InterfaceC14873a;
import Up0.InterfaceC15557a;
import android.os.Bundle;
import com.avito.android.advert.item.abuse.c;
import com.avito.android.advert.item.additionalSeller.l;
import com.avito.android.advert.item.additionalSeller.t;
import com.avito.android.advert.item.auto_credits.c;
import com.avito.android.advert.item.consultation.InterfaceC28106l;
import com.avito.android.advert.item.cv_phone_actualization.d;
import com.avito.android.advert.item.cv_state.c;
import com.avito.android.advert.item.leasing_calculator.c;
import com.avito.android.advert.item.leasing_calculator.link_item.c;
import com.avito.android.advert.item.modelSpecs.a;
import com.avito.android.advert.item.ownership_cost.dialogs.e;
import com.avito.android.advert.item.ownership_cost.items.input_form.a;
import com.avito.android.advert.item.parking.c;
import com.avito.android.advert.item.price_comparison.c;
import com.avito.android.advert.item.realty_imv.g;
import com.avito.android.advert.item.scroll_up.c;
import com.avito.android.advert.item.short_term_rent.item_discount.c;
import com.avito.android.advert.item.short_term_rent.payment_toggles.h;
import com.avito.android.advert.item.short_term_rent.str_buttons.c;
import com.avito.android.advert.item.show_on_map.i;
import com.avito.android.advert.item.verification.c;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.advert_details_items.campaigns.f;
import com.avito.android.advert_details_items.georeference.c;
import com.avito.android.advert_details_items.rich_geo_block.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonType;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.screenshot_observer.a;
import com.avito.android.service_booking.deeplinks.create.ServiceBookingCreateLink;
import h5.InterfaceC40772a;
import java.util.List;
import kotlin.Metadata;
import lf.InterfaceC43762a;
import m5.InterfaceC43882a;
import ob.InterfaceC44739c;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e2\u00020\u001f2\u00020 2\u00020!2\u00020\"2\u00020#2\u00020$2\u00020%2\u00020&2\u00020'2\u00020(2\u00020)2\u00020*2\u00020+2\u00020,2\u00020-2\u00020.2\u00020/2\u0002002\u0002012\u0002022\u0002032\u0002042\u000205¨\u00066"}, d2 = {"Lcom/avito/android/advert/item/g0;", "Lob/c;", "Lcom/avito/android/advert/item/additionalSeller/l$b;", "Lcom/avito/android/advert/item/additionalSeller/t$b;", "Lcom/avito/android/advert/item/cv_phone_actualization/d$a;", "Lcom/avito/android/advert/item/cv_state/c$b;", "Lcom/avito/android/advert/item/abuse/c$a;", "Lcom/avito/android/advert_details_items/address/f$b;", "Lcom/avito/android/advert/item/auto_credits/c$a;", "Lcom/avito/android/advert_details_items/campaigns/f$b;", "Lcom/avito/android/advert/item/consultation/l$b;", "Lcom/avito/android/advert/item/o;", "Lcom/avito/android/advert_core/advert/k;", "Lcom/avito/android/advert_details_items/photogallery/c;", "Lcom/avito/android/advert_details_items/georeference/c$a;", "Lcom/avito/android/advert_core/advert/o;", "Lcom/avito/android/advert/item/leasing_calculator/c$a;", "Lcom/avito/android/advert/item/leasing_calculator/link_item/c$a;", "LQa/a;", "Lcom/avito/android/advert/item/parking/c$a;", "Lcom/avito/android/advert_details_items/rich_geo_block/l$b;", "Lcom/avito/android/advert/item/scroll_up/c$a;", "Lcom/avito/android/advert/item/short_term_rent/item_discount/c$a;", "Lcom/avito/android/advert/item/short_term_rent/str_buttons/c$a;", "Lcom/avito/android/advert/item/show_on_map/i$b;", "Lcom/avito/android/advert/item/gig/similar_shifts/e;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/h$a;", "Lcom/avito/android/advert/item/verification/c$a;", "Llf/a;", "LMe/p;", "LMe/q;", "Lcom/avito/android/advert_core/advert/p;", "Lh5/a;", "Lm5/a;", "Lcom/avito/android/advert_core/expand_items_button/f;", "Lcom/avito/android/advert/item/comfortable_deal/l;", "LR70/b;", "Lcom/avito/android/home/i;", "Lcom/avito/android/advert/item/modelSpecs/a$a;", "Lcom/avito/android/advert_details_items/neighboring_dates/tools/d;", "Lrn0/e;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/e$a;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/a$a;", "Lcom/avito/android/advert_core/pp_recall_promo/o;", "Lcom/avito/android/advert/item/price_comparison/c$a;", "LUp0/a;", "Lcom/avito/android/advert/item/realty_imv/g$c;", "Lcom/avito/android/advert/item/realty_quiz_banner/c;", "Lcom/avito/android/screenshot_observer/a$a;", "Lcom/avito/android/section/z;", "Lcom/avito/android/advert_details_items/show_description_button/i;", "Lcom/avito/android/advert/item/similars_button/i;", "Lcom/avito/android/ui/status_bar/k;", "Lcom/avito/android/advert/item/trust_factors/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28130g0 extends InterfaceC44739c, l.b, t.b, d.a, c.b, c.a, f.b, c.a, f.b, InterfaceC28106l.b, InterfaceC28153o, com.avito.android.advert_core.advert.k, com.avito.android.advert_details_items.photogallery.c, c.a, com.avito.android.advert_core.advert.o, c.a, c.a, InterfaceC14873a, c.a, l.b, c.a, c.a, c.a, i.b, com.avito.android.advert.item.gig.similar_shifts.e, h.a, c.a, InterfaceC43762a, Me.p, Me.q, com.avito.android.advert_core.advert.p, InterfaceC40772a, InterfaceC43882a, com.avito.android.advert_core.expand_items_button.f, com.avito.android.advert.item.comfortable_deal.l, R70.b, com.avito.android.home.i, a.InterfaceC2289a, com.avito.android.advert_details_items.neighboring_dates.tools.d, rn0.e, e.a, a.InterfaceC2309a, com.avito.android.advert_core.pp_recall_promo.o, c.a, InterfaceC15557a, g.c, com.avito.android.advert.item.realty_quiz_banner.c, a.InterfaceC7827a, com.avito.android.section.z, com.avito.android.advert_details_items.show_description_button.i, com.avito.android.advert.item.similars_button.i, com.avito.android.ui.status_bar.k, com.avito.android.advert.item.trust_factors.i {

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.g0$a */
    public static final class a {
    }

    void A9(@Y61.l Bundle bundle);

    void B8(@Y61.l String str, boolean z12);

    void D8();

    void Ia();

    void L9(@Y61.k ServiceBookingCreateLink.b bVar);

    void Pc();

    void W3(@Y61.l List<String> list);

    void Wd(@Y61.k RatingFormLink.b bVar, @Y61.l Y41.a<kotlin.G0> aVar);

    void a5(@Y61.k CombinedButtonType combinedButtonType, boolean z12);

    void c0();

    @Y61.l
    Bundle d0();

    void d8(@Y61.k SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, boolean z12);

    void e0();

    void gb(@Y61.k DeepLink deepLink);

    void i3(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.v vVar);

    void j6(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.a aVar);

    void j7();

    void k(@Y61.l I1 i12);

    void m(@Y61.k W0 w02);

    void onPause();

    void onResume();

    void p0();

    void pd(@Y61.l Y41.l<? super AdvertDetailsStyle, kotlin.G0> lVar);

    void start();

    void stop();

    void t4(@Y61.k DeepLink deepLink);

    void y3(@Y61.k String str, boolean z12);
}
