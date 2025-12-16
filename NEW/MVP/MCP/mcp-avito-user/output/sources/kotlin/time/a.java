package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.time.d;
import kotlin.time.e;
import kotlin.time.r;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/a;", "Lkotlin/time/r$c;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
@InterfaceC42830m
@k
/* loaded from: classes8.dex */
public abstract class a implements r.c {

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/time/a$a;", "Lkotlin/time/d;", "", "startedAt", "Lkotlin/time/a;", "timeSource", "Lkotlin/time/e;", "offset", "<init>", "(DLkotlin/time/a;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C11707a implements d {

        /* renamed from: b, reason: collision with root package name */
        public final double f410641b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final a f410642c;

        /* renamed from: d, reason: collision with root package name */
        public final long f410643d;

        public C11707a(double d12, a aVar, long j12, C42822w c42822w) {
            this.f410641b = d12;
            this.f410642c = aVar;
            this.f410643d = j12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return d.a.a(this, dVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof C11707a) {
                if (L.f(this.f410642c, ((C11707a) obj).f410642c)) {
                    long jY02 = y0((d) obj);
                    e.f410651c.getClass();
                    if (jY02 == 0) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            this.f410642c.getClass();
            return Long.hashCode(e.k(g.f(this.f410641b, null), this.f410643d));
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DoubleTimeMark(");
            sb2.append(this.f410641b);
            a aVar = this.f410642c;
            aVar.getClass();
            sb2.append(j.b(null));
            sb2.append(" + ");
            sb2.append((Object) e.m(this.f410643d));
            sb2.append(", ");
            sb2.append(aVar);
            sb2.append(')');
            return sb2.toString();
        }

        @Override // kotlin.time.d
        public final long y0(@Y61.k d dVar) {
            if (dVar instanceof C11707a) {
                C11707a c11707a = (C11707a) dVar;
                a aVar = c11707a.f410642c;
                a aVar2 = this.f410642c;
                if (L.f(aVar2, aVar)) {
                    e.a aVar3 = e.f410651c;
                    long j12 = this.f410643d;
                    long j13 = c11707a.f410643d;
                    if ((j12 == j13) && e.j(j12)) {
                        e.f410651c.getClass();
                        return 0L;
                    }
                    long jK2 = e.k(j12, e.n(j13));
                    double d12 = this.f410641b - c11707a.f410641b;
                    aVar2.getClass();
                    long jF2 = g.f(d12, null);
                    if (jF2 != e.n(jK2)) {
                        return e.k(jF2, jK2);
                    }
                    e.f410651c.getClass();
                    return 0L;
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }
    }
}
