package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridLaneInfo.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/Y;", "", "<init>", "()V", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f29582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public int[] f29583b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42754k<b> f29584c = new C42754k<>();

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/Y$a;", "", "<init>", "()V", "", "FullSpan", "I", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/Y$b;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f29585a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public int[] f29586b;

        public b(int i12, @Y61.k int[] iArr) {
            this.f29585a = i12;
            this.f29586b = iArr;
        }
    }

    /* compiled from: Collections.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<b, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Integer f29587l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num) {
            super(1);
            this.f29587l = num;
        }

        @Override // Y41.l
        public final Integer invoke(b bVar) {
            return Integer.valueOf(kotlin.comparisons.a.b(Integer.valueOf(bVar.f29585a), this.f29587l));
        }
    }

    static {
        new a(null);
    }

    public final boolean a(int i12, int i13) {
        int iF2 = f(i12);
        return iF2 == i13 || iF2 == -1 || iF2 == -2;
    }

    public final void b(int i12, int i13) {
        if (i12 > 131072) {
            androidx.compose.foundation.internal.e.a("Requested item capacity " + i12 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.f29583b;
        if (iArr.length < i12) {
            int length = iArr.length;
            while (length < i12) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            C42756l.p(i13, 0, 12, this.f29583b, iArr2);
            this.f29583b = iArr2;
        }
    }

    public final void c(int i12) {
        C42754k<b> c42754k;
        int i13 = this.f29582a;
        int i14 = i12 - i13;
        if (i14 < 0 || i14 >= 131072) {
            int iMax = Math.max(i12 - (this.f29583b.length / 2), 0);
            this.f29582a = iMax;
            int i15 = iMax - i13;
            if (i15 >= 0) {
                int[] iArr = this.f29583b;
                if (i15 < iArr.length) {
                    C42756l.k(0, i15, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.f29583b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i15), this.f29583b.length, 0);
            } else {
                int i16 = -i15;
                int[] iArr3 = this.f29583b;
                if (iArr3.length + i16 < 131072) {
                    b(iArr3.length + i16 + 1, i16);
                } else {
                    if (i16 < iArr3.length) {
                        C42756l.k(i16, 0, iArr3.length - i16, iArr3, iArr3);
                    }
                    int[] iArr4 = this.f29583b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i16), 0);
                }
            }
        } else {
            b(i14 + 1, 0);
        }
        while (true) {
            c42754k = this.f29584c;
            if (c42754k.isEmpty() || c42754k.first().f29585a >= this.f29582a) {
                break;
            } else {
                c42754k.removeFirst();
            }
        }
        while (!c42754k.isEmpty() && c42754k.last().f29585a > this.f29582a + this.f29583b.length) {
            c42754k.removeLast();
        }
    }

    public final int d(int i12, int i13) {
        do {
            i12--;
            if (-1 >= i12) {
                return -1;
            }
        } while (!a(i12, i13));
        return i12;
    }

    @Y61.l
    public final int[] e(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        C42754k<b> c42754k = this.f29584c;
        b bVar = (b) C42745f0.K(C42745f0.n(c42754k, c42754k.getF406668c(), new c(numValueOf)), c42754k);
        if (bVar != null) {
            return bVar.f29586b;
        }
        return null;
    }

    public final int f(int i12) {
        int i13 = this.f29582a;
        if (i12 < i13) {
            return -1;
        }
        if (i12 >= this.f29583b.length + i13) {
            return -1;
        }
        return r1[i12 - i13] - 1;
    }

    public final void g() {
        C42756l.z(this.f29583b, 0, 0, 6);
        this.f29584c.clear();
    }

    public final void h(int i12, int i13) {
        if (!(i12 >= 0)) {
            androidx.compose.foundation.internal.e.a("Negative lanes are not supported");
        }
        c(i12);
        this.f29583b[i12 - this.f29582a] = i13 + 1;
    }
}
