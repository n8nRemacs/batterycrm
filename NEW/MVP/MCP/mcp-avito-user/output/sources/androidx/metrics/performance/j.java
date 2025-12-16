package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.b;
import j.X;
import kotlin.Metadata;

/* compiled from: JankStatsApi24Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/j;", "Landroidx/metrics/performance/g;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public class j extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f52718n = 0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Window f52719h;

    /* renamed from: i, reason: collision with root package name */
    public long f52720i;

    /* renamed from: j, reason: collision with root package name */
    public long f52721j;

    /* renamed from: k, reason: collision with root package name */
    public long f52722k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final d f52723l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final i f52724m;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.metrics.performance.i] */
    public j(@Y61.k final f fVar, @Y61.k View view, @Y61.k Window window) {
        super(fVar, view);
        this.f52719h = window;
        this.f52723l = new d(this.f52710f);
        this.f52724m = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.metrics.performance.i
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i12) {
                int i13 = j.f52718n;
                j jVar = this.f52716a;
                long jMax = Math.max(jVar.c(frameMetrics), jVar.f52722k);
                if (jMax < jVar.f52721j || jMax == jVar.f52720i) {
                    return;
                }
                float fA2 = jVar.a(frameMetrics);
                f fVar2 = fVar;
                fVar2.f52703a.a(jVar.b(jMax, (long) (fA2 * fVar2.f52706d), frameMetrics));
                jVar.f52720i = jMax;
            }
        };
    }

    public long a(@Y61.k FrameMetrics frameMetrics) {
        View view = this.f52707c.get();
        b.f52693b.getClass();
        return b.a.a(view);
    }

    @Y61.k
    public d b(long j12, long j13, @Y61.k FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j14 = j12 + metric;
        this.f52722k = j14;
        p pVar = this.f52709e.f52734a;
        if (pVar != null) {
            pVar.b(j12, j14, this.f52710f);
        }
        boolean z12 = metric > j13;
        long metric2 = frameMetrics.getMetric(8);
        d dVar = this.f52723l;
        dVar.f52696b = j12;
        dVar.f52697c = metric;
        dVar.f52698d = z12;
        dVar.f52699e = metric2;
        return dVar;
    }

    public long c(@Y61.k FrameMetrics frameMetrics) {
        b.f52693b.getClass();
        return ((Long) b.f52694c.get(this.f52708d)).longValue();
    }
}
