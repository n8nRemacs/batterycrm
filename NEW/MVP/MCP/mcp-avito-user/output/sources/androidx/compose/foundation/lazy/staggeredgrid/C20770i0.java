package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.R0;
import androidx.compose.ui.unit.q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "Landroidx/compose/ui/layout/j0;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "scrollBackAmount", "", "canScrollForward", "isVertical", "remeasureNeeded", "Landroidx/compose/foundation/lazy/staggeredgrid/w0;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/x0;", "spanProvider", "Landroidx/compose/ui/unit/d;", "density", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "visibleItemsInfo", "Landroidx/compose/ui/unit/u;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "Lkotlinx/coroutines/T;", "coroutineScope", "<init>", "([I[IFLandroidx/compose/ui/layout/j0;FZZZLandroidx/compose/foundation/lazy/staggeredgrid/w0;Landroidx/compose/foundation/lazy/staggeredgrid/x0;Landroidx/compose/ui/unit/d;ILjava/util/List;JIIIIILkotlinx/coroutines/T;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20770i0 implements InterfaceC20754a0, InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final int[] f29621a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f29622b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29623c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22367j0 f29624d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29625e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29626f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29627g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29628h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final w0 f29629i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final x0 f29630j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f29631k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29632l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<l0> f29633m;

    /* renamed from: n, reason: collision with root package name */
    public final long f29634n;

    /* renamed from: o, reason: collision with root package name */
    public final int f29635o;

    /* renamed from: p, reason: collision with root package name */
    public final int f29636p;

    /* renamed from: q, reason: collision with root package name */
    public final int f29637q;

    /* renamed from: r, reason: collision with root package name */
    public final int f29638r;

    /* renamed from: s, reason: collision with root package name */
    public final int f29639s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f29640t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Orientation f29641u;

    public C20770i0() {
        throw null;
    }

    public C20770i0(int[] iArr, int[] iArr2, float f12, InterfaceC22367j0 interfaceC22367j0, float f13, boolean z12, boolean z13, boolean z14, w0 w0Var, x0 x0Var, androidx.compose.ui.unit.d dVar, int i12, List list, long j12, int i13, int i14, int i15, int i16, int i17, kotlinx.coroutines.T t12, C42822w c42822w) {
        this.f29621a = iArr;
        this.f29622b = iArr2;
        this.f29623c = f12;
        this.f29624d = interfaceC22367j0;
        this.f29625e = f13;
        this.f29626f = z12;
        this.f29627g = z13;
        this.f29628h = z14;
        this.f29629i = w0Var;
        this.f29630j = x0Var;
        this.f29631k = dVar;
        this.f29632l = i12;
        this.f29633m = list;
        this.f29634n = j12;
        this.f29635o = i13;
        this.f29636p = i14;
        this.f29637q = i15;
        this.f29638r = i16;
        this.f29639s = i17;
        this.f29640t = t12;
        this.f29641u = z13 ? Orientation.f27425b : Orientation.f27426c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final C20770i0 a(int i12, boolean z12) {
        List<l0> list;
        int i13;
        long j12;
        int i14;
        int i15 = 1;
        if (!this.f29628h) {
            List<l0> list2 = this.f29633m;
            if (!list2.isEmpty() && this.f29621a.length != 0) {
                int[] iArr = this.f29622b;
                if (iArr.length != 0) {
                    int i16 = this.f29638r;
                    int i17 = this.f29636p;
                    int i18 = i17 - i16;
                    List<l0> list3 = list2;
                    int size = list3.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        l0 l0Var = list2.get(i19);
                        if (!l0Var.f29662r) {
                            if ((l0Var.m() <= 0) == (l0Var.m() + i12 <= 0)) {
                                int iM2 = l0Var.m();
                                int i22 = this.f29635o;
                                int i23 = l0Var.f29658n;
                                if (iM2 <= i22) {
                                    if (i12 < 0) {
                                        if ((l0Var.m() + i23) - i22 <= (-i12)) {
                                            return null;
                                        }
                                    } else if (i22 - l0Var.m() <= i12) {
                                        return null;
                                    }
                                }
                                if (l0Var.m() + i23 >= i18) {
                                    if (i12 < 0) {
                                        if ((l0Var.m() + i23) - i17 <= (-i12)) {
                                            return null;
                                        }
                                    } else if (i17 - l0Var.m() <= i12) {
                                        return null;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    int size2 = list3.size();
                    int i24 = 0;
                    while (i24 < size2) {
                        l0 l0Var2 = list2.get(i24);
                        if (l0Var2.f29662r) {
                            i13 = i15;
                            list = list2;
                        } else {
                            long j13 = l0Var2.f29664t;
                            boolean z13 = l0Var2.f29648d;
                            q.a aVar = androidx.compose.ui.unit.q.f42862b;
                            long j14 = 4294967295L;
                            list = list2;
                            l0Var2.f29664t = ((z13 ? (int) (j13 >> 32) : ((int) (j13 >> 32)) + i12) << 32) | ((z13 ? ((int) (j13 & 4294967295L)) + i12 : (int) (j13 & 4294967295L)) & 4294967295L);
                            if (z12) {
                                int size3 = l0Var2.f29647c.size();
                                int i25 = 0;
                                while (i25 < size3) {
                                    C20737p c20737pA = l0Var2.f29654j.a(i25, l0Var2.f29646b);
                                    if (c20737pA != null) {
                                        long j15 = c20737pA.f29493l;
                                        int i26 = z13 ? (int) (j15 >> 32) : ((int) (j15 >> 32)) + i12;
                                        if (z13) {
                                            j12 = 4294967295L;
                                            i14 = ((int) (j15 & 4294967295L)) + i12;
                                        } else {
                                            j12 = 4294967295L;
                                            i14 = (int) (j15 & 4294967295L);
                                        }
                                        c20737pA.f29493l = (i14 & j12) | (i26 << 32);
                                    } else {
                                        j12 = j14;
                                    }
                                    i25++;
                                    j14 = j12;
                                }
                            }
                            i13 = 1;
                        }
                        i24 += i13;
                        i15 = i13;
                        list2 = list;
                    }
                    int i27 = i15;
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    for (int i28 = 0; i28 < length; i28 += i27) {
                        iArr2[i28] = iArr[i28] - i12;
                    }
                    return new C20770i0(this.f29621a, iArr2, i12, this.f29624d, this.f29625e, (this.f29626f || i12 > 0) ? i27 : 0, this.f29627g, this.f29628h, this.f29629i, this.f29630j, this.f29631k, this.f29632l, this.f29633m, this.f29634n, this.f29635o, this.f29636p, this.f29637q, this.f29638r, this.f29639s, this.f29640t, null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Orientation getF29641u() {
        return this.f29641u;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    /* renamed from: c, reason: from getter */
    public final long getF29634n() {
        return this.f29634n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    /* renamed from: d, reason: from getter */
    public final int getF29637q() {
        return this.f29637q;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    /* renamed from: e, reason: from getter */
    public final int getF29638r() {
        return this.f29638r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    /* renamed from: f, reason: from getter */
    public final int getF29632l() {
        return this.f29632l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    /* renamed from: g, reason: from getter */
    public final int getF29639s() {
        return this.f29639s;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight */
    public final int getF40716b() {
        return this.f29624d.getF40716b();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth */
    public final int getF40715a() {
        return this.f29624d.getF40715a();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC20754a0
    @Y61.k
    public final List<l0> h() {
        return this.f29633m;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.k
    public final Map<AbstractC22348a, Integer> t() {
        return this.f29624d.t();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f29624d.u();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.l
    public final Y41.l<R0, kotlin.G0> v() {
        return this.f29624d.v();
    }
}
