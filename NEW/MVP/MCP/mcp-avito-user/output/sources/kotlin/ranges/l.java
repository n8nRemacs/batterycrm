package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/l;", "Lkotlin/ranges/j;", "Lkotlin/ranges/g;", "", "Lkotlin/ranges/r;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f406912f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final l f406913g = new l(1, 0, 1);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/l$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(int i12, int i13) {
        super(i12, i13, 1);
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return Integer.valueOf(this.f406905b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public final /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return h(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.j
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (this.f406905b == lVar.f406905b) {
                    if (this.f406906c == lVar.f406906c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return Integer.valueOf(this.f406906c);
    }

    public final boolean h(int i12) {
        return this.f406905b <= i12 && i12 <= this.f406906c;
    }

    @Override // kotlin.ranges.j
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f406905b * 31) + this.f406906c;
    }

    @Override // kotlin.ranges.j, kotlin.ranges.g
    public final boolean isEmpty() {
        return this.f406905b > this.f406906c;
    }

    @Override // kotlin.ranges.j
    @Y61.k
    public final String toString() {
        return this.f406905b + ".." + this.f406906c;
    }
}
