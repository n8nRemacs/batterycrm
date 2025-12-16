package com.avito.android.delivery_abuse.price_reduction.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.delivery_abuse.price_reduction.mvi.entity.PriceReductionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceReductionReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/delivery_abuse/price_reduction/mvi/entity/PriceReductionInternalAction;", "LBv/c;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<PriceReductionInternalAction, Bv.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final yv.c f134920b;

    @Inject
    public l(@Y61.k yv.c cVar) {
        this.f134920b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Bv.c a(PriceReductionInternalAction priceReductionInternalAction, Bv.c cVar) {
        PriceReductionInternalAction priceReductionInternalAction2 = priceReductionInternalAction;
        Bv.c cVar2 = cVar;
        if (!(priceReductionInternalAction2 instanceof PriceReductionInternalAction.Content)) {
            return priceReductionInternalAction2 instanceof PriceReductionInternalAction.Dismiss ? cVar2 : priceReductionInternalAction2 instanceof PriceReductionInternalAction.Error ? Bv.c.a(cVar2, 0L, 0L, 0L, false, 7) : priceReductionInternalAction2 instanceof PriceReductionInternalAction.Loading ? Bv.c.a(cVar2, 0L, 0L, 0L, true, 7) : cVar2;
        }
        this.f134920b.c();
        PriceReductionInternalAction.Content content = (PriceReductionInternalAction.Content) priceReductionInternalAction2;
        return Bv.c.a(cVar2, content.f134897b, content.f134898c, content.f134899d, false, 8);
    }
}
