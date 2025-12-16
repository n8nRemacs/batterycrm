package com.avito.android.str_calendar.seller.last_minute_offer;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LastMinuteOfferResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/l;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/k;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287908a = com.avito.android.printable_text.b.c(R.string.seller_calendar_last_minute_offer_discount_applied_text, new Serializable[0]);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287909b = com.avito.android.printable_text.b.c(R.string.str_has_error_occurred, new Serializable[0]);

    @Inject
    public l() {
    }

    @Override // com.avito.android.str_calendar.seller.last_minute_offer.k
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final PrintableText getF287909b() {
        return this.f287909b;
    }

    @Override // com.avito.android.str_calendar.seller.last_minute_offer.k
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final PrintableText getF287908a() {
        return this.f287908a;
    }
}
