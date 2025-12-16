package com.avito.android.imv_similiar_adverts;

import TP.a;
import UX.a;
import WN.a;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsFragment;
import com.avito.android.inline_filters.dialog.range.RangeFilterView;
import com.avito.android.installments.form.InstallmentsFormActivity;
import com.avito.android.item_map.view.V;
import com.avito.android.item_report.ItemReportFragment;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationActivity;
import com.avito.android.job.interview.JobInterviewInvitationActivity;
import com.avito.android.lib.deprecated_design.NetworkProblemView;
import com.avito.android.lib.deprecated_design.SelectView;
import com.avito.android.lib.design.action_menu.b;
import com.avito.android.lib.design.action_menu.d;
import com.avito.android.lib.design.bottom_sheet.y;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.InputField;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.lib.design.select.Select;
import com.avito.android.lib.design.select.state.SelectState;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.messenger.blacklist_reasons.list_items.m;
import com.avito.android.util.K2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import iX.InterfaceC41355a;
import kX.InterfaceC42640a;
import kotlin.G0;
import kotlin.collections.C42745f0;
import pX.InterfaceC47025a;
import rX.InterfaceC47607a;
import sN.InterfaceC48076a;
import vQ.InterfaceC49249a;
import vY.InterfaceC49282a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f170860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170861c;

    public /* synthetic */ h(Object obj, int i12) {
        this.f170860b = i12;
        this.f170861c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f170861c;
        switch (this.f170860b) {
            case 0:
                ImvSimilarAdvertsFragment.a aVar = ImvSimilarAdvertsFragment.f170813A0;
                ((ImvSimilarAdvertsFragment) obj).r5().accept(InterfaceC48076a.C12612a.f437626a);
                break;
            case 1:
                ((com.avito.android.info.ui.c) obj).close();
                break;
            case 2:
                ((com.avito.android.inline_filters.dialog.group.r) obj).f171639k.invoke();
                break;
            case 3:
                ((com.avito.android.inline_filters.dialog.location_group.adapter.g) obj).f171743d.accept(G0.f406611a);
                break;
            case 4:
                ((com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.g) obj).f171773d.accept(G0.f406611a);
                break;
            case 5:
                RangeFilterView rangeFilterView = (RangeFilterView) obj;
                rangeFilterView.f171957g.invoke(C42745f0.U(String.valueOf(RangeFilterView.k(rangeFilterView.f171962l)), String.valueOf(RangeFilterView.k(rangeFilterView.f171961k))));
                break;
            case 6:
                int i12 = InstallmentsFormActivity.f172577A;
                ((InstallmentsFormActivity) obj).c2().accept(a.i.f17900a);
                break;
            case 7:
                Y41.a<G0> aVar2 = ((com.avito.android.installments.form.loader.c) obj).f172708b;
                if (aVar2 != null) {
                    aVar2.invoke();
                    break;
                }
                break;
            case 8:
                V v12 = (V) obj;
                com.avito.android.lib.design.tooltip.k kVar = v12.f173557M;
                if (kVar != null) {
                    kVar.dismiss();
                }
                v12.f173590y.accept(G0.f406611a);
                break;
            case 9:
                ActivityC22955m activityC22955mL1 = ((ItemReportFragment) obj).l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                    break;
                }
                break;
            case 10:
                JsxCvInfoActualizationActivity.a aVar3 = JsxCvInfoActualizationActivity.f174193w;
                ((VP.a) ((JsxCvInfoActualizationActivity) obj).f174200s.getValue()).accept(a.c.f15654a);
                break;
            case 11:
                JobInterviewInvitationActivity.a aVar4 = JobInterviewInvitationActivity.f174509y;
                ((JobInterviewInvitationActivity) obj).a2().accept(InterfaceC49249a.d.f440733a);
                break;
            case 12:
                NetworkProblemView.b bVar = ((NetworkProblemView) obj).f177764f;
                if (bVar != null) {
                    bVar.W1();
                    break;
                }
                break;
            case 13:
                int i13 = SelectView.f177780s;
                SelectView selectView = (SelectView) obj;
                selectView.setValue(null);
                Y41.a<G0> aVar5 = selectView.f177797r;
                if (aVar5 != null) {
                    aVar5.invoke();
                    break;
                }
                break;
            case 14:
                ((com.avito.android.lib.deprecated_design.radio_button.d) obj).f178080d.toggle();
                break;
            case 15:
                int i14 = b.a.f178223g;
                ((d.a) obj).f178239d.invoke();
                break;
            case 16:
                Input input = (Input) obj;
                InputField inputField = input.f179340l;
                inputField.setText((CharSequence) null);
                if (input.f179351w && inputField.isFocusable()) {
                    K2.i(inputField);
                }
                Y41.a<G0> aVar6 = input.f179329V;
                if (aVar6 != null) {
                    aVar6.invoke();
                    break;
                }
                break;
            case 17:
                Y41.a<G0> aVar7 = ((MasterPlanView) obj).f179677n;
                if (aVar7 != null) {
                    aVar7.invoke();
                    break;
                }
                break;
            case 18:
                int i15 = Select.f180249i0;
                Y41.a<G0> aVar8 = ((SelectState) obj).f180265i;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            case 19:
                Select select = (Select) obj;
                y yVar = select.f180250f0;
                if (yVar != null) {
                    com.avito.android.lib.util.g.a(yVar.a(select.getContext()));
                    break;
                }
                break;
            case 20:
                com.avito.android.loyalty.ui.badge_details.c cVar = (com.avito.android.loyalty.ui.badge_details.c) obj;
                com.avito.android.loyalty.ui.badge_details.a aVar9 = cVar.f183251E.f183250b;
                com.avito.android.deeplink_handler.handler.composite.b.a(cVar.f183252F, aVar9 != null ? aVar9.f183248b : null);
                cVar.dismiss();
                break;
            case 21:
                ((com.avito.android.loyalty.ui.criteria.g) obj).f183458b.invoke(InterfaceC41355a.e.f398536a);
                break;
            case 22:
                int i16 = CriteriaGrayActivity.f183562w;
                ((CriteriaGrayActivity) obj).a2().accept(InterfaceC42640a.e.f406363a);
                break;
            case 23:
                ((com.avito.android.loyalty.ui.quality_service.m) obj).f183971c.invoke(InterfaceC47025a.b.f428574a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i17 = QualityServiceGrayActivity.f184032w;
                ((com.avito.android.loyalty.ui.quality_service_gray.h) ((QualityServiceGrayActivity) obj).f184034n.getValue()).accept(InterfaceC47607a.d.f429858a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.mandatory_verification.presentation.e) obj).f184737b.invoke(a.f.f16424a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((com.avito.android.master_plan.r) obj).f186098e.a2().accept(InterfaceC49282a.C12779a.f440825a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Y41.a<G0> aVar10 = ((com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.h) obj).f186409i;
                if (aVar10 != null) {
                    aVar10.invoke();
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Y41.a<G0> aVar11 = ((m.b) obj).f186634c;
                if (aVar11 != null) {
                    aVar11.invoke();
                    break;
                }
                break;
            default:
                com.avito.android.messenger.channels.filter.d dVar = (com.avito.android.messenger.channels.filter.d) obj;
                SegmentedControl segmentedControl = dVar.f187154G;
                dVar.f187153F.invoke(Boolean.valueOf((segmentedControl != null ? segmentedControl : null).getCurrentSelected() != 0));
                dVar.dismiss();
                break;
        }
    }
}
