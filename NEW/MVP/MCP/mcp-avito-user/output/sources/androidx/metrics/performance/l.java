package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import j.X;
import kotlin.Metadata;

/* compiled from: JankStatsApi31Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/l;", "Landroidx/metrics/performance/k;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final e f52725o;

    public l(@Y61.k f fVar, @Y61.k View view, @Y61.k Window window) {
        super(fVar, view, window);
        e eVar = new e(this.f52710f);
        eVar.f52700f = 0L;
        eVar.f52701g = 0L;
        this.f52725o = eVar;
    }

    @Override // androidx.metrics.performance.j
    public final long a(@Y61.k FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // androidx.metrics.performance.j
    public final d b(long j12, long j13, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j14 = j12 + metric;
        this.f52722k = j14;
        p pVar = this.f52709e.f52734a;
        if (pVar != null) {
            pVar.b(j12, j14, this.f52710f);
        }
        boolean z12 = metric > j13;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        e eVar = this.f52725o;
        eVar.f52696b = j12;
        eVar.f52697c = metric;
        eVar.f52698d = z12;
        eVar.f52699e = metric3;
        eVar.f52700f = metric2;
        eVar.f52701g = metric4;
        return eVar;
    }
}
