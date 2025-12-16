package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.user_stats.model.extended_user_stats.MetricItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorTabReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m {
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(long r4, @Y61.l java.lang.String r6, @Y61.l java.lang.String r7) {
        /*
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            java.lang.String r4 = java.lang.String.valueOf(r4)
        Lc:
            r3 = r1
            r1 = r4
            r4 = r3
            goto L64
        L10:
            java.lang.String r0 = "money"
            boolean r0 = kotlin.jvm.internal.L.f(r6, r0)
            r2 = 1
            if (r0 == 0) goto L24
            double r4 = com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.m.a(r4)
            java.lang.String r1 = com.avito.android.util.C5.b(r4, r2)
            java.lang.String r4 = "₽"
            goto L64
        L24:
            java.lang.String r0 = "conversion"
            boolean r6 = kotlin.jvm.internal.L.f(r6, r0)
            if (r6 == 0) goto L57
            double r4 = com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.m.a(r4)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r6.<init>(r4)
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r4 = r6.setScale(r2, r4)
            double r4 = r4.doubleValue()
            java.lang.String r4 = com.avito.android.util.C5.b(r4, r2)
            int r5 = r4.length()
            r6 = 2
            if (r5 <= r6) goto L53
            r5 = 0
            java.lang.String r4 = androidx.compose.ui.graphics.colorspace.e.h(r2, r5, r4)
        L53:
            r1 = r4
            java.lang.String r4 = "%"
            goto L64
        L57:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = 32
            java.lang.String r4 = com.avito.android.util.C5.e(r4, r5)
            if (r4 != 0) goto Lc
            r4 = r1
        L64:
            java.lang.StringBuilder r5 = androidx.compose.foundation.H.r(r1)
            java.lang.String r6 = " "
            if (r7 != 0) goto L71
            java.lang.String r4 = r6.concat(r4)
            goto L75
        L71:
            java.lang.String r4 = r6.concat(r7)
        L75:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.m.a(long, java.lang.String, java.lang.String):java.lang.String");
    }

    @Y61.k
    public static final String b(@Y61.l Long l12, @Y61.l MetricItem metricItem) {
        if (l12 == null) {
            return "—";
        }
        return a(l12.longValue(), metricItem != null ? metricItem.getType() : null, metricItem != null ? metricItem.getSymbol() : null);
    }
}
