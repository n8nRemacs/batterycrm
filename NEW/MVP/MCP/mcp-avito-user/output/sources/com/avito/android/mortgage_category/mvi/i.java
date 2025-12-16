package com.avito.android.mortgage_category.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageCategoryReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "LP10/d;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements u<MortgageCategoryInternalAction, P10.d> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final P10.d a(MortgageCategoryInternalAction mortgageCategoryInternalAction, P10.d dVar) {
        MortgageCategoryInternalAction mortgageCategoryInternalAction2 = mortgageCategoryInternalAction;
        P10.d dVar2 = dVar;
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.MortgageCategoryLoadingStarted) {
            return P10.d.a(dVar2, null, true, 7);
        }
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.MortgageCategoryLoadingCompleted) {
            return P10.d.a(dVar2, ((MortgageCategoryInternalAction.MortgageCategoryLoadingCompleted) mortgageCategoryInternalAction2).f204948b, false, 3);
        }
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.MortgageCategoryLoadingFailed) {
            return P10.d.a(dVar2, null, false, 3);
        }
        boolean z12 = mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.SetArchivedLoadingStarted;
        O10.b bVar = dVar2.f12780d;
        if (z12) {
            return P10.d.a(dVar2, bVar != null ? bVar.L9(true) : null, false, 11);
        }
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.SetArchivedLoadingCompleted) {
            return P10.d.a(dVar2, bVar != null ? bVar.L9(false) : null, false, 11);
        }
        if (mortgageCategoryInternalAction2 instanceof MortgageCategoryInternalAction.SetArchivedLoadingFailed) {
            return P10.d.a(dVar2, bVar != null ? bVar.L9(false) : null, false, 11);
        }
        return dVar2;
    }
}
