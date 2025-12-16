package com.avito.android.loyalty.ui.criteria.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.loyalty.ui.criteria.mvi.entity.CriteriaInternalAction;
import com.avito.android.remote.error.ApiError;
import iX.AbstractC41357c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CriteriaReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "LiX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements u<CriteriaInternalAction, AbstractC41357c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC41357c a(CriteriaInternalAction criteriaInternalAction, AbstractC41357c abstractC41357c) {
        CriteriaInternalAction criteriaInternalAction2 = criteriaInternalAction;
        AbstractC41357c abstractC41357c2 = abstractC41357c;
        if (criteriaInternalAction2 instanceof CriteriaInternalAction.Content) {
            return new AbstractC41357c.e(((CriteriaInternalAction.Content) criteriaInternalAction2).f183539b);
        }
        if (criteriaInternalAction2 instanceof CriteriaInternalAction.Error) {
            return ((CriteriaInternalAction.Error) criteriaInternalAction2).f183540b.f318522b instanceof ApiError.Forbidden ? AbstractC41357c.C11381c.f398544d : AbstractC41357c.b.f398543d;
        }
        if (criteriaInternalAction2 instanceof CriteriaInternalAction.Loading) {
            return AbstractC41357c.d.f398545d;
        }
        if (criteriaInternalAction2 instanceof CriteriaInternalAction.NavigateToMain ? true : criteriaInternalAction2 instanceof CriteriaInternalAction.NavigateBack ? true : criteriaInternalAction2 instanceof CriteriaInternalAction.OpenUrl ? true : criteriaInternalAction2 instanceof CriteriaInternalAction.OpenDeeplink) {
            return abstractC41357c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
