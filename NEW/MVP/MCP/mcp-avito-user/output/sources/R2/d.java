package R2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TabGroupIndicatorData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LR2/d;", "", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f14082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14083b;

    public d(int i12, int i13) {
        this.f14082a = i12;
        this.f14083b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14082a == dVar.f14082a && this.f14083b == dVar.f14083b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14083b) + (Integer.hashCode(this.f14082a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(x=");
        sb2.append(this.f14082a);
        sb2.append(", width=");
        return r.t(sb2, this.f14083b, ')');
    }
}
