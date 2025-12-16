package shark.internal.hppc;

import Y61.l;
import kotlin.Metadata;
import shark.internal.X;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/hppc/b;", "B", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class b<B> {

    /* renamed from: a, reason: collision with root package name */
    public final int f438526a;

    /* renamed from: b, reason: collision with root package name */
    public final X f438527b;

    public b(int i12, X x12) {
        this.f438526a = i12;
        this.f438527b = x12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f438526a == bVar.f438526a && this.f438527b.equals(bVar.f438527b);
    }

    public final int hashCode() {
        return this.f438527b.hashCode() + (this.f438526a * 31);
    }

    @Y61.k
    public final String toString() {
        return "IntObjectPair(first=" + this.f438526a + ", second=" + this.f438527b + ")";
    }
}
