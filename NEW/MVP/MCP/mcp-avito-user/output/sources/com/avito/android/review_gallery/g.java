package com.avito.android.review_gallery;

import Bt0.InterfaceC13184a;
import Nt0.InterfaceC14610a;
import Oq0.d;
import Vq0.InterfaceC15708a;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.reward_bug_entry_impl.mvi.a;
import com.avito.android.safedeal.delivery.order_cancellation.RdsOrderCancellationReasonsFragment;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeActivity;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import com.avito.android.saved_searches.presentation.core.SavedSearchDialogFragment;
import com.avito.android.sbc.create.common.CreateDiscountDispatchAudienceCountDialog;
import com.avito.android.sbc.create.common.CreateDiscountDispatchHardcodedHowItWorksBottomDialog;
import com.avito.android.sbc.create.common.CreateDiscountDispatchHowItWorksBottomDialog;
import com.avito.android.sbc.create.common.SbcConfiguratorGeneralDialog;
import com.avito.android.search.filter.adapter.chips.w;
import com.avito.android.search_view.n;
import com.avito.android.select.bottom_sheet.blueprints.group.t;
import com.avito.android.seller_coach.adverts_hint.view.f;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import com.avito.android.seller_room.ui.SellerRoomFragment;
import com.avito.android.serp.adapter.empty_placeholder.l;
import com.avito.android.serp.adapter.empty_placeholder.m;
import com.avito.android.service_booking_details.p;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Iterator;
import kotlin.G0;
import so0.InterfaceC48391a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f255498c;

    public /* synthetic */ g(Object obj, int i12) {
        this.f255497b = i12;
        this.f255498c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.avito.android.lib.design.picker.k<?> firstWheelValue;
        Object obj = null;
        Object obj2 = this.f255498c;
        switch (this.f255497b) {
            case 0:
                ((h) obj2).f255499a.invoke();
                break;
            case 1:
                ((com.avito.android.reward_bug_entry_impl.f) obj2).f255629e.accept(a.b.f255633a);
                break;
            case 2:
                ActivityC22955m activityC22955mL1 = ((RdsOrderCancellationReasonsFragment) obj2).l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    break;
                }
                break;
            case 3:
                UniversalDeliveryTypeActivity.a2((UniversalDeliveryTypeActivity) obj2);
                break;
            case 4:
                PasswordSettingFragment.a aVar = PasswordSettingFragment.f257418v0;
                PasswordSettingFragment passwordSettingFragment = (PasswordSettingFragment) obj2;
                passwordSettingFragment.r5(new InterfaceC48391a.d(passwordSettingFragment.q5().b()));
                break;
            case 5:
                SavedSearchDialogFragment.a aVar2 = SavedSearchDialogFragment.f258384m0;
                ((SavedSearchDialogFragment.b) obj2).r();
                break;
            case 6:
                CreateDiscountDispatchAudienceCountDialog.a aVar3 = CreateDiscountDispatchAudienceCountDialog.f259168h0;
                ((CreateDiscountDispatchAudienceCountDialog) obj2).dismiss();
                break;
            case 7:
                ((CreateDiscountDispatchHardcodedHowItWorksBottomDialog) obj2).dismiss();
                break;
            case 8:
                CreateDiscountDispatchHowItWorksBottomDialog.a aVar4 = CreateDiscountDispatchHowItWorksBottomDialog.f259169h0;
                ((CreateDiscountDispatchHowItWorksBottomDialog) obj2).dismiss();
                break;
            case 9:
                SbcConfiguratorGeneralDialog.a aVar5 = SbcConfiguratorGeneralDialog.f259176h0;
                ((SbcConfiguratorGeneralDialog) obj2).dismiss();
                break;
            case 10:
                com.avito.android.screens.bbip_v2.ui.items.duration.a aVar6 = (com.avito.android.screens.bbip_v2.ui.items.duration.a) obj2;
                Picker picker = aVar6.f261611I;
                Integer num = (picker == null || (firstWheelValue = picker.getFirstWheelValue()) == null) ? null : firstWheelValue.f180046a;
                Integer num2 = num instanceof Integer ? num : null;
                if (num2 != null) {
                    aVar6.f261609G.invoke(aVar6.f261608F.get(num2.intValue()));
                    aVar6.dismiss();
                    break;
                }
                break;
            case 11:
                Y41.a<G0> aVar7 = ((com.avito.android.search.filter.adapter.chips.c) obj2).f262149f;
                if (aVar7 != null) {
                    aVar7.invoke();
                    break;
                }
                break;
            case 12:
                Y41.a<G0> aVar8 = ((w) obj2).f262191f;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            case 13:
                ((n) obj2).f264578f.accept(G0.f406611a);
                break;
            case 14:
                ((t) obj2).f265128c.performClick();
                break;
            case 15:
                Y41.a<G0> aVar9 = ((com.avito.android.select.bottom_sheet_pagination.blueprints.error.g) obj2).f265342c;
                if (aVar9 != null) {
                    aVar9.invoke();
                    break;
                }
                break;
            case 16:
                ((com.avito.android.seller_coach.adverts_hint.view.b) obj2).f267324b.a(f.a.c.f267336a);
                break;
            case 17:
                ((com.avito.android.seller_coach.all_advices.view.e) obj2).f267430i.accept(G0.f406611a);
                break;
            case 18:
                int i12 = com.avito.android.seller_coach.hints_dialog.item.empty_hints.h.f267471d;
                ((d.a) obj2).s1();
                break;
            case 19:
                ((com.avito.android.seller_promotions.konveyor.pagination.d) obj2).f267818b.invoke(d.g.f12585a);
                break;
            case 20:
                SellerRoomFragment.a aVar10 = SellerRoomFragment.f268217x0;
                ((SellerRoomFragment) obj2).t5().accept(new InterfaceC15708a.b());
                break;
            case 21:
                ((com.avito.android.send_esia_data_screen.ui.f) obj2).f268301b.invoke();
                break;
            case 22:
                int i13 = m.f269917g;
                Y41.a<G0> aVar11 = ((l.a) obj2).f269916b;
                if (aVar11 != null) {
                    aVar11.invoke();
                    break;
                }
                break;
            case 23:
                ?? r82 = ((com.avito.android.serp.adapter.vertical_main.mini_search_widget.b) obj2).f273053i;
                if (r82 != 0) {
                    r82.invoke();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.h) obj2).f273524c.toggle();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.service_booking_day_settings.daysettings.a) obj2).f276715c.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Y41.l<? super InterfaceC13184a, G0> lVar = ((p) obj2).f277474q;
                if (lVar != null) {
                    lVar.invoke(InterfaceC13184a.C0074a.f1753a);
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.service_booking_schedule_repetition_impl.e) obj2).f277590a.invoke(InterfaceC14610a.e.f11792a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                com.avito.android.services_realty_sheet.c cVar = (com.avito.android.services_realty_sheet.c) obj2;
                cVar.f280407E.invoke();
                cVar.dismiss();
                break;
            default:
                com.avito.android.services_transportation_widget.cargo_capacity_sheet.e eVar = ((com.avito.android.services_transportation_widget.cargo_capacity_sheet.j) obj2).f280490F;
                Iterator<T> it = eVar.f280480c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        long valueId = ((ServiceTransportationWidget.CardSelectField.CardSelectValue) next).getValueId();
                        Long l12 = eVar.f280486i;
                        if (l12 != null && valueId == l12.longValue()) {
                            obj = next;
                        }
                    }
                }
                ServiceTransportationWidget.CardSelectField.CardSelectValue cardSelectValue = (ServiceTransportationWidget.CardSelectField.CardSelectValue) obj;
                if (cardSelectValue != null) {
                    eVar.f280482e.invoke(cardSelectValue);
                }
                com.avito.android.services_transportation_widget.cargo_capacity_sheet.j jVar = eVar.f280484g;
                if (jVar != null) {
                    jVar.r();
                    break;
                }
                break;
        }
    }
}
