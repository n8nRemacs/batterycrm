package com.avito.android.hotel_booking.select_single_value.mvi;

import VI.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.hotel_booking.select_single_value.mvi.entity.SelectSingleValueInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectSingleValueOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "LVI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<SelectSingleValueInternalAction, VI.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final VI.b b(SelectSingleValueInternalAction selectSingleValueInternalAction) {
        SelectSingleValueInternalAction selectSingleValueInternalAction2 = selectSingleValueInternalAction;
        if (selectSingleValueInternalAction2 instanceof SelectSingleValueInternalAction.CloseScreen) {
            return b.a.f17052a;
        }
        if (selectSingleValueInternalAction2 instanceof SelectSingleValueInternalAction.CloseScreenWithResult) {
            return new b.C1171b(((SelectSingleValueInternalAction.CloseScreenWithResult) selectSingleValueInternalAction2).f164108b);
        }
        return null;
    }
}
