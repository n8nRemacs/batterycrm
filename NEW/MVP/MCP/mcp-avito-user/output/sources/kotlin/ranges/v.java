package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.s0;

/* compiled from: UIntRange.kt */
@K0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/ranges/v;", "", "Lkotlin/s0;", "start", "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/w;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public class v implements Iterable<s0>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f406924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406925c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406926d;

    /* compiled from: UIntRange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/v$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public v(int i12, int i13, int i14, C42822w c42822w) {
        if (i14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i14 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f406924b = i12;
        if (i14 > 0) {
            if (Integer.compareUnsigned(i12, i13) < 0) {
                int i15 = s0.f410475c;
                int iRemainderUnsigned = Integer.remainderUnsigned(i13, i14);
                int iRemainderUnsigned2 = Integer.remainderUnsigned(i12, i14);
                int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
                int i16 = iRemainderUnsigned - iRemainderUnsigned2;
                i13 -= iCompareUnsigned < 0 ? i16 + i14 : i16;
            }
        } else {
            if (i14 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compareUnsigned(i12, i13) > 0) {
                int i17 = -i14;
                int i18 = s0.f410475c;
                int iRemainderUnsigned3 = Integer.remainderUnsigned(i12, i17);
                int iRemainderUnsigned4 = Integer.remainderUnsigned(i13, i17);
                int iCompareUnsigned2 = Integer.compareUnsigned(iRemainderUnsigned3, iRemainderUnsigned4);
                int i19 = iRemainderUnsigned3 - iRemainderUnsigned4;
                i13 += iCompareUnsigned2 < 0 ? i19 + i17 : i19;
            }
        }
        this.f406925c = i13;
        this.f406926d = i14;
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj instanceof v) {
            if (!isEmpty() || !((v) obj).isEmpty()) {
                v vVar = (v) obj;
                if (this.f406924b != vVar.f406924b || this.f406925c != vVar.f406925c || this.f406926d != vVar.f406926d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f406924b * 31) + this.f406925c) * 31) + this.f406926d;
    }

    public boolean isEmpty() {
        int i12 = this.f406926d;
        int i13 = this.f406925c;
        int i14 = this.f406924b;
        if (i12 > 0) {
            if (Integer.compareUnsigned(i14, i13) <= 0) {
                return false;
            }
        } else if (Integer.compareUnsigned(i14, i13) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<s0> iterator() {
        return new w(this.f406924b, this.f406925c, this.f406926d, null);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2;
        int i12 = this.f406925c;
        int i13 = this.f406924b;
        int i14 = this.f406926d;
        if (i14 > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) s0.b(i13));
            sb2.append("..");
            sb2.append((Object) s0.b(i12));
            sb2.append(" step ");
            sb2.append(i14);
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) s0.b(i13));
            sb2.append(" downTo ");
            sb2.append((Object) s0.b(i12));
            sb2.append(" step ");
            sb2.append(-i14);
        }
        return sb2.toString();
    }
}
