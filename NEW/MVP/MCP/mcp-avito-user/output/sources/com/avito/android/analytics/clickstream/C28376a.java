package com.avito.android.analytics.clickstream;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: AnalyticMetricsFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/clickstream/a;", "", "<init>", "()V", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.clickstream.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28376a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NumberFormat f89777a;

    public C28376a() {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f89777a = numberInstance;
        numberInstance.setGroupingUsed(false);
        numberInstance.setMinimumFractionDigits(0);
        numberInstance.setMaximumFractionDigits(6);
    }

    @Y61.k
    public final String a(long j12, @Y61.k TimeUnit timeUnit) {
        return this.f89777a.format(timeUnit.toMillis(j12) / 1000.0d);
    }
}
