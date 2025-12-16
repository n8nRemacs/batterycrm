package kotlin.ranges;

import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: UIntRange.kt */
@K0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/ranges/x;", "Lkotlin/ranges/v;", "Lkotlin/ranges/g;", "Lkotlin/s0;", "Lkotlin/ranges/r;", "start", "endInclusive", "<init>", "(IILkotlin/jvm/internal/w;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class x extends v implements g<s0>, r<s0> {

    /* compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/x$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        new x(-1, 0, null);
    }

    public x(int i12, int i13, C42822w c42822w) {
        super(i12, i13, 1, null);
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return s0.a(this.f406924b);
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        int i12 = this.f406924b;
        int i13 = ((s0) comparable).f410476b;
        return Integer.compareUnsigned(i12, i13) <= 0 && Integer.compareUnsigned(i13, this.f406925c) <= 0;
    }

    @Override // kotlin.ranges.v
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof x) {
            if (!isEmpty() || !((x) obj).isEmpty()) {
                x xVar = (x) obj;
                if (this.f406924b == xVar.f406924b) {
                    if (this.f406925c == xVar.f406925c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return s0.a(this.f406925c);
    }

    @Override // kotlin.ranges.v
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f406924b * 31) + this.f406925c;
    }

    @Override // kotlin.ranges.v, kotlin.ranges.g
    public final boolean isEmpty() {
        return Integer.compareUnsigned(this.f406924b, this.f406925c) > 0;
    }

    @Override // kotlin.ranges.v
    @Y61.k
    public final String toString() {
        return ((Object) s0.b(this.f406924b)) + ".." + ((Object) s0.b(this.f406925c));
    }
}
