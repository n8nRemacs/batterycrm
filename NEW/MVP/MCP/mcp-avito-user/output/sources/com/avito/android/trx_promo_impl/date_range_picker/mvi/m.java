package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import SF0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.entity.TrxPromoDateRangePickerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoDateRangePickerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_impl/date_range_picker/mvi/entity/TrxPromoDateRangePickerInternalAction;", "LSF0/b;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements t<TrxPromoDateRangePickerInternalAction, SF0.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final SF0.b b(TrxPromoDateRangePickerInternalAction trxPromoDateRangePickerInternalAction) {
        TrxPromoDateRangePickerInternalAction trxPromoDateRangePickerInternalAction2 = trxPromoDateRangePickerInternalAction;
        if (trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.HandleDeeplink) {
            return new b.C1004b(((TrxPromoDateRangePickerInternalAction.HandleDeeplink) trxPromoDateRangePickerInternalAction2).f304043b);
        }
        if (trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.Error) {
            return new b.c(((TrxPromoDateRangePickerInternalAction.Error) trxPromoDateRangePickerInternalAction2).f304042b);
        }
        if (!(trxPromoDateRangePickerInternalAction2 instanceof TrxPromoDateRangePickerInternalAction.CloseWithSelectedDates)) {
            return null;
        }
        TrxPromoDateRangePickerInternalAction.CloseWithSelectedDates closeWithSelectedDates = (TrxPromoDateRangePickerInternalAction.CloseWithSelectedDates) trxPromoDateRangePickerInternalAction2;
        return new b.a(closeWithSelectedDates.f304037b, closeWithSelectedDates.f304038c);
    }
}
