package com.avito.android.loyalty.ui.criteria_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kX.AbstractC42642c;
import kotlin.Metadata;

/* compiled from: CriteriaGrayReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "LkX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<CriteriaGrayInternalAction, AbstractC42642c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC42642c a(CriteriaGrayInternalAction criteriaGrayInternalAction, AbstractC42642c abstractC42642c) {
        CriteriaGrayInternalAction criteriaGrayInternalAction2 = criteriaGrayInternalAction;
        return criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.Loading ? AbstractC42642c.e.f406373d : criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.Content ? new AbstractC42642c.b(((CriteriaGrayInternalAction.Content) criteriaGrayInternalAction2).f183618b) : criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.Error ? ((CriteriaGrayInternalAction.Error) criteriaGrayInternalAction2).f183619b.f318522b instanceof ApiError.Forbidden ? AbstractC42642c.d.f406372d : AbstractC42642c.C11620c.f406371d : abstractC42642c;
    }
}
