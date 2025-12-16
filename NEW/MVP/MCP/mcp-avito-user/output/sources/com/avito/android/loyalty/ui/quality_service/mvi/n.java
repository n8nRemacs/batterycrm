package com.avito.android.loyalty.ui.quality_service.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pX.AbstractC47027c;

/* compiled from: QualityServiceReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "LpX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements u<QualityServiceInternalAction, AbstractC47027c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC47027c a(QualityServiceInternalAction qualityServiceInternalAction, AbstractC47027c abstractC47027c) {
        QualityServiceInternalAction qualityServiceInternalAction2 = qualityServiceInternalAction;
        AbstractC47027c abstractC47027c2 = abstractC47027c;
        if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.Error) {
            return ((QualityServiceInternalAction.Error) qualityServiceInternalAction2).f183996b.f318522b instanceof ApiError.Forbidden ? AbstractC47027c.b.f428584b : AbstractC47027c.a.f428583b;
        }
        if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.Loaded) {
            return new AbstractC47027c.C12278c(((QualityServiceInternalAction.Loaded) qualityServiceInternalAction2).f184000b);
        }
        if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.Loading) {
            return AbstractC47027c.d.f428586b;
        }
        if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.LoadAlert ? true : qualityServiceInternalAction2 instanceof QualityServiceInternalAction.ShowAlert ? true : qualityServiceInternalAction2 instanceof QualityServiceInternalAction.OpenPopup ? true : qualityServiceInternalAction2 instanceof QualityServiceInternalAction.NavigateToEffectDetails ? true : qualityServiceInternalAction2.equals(QualityServiceInternalAction.Forbidden.f183998b)) {
            return abstractC47027c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
