package com.avito.android.user_advert.di;

import Mn0.InterfaceC14512b;
import Mp0.C14517a;
import Ta.InterfaceC15346a;
import Zd.InterfaceC19542a;
import aL0.InterfaceC19789b;
import android.app.Application;
import cU.s;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C30566f2;
import com.avito.android.N2;
import com.avito.android.Z0;
import com.avito.android.ab_tests.g0;
import com.avito.android.advert.C27794f;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.personal_banner.feature.factory.b;
import com.avito.android.remote.d1;
import com.avito.android.remote.q1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import java.util.Locale;
import kotlin.Metadata;
import lD.C43617a;
import lI0.InterfaceC43640a;
import lJ0.C43645a;
import mv0.InterfaceC44141a;
import nI0.InterfaceC44261b;
import nM.InterfaceC44291a;
import oz.C44960b;
import tz.C48744b;
import ur.C49102c;
import wx.InterfaceC49694a;
import yc.C50213a;

/* compiled from: MyAdvertDetailsDependencies.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/di/x;", "Lcom/avito/android/di/h;", "Lkj/c;", "Lcom/avito/android/lib/beduin_v2/feature/di/H$b;", "LcU/s$b;", "Lcom/avito/android/personal_banner/feature/factory/b$a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.di.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35544x extends InterfaceC29971h, kj.c, H.b, s.b, b.a {
    @Y61.k
    com.avito.android.analytics.provider.a B2();

    @Y61.k
    C43617a C0();

    @Y61.k
    B2 D();

    @Y61.k
    com.avito.android.P E();

    @Y61.k
    InterfaceC41196a E0();

    @Y61.k
    com.avito.android.photo_gallery.F F0();

    @Y61.k
    SV0.a F4();

    @Y61.k
    InterfaceC44291a F7();

    @Y61.k
    J20.a Fd();

    @Y61.k
    C49102c G();

    @Y61.k
    C43645a I4();

    @Y61.k
    N2 K4();

    @Y61.k
    com.avito.android.service_booking_persistence.c K7();

    @Y61.k
    InterfaceC44141a Kh();

    @Y61.k
    com.avito.android.advert_multi_items.param_chips.b L7();

    @Y61.k
    com.avito.android.deeplink_handler.mapping.checker.c N9();

    @Y61.k
    C50213a Nc();

    @Y61.k
    C48744b Nh();

    @Y61.k
    C27794f P7();

    @Y61.k
    g0 Ph();

    @Y61.k
    C29640d Q();

    @Y61.k
    hJ.e S();

    @Y61.k
    nt.g S7();

    @Y61.k
    Bt.d V8();

    @Y61.k
    com.avito.android.notifications_permission_messenger.b Vd();

    @Y61.k
    Z0 W();

    @Y61.k
    Ut.b Wd();

    @Y61.k
    hJ.i Y();

    @Y61.k
    C14517a Y8();

    @Y61.k
    InterfaceC19789b Yg();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    d1 a0();

    @Y61.k
    Yo.y ak();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    C44960b b5();

    @Y61.k
    com.avito.android.user_advert.advert.faq.f b9();

    @Y61.k
    com.avito.android.user_advert.advert.faq.b bc();

    @Override // com.avito.android.personal_banner.feature.factory.b.a, com.avito.android.evidence_request.mvi.evidence_request.di.c, com.avito.android.photo_gallery.grid_gallery.di.d, com.avito.android.mortgage_calculator.internal.di.c, com.avito.android.short_term_rent.bookingform.di.b, com.avito.android.str_calendar.booking_calendar.di.c, com.avito.android.str_calendar.seller.calendar.di.c, com.avito.android.str_calendar.seller.calandar_parameters.di.n, com.avito.android.safedeal.delivery.di.component.b, com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c, com.avito.android.order.feature.di.c, com.avito.android.orderBeduinV2.di.c, com.avito.android.orders.feature.beduin_orders_list.di.c, com.avito.android.verification.di.disclaimer.c, com.avito.android.verification.di.status_list.c, com.avito.android.verification.di.finish.c, com.avito.android.verification.di.confirm_requisites.c, com.avito.android.verification.di.input_bill_amount.c, com.avito.android.verification.di.fetch_invoice.c, com.avito.android.verification.di.form_builder.c, com.avito.android.loyalty.di.quality_service.h, com.avito.android.loyalty.di.criteria.b, com.avito.android.loyalty.di.criteria_gray.b, com.avito.android.loyalty.di.quality_service_gray.c, com.avito.android.loyalty.di.badge_details_v3.b, com.avito.android.extended_profile.di.InterfaceC30437q, com.avito.android.extended_profile_serp.di.InterfaceC30535e, com.avito.android.extended_profile_tabs.di.f, com.avito.android.similar_adverts.di.i, com.avito.android.di.InterfaceC29970g, com.avito.android.saved_searches.di.core.i, com.avito.android.rating_form.di.g, com.avito.android.passport.profile_add.di.a, com.avito.android.change_specific.di.c, com.avito.android.imv_goods_advert.di.e, com.avito.android.universal_map.map.di.InterfaceC35314u, com.avito.android.return_checkout.di.component.c, com.avito.android.campaigns_sale.di.i, com.avito.android.campaigns_sale_search.di.b, com.avito.android.category_items_tree.screens.tree_screen.di.c, com.avito.android.category_items_tree.screens.items_screen.di.b, com.avito.android.crm_candidates.di.candidates.c, com.avito.android.crm_paid_cvs.features.cv_list.di.c, com.avito.android.vas_performance.screens.visual.di.e, com.avito.android.vas_performance.screens.visual_v2.di.h, com.avito.android.checkout.di.g, com.avito.android.profile.host.di.c, com.avito.android.service_booking_user_profile.view.g, mg.InterfaceC44077a, com.avito.android.photo_picker.camera_mvi.di.b, com.avito.android.early_access_advert.di.e, com.avito.android.service_booking_additional_settings.di.j, cz0.e, com.avito.android.wallet.page.di.component.e, zE.InterfaceC50445a, com.avito.android.cpx_promo.impl.di.d, com.avito.android.service_booking.mvi.di.r, com.avito.android.cpx_promo.v2.di.f, com.avito.android.advert_collection_list.di.b, com.avito.android.advert_collection.di.InterfaceC28254b, sk.InterfaceC48375a, com.avito.android.travel_guest_profile.di.e, com.avito.android.universal_transaction.di.c, com.avito.android.str_seller_orders_important_to_note.di.c, com.avito.android.reputation.di.s, com.avito.android.email.email_update.di.c, com.avito.android.email.email_confirmation.di.c, com.avito.android.advert_collection_adding.di.e, com.avito.android.ai_assistant.di.chat.b, com.avito.android.ai_assistant.di.chat_list.b, com.avito.android.auto_evidence_request.di.e, hh.InterfaceC40934b, nh.InterfaceC44423b, com.avito.android.bbl.screens.configure.v4.di.b, com.avito.android.bbl.screens.limit_increase.di.g, com.avito.android.calendar_select.di.a, com.avito.android.category.di.d, com.avito.android.code_check.j, com.avito.android.comfortable_deal.di.a, wq.InterfaceC49671c, com.avito.android.competitor_analytics.di.d, com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e, com.avito.android.cpx_promo_geo.screens.region_sheet.di.e, com.avito.android.das_date_picker.di.c, com.avito.android.delivery_abuse.price_reduction.di.f, com.avito.android.delivery_location_suggest.di.e, com.avito.android.developments_advice.di.f, com.avito.android.developments_agency_search.screen.deal_cabinet.di.c, com.avito.android.developments_agency_search.screen.deal_room.di.c, com.avito.android.developments_agency_search.screen.location_group.di.c, com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b, com.avito.android.developments_agency_search.screen.realty_agency_search.di.o, com.avito.android.developments_catalog.residential_complex_search.di.c, vx.InterfaceC49390a, com.avito.android.early_access.di.c, com.avito.android.edit_seller_type.di.c, com.avito.android.extended_profile_image_edit.di.b, com.avito.android.extended_profile_selection_create.select.di.c, com.avito.android.extended_profile_universal_widget_edit.create.di.c, com.avito.android.extended_profile_universal_widget_edit.edit.di.c, com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c, com.avito.android.free_delivery.di.c, YE.c, com.avito.android.historical_suggests.suggest.di.c, com.avito.android.hotel_available_rooms.di.o, com.avito.android.hotel_booking.di.InterfaceC30799u, com.avito.android.job.cv_packages.di.b, com.avito.android.lf_levels.di.c, com.avito.android.master_plan.di.c, com.avito.android.mortgage.di.o, com.avito.android.mortgage_category.di.c, c20.InterfaceC26928e, com.avito.android.multi_message_send.di.i, com.avito.android.multigeo_flow.full_list.di.c, com.avito.android.onboarding.dialog.di.g, com.avito.android.onboarding.steps.di.e, com.avito.android.passport.auth_suggest.di.c, d60.InterfaceC39512a, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.d, com.avito.android.position_in_search.storage.provider.c.a, com.avito.android.position_in_search.stats.screen.position_in_search.di.c, com.avito.android.profile.remove.confirm.di.c, com.avito.android.profile.remove.di.c, Lc0.InterfaceC14378a, com.avito.android.rating.user_contacts.di.d, com.avito.android.re_agent_landing.di.c, com.avito.android.realty_agency.checkerboard.di.b, com.avito.android.recall_me_v2.presentation.recallme.d, com.avito.android.referral_contacts.di.c, com.avito.android.related_products.bottom_sheet.di.f, com.avito.android.service_booking_calendar.day.schedule.di.n, com.avito.android.service_booking_calendar.flexible.di.d, com.avito.android.service_booking_day_settings.di.i, com.avito.android.service_booking_details.di.d, com.avito.android.service_booking_schedule_repetition_impl.di.c, com.avito.android.service_booking_settings.di.work_hours.d, com.avito.android.service_fee_conditions.di.g, com.avito.android.service_orders.di.i, com.avito.android.services_onboarding.di.e, com.avito.android.settings.di.c, com.avito.android.short_term_rent.bookingform.promocode.di.b, com.avito.android.short_term_rent.promo_codes.di.c, com.avito.android.soa_stat.di.c, com.avito.android.social.di.g.a, com.avito.android.str_booking.di.m, com.avito.android.str_calendar.seller.last_minute_offer.di.c, com.avito.android.str_cancellation_settings.di.f, com.avito.android.str_insurance.di.c, com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h, com.avito.android.success.di.component.c, com.avito.android.sx_address.address_video_verification.di.c, com.avito.android.sx_address.selectaddresslist.di.c, WA0.b, com.avito.android.tariff.cpr.configure.advance.di.t, com.avito.android.tariff.cpx.info.limits.di.e, com.avito.android.tariff_cpt.common.di.d, gD0.InterfaceC40574b, KD0.b, com.avito.android.tariff_select.di.h, com.avito.android.travel_payment_selector.di.f, com.avito.android.travel_search.di.c, com.avito.android.trx_promo_goods.common.di.c, com.avito.android.trx_promo_impl.di.l, com.avito.android.user_favorites.di.h, com.avito.android.vas_autoprolong.screens.autoprolong.di.e, com.avito.android.vas_discount.di.d, com.avito.android.vas_performance.screens.applied_services.di.c, com.avito.android.vas_performance.screens.competitive.di.d, LL0.c, com.avito.android.vas_performance.screens.stickers.edit.di.g, com.avito.android.vas_planning.balance_lack.di.c, com.avito.android.vas_union.di.n, HN0.a, TN0.a, fO0.InterfaceC40325a, com.avito.android.virtual_deal_room_reference_category.client_add.di.b, BP0.a, com.avito.android.widget_filters.di.c, com.avito.android.work_profile.profile.work_profile_host.di.c
    @Y61.k
    R0 c();

    @Y61.k
    com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.b cl();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC14512b d3();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    l90.n e1();

    @Y61.k
    InterfaceC43640a f3();

    @Y61.k
    InterfaceC30751h g0();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    com.avito.android.clientEventBus.a h0();

    @Y61.k
    com.avito.android.account.E i();

    @Y61.k
    InterfaceC44261b i1();

    @Y61.k
    com.avito.android.lib.beduin_v2.feature.item.c j0();

    @Y61.k
    Application k();

    @Y61.k
    com.avito.android.server_time.f l();

    @InterfaceC49694a
    @Y61.k
    com.jakewharton.rxrelay3.c<String> la();

    @Y61.k
    HX.a lf();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    b.InterfaceC6452b m3();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    com.avito.android.remote.error.f o();

    @Y61.k
    SK0.b p();

    @Y61.k
    com.avito.android.item_map.a q5();

    @Y61.k
    AK0.l r();

    @Y61.k
    q1 r5();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    l90.p t0();

    @Y61.k
    InterfaceC15346a t9();

    @Y61.k
    com.avito.android.advert_multi_items.param_images.b w6();

    @Y61.k
    InterfaceC19542a x();

    @Y61.k
    L0 z();

    @Y61.k
    lE.g z1();

    @Y61.k
    C30566f2 z2();

    @Y61.k
    com.avito.android.charity.c z7();
}
