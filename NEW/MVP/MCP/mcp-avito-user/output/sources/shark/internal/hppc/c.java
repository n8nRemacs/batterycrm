package shark.internal.hppc;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/hppc/c;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f438528a;

    /* renamed from: b, reason: collision with root package name */
    public final long f438529b;

    public c(long j12, long j13) {
        this.f438528a = j12;
        this.f438529b = j13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f438528a == cVar.f438528a && this.f438529b == cVar.f438529b;
    }

    public final int hashCode() {
        long j12 = this.f438528a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        long j13 = this.f438529b;
        return i12 + ((int) ((j13 >>> 32) ^ j13));
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LongLongPair(first=");
        sb2.append(this.f438528a);
        sb2.append(", second=");
        return AK.c.j(this.f438529b, ")", sb2);
    }
}
