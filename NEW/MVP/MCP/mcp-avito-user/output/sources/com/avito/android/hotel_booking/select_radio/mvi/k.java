package com.avito.android.hotel_booking.select_radio.mvi;

import TI.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectRadioOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "LTI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<SelectRadioInternalAction, TI.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final TI.b b(SelectRadioInternalAction selectRadioInternalAction) {
        SelectRadioInternalAction selectRadioInternalAction2 = selectRadioInternalAction;
        if (selectRadioInternalAction2 instanceof SelectRadioInternalAction.CloseScreen) {
            return b.a.f15517a;
        }
        if (selectRadioInternalAction2 instanceof SelectRadioInternalAction.CloseScreenWithResult) {
            return new b.C1056b(((SelectRadioInternalAction.CloseScreenWithResult) selectRadioInternalAction2).f164036b);
        }
        return null;
    }
}
