package com.avito.android.free_delivery.mvi;

import UE.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.free_delivery.FreeDeliveryDetails;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FreeDeliveryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/free_delivery/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "LUE/b;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<FreeDeliveryInternalAction, UE.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FreeDeliveryDetails f158807b;

    @Inject
    public l(@Y61.k FreeDeliveryDetails freeDeliveryDetails) {
        this.f158807b = freeDeliveryDetails;
    }

    @Override // com.avito.android.arch.mvi.t
    public final UE.b b(FreeDeliveryInternalAction freeDeliveryInternalAction) {
        int iB2;
        FreeDeliveryInternalAction freeDeliveryInternalAction2 = freeDeliveryInternalAction;
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Dismiss) {
            return b.a.f16308a;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Updated) {
            return b.a.f16308a;
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Error) {
            return new b.C1113b(((FreeDeliveryInternalAction.Error) freeDeliveryInternalAction2).f158786b);
        }
        boolean z12 = freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Input;
        FreeDeliveryDetails freeDeliveryDetails = this.f158807b;
        if (z12) {
            int minDiscount = freeDeliveryDetails.getMinDiscount();
            int maxDiscount = freeDeliveryDetails.getMaxDiscount();
            int i12 = ((FreeDeliveryInternalAction.Input) freeDeliveryInternalAction2).f158789b;
            if (minDiscount > i12 || i12 > maxDiscount) {
                return b.c.f16310a;
            }
        } else if ((freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Slider) && ((iB2 = kotlin.math.b.b(((FreeDeliveryInternalAction.Slider) freeDeliveryInternalAction2).f158791b)) == freeDeliveryDetails.getMaxDiscount() || iB2 == freeDeliveryDetails.getMinDiscount())) {
            return b.c.f16310a;
        }
        return null;
    }
}
