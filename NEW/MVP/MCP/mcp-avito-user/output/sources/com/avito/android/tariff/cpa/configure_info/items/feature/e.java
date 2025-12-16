package com.avito.android.tariff.cpa.configure_info.items.feature;

import FC0.a;
import HB0.a;
import NM0.a;
import OF0.a;
import PF0.a;
import QM0.a;
import TM0.a;
import YM0.a;
import aG0.InterfaceC19770a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.tariff.cpx.levels.CpxLevelsFragment;
import com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment;
import com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment;
import com.avito.android.trx_promo_goods.screens.status.TrxPromoGoodsStatusFragment;
import com.avito.android.trx_promo_impl.status_screen.TrxPromoStatusFragment;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.machinery_rental_banner.j;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerFragment;
import com.avito.android.verification.verification_disclaimer.k;
import com.avito.android.verification.verification_finish.VerificationFinishFragment;
import com.avito.android.verification.verification_form_builder.FormBuilderFragment;
import com.avito.android.verification.verification_status_list.VerificationStatusListFragment;
import kq.C43486b;
import u7.C48810a;
import wc0.C49600e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f294504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f294505c;

    public /* synthetic */ e(Object obj, int i12) {
        this.f294504b = i12;
        this.f294505c = obj;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        Object obj = this.f294505c;
        switch (this.f294504b) {
            case 0:
                ((f) obj).f294506b.accept(deepLink);
                break;
            case 1:
                ((com.avito.android.tariff.cpr.configure.advance.items.header.e) obj).f295266b.K5(deepLink);
                break;
            case 2:
                CpxLevelsFragment.a aVar = CpxLevelsFragment.f297006w0;
                ((CpxLevelsFragment) obj).f5().accept(new a.c(deepLink));
                break;
            case 3:
                TariffCptLevelsFragment.a aVar2 = TariffCptLevelsFragment.f298504x0;
                ((TariffCptLevelsFragment) obj).f5().accept(new a.c(deepLink));
                break;
            case 4:
                ((com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.i) obj).f300165f.accept(deepLink);
                break;
            case 5:
                TrxPromoGoodsDatePickerFragment.a aVar3 = TrxPromoGoodsDatePickerFragment.f303624p0;
                ((TrxPromoGoodsDatePickerFragment) obj).f5().accept(new a.c(deepLink));
                break;
            case 6:
                TrxPromoGoodsStatusFragment.a aVar4 = TrxPromoGoodsStatusFragment.f303747B0;
                ((TrxPromoGoodsStatusFragment) obj).q5().accept(new a.b(deepLink));
                break;
            case 7:
                TrxPromoStatusFragment.a aVar5 = TrxPromoStatusFragment.f304371z0;
                ((TrxPromoStatusFragment) obj).q5().accept(new InterfaceC19770a.b(deepLink));
                break;
            case 8:
                b.a.a(((com.avito.android.user_advert.advert.items.availableStocks.e) obj).f309267b, deepLink, null, null, 6);
                break;
            case 9:
                MyAdvertDetailsActivity myAdvertDetailsActivity = ((com.avito.android.user_advert.advert.items.credit_info.e) obj).f309347b;
                if (myAdvertDetailsActivity != null) {
                    InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                    (interfaceC35426j0 != null ? interfaceC35426j0 : null).X4(deepLink);
                    break;
                }
                break;
            case 10:
                b.a.a(((j) obj).f309593d, deepLink, null, null, 6);
                break;
            case 11:
                MyAdvertDetailsActivity myAdvertDetailsActivity2 = ((com.avito.android.user_advert.advert.items.multi_urgency.g) obj).f309650b;
                if (myAdvertDetailsActivity2 != null) {
                    InterfaceC35426j0 interfaceC35426j02 = myAdvertDetailsActivity2.f308326q;
                    (interfaceC35426j02 != null ? interfaceC35426j02 : null).W5(deepLink);
                    break;
                }
                break;
            case 12:
                ((com.avito.android.user_advert.advert.items.promo_block_feed.g) obj).f309867d.accept(deepLink);
                break;
            case 13:
                ((com.avito.android.user_advert.advert.items.realty.reliable_owner.f) obj).f309939c.accept(deepLink);
                break;
            case 14:
                int i12 = com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.i.f317454d;
                ((com.jakewharton.rxrelay3.c) obj).accept(deepLink);
                break;
            case 15:
                ((com.avito.android.vas_performance.ui.items.additional_info_block.d) obj).f321542b.onNext(deepLink);
                break;
            case 16:
                ((com.avito.android.vas_performance.ui.items.lightning_block.d) obj).f321716b.onNext(deepLink);
                break;
            case 17:
                VerificationDisclaimerFragment.a aVar6 = VerificationDisclaimerFragment.f325020t0;
                ((k) ((VerificationDisclaimerFragment) obj).f325022o0.getValue()).accept(new a.C0730a(deepLink));
                break;
            case 18:
                VerificationFinishFragment.a aVar7 = VerificationFinishFragment.f325228r0;
                ((com.avito.android.verification.verification_finish.a) ((VerificationFinishFragment) obj).f325230o0.getValue()).accept(new a.c(deepLink));
                break;
            case 19:
                FormBuilderFragment.a aVar8 = FormBuilderFragment.f325335u0;
                ((FormBuilderFragment) obj).q5().accept(new a.b(deepLink));
                break;
            case 20:
                VerificationStatusListFragment.a aVar9 = VerificationStatusListFragment.f325745s0;
                ((com.avito.android.verification.verification_status_list.k) ((VerificationStatusListFragment) obj).f325749q0.getValue()).accept(new a.b(deepLink));
                break;
            case 21:
                ((C43486b) obj).f413232c.invoke(deepLink);
                break;
            case 22:
                ((nq.c) obj).f419167e.invoke(deepLink);
                break;
            case 23:
                b.a.a(((C48810a) obj).f439801a, deepLink, null, null, 6);
                break;
            default:
                ((C49600e) obj).f441683c.invoke(deepLink);
                break;
        }
    }
}
