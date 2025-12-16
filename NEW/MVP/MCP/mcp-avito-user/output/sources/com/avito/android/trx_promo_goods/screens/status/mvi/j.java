package com.avito.android.trx_promo_goods.screens.status.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsStatusReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "LPF0/c;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TrxPromoGoodsStatusInternalAction, PF0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final PF0.c a(TrxPromoGoodsStatusInternalAction trxPromoGoodsStatusInternalAction, PF0.c cVar) {
        TrxPromoGoodsStatusInternalAction trxPromoGoodsStatusInternalAction2 = trxPromoGoodsStatusInternalAction;
        PF0.c cVar2 = cVar;
        if (trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.Loading) {
            return PF0.c.a(cVar2, false, 0, null, null, null, null, null, null, true, 127);
        }
        if (!(trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.Content)) {
            return trxPromoGoodsStatusInternalAction2 instanceof TrxPromoGoodsStatusInternalAction.Error ? PF0.c.a(cVar2, false, 0, null, null, null, null, null, z.l(((TrxPromoGoodsStatusInternalAction.Error) trxPromoGoodsStatusInternalAction2).f303847b), false, 127) : cVar2;
        }
        JF0.g gVar = ((TrxPromoGoodsStatusInternalAction.Content) trxPromoGoodsStatusInternalAction2).f303846b;
        return PF0.c.a(cVar2, false, 0, null, gVar.getImage(), gVar.getTitle(), gVar.getSubtitle(), gVar.getButton(), null, false, 7);
    }
}
