package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.R0;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListMeasureResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/f0;", "Landroidx/compose/foundation/lazy/Y;", "Landroidx/compose/ui/layout/j0;", "Landroidx/compose/foundation/lazy/g0;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/T;", "coroutineScope", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/b;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/g0;IZFLandroidx/compose/ui/layout/j0;FZLkotlinx/coroutines/T;Landroidx/compose/ui/unit/d;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 implements Y, InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final g0 f28935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28936b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28937c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22367j0 f28939e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28940f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28941g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f28942h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28943i;

    /* renamed from: j, reason: collision with root package name */
    public final long f28944j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<g0> f28945k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28946l;

    /* renamed from: m, reason: collision with root package name */
    public final int f28947m;

    /* renamed from: n, reason: collision with root package name */
    public final int f28948n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f28949o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Orientation f28950p;

    /* renamed from: q, reason: collision with root package name */
    public final int f28951q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28952r;

    public f0() {
        throw null;
    }

    public f0(g0 g0Var, int i12, boolean z12, float f12, InterfaceC22367j0 interfaceC22367j0, float f13, boolean z13, kotlinx.coroutines.T t12, androidx.compose.ui.unit.d dVar, long j12, List list, int i13, int i14, int i15, boolean z14, Orientation orientation, int i16, int i17, C42822w c42822w) {
        this.f28935a = g0Var;
        this.f28936b = i12;
        this.f28937c = z12;
        this.f28938d = f12;
        this.f28939e = interfaceC22367j0;
        this.f28940f = f13;
        this.f28941g = z13;
        this.f28942h = t12;
        this.f28943i = dVar;
        this.f28944j = j12;
        this.f28945k = list;
        this.f28946l = i13;
        this.f28947m = i14;
        this.f28948n = i15;
        this.f28949o = z14;
        this.f28950p = orientation;
        this.f28951q = i16;
        this.f28952r = i17;
    }

    @Y61.l
    public final f0 a(int i12, boolean z12) {
        g0 g0Var;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        f0 f0Var = null;
        if (!this.f28941g) {
            List<g0> list = this.f28945k;
            if (!list.isEmpty() && (g0Var = this.f28935a) != null && (i13 = this.f28936b - i12) >= 0 && i13 < g0Var.f28971s) {
                g0 g0Var2 = (g0) C42745f0.E(list);
                g0 g0Var3 = (g0) C42745f0.Q(list);
                if (!g0Var2.f28973u && !g0Var3.f28973u) {
                    int i17 = this.f28947m;
                    int i18 = this.f28946l;
                    if (i12 >= 0 ? Math.min(i18 - g0Var2.f28968p, i17 - g0Var3.f28968p) > i12 : Math.min((g0Var2.f28968p + g0Var2.f28971s) - i18, (g0Var3.f28968p + g0Var3.f28971s) - i17) > (-i12)) {
                        int size = list.size();
                        int i19 = 0;
                        while (i19 < size) {
                            g0 g0Var4 = list.get(i19);
                            if (!g0Var4.f28973u) {
                                g0Var4.f28968p += i12;
                                int[] iArr = g0Var4.f28977y;
                                int length = iArr.length;
                                int i22 = 0;
                                while (true) {
                                    z13 = g0Var4.f28955c;
                                    if (i22 >= length) {
                                        break;
                                    }
                                    int i23 = i22 & 1;
                                    if ((z13 && i23 != 0) || (!z13 && i23 == 0)) {
                                        iArr[i22] = iArr[i22] + i12;
                                    }
                                    i22++;
                                }
                                if (z12) {
                                    int size2 = g0Var4.f28954b.size();
                                    int i24 = 0;
                                    while (i24 < size2) {
                                        C20737p c20737pA = g0Var4.f28966n.a(i24, g0Var4.f28964l);
                                        if (c20737pA != null) {
                                            long j12 = c20737pA.f29493l;
                                            if (z13) {
                                                q.a aVar = androidx.compose.ui.unit.q.f42862b;
                                                i14 = i19;
                                                i15 = (int) (j12 >> 32);
                                                i16 = ((int) (j12 & 4294967295L)) + i12;
                                            } else {
                                                i14 = i19;
                                                q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
                                                i15 = ((int) (j12 >> 32)) + i12;
                                                i16 = (int) (j12 & 4294967295L);
                                            }
                                            c20737pA.f29493l = (i16 & 4294967295L) | (i15 << 32);
                                        } else {
                                            i14 = i19;
                                        }
                                        i24++;
                                        i19 = i14;
                                    }
                                }
                            }
                            i19++;
                        }
                        f0Var = new f0(this.f28935a, i13, this.f28937c || i12 > 0, i12, this.f28939e, this.f28940f, this.f28941g, this.f28942h, this.f28943i, this.f28944j, this.f28945k, this.f28946l, this.f28947m, this.f28948n, this.f28949o, this.f28950p, this.f28951q, this.f28952r, null);
                    }
                }
            }
        }
        return f0Var;
    }

    @Override // androidx.compose.foundation.lazy.Y
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Orientation getF28950p() {
        return this.f28950p;
    }

    @Override // androidx.compose.foundation.lazy.Y
    public final long c() {
        InterfaceC22367j0 interfaceC22367j0 = this.f28939e;
        long f40715a = (interfaceC22367j0.getF40584b() << 32) | (interfaceC22367j0.getF40585c() & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return f40715a;
    }

    @Override // androidx.compose.foundation.lazy.Y
    public final int d() {
        return -this.f28946l;
    }

    @Override // androidx.compose.foundation.lazy.Y
    /* renamed from: e, reason: from getter */
    public final int getF28951q() {
        return this.f28951q;
    }

    @Override // androidx.compose.foundation.lazy.Y
    /* renamed from: f, reason: from getter */
    public final int getF28948n() {
        return this.f28948n;
    }

    @Override // androidx.compose.foundation.lazy.Y
    /* renamed from: g, reason: from getter */
    public final int getF28952r() {
        return this.f28952r;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight */
    public final int getF40585c() {
        return this.f28939e.getF40585c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth */
    public final int getF40584b() {
        return this.f28939e.getF40584b();
    }

    @Override // androidx.compose.foundation.lazy.Y
    @Y61.k
    public final List<g0> h() {
        return this.f28945k;
    }

    @Override // androidx.compose.foundation.lazy.Y
    /* renamed from: i, reason: from getter */
    public final int getF28946l() {
        return this.f28946l;
    }

    @Override // androidx.compose.foundation.lazy.Y
    /* renamed from: j, reason: from getter */
    public final int getF28947m() {
        return this.f28947m;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.k
    public final Map<AbstractC22348a, Integer> t() {
        return this.f28939e.t();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f28939e.u();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.l
    public final Y41.l<R0, G0> v() {
        return this.f28939e.v();
    }
}
