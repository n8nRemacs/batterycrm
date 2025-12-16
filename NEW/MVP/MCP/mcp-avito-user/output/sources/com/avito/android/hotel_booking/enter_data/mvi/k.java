package com.avito.android.hotel_booking.enter_data.mvi;

import QI.b;
import com.avito.android.hotel_booking.enter_data.mvi.entity.EnterDataInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EnterDataOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "LQI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements com.avito.android.arch.mvi.t<EnterDataInternalAction, QI.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final QI.b b(EnterDataInternalAction enterDataInternalAction) {
        EnterDataInternalAction enterDataInternalAction2 = enterDataInternalAction;
        if (enterDataInternalAction2 instanceof EnterDataInternalAction.CloseScreen) {
            return b.a.f13661a;
        }
        if (enterDataInternalAction2 instanceof EnterDataInternalAction.CloseScreenWithResult) {
            return new b.C0897b(((EnterDataInternalAction.CloseScreenWithResult) enterDataInternalAction2).f163571b);
        }
        return null;
    }
}
