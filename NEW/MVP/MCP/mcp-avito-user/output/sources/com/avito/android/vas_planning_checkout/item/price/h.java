package com.avito.android.vas_planning_checkout.item.price;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanPriceFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/price/h;", "Lcom/avito/android/vas_planning_checkout/item/price/g;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f322981a;

    @Inject
    public h(@Y61.k Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f322981a = decimalFormat;
    }

    @Override // com.avito.android.vas_planning_checkout.item.price.g
    @Y61.k
    public final String a(long j12) {
        return this.f322981a.format(j12);
    }
}
