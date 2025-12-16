package com.avito.android.analytics.screens.tracker;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: AnalyticMetricsFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/a;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28479a {
    public C28479a() {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setGroupingUsed(false);
        numberInstance.setMinimumFractionDigits(0);
        numberInstance.setMaximumFractionDigits(6);
    }

    @Y61.k
    public static String a(@Y61.l Integer num) {
        if (num == null || num.intValue() <= 0) {
            return "etc";
        }
        if (num.intValue() >= 5) {
            return "more";
        }
        u0 u0Var = u0.f406856a;
        return String.format("%03d", Arrays.copyOf(new Object[]{num}, 1));
    }
}
