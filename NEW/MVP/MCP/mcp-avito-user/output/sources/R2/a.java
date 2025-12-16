package R2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabGroupIndicatorData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/a;", "", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f14067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14069c;

    public a(@k d dVar, int i12, int i13) {
        this.f14067a = dVar;
        this.f14068b = i12;
        this.f14069c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f14067a, aVar.f14067a) && this.f14068b == aVar.f14068b && this.f14069c == aVar.f14069c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14069c) + r.e(this.f14068b, this.f14067a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabGroupIndicatorData(selectedTabPosition=");
        sb2.append(this.f14067a);
        sb2.append(", startOffsetPx=");
        sb2.append(this.f14068b);
        sb2.append(", indicatorWidth=");
        return r.t(sb2, this.f14069c, ')');
    }
}
