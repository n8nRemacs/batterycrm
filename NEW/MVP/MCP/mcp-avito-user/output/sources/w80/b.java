package W80;

import V80.h;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h.a f17774a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f17775b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final c f17776c;

    public b(@k h.a aVar, @l c cVar, @l c cVar2) {
        this.f17774a = aVar;
        this.f17775b = cVar;
        this.f17776c = cVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f17774a, bVar.f17774a) && L.f(this.f17775b, bVar.f17775b) && L.f(this.f17776c, bVar.f17776c);
    }

    public final int hashCode() {
        int iHashCode = this.f17774a.hashCode() * 31;
        c cVar = this.f17775b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f17776c;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PositionInfoBottomBlock(item=" + this.f17774a + ", leftButton=" + this.f17775b + ", rightButton=" + this.f17776c + ')';
    }
}
