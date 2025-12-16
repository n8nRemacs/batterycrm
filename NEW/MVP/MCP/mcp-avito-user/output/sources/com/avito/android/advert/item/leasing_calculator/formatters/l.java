package com.avito.android.advert.item.leasing_calculator.formatters;

import androidx.compose.runtime.internal.P;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertLeasingPriceFormatter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/formatters/l;", "Lcom/avito/android/advert/item/leasing_calculator/formatters/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f77389a;

    @Inject
    public l(@Y61.k Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f77389a = decimalFormat;
    }

    @Override // com.avito.android.advert.item.leasing_calculator.formatters.k
    @Y61.l
    public final String a(@Y61.l Long l12) {
        if (l12 == null) {
            return null;
        }
        return this.f77389a.format(l12.longValue()) + " ₽";
    }
}
