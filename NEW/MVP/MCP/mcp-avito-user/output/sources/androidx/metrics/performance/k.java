package androidx.metrics.performance;

import android.view.FrameMetrics;
import j.X;
import kotlin.Metadata;

/* compiled from: JankStatsApi26Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/k;", "Landroidx/metrics/performance/j;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public class k extends j {
    @Override // androidx.metrics.performance.j
    public final long c(@Y61.k FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(10);
    }
}
