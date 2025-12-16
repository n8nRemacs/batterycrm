package CV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrikethroughTextState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f2193a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2194b;

    public a(String str, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? true : z12;
        this.f2193a = str;
        this.f2194b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f2193a, aVar.f2193a) && this.f2194b == aVar.f2194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2194b) + (this.f2193a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrikethroughTextState(text=");
        sb2.append(this.f2193a);
        sb2.append(", strikethroughVisible=");
        return r.x(sb2, this.f2194b, ')');
    }
}
