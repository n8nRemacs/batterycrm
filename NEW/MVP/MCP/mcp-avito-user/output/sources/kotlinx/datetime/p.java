package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.time.d;
import kotlinx.datetime.l;

/* compiled from: Clock.kt */
@kotlin.time.k
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/p;", "Lkotlin/time/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class p implements kotlin.time.d {
    @Override // java.lang.Comparable
    public final int compareTo(kotlin.time.d dVar) {
        return d.a.a(this, dVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            pVar.getClass();
            if (L.f(null, null)) {
                pVar.getClass();
                if (L.f(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "InstantTimeMark(null, null)";
    }

    @Override // kotlin.time.d
    public final long y0(kotlin.time.d dVar) {
        if (!(dVar instanceof p) || !L.f(null, null)) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }
        if (L.f(null, null)) {
            kotlin.time.e.f410651c.getClass();
            return 0L;
        }
        l.Companion companion = l.INSTANCE;
        companion.getClass();
        l lVar = l.f412617d;
        if (L.f(null, lVar)) {
            throw null;
        }
        l lVar2 = l.f412616c;
        if (L.f(null, lVar2)) {
            throw null;
        }
        companion.getClass();
        if (L.f(null, lVar) || L.f(null, lVar2)) {
            throw null;
        }
        throw null;
    }
}
