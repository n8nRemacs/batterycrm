package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/c;", "Lkotlin/ranges/a;", "Lkotlin/ranges/g;", "", "Lkotlin/ranges/r;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42837c extends C42835a implements g<Character>, r<Character> {

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/c$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        new C42837c((char) 1, (char) 0);
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return Character.valueOf(this.f406891b);
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        char cCharValue = ((Character) comparable).charValue();
        return L.g(this.f406891b, cCharValue) <= 0 && L.g(cCharValue, this.f406892c) <= 0;
    }

    @Override // kotlin.ranges.C42835a
    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C42837c) {
            if (!isEmpty() || !((C42837c) obj).isEmpty()) {
                C42837c c42837c = (C42837c) obj;
                if (this.f406891b != c42837c.f406891b || this.f406892c != c42837c.f406892c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return Character.valueOf(this.f406892c);
    }

    @Override // kotlin.ranges.C42835a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f406891b * 31) + this.f406892c;
    }

    @Override // kotlin.ranges.C42835a, kotlin.ranges.g
    public final boolean isEmpty() {
        return L.g(this.f406891b, this.f406892c) > 0;
    }

    @Override // kotlin.ranges.C42835a
    @Y61.k
    public final String toString() {
        return this.f406891b + ".." + this.f406892c;
    }
}
