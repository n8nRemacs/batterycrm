package com.avito.android.delivery_abuse.price_reduction.mvi;

import Bv.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceReductionOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "LBv/b;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<PriceReductionInternalAction, Bv.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Bv.b b(PriceReductionInternalAction priceReductionInternalAction) {
        PriceReductionInternalAction priceReductionInternalAction2 = priceReductionInternalAction;
        if (priceReductionInternalAction2 instanceof PriceReductionInternalAction.SelectPrice) {
            PriceReductionInternalAction.SelectPrice selectPrice = (PriceReductionInternalAction.SelectPrice) priceReductionInternalAction2;
            return new b.c(selectPrice.f134904b, selectPrice.f134905c);
        }
        if (priceReductionInternalAction2 instanceof PriceReductionInternalAction.Dismiss) {
            return b.a.f1784a;
        }
        if (priceReductionInternalAction2 instanceof PriceReductionInternalAction.Error) {
            return new b.C0079b(((PriceReductionInternalAction.Error) priceReductionInternalAction2).f134901b);
        }
        return null;
    }
}
