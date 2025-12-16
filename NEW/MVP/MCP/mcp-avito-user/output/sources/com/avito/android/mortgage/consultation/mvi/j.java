package com.avito.android.mortgage.consultation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MortgageConsultationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "LXZ/d;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements u<MortgageConsultationInternalAction, XZ.d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final XZ.d a(MortgageConsultationInternalAction mortgageConsultationInternalAction, XZ.d dVar) {
        MortgageConsultationInternalAction mortgageConsultationInternalAction2 = mortgageConsultationInternalAction;
        XZ.d dVar2 = dVar;
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.PhoneUpdated) {
            String str = ((MortgageConsultationInternalAction.PhoneUpdated) mortgageConsultationInternalAction2).f198616b;
            return XZ.d.a(dVar2, null, false, str, !C43066x.K(str) ? false : dVar2.f18917f, null, false, false, 2023);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.ValidationUpdate) {
            MortgageConsultationInternalAction.ValidationUpdate validationUpdate = (MortgageConsultationInternalAction.ValidationUpdate) mortgageConsultationInternalAction2;
            return XZ.d.a(dVar2, null, validationUpdate.f198628c, null, validationUpdate.f198627b, null, false, false, 2027);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.FullNameUpdated) {
            String str2 = ((MortgageConsultationInternalAction.FullNameUpdated) mortgageConsultationInternalAction2).f198615b;
            return XZ.d.a(dVar2, str2, !C43066x.K(str2) ? false : dVar2.f18915d, null, false, null, false, false, 2041);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotsLoadingStarted) {
            return XZ.d.a(dVar2, null, false, "", false, C42784z0.f406748b, false, true, 1863);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotsLoadingCompleted) {
            WZ.c cVar = ((MortgageConsultationInternalAction.SlotsLoadingCompleted) mortgageConsultationInternalAction2).f198621b;
            return XZ.d.a(dVar2, null, false, cVar.f17947a, false, cVar.f17948b, false, false, 1879);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotsLoadingFailed) {
            return XZ.d.a(dVar2, null, false, null, false, null, false, false, 1919);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotAssignLoadingStarted) {
            return XZ.d.a(dVar2, null, false, null, false, null, true, false, 1983);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotAssignLoadingFailed) {
            return XZ.d.a(dVar2, null, false, null, false, null, false, false, 1983);
        }
        if (mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.SlotAssignLoadingCompleted) {
            return XZ.d.a(dVar2, null, false, null, false, null, false, false, 1983);
        }
        boolean z12 = mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.UpdateDaySlot;
        List<WZ.a> list = dVar2.f18918g;
        if (z12) {
            List<WZ.a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (WZ.a aVar : list2) {
                arrayList.add(WZ.a.a(aVar, null, L.f(aVar.f17941c, ((MortgageConsultationInternalAction.UpdateDaySlot) mortgageConsultationInternalAction2).f198625b), 7));
            }
            return XZ.d.a(dVar2, null, false, null, false, arrayList, false, false, 2015);
        }
        if (!(mortgageConsultationInternalAction2 instanceof MortgageConsultationInternalAction.UpdateTimeSlot)) {
            throw new NoWhenBranchMatchedException();
        }
        List<WZ.a> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        for (WZ.a aVarA : list3) {
            String str3 = aVarA.f17941c;
            WZ.a aVar2 = dVar2.f18924m;
            if (L.f(str3, aVar2 != null ? aVar2.f17941c : null)) {
                List<WZ.b> list4 = aVarA.f17942d;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (WZ.b bVar : list4) {
                    arrayList3.add(new WZ.b(bVar.f17944b, bVar.f17945c, L.f(bVar.f17945c, ((MortgageConsultationInternalAction.UpdateTimeSlot) mortgageConsultationInternalAction2).f198626b)));
                }
                aVarA = WZ.a.a(aVarA, arrayList3, false, 11);
            }
            arrayList2.add(aVarA);
        }
        return XZ.d.a(dVar2, null, false, null, false, arrayList2, false, false, 2015);
    }
}
