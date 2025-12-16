package androidx.work.impl.constraints;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: NetworkState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/d;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f55692a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55693b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55694c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f55695d;

    public d(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f55692a = z12;
        this.f55693b = z13;
        this.f55694c = z14;
        this.f55695d = z15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f55692a == dVar.f55692a && this.f55693b == dVar.f55693b && this.f55694c == dVar.f55694c && this.f55695d == dVar.f55695d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55695d) + r.i(r.i(Boolean.hashCode(this.f55692a) * 31, 31, this.f55693b), 31, this.f55694c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f55692a);
        sb2.append(", isValidated=");
        sb2.append(this.f55693b);
        sb2.append(", isMetered=");
        sb2.append(this.f55694c);
        sb2.append(", isNotRoaming=");
        return r.x(sb2, this.f55695d, ')');
    }
}
