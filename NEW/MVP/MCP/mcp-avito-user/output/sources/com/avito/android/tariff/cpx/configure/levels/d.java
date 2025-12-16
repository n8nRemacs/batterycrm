package com.avito.android.tariff.cpx.configure.levels;

import BI0.a;
import EB0.a;
import NB0.a;
import NM0.a;
import OF0.a;
import OM0.b;
import OM0.d;
import RJ0.a;
import UM0.a;
import Y41.l;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.tariff.cpx.configure.levels.TariffCpxConfigureLevelsFragment;
import com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment;
import com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment;
import com.avito.android.tariff_cpt.configure.forbidden.CptForbiddenFragment;
import com.avito.android.travel_bnpl_calculator.model.PaymentMethod;
import com.avito.android.travel_payment_methods.items.payment_method.PaymentMethodItem;
import com.avito.android.travel_payment_methods.items.payment_method.p;
import com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.user_address.map.UserAddressMapFragment;
import com.avito.android.user_address.map.mvi.A;
import com.avito.android.user_advert.advert.items.safe_deal_services.switcher.k;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.TotalItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.DynamicItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.ValueItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.VasItemData;
import com.avito.android.vas_planning_checkout.item.result_warning.VasPlanningResultWarningItem;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerScreenData;
import com.avito.android.verification.verification_disclaimer.m;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import iR.C41336a;
import kotlin.jvm.internal.N;
import mC0.C43945a;
import sB0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f296078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f296079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f296080d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f296078b = i12;
        this.f296079c = obj;
        this.f296080d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        DeepLink noMatchLink;
        Object obj = this.f296079c;
        Object obj2 = this.f296080d;
        switch (this.f296078b) {
            case 0:
                TariffCpxConfigureLevelsFragment.a aVar = TariffCpxConfigureLevelsFragment.f296048E0;
                ((l) obj).invoke(new c.b(((sB0.b) obj2).f437510b, null, 2, null));
                break;
            case 1:
                TariffCpxLevelFeatureFragment.a aVar2 = TariffCpxLevelFeatureFragment.f296924q0;
                ((com.avito.android.tariff.cpx.level.feature.c) ((TariffCpxLevelFeatureFragment) obj).f296927i0.getValue()).accept(new a.b((DeepLink) obj2));
                break;
            case 2:
                TariffCpxLimitFragment.a aVar3 = TariffCpxLimitFragment.f297225w0;
                ((TariffCpxLimitFragment) obj).f5().accept(new a.b((DeepLink) obj2));
                break;
            case 3:
                CptForbiddenFragment.a aVar4 = CptForbiddenFragment.f297585y0;
                com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g gVar = (com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g) ((CptForbiddenFragment) obj).f297588p0.getValue();
                DeepLink deeplink = ((C43945a) obj2).f414402d.getDeeplink();
                if (deeplink != null) {
                    b.a.a(gVar.f297638M, deeplink, null, null, 6);
                    break;
                }
                break;
            case 4:
                com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.h.B80((com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.h) obj, (Y41.a) obj2);
                break;
            case 5:
                if (!((com.avito.android.tariff_lf_publication.count.ui.items.option.i) obj).f300868c.isChecked()) {
                    ((Y41.a) obj2).invoke();
                    break;
                }
                break;
            case 6:
                if (!((com.avito.android.tariff_lf_publication.region.ui.items.option.i) obj).f301131b.isChecked()) {
                    ((Y41.a) obj2).invoke();
                    break;
                }
                break;
            case 7:
                int i12 = com.avito.android.travel_bnpl_calculator.b.f301653a;
                l lVar = (l) obj;
                if (lVar != null) {
                    lVar.invoke(((PaymentMethod) obj2).getPaymentType());
                    break;
                }
                break;
            case 8:
                int i13 = com.avito.android.travel_guest_profile.items.profile_header.i.f302097k;
                ((l) obj).invoke(((PE0.f) obj2).f12898e);
                break;
            case 9:
                int i14 = p.f302525h;
                ((l) obj).invoke(((PaymentMethodItem) obj2).f302516b);
                break;
            case 10:
                TrxPromoGoodsDatePickerFragment.a aVar5 = TrxPromoGoodsDatePickerFragment.f303624p0;
                DeepLink deeplink2 = ((OF0.c) obj).f12115h.getDeeplink();
                if (deeplink2 != null) {
                    ((TrxPromoGoodsDatePickerFragment) obj2).f5().accept(new a.C0781a(deeplink2));
                    break;
                }
                break;
            case 11:
                int i15 = com.avito.android.trx_promo_impl.item.banner.j.f304212k;
                DeepLink deepLink = ((RF0.h) obj2).f14240b;
                if (deepLink != null) {
                    ((l) obj).invoke(deepLink);
                    break;
                }
                break;
            case 12:
                ((com.avito.android.lib.design.bottom_sheet.d) obj).dismiss();
                UserAddressMapFragment.a aVar6 = UserAddressMapFragment.f307488A0;
                ((com.avito.android.user_address.map.e) ((UserAddressMapFragment) obj2).f307498w0.getValue()).accept(A.j.f307632a);
                break;
            case 13:
                StringBuilder sb2 = new StringBuilder();
                CompositeLocationTextView compositeLocationTextView = ((com.avito.android.user_address.map.view.d) obj2).f307947f;
                sb2.append(compositeLocationTextView.getFirstText());
                sb2.append(compositeLocationTextView.getSecondText());
                ((com.avito.android.user_address.map.e) obj).accept(new A.d(sb2.toString()));
                break;
            case 14:
                int i16 = com.avito.android.user_advert.advert.items.realty.entry_point_client_room.h.f309913h;
                ((l) obj).invoke(((MyAdvertDetails.MainButtonAction) obj2).getDeepLink());
                break;
            case 15:
                ?? r12 = (N) obj;
                if (r12 == 0) {
                    int i17 = k.f310075d;
                    break;
                } else {
                    r12.invoke(Boolean.valueOf(((k) obj2).f310076b.isChecked()));
                    break;
                }
            case 16:
                C41336a.C11375a.a();
                C35565c c35565c = ((com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h) obj).f312822o;
                if (c35565c != null) {
                    c35565c.a(a.f.f1294a);
                }
                ((com.avito.android.lib.design.tooltip.k) obj2).dismiss();
                break;
            case 17:
                com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a aVar7 = ((com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.g) obj).f313758h;
                if (aVar7 != null) {
                    ((com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.f) obj2).c(aVar7);
                    break;
                }
                break;
            case 18:
                com.avito.android.user_stats.extended_user_stats.list_search_dialog.d dVar = (com.avito.android.user_stats.extended_user_stats.list_search_dialog.d) obj;
                dVar.f317247j = "";
                Input.t((Input) obj2, "", false, 6);
                dVar.f317239b.c(new UV0.c(dVar.f317243f));
                break;
            case 19:
                int i18 = com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.k.f317482c;
                ((com.jakewharton.rxrelay3.c) obj).accept(((com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.a) obj2).f317460b);
                break;
            case 20:
                int i19 = com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.g.f317780i;
                ((l) obj).invoke(new a.u(((TotalItemData) obj2).f317771f));
                break;
            case 21:
                int i22 = com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.g.f317990i;
                DynamicItemData dynamicItemData = (DynamicItemData) obj2;
                ((l) obj).invoke(new a.i(dynamicItemData.f317983l, dynamicItemData.f317974c));
                break;
            case 22:
                int i23 = com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.g.f318120e;
                ((l) obj).invoke(new a.v(((ValueItemData) obj2).f318111e));
                break;
            case 23:
                int i24 = com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.g.f318136g;
                ((l) obj).invoke(new a.j(((VasItemData) obj2).f318126d));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i25 = com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.i.f321843n;
                ((Y41.a) obj).invoke();
                ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.i) obj2).f321850h.setChecked(!r5.isChecked());
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                w wVar = ((com.avito.android.vas_planning_checkout.item.result_warning.g) obj).f323002d;
                if (wVar != null) {
                    VasPlanningResultWarningItem.Action action = ((VasPlanningResultWarningItem) obj2).f322986c;
                    if (action == null || (noMatchLink = action.f322991c) == null) {
                        noMatchLink = new NoMatchLink();
                    }
                    wVar.i7(noMatchLink);
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((l) obj).invoke(new a.C0730a(((m) obj2).f325080h.f442450h));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((l) obj).invoke(new a.C0730a(((VerificationDisclaimerScreenData.Button) obj2).f325042b));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.verification.verification_fetch_invoice.g) obj).f325179d.invoke(new b.d(((d.b) ((OM0.d) obj2)).f12219d.f12205b));
                break;
            default:
                ((l) obj).invoke(new a.c(((com.avito.android.verification.verification_input_bill_amount.g) obj2).f325537f.f442450h));
                break;
        }
    }

    public /* synthetic */ d(RF0.h hVar, l lVar) {
        this.f296078b = 11;
        this.f296080d = hVar;
        this.f296079c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(l lVar, k kVar) {
        this.f296078b = 15;
        this.f296079c = (N) lVar;
        this.f296080d = kVar;
    }
}
