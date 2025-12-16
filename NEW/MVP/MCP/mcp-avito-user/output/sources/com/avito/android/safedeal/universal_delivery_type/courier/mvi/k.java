package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Qn0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeCourierOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "LQn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements t<UniversalDeliveryTypeCourierInternalAction, Qn0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Qn0.b b(UniversalDeliveryTypeCourierInternalAction universalDeliveryTypeCourierInternalAction) {
        UniversalDeliveryTypeCourierInternalAction universalDeliveryTypeCourierInternalAction2 = universalDeliveryTypeCourierInternalAction;
        if (universalDeliveryTypeCourierInternalAction2 instanceof UniversalDeliveryTypeCourierInternalAction.ExecuteRequestFailed) {
            return new b.a(((UniversalDeliveryTypeCourierInternalAction.ExecuteRequestFailed) universalDeliveryTypeCourierInternalAction2).f256533b);
        }
        return null;
    }
}
