package com.avito.android.loyalty.ui.quality_service.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.loyalty.ui.quality_service.mvi.entity.QualityServiceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import pX.InterfaceC47026b;

/* compiled from: QualityServiceEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/loyalty/ui/quality_service/mvi/entity/QualityServiceInternalAction;", "LpX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements t<QualityServiceInternalAction, InterfaceC47026b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47026b b(QualityServiceInternalAction qualityServiceInternalAction) {
        InterfaceC47026b eVar;
        QualityServiceInternalAction qualityServiceInternalAction2 = qualityServiceInternalAction;
        if (qualityServiceInternalAction2.equals(QualityServiceInternalAction.Forbidden.f183998b)) {
            return InterfaceC47026b.c.f428580a;
        }
        if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.NavigateToEffectDetails) {
            eVar = new InterfaceC47026b.C12277b(((QualityServiceInternalAction.NavigateToEffectDetails) qualityServiceInternalAction2).f184001b);
        } else if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.OpenPopup) {
            eVar = new InterfaceC47026b.d(((QualityServiceInternalAction.OpenPopup) qualityServiceInternalAction2).f184002b);
        } else if (qualityServiceInternalAction2 instanceof QualityServiceInternalAction.LoadAlert) {
            eVar = new InterfaceC47026b.a(((QualityServiceInternalAction.LoadAlert) qualityServiceInternalAction2).f183999b);
        } else {
            if (!(qualityServiceInternalAction2 instanceof QualityServiceInternalAction.ShowAlert)) {
                return null;
            }
            eVar = new InterfaceC47026b.e(((QualityServiceInternalAction.ShowAlert) qualityServiceInternalAction2).f184003b);
        }
        return eVar;
    }
}
