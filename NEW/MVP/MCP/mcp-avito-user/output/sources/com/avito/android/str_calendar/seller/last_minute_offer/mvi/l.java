package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.LastMinuteOfferDiscount;
import com.avito.android.remote.model.LastMinuteOfferOption;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LastMinuteOfferReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<LastMinuteOfferInternalAction, LastMinuteOfferState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f287974b;

    @Inject
    public l(@Y61.k n nVar) {
        this.f287974b = nVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final LastMinuteOfferState a(LastMinuteOfferInternalAction lastMinuteOfferInternalAction, LastMinuteOfferState lastMinuteOfferState) {
        LastMinuteOfferInternalAction lastMinuteOfferInternalAction2 = lastMinuteOfferInternalAction;
        LastMinuteOfferState lastMinuteOfferState2 = lastMinuteOfferState;
        boolean z12 = lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ShowContent;
        n nVar = this.f287974b;
        if (z12) {
            LastMinuteOfferState.LoadingState loadingState = LastMinuteOfferState.LoadingState.f287947c;
            StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse = ((LastMinuteOfferInternalAction.ShowContent) lastMinuteOfferInternalAction2).f287932b;
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, loadingState, strSellerCalendarLastMinuteOfferResponse, Boolean.valueOf(strSellerCalendarLastMinuteOfferResponse.getDiscount().isEnabled()), false, false, null, null, 120));
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ShowError) {
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, LastMinuteOfferState.LoadingState.f287948d, null, null, false, false, null, null, 124));
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.StartLoading) {
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, LastMinuteOfferState.LoadingState.f287946b, null, null, false, false, null, null, 124));
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.OpenKeyboard) {
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, null, null, null, !((LastMinuteOfferInternalAction.OpenKeyboard) lastMinuteOfferInternalAction2).f287931b, false, null, null, 119));
        }
        boolean z13 = lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.CheckSwitchToggle;
        StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse2 = lastMinuteOfferState2.f287940c;
        if (z13) {
            return strSellerCalendarLastMinuteOfferResponse2 != null ? nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, null, StrSellerCalendarLastMinuteOfferResponse.copy$default(strSellerCalendarLastMinuteOfferResponse2, null, null, null, LastMinuteOfferDiscount.copy$default(strSellerCalendarLastMinuteOfferResponse2.getDiscount(), ((LastMinuteOfferInternalAction.CheckSwitchToggle) lastMinuteOfferInternalAction2).f287928b, null, null, null, 0, null, 62, null), null, 23, null), null, false, false, "", null, 77)) : lastMinuteOfferState2;
        }
        if (lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ChangeDiscountValue) {
            if (strSellerCalendarLastMinuteOfferResponse2 == null) {
                return lastMinuteOfferState2;
            }
            List<LastMinuteOfferOption> options = strSellerCalendarLastMinuteOfferResponse2.getDiscount().getOptions();
            ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
            for (LastMinuteOfferOption lastMinuteOfferOption : options) {
                arrayList.add(LastMinuteOfferOption.copy$default(lastMinuteOfferOption, 0, null, ((LastMinuteOfferInternalAction.ChangeDiscountValue) lastMinuteOfferInternalAction2).f287926b == lastMinuteOfferOption.getValue(), 3, null));
            }
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, null, StrSellerCalendarLastMinuteOfferResponse.copy$default(strSellerCalendarLastMinuteOfferResponse2, null, null, null, LastMinuteOfferDiscount.copy$default(strSellerCalendarLastMinuteOfferResponse2.getDiscount(), false, null, null, null, ((LastMinuteOfferInternalAction.ChangeDiscountValue) lastMinuteOfferInternalAction2).f287926b, arrayList, 15, null), null, 23, null), null, false, false, "", null, 77));
        }
        if (!(lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ChangeSelectedOption)) {
            if (!(lastMinuteOfferInternalAction2 instanceof LastMinuteOfferInternalAction.ShowInputError)) {
                return lastMinuteOfferState2;
            }
            LastMinuteOfferInternalAction.ShowInputError showInputError = (LastMinuteOfferInternalAction.ShowInputError) lastMinuteOfferInternalAction2;
            showInputError.getClass();
            return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, null, null, null, false, true, showInputError.f287935b, null, 79));
        }
        if (strSellerCalendarLastMinuteOfferResponse2 == null) {
            return lastMinuteOfferState2;
        }
        List<LastMinuteOfferOption> options2 = strSellerCalendarLastMinuteOfferResponse2.getDiscount().getOptions();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(options2, 10));
        for (LastMinuteOfferOption lastMinuteOfferOption2 : options2) {
            arrayList2.add(LastMinuteOfferOption.copy$default(lastMinuteOfferOption2, 0, null, ((LastMinuteOfferInternalAction.ChangeSelectedOption) lastMinuteOfferInternalAction2).f287927b.f9741b == lastMinuteOfferOption2.getValue(), 3, null));
        }
        return nVar.a(LastMinuteOfferState.a(lastMinuteOfferState2, null, StrSellerCalendarLastMinuteOfferResponse.copy$default(strSellerCalendarLastMinuteOfferResponse2, null, null, null, LastMinuteOfferDiscount.copy$default(strSellerCalendarLastMinuteOfferResponse2.getDiscount(), false, null, null, null, ((LastMinuteOfferInternalAction.ChangeSelectedOption) lastMinuteOfferInternalAction2).f287927b.f9741b, arrayList2, 15, null), null, 23, null), null, false, false, null, null, 125));
    }
}
