package androidx.metrics.performance;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: FrameDataApi24.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/d;", "Landroidx/metrics/performance/c;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public long f52699e;

    public d(@Y61.k ArrayList arrayList) {
        super(arrayList);
        this.f52699e = 0L;
    }

    @Override // androidx.metrics.performance.c
    public boolean equals(@Y61.l Object obj) {
        return (obj instanceof d) && super.equals(obj) && this.f52699e == ((d) obj).f52699e;
    }

    @Override // androidx.metrics.performance.c
    public int hashCode() {
        return Long.hashCode(this.f52699e) + (super.hashCode() * 31);
    }

    @Override // androidx.metrics.performance.c
    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FrameData(frameStartNanos=");
        sb2.append(this.f52696b);
        sb2.append(", frameDurationUiNanos=");
        sb2.append(this.f52697c);
        sb2.append(", frameDurationCpuNanos=");
        sb2.append(this.f52699e);
        sb2.append(", isJank=");
        sb2.append(this.f52698d);
        sb2.append(", states=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f52695a, ')');
    }
}
