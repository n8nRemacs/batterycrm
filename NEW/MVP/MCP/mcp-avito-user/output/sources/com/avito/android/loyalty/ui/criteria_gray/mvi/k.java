package com.avito.android.loyalty.ui.criteria_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import javax.inject.Inject;
import kX.InterfaceC42641b;
import kotlin.Metadata;

/* compiled from: CriteriaGrayOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "LkX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<CriteriaGrayInternalAction, InterfaceC42641b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42641b b(CriteriaGrayInternalAction criteriaGrayInternalAction) {
        InterfaceC42641b dVar;
        CriteriaGrayInternalAction criteriaGrayInternalAction2 = criteriaGrayInternalAction;
        if (criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.NavigateBack) {
            return InterfaceC42641b.a.f406364a;
        }
        if (criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.NavigateToMain) {
            return InterfaceC42641b.C11619b.f406365a;
        }
        if (criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.OpenDeeplink) {
            dVar = new InterfaceC42641b.c(((CriteriaGrayInternalAction.OpenDeeplink) criteriaGrayInternalAction2).f183623b);
        } else {
            if (!(criteriaGrayInternalAction2 instanceof CriteriaGrayInternalAction.OpenUrl)) {
                return null;
            }
            dVar = new InterfaceC42641b.d(((CriteriaGrayInternalAction.OpenUrl) criteriaGrayInternalAction2).f183624b);
        }
        return dVar;
    }
}
