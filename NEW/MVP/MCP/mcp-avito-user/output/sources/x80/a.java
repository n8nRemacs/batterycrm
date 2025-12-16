package X80;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f18653a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final V80.d f18655c;

    public a(@Y61.k String str, boolean z12, @Y61.l V80.d dVar) {
        this.f18653a = str;
        this.f18654b = z12;
        this.f18655c = dVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f18653a, aVar.f18653a) && this.f18654b == aVar.f18654b && L.f(this.f18655c, aVar.f18655c);
    }

    public final int hashCode() {
        int i12 = r.i(this.f18653a.hashCode() * 31, 31, this.f18654b);
        V80.d dVar = this.f18655c;
        return i12 + (dVar == null ? 0 : dVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ChartDynamicBlock(blockId=" + this.f18653a + ", isLoading=" + this.f18654b + ", data=" + this.f18655c + ')';
    }
}
