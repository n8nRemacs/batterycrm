package androidx.metrics.performance;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FrameData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/c;", "", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52695a;

    /* renamed from: b, reason: collision with root package name */
    public long f52696b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f52697c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52698d = false;

    public c(@Y61.k ArrayList arrayList) {
        this.f52695a = arrayList;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f52696b == cVar.f52696b && this.f52697c == cVar.f52697c && this.f52698d == cVar.f52698d && L.f(this.f52695a, cVar.f52695a);
    }

    public int hashCode() {
        return this.f52695a.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.g(Long.hashCode(this.f52696b) * 31, 31, this.f52697c), 31, this.f52698d);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FrameData(frameStartNanos=");
        sb2.append(this.f52696b);
        sb2.append(", frameDurationUiNanos=");
        sb2.append(this.f52697c);
        sb2.append(", isJank=");
        sb2.append(this.f52698d);
        sb2.append(", states=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f52695a, ')');
    }
}
