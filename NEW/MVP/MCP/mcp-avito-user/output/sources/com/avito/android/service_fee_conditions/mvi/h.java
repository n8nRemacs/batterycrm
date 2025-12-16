package com.avito.android.service_fee_conditions.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import qu0.InterfaceC47450b;

/* compiled from: ServiceFeeConditionsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lqu0/b;", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<ServiceFeeConditionsInternalAction, InterfaceC47450b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47450b b(ServiceFeeConditionsInternalAction serviceFeeConditionsInternalAction) {
        ServiceFeeConditionsInternalAction serviceFeeConditionsInternalAction2 = serviceFeeConditionsInternalAction;
        if (serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.Back) {
            return InterfaceC47450b.a.f429474a;
        }
        if (serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.FinishFlow) {
            return InterfaceC47450b.C12343b.f429475a;
        }
        if (serviceFeeConditionsInternalAction2 instanceof ServiceFeeConditionsInternalAction.HandleDeeplink) {
            return new InterfaceC47450b.c();
        }
        return null;
    }
}
