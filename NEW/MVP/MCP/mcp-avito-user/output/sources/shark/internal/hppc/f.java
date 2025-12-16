package shark.internal.hppc;

import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/hppc/f;", "B", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class f<B> {

    /* renamed from: a, reason: collision with root package name */
    public final long f438540a;

    /* renamed from: b, reason: collision with root package name */
    public final B f438541b;

    public f(long j12, B b12) {
        this.f438540a = j12;
        this.f438541b = b12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f438540a == fVar.f438540a && L.f(this.f438541b, fVar.f438541b);
    }

    public final int hashCode() {
        long j12 = this.f438540a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        B b12 = this.f438541b;
        return i12 + (b12 != null ? b12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LongObjectPair(first=");
        sb2.append(this.f438540a);
        sb2.append(", second=");
        return r.o(this.f438541b, ")", sb2);
    }
}
