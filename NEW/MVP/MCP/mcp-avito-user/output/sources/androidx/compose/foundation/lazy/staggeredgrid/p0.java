package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: LazyStaggeredGridScrollPosition.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/p0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Integer, Integer, int[]> f29665a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public int[] f29666b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29667c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public int[] f29668d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29669e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29670f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Object f29671g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.W f29672h;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(@Y61.k int[] iArr, @Y61.k int[] iArr2, @Y61.k Y41.p<? super Integer, ? super Integer, int[]> pVar) {
        this.f29665a = pVar;
        this.f29666b = iArr;
        this.f29667c = U2.a(a(iArr));
        this.f29668d = iArr2;
        this.f29669e = U2.a(b(iArr, iArr2));
        Integer numV = C42756l.V(iArr);
        this.f29672h = new androidx.compose.foundation.lazy.layout.W(numV != null ? numV.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int i12 = Integer.MAX_VALUE;
        for (int i13 : iArr) {
            if (i13 <= 0) {
                return 0;
            }
            if (i12 > i13) {
                i12 = i13;
            }
        }
        if (i12 == Integer.MAX_VALUE) {
            return 0;
        }
        return i12;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int iA2 = a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < length; i12++) {
            if (iArr[i12] == iA2) {
                iMin = Math.min(iMin, iArr2[i12]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }
}
