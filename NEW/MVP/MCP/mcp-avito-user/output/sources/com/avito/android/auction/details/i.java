package com.avito.android.auction.details;

import Ce.InterfaceC13293a;
import Gy0.InterfaceC13931a;
import Md.InterfaceC14470a;
import Ui.InterfaceC15523b;
import android.net.Uri;
import com.avito.android.authorization.duplicate_pd.DuplicatePdHelpFragment;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.credits.calculator.A;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.x;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.IacCallMethodsDialogFragmentResult;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce.IacForceCallMethodsDialogFragment;
import com.avito.android.loyalty.ui.criteria.CriteriaActivity;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.rating_form.step.RatingFormStepFragment;
import f10.InterfaceC40199a;
import iX.InterfaceC41355a;
import ih0.InterfaceC41402a;
import java.util.Map;
import kX.InterfaceC42640a;
import kotlin.jvm.internal.l0;
import rX.InterfaceC47607a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92345c;

    public /* synthetic */ i(Object obj, int i12) {
        this.f92344b = i12;
        this.f92345c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(String str) {
        Map map = null;
        Object[] objArr = 0;
        Object obj = this.f92345c;
        switch (this.f92344b) {
            case 0:
                int i12 = AuctionDetailsSheetActivity.f92320s;
                ((q) ((AuctionDetailsSheetActivity) obj).f92322n.getValue()).accept(new InterfaceC14470a.d(str));
                return true;
            case 1:
                DuplicatePdHelpFragment.a aVar = DuplicatePdHelpFragment.f93816n0;
                if (str.length() != 0) {
                    return false;
                }
                DuplicatePdHelpFragment duplicatePdHelpFragment = (DuplicatePdHelpFragment) obj;
                duplicatePdHelpFragment.requireActivity().setResult(-1);
                duplicatePdHelpFragment.requireActivity().finish();
                return true;
            case 2:
                ((com.avito.android.auto_evidence_request.items.attributed_text_item.d) obj).f95185b.invoke(new InterfaceC13293a.k(str));
                return true;
            case 3:
                ((InterfaceC15523b) obj).o(new BeduinOpenLinkAction(str, map, 2, objArr == true ? 1 : 0));
                return true;
            case 4:
                ((com.avito.android.blueprints.job_multigeo_address.k) obj).f106018i.accept(str);
                return true;
            case 5:
                int i13 = com.avito.android.credits.calculator.q.f128699p;
                if (str.length() == 0) {
                    return false;
                }
                com.avito.android.credits.p pVar = ((com.avito.android.credits.calculator.q) obj).f128709k;
                if (pVar != null) {
                    pVar.j9(Uri.parse(str));
                }
                return true;
            case 6:
                int i14 = A.f128626C;
                if (str.length() == 0) {
                    return false;
                }
                com.avito.android.credits.p pVar2 = ((A) obj).f128709k;
                if (pVar2 != null) {
                    pVar2.j9(Uri.parse(str));
                }
                return true;
            case 7:
                IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment = (IacForceCallMethodsDialogFragment) obj;
                iacForceCallMethodsDialogFragment.h5((String) iacForceCallMethodsDialogFragment.f168473m0.getValue(), new IacCallMethodsDialogFragmentResult.OnOnboardingClicked(iacForceCallMethodsDialogFragment.g5()));
                return true;
            case 8:
                int i15 = CriteriaActivity.f183403x;
                ((com.avito.android.loyalty.ui.criteria.j) ((CriteriaActivity) obj).f183405n.getValue()).accept(new InterfaceC41355a.d(str));
                return true;
            case 9:
                int i16 = CriteriaGrayActivity.f183562w;
                ((CriteriaGrayActivity) obj).a2().accept(new InterfaceC42640a.d(str));
                return true;
            case 10:
                int i17 = QualityServiceGrayActivity.f184032w;
                ((com.avito.android.loyalty.ui.quality_service_gray.h) ((QualityServiceGrayActivity) obj).f184034n.getValue()).accept(new InterfaceC47607a.c(str));
                return true;
            case 11:
                ((com.avito.android.mortgage.root.list.items.privacy.d) obj).f202734b.invoke(new InterfaceC40199a.C40214p(new WebViewLink.OnlyAvitoDomain(Uri.parse(str), null, null, 6, null)));
                return true;
            case 12:
                RatingFormStepFragment.a aVar2 = RatingFormStepFragment.f249120R0;
                ((RatingFormStepFragment) obj).r5().accept(new InterfaceC41402a.q(str));
                return true;
            case 13:
                ((com.avito.android.rating_ui.attributed_text.h) obj).f249947b.accept(new com.avito.android.rating_ui.attributed_text.b(null, str, 1, null));
                return true;
            case 14:
                ((com.avito.android.str_calendar.seller.calandar_parameters.items.chips.c) obj).f287098b.invoke(new InterfaceC13931a.A(str));
                return true;
            default:
                int i18 = com.avito.android.upload_doc.view.checkbox.h.f306991j;
                return ((Boolean) ((Y41.a) ((l0.h) obj).f406842b).invoke()).booleanValue();
        }
    }
}
