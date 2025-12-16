package com.avito.android.comfortable_deal.end_deal.mvi;

import Lp.C14426a;
import Op.C14722a;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.comfortable_deal.end_deal.model.CommissionInfo;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EndDealReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "LHp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<EndDealInternalAction, Hp.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.end_deal.mvi.builder.e f122352b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.end_deal.mvi.builder.a f122353c;

    @Inject
    public n(@Y61.k com.avito.android.comfortable_deal.end_deal.mvi.builder.e eVar, @Y61.k com.avito.android.comfortable_deal.end_deal.mvi.builder.a aVar) {
        this.f122352b = eVar;
        this.f122353c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Hp.c a(EndDealInternalAction endDealInternalAction, Hp.c cVar) {
        String str;
        Integer numY0;
        String str2;
        Integer numY02;
        EndDealInternalAction endDealInternalAction2 = endDealInternalAction;
        Hp.c cVarA = cVar;
        boolean z12 = endDealInternalAction2 instanceof EndDealInternalAction.CommissionLoaded;
        Map<String, EndDealField> mapC = cVarA.f7737g;
        if (z12) {
            C14426a c14426a = ((EndDealInternalAction.CommissionLoaded) endDealInternalAction2).f122312b;
            int productCommission = (int) c14426a.getProductCommission();
            int productCommissionRate = (int) c14426a.getProductCommissionRate();
            EndDealField endDealField = mapC != null ? mapC.get("agentCommission") : null;
            EndDealField.RoubleInput roubleInput = endDealField instanceof EndDealField.RoubleInput ? (EndDealField.RoubleInput) endDealField : null;
            int iIntValue = 0;
            int iIntValue2 = (roubleInput == null || (str2 = roubleInput.f122271b) == null || (numY02 = C43066x.y0(str2)) == null) ? 0 : numY02.intValue();
            Parcelable parcelable = mapC != null ? (EndDealField) mapC.get("agentCommission") : null;
            EndDealField.RoubleInput roubleInput2 = parcelable instanceof EndDealField.RoubleInput ? (EndDealField.RoubleInput) parcelable : null;
            if (roubleInput2 != null && (str = roubleInput2.f122271b) != null && (numY0 = C43066x.y0(str)) != null) {
                iIntValue = numY0.intValue();
            }
            cVarA = Hp.c.a(cVarA, false, false, false, new CommissionData(iIntValue2, Integer.valueOf(productCommissionRate), Integer.valueOf(productCommission), iIntValue - ((int) c14426a.getProductCommission())), null, null, null, null, false, null, 1011);
        } else if (endDealInternalAction2 instanceof EndDealInternalAction.CommissionLoadingFailure) {
            cVarA = Hp.c.a(cVarA, false, false, false, null, null, null, null, null, false, null, 1011);
        } else {
            boolean z13 = endDealInternalAction2 instanceof EndDealInternalAction.Content;
            com.avito.android.comfortable_deal.end_deal.mvi.builder.a aVar = this.f122353c;
            if (z13) {
                C14722a c14722a = ((EndDealInternalAction.Content) endDealInternalAction2).f122314b;
                cVarA = Hp.c.a(cVarA, false, false, false, null, new CommissionDetailsDialogArguments(c14722a.getLayout().getCommissionConfirmation().getCalculationInfo().getTitle(), c14722a.getLayout().getCommissionConfirmation().getCalculationInfo().getDescription(), c14722a.getLayout().getCommissionConfirmation().getCalculationInfo().getButtonTitle()), aVar.b(c14722a), c14722a.getTitle(), new CommissionInfo(c14722a.getLayout().getCommissionConfirmation().getTitle(), c14722a.getLayout().getCommissionConfirmation().getDescription()), false, null, 526);
            } else if (endDealInternalAction2 instanceof EndDealInternalAction.Error) {
                cVarA = Hp.c.a(cVarA, false, false, false, null, null, null, null, null, true, null, 766);
            } else if (endDealInternalAction2 instanceof EndDealInternalAction.Loading) {
                cVarA = Hp.c.a(cVarA, true, false, false, null, null, null, null, null, false, null, 766);
            } else if (endDealInternalAction2.equals(EndDealInternalAction.LoadingCommission.f122318b)) {
                cVarA = Hp.c.a(cVarA, false, false, true, null, null, null, null, null, false, null, 1011);
            } else if (endDealInternalAction2.equals(EndDealInternalAction.SubmitForm.f122323b)) {
                cVarA = Hp.c.a(cVarA, false, true, false, null, null, null, null, null, false, null, 1021);
            } else if (endDealInternalAction2 instanceof EndDealInternalAction.SubmitFormError) {
                cVarA = Hp.c.a(cVarA, false, false, false, null, null, null, null, null, false, null, 1021);
            } else if (!(endDealInternalAction2 instanceof EndDealInternalAction.OpenCalendarClicked)) {
                if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateChipValue) {
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    EndDealInternalAction.UpdateChipValue updateChipValue = (EndDealInternalAction.UpdateChipValue) endDealInternalAction2;
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, aVar.d(updateChipValue.f122327b, updateChipValue.f122328c, mapC), null, null, false, null, 991);
                } else if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateCommentValue) {
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    EndDealInternalAction.UpdateCommentValue updateCommentValue = (EndDealInternalAction.UpdateCommentValue) endDealInternalAction2;
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, aVar.a(updateCommentValue.f122330b, updateCommentValue.f122331c, mapC), null, null, false, null, 991);
                } else if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateDataValue) {
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    EndDealInternalAction.UpdateDataValue updateDataValue = (EndDealInternalAction.UpdateDataValue) endDealInternalAction2;
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, aVar.e(updateDataValue.f122332b, updateDataValue.f122333c, mapC), null, null, false, null, 991);
                } else if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateInputValue) {
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    EndDealInternalAction.UpdateInputValue updateInputValue = (EndDealInternalAction.UpdateInputValue) endDealInternalAction2;
                    String str3 = updateInputValue.f122335b;
                    LinkedHashMap linkedHashMapF = aVar.f(str3, updateInputValue.f122336c, mapC);
                    CommissionData commissionData = cVarA.f7735e;
                    cVarA = Hp.c.a(cVarA, false, false, false, (commissionData == null || str3.equals("agentCommission")) ? null : commissionData, null, linkedHashMapF, null, null, false, null, 983);
                } else if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateCalendarValue) {
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, aVar.c(mapC, ((EndDealInternalAction.UpdateCalendarValue) endDealInternalAction2).f122326b), null, null, false, null, 991);
                } else if (endDealInternalAction2.equals(EndDealInternalAction.InvalidForm.f122317b)) {
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, null, null, null, false, null, 1021);
                } else if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateForm) {
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, ((EndDealInternalAction.UpdateForm) endDealInternalAction2).f122334b, null, null, false, null, 991);
                } else if (endDealInternalAction2.equals(EndDealInternalAction.SubmitFormFinished.f122325b)) {
                    cVarA = Hp.c.a(cVarA, false, false, false, null, null, null, null, null, false, null, 1021);
                } else if (!(endDealInternalAction2 instanceof EndDealInternalAction.Close) && !(endDealInternalAction2 instanceof EndDealInternalAction.OpenDeeplink)) {
                    if (!(endDealInternalAction2 instanceof EndDealInternalAction.RestoreState)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EndDealSavedState endDealSavedState = ((EndDealInternalAction.RestoreState) endDealInternalAction2).f122322b;
                    cVarA = Hp.c.a(cVarA, false, false, false, endDealSavedState.f122279b, endDealSavedState.f122280c, endDealSavedState.f122281d, endDealSavedState.f122282e, endDealSavedState.f122283f, false, null, 518);
                }
            }
        }
        return this.f122352b.a(cVarA);
    }
}
