package kotlin.time;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.time.d;
import kotlin.time.e;
import kotlin.time.r;

/* compiled from: TimeSources.kt */
@K0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/b;", "Lkotlin/time/r$c;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public abstract class b implements r.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DurationUnit f410644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f410645b = C42727D.c(new C11708b());

    /* compiled from: TimeSources.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/time/b$a;", "Lkotlin/time/d;", "", "startedAt", "Lkotlin/time/b;", "timeSource", "Lkotlin/time/e;", "offset", "<init>", "(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public final long f410646b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f410647c;

        /* renamed from: d, reason: collision with root package name */
        public final long f410648d;

        public a(long j12, b bVar, long j13, C42822w c42822w) {
            this.f410646b = j12;
            this.f410647c = bVar;
            this.f410648d = j13;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return d.a.a(this, dVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (L.f(this.f410647c, ((a) obj).f410647c)) {
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
            e.a aVar = e.f410651c;
            return Long.hashCode(this.f410646b) + (Long.hashCode(this.f410648d) * 37);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LongTimeMark(");
            sb2.append(this.f410646b);
            b bVar = this.f410647c;
            sb2.append(j.b(bVar.f410644a));
            sb2.append(" + ");
            sb2.append((Object) e.m(this.f410648d));
            sb2.append(", ");
            sb2.append(bVar);
            sb2.append(')');
            return sb2.toString();
        }

        @Override // kotlin.time.d
        public final long y0(@Y61.k d dVar) {
            if (dVar instanceof a) {
                a aVar = (a) dVar;
                b bVar = aVar.f410647c;
                b bVar2 = this.f410647c;
                if (L.f(bVar2, bVar)) {
                    return e.k(l.c(this.f410646b, aVar.f410646b, bVar2.f410644a), e.k(this.f410648d, e.n(aVar.f410648d)));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }
    }

    /* compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.b$b, reason: collision with other inner class name */
    public static final class C11708b extends N implements Y41.a<Long> {
        public C11708b() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() {
            b.this.getClass();
            return 0L;
        }
    }

    public b(@Y61.k DurationUnit durationUnit) {
        this.f410644a = durationUnit;
    }
}
