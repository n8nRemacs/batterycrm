package W80;

import V80.h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/f;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h.c f17792a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17793b;

    public f(@k h.c cVar, boolean z12) {
        this.f17792a = cVar;
        this.f17793b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f17792a, fVar.f17792a) && this.f17793b == fVar.f17793b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17793b) + (this.f17792a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionInfoPeriodItemBlock(period=");
        sb2.append(this.f17792a);
        sb2.append(", selected=");
        return r.x(sb2, this.f17793b, ')');
    }
}
