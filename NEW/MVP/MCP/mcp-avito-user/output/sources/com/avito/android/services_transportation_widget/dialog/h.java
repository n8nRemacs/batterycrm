package com.avito.android.services_transportation_widget.dialog;

import Ax0.InterfaceC13098b;
import DC0.a;
import FC0.a;
import Fx0.InterfaceC13851a;
import Ky0.b;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.short_term_rent.soft_booking.dialog.a;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.stories.z;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_calendar.seller.last_minute_offer.ui.LastMinuteOfferFragment;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersFragment;
import com.avito.android.suggest_addresses.presentation.SuggestAddressesToolbarImpl;
import com.avito.android.suggest_addresses.presentation.k;
import com.avito.android.suggest_locations.SuggestLocationsToolbarRedesign;
import com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment;
import com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment;
import com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment;
import com.avito.android.tariff.detailssheet.TariffDetailsSheetDialogFragment;
import com.avito.android.tariff.detailssheet.vm.l;
import com.avito.android.tariff_cpt.configure.forbidden.CptForbiddenFragment;
import com.avito.android.tariff_cpt.configure.migration.CptMigrationFragment;
import com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment;
import com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment;
import com.avito.android.tariff_lf.edit_info.EditInfoFragment;
import com.avito.android.util.D6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import gB0.InterfaceC40566a;
import kotlin.G0;
import oA0.InterfaceC44610a;
import oB0.InterfaceC44620a;
import qz0.InterfaceC47467a;
import tB0.InterfaceC48530a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f280507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f280508c;

    public /* synthetic */ h(Object obj, int i12) {
        this.f280507b = i12;
        this.f280508c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f280508c;
        switch (this.f280507b) {
            case 0:
                int i12 = i.f280509I;
                ((i) obj).dismiss();
                break;
            case 1:
                ((com.avito.android.short_term_rent.bookingform.promocode.b) obj).f282080c.invoke();
                break;
            case 2:
                a.C8444a c8444a = com.avito.android.short_term_rent.soft_booking.dialog.a.f282581I;
                ((com.avito.android.short_term_rent.soft_booking.dialog.a) obj).dismiss();
                break;
            case 3:
                Y41.a<G0> aVar = ((com.avito.android.short_term_rent.soft_booking.view.g) obj).f282906j;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 4:
                C34999p c34999p = (C34999p) obj;
                ClarifyButtonItem clarifyButtonItem = c34999p.f283490j0;
                c34999p.f283476c0.accept(new ClarifyButtonItem(clarifyButtonItem.f283216d, clarifyButtonItem.f283214b, clarifyButtonItem.f283215c, "air", clarifyButtonItem.f283218f));
                break;
            case 5:
                Y41.a<G0> aVar2 = ((com.avito.android.social_management.adapter.notification.i) obj).f284546e;
                if (aVar2 != null) {
                    aVar2.invoke();
                    break;
                }
                break;
            case 6:
                ((com.avito.android.status_doc.helpers.a) obj).f284872i.invoke(InterfaceC13098b.c.f720a);
                break;
            case 7:
                ((z) obj).f285367i.K5(InterfaceC13851a.C0312a.f6066a);
                break;
            case 8:
                ((com.avito.android.str_booking.ui.f) obj).f286019f.accept(a.k.f285793a);
                break;
            case 9:
                ((com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.c) obj).f287270b.toggle();
                break;
            case 10:
                LastMinuteOfferFragment.a aVar3 = LastMinuteOfferFragment.f287978s0;
                ((LastMinuteOfferFragment) obj).r5().accept(b.c.f9730a);
                break;
            case 11:
                ((com.avito.android.str_seller_orders.orders.f) obj).f288868a.invoke();
                break;
            case 12:
                StrOrdersFiltersFragment.a aVar4 = StrOrdersFiltersFragment.f289101n0;
                ((StrOrdersFiltersFragment) obj).f5().accept(InterfaceC47467a.C12348a.f429540a);
                break;
            case 13:
                ((com.avito.android.suggest_addresses.domain.adapter.chips.i) obj).f291855c.setMaxLines(null);
                D6.w(view);
                break;
            case 14:
                Y41.a<G0> aVar5 = ((com.avito.android.suggest_addresses.domain.adapter.error.h) obj).f291873e;
                if (aVar5 != null) {
                    aVar5.invoke();
                    break;
                }
                break;
            case 15:
                Y41.a<G0> aVar6 = ((SuggestAddressesToolbarImpl) obj).f291964d;
                if (aVar6 != null) {
                    aVar6.invoke();
                    break;
                }
                break;
            case 16:
                ((k) obj).f291974c.accept(InterfaceC44610a.b.f419473a);
                break;
            case 17:
                ((SuggestLocationsToolbarRedesign) obj).f292166d.accept(G0.f406611a);
                break;
            case 18:
                com.avito.android.sx_address.list.view.a aVar7 = (com.avito.android.sx_address.list.view.a) obj;
                aVar7.f293411J.K5(aVar7.f293409H);
                aVar7.r();
                break;
            case 19:
                ((com.avito.android.sx_address.selectaddresslist.view.d) obj).f294178r.K5(G0.f406611a);
                break;
            case 20:
                CprConfigureAdvanceFragment.a aVar8 = CprConfigureAdvanceFragment.f295152C0;
                ((CprConfigureAdvanceFragment) obj).r5().accept(InterfaceC40566a.C11194a.f396364a);
                break;
            case 21:
                CpxConfigureAdvanceManualFragment.a aVar9 = CpxConfigureAdvanceManualFragment.f295770u0;
                ((CpxConfigureAdvanceManualFragment) obj).f5().accept(InterfaceC44620a.b.f419552a);
                break;
            case 22:
                TariffCpxInfoAdvanceDialogFragment.a aVar10 = TariffCpxInfoAdvanceDialogFragment.f296263n0;
                ((com.avito.android.tariff.cpx.info.advance.e) ((TariffCpxInfoAdvanceDialogFragment) obj).f296267k0.getValue()).accept(InterfaceC48530a.b.f439186a);
                break;
            case 23:
                l lVar = ((TariffDetailsSheetDialogFragment) obj).f297396h0;
                (lVar != null ? lVar : null).f297452P.postValue(G0.f406611a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                CptForbiddenFragment.a aVar11 = CptForbiddenFragment.f297585y0;
                ActivityC22955m activityC22955mL1 = ((CptForbiddenFragment) obj).l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                CptMigrationFragment.a aVar12 = CptMigrationFragment.f297998v0;
                ActivityC22955m activityC22955mL12 = ((CptMigrationFragment) obj).l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.onBackPressed();
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                TariffCptLevelFeatureFragment.a aVar13 = TariffCptLevelFeatureFragment.f298421r0;
                ((com.avito.android.tariff_cpt.level_feature.b) ((TariffCptLevelFeatureFragment) obj).f298428m0.getValue()).accept(a.b.f3093a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                TariffCptLevelsFragment.a aVar14 = TariffCptLevelsFragment.f298504x0;
                ((TariffCptLevelsFragment) obj).f5().accept(a.b.f4619a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                EditInfoFragment.a aVar15 = EditInfoFragment.f298742F0;
                ActivityC22955m activityC22955mL13 = ((EditInfoFragment) obj).l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.onBackPressed();
                    break;
                }
                break;
            default:
                Y41.a<G0> aVar16 = ((com.avito.android.tariff_lf.edit_info.item.add_category.i) obj).f298885c;
                if (aVar16 != null) {
                    aVar16.invoke();
                    break;
                }
                break;
        }
    }
}
