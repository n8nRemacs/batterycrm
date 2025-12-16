package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import Ky0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LastMinuteOfferOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "LKy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<LastMinuteOfferInternalAction, Ky0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ky0.c b(LastMinuteOfferInternalAction lastMinuteOfferInternalAction) {
        LastMinuteOfferInternalAction lastMinuteOfferInternalAction2 = lastMinuteOfferInternalAction;
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.CloseScreen) {
            LastMinuteOfferInternalAction.CloseScreen closeScreen = (LastMinuteOfferInternalAction.CloseScreen) lastMinuteOfferInternalAction2;
            return new c.b(closeScreen.f287929b, closeScreen.f287930c);
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ShowToast) {
            LastMinuteOfferInternalAction.ShowToast showToast = (LastMinuteOfferInternalAction.ShowToast) lastMinuteOfferInternalAction2;
            return new c.C0601c(showToast.f287936b, showToast.f287937c);
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.OpenKeyboard) {
            return new c.a(((LastMinuteOfferInternalAction.OpenKeyboard) lastMinuteOfferInternalAction2).f287931b);
        }
        return null;
    }
}
