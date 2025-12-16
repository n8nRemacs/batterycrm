package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import Ky0.C14362a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.LastMinuteOfferDiscount;
import com.avito.android.remote.model.LastMinuteOfferOption;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LastMinuteOfferViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/o;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/n;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements n {

    /* compiled from: LastMinuteOfferViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LastMinuteOfferState.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LastMinuteOfferState.LoadingState loadingState = LastMinuteOfferState.LoadingState.f287946b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LastMinuteOfferState.LoadingState loadingState2 = LastMinuteOfferState.LoadingState.f287946b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.str_calendar.seller.last_minute_offer.mvi.n
    @Y61.k
    public final LastMinuteOfferState a(@Y61.k LastMinuteOfferState lastMinuteOfferState) {
        com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a c8652a;
        int iOrdinal = lastMinuteOfferState.f287939b.ordinal();
        if (iOrdinal != 0) {
            boolean z12 = true;
            if (iOrdinal == 1) {
                StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse = lastMinuteOfferState.f287940c;
                if (strSellerCalendarLastMinuteOfferResponse == null) {
                    c8652a = a.b.f287960a;
                } else {
                    if (!strSellerCalendarLastMinuteOfferResponse.getDiscount().isEnabled()) {
                        if (L.f(lastMinuteOfferState.f287941d, Boolean.valueOf(strSellerCalendarLastMinuteOfferResponse.getDiscount().isEnabled()))) {
                            z12 = false;
                        }
                    }
                    boolean z13 = z12;
                    UniversalImage image = strSellerCalendarLastMinuteOfferResponse.getImage();
                    String title = strSellerCalendarLastMinuteOfferResponse.getTitle();
                    String description = strSellerCalendarLastMinuteOfferResponse.getDescription();
                    LastMinuteOfferDiscount discount = strSellerCalendarLastMinuteOfferResponse.getDiscount();
                    boolean zIsEnabled = discount.isEnabled();
                    String enabledText = discount.getEnabledText();
                    String title2 = discount.getTitle();
                    String title3 = discount.getLimits().getTitle();
                    int value = discount.getValue();
                    String strValueOf = discount.getValue() != 0 ? String.valueOf(discount.getValue()) : "";
                    List<LastMinuteOfferOption> options = discount.getOptions();
                    ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
                    Iterator it = options.iterator();
                    while (it.hasNext()) {
                        LastMinuteOfferOption lastMinuteOfferOption = (LastMinuteOfferOption) it.next();
                        arrayList.add(new Ky0.d(lastMinuteOfferOption.getValue(), lastMinuteOfferOption.getTitle(), lastMinuteOfferOption.isSelected()));
                        it = it;
                        z13 = z13;
                    }
                    c8652a = new a.C8652a(image, title, description, new C14362a(zIsEnabled, enabledText, title2, title3, value, strValueOf, arrayList), strSellerCalendarLastMinuteOfferResponse.getButtonText(), z13, lastMinuteOfferState.f287942e, lastMinuteOfferState.f287943f, lastMinuteOfferState.f287944g);
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c8652a = a.b.f287960a;
            }
        } else {
            c8652a = a.c.f287961a;
        }
        return LastMinuteOfferState.a(lastMinuteOfferState, null, null, null, false, false, null, c8652a, 63);
    }
}
