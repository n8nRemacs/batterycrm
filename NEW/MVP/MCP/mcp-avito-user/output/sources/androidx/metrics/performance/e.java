package androidx.metrics.performance;

import kotlin.Metadata;

/* compiled from: FrameDataApi31.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/e;", "Landroidx/metrics/performance/d;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: f, reason: collision with root package name */
    public long f52700f;

    /* renamed from: g, reason: collision with root package name */
    public long f52701g;

    public e() {
        throw null;
    }

    @Override // androidx.metrics.performance.d, androidx.metrics.performance.c
    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof e) && super.equals(obj)) {
            e eVar = (e) obj;
            if (this.f52700f == eVar.f52700f && this.f52701g == eVar.f52701g) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.metrics.performance.d, androidx.metrics.performance.c
    public final int hashCode() {
        return Long.hashCode(this.f52701g) + (Long.hashCode(this.f52700f) * 31) + (super.hashCode() * 31);
    }

    @Override // androidx.metrics.performance.d, androidx.metrics.performance.c
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FrameData(frameStartNanos=");
        sb2.append(this.f52696b);
        sb2.append(", frameDurationUiNanos=");
        sb2.append(this.f52697c);
        sb2.append(", frameDurationCpuNanos=");
        sb2.append(this.f52699e);
        sb2.append(", frameDurationTotalNanos=");
        sb2.append(this.f52700f);
        sb2.append(", frameOverrunNanos=");
        sb2.append(this.f52701g);
        sb2.append(", isJank=");
        sb2.append(this.f52698d);
        sb2.append(", states=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f52695a, ')');
    }
}
