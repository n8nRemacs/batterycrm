package GV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimeLineState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGV/b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a> f6517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6518b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6519c;

    public b(int i12, @k List list, boolean z12) {
        this.f6517a = list;
        this.f6518b = i12;
        this.f6519c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f6517a, bVar.f6517a) && this.f6518b == bVar.f6518b && this.f6519c == bVar.f6519c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6519c) + r.e(this.f6518b, this.f6517a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeLineState(items=");
        sb2.append(this.f6517a);
        sb2.append(", currentItemIndex=");
        sb2.append(this.f6518b);
        sb2.append(", scrollToCurrentIndex=");
        return r.x(sb2, this.f6519c, ')');
    }

    public /* synthetic */ b(List list, int i12, boolean z12, int i13, C42822w c42822w) {
        this((i13 & 2) != 0 ? 0 : i12, list, (i13 & 4) != 0 ? true : z12);
    }
}
