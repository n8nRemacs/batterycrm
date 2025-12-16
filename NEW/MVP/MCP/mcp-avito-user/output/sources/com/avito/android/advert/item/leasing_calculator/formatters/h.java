package com.avito.android.advert.item.leasing_calculator.formatters;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: AdvertLeasingMonthFormatter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/formatters/h;", "Lcom/avito/android/advert/item/leasing_calculator/formatters/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements g {
    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(String str) {
        Integer numY0;
        String str2 = str;
        if (str2 == null || (numY0 = C43066x.y0(new C43059p("[^0-9]").f(str2, ""))) == null) {
            return "";
        }
        numY0.intValue();
        throw null;
    }
}
