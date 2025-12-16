package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import OF0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.entity.TrxPromoGoodsDatePickerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsDatePickerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/mvi/entity/TrxPromoGoodsDatePickerInternalAction;", "LOF0/b;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<TrxPromoGoodsDatePickerInternalAction, OF0.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final OF0.b b(TrxPromoGoodsDatePickerInternalAction trxPromoGoodsDatePickerInternalAction) {
        TrxPromoGoodsDatePickerInternalAction trxPromoGoodsDatePickerInternalAction2 = trxPromoGoodsDatePickerInternalAction;
        if (trxPromoGoodsDatePickerInternalAction2 instanceof TrxPromoGoodsDatePickerInternalAction.Error) {
            return new b.c(((TrxPromoGoodsDatePickerInternalAction.Error) trxPromoGoodsDatePickerInternalAction2).f303723b);
        }
        if (trxPromoGoodsDatePickerInternalAction2 instanceof TrxPromoGoodsDatePickerInternalAction.HandleDeeplink) {
            return new b.C0782b(((TrxPromoGoodsDatePickerInternalAction.HandleDeeplink) trxPromoGoodsDatePickerInternalAction2).f303724b);
        }
        if (trxPromoGoodsDatePickerInternalAction2 instanceof TrxPromoGoodsDatePickerInternalAction.CloseWithSelectedDate) {
            return new b.a(((TrxPromoGoodsDatePickerInternalAction.CloseWithSelectedDate) trxPromoGoodsDatePickerInternalAction2).f303720b);
        }
        return null;
    }
}
