package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/o;", "Lkotlin/ranges/m;", "Lkotlin/ranges/g;", "", "Lkotlin/ranges/r;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f406922f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final o f406923g = new o(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/o$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(long j12, long j13) {
        super(j12, j13, 1L);
    }

    public final boolean b(long j12) {
        return this.f406915b <= j12 && j12 <= this.f406916c;
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return Long.valueOf(this.f406915b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public final /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return b(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.m
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof o) {
            if (!isEmpty() || !((o) obj).isEmpty()) {
                o oVar = (o) obj;
                if (this.f406915b == oVar.f406915b) {
                    if (this.f406916c == oVar.f406916c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return Long.valueOf(this.f406916c);
    }

    @Override // kotlin.ranges.m
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j12 = this.f406915b;
        long j13 = 31 * (j12 ^ (j12 >>> 32));
        long j14 = this.f406916c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    @Override // kotlin.ranges.m, kotlin.ranges.g
    public final boolean isEmpty() {
        return this.f406915b > this.f406916c;
    }

    @Override // kotlin.ranges.m
    @Y61.k
    public final String toString() {
        return this.f406915b + ".." + this.f406916c;
    }
}
