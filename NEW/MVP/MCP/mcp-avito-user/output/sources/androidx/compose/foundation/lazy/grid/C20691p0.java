package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridMeasuredItem.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/p0;", "Landroidx/compose/foundation/lazy/grid/O;", "Landroidx/compose/foundation/lazy/layout/T;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/K0;", "placeables", "Landroidx/compose/ui/unit/q;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/b;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20691p0 implements O, androidx.compose.foundation.lazy.layout.T {

    /* renamed from: a, reason: collision with root package name */
    public final int f29198a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f29199b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29200c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29201d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29202e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f29203f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29204g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29205h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<androidx.compose.ui.layout.K0> f29206i;

    /* renamed from: j, reason: collision with root package name */
    public final long f29207j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Object f29208k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<C20691p0> f29209l;

    /* renamed from: m, reason: collision with root package name */
    public final long f29210m;

    /* renamed from: n, reason: collision with root package name */
    public final int f29211n;

    /* renamed from: o, reason: collision with root package name */
    public final int f29212o;

    /* renamed from: p, reason: collision with root package name */
    public final int f29213p;

    /* renamed from: q, reason: collision with root package name */
    public final int f29214q;

    /* renamed from: r, reason: collision with root package name */
    public int f29215r;

    /* renamed from: s, reason: collision with root package name */
    public int f29216s;

    /* renamed from: t, reason: collision with root package name */
    public int f29217t;

    /* renamed from: u, reason: collision with root package name */
    public final long f29218u;

    /* renamed from: v, reason: collision with root package name */
    public long f29219v;

    /* renamed from: w, reason: collision with root package name */
    public int f29220w;

    /* renamed from: x, reason: collision with root package name */
    public int f29221x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29222y;

    public C20691p0() {
        throw null;
    }

    public C20691p0(int i12, Object obj, boolean z12, int i13, int i14, boolean z13, LayoutDirection layoutDirection, int i15, int i16, List list, long j12, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j13, int i17, int i18, C42822w c42822w) {
        long j14;
        this.f29198a = i12;
        this.f29199b = obj;
        this.f29200c = z12;
        this.f29201d = i13;
        this.f29202e = z13;
        this.f29203f = layoutDirection;
        this.f29204g = i15;
        this.f29205h = i16;
        this.f29206i = list;
        this.f29207j = j12;
        this.f29208k = obj2;
        this.f29209l = lazyLayoutItemAnimator;
        this.f29210m = j13;
        this.f29211n = i17;
        this.f29212o = i18;
        this.f29215r = BeduinInputModel.MIN_TEXT_VERSION;
        int size = list.size();
        int iMax = 0;
        for (int i19 = 0; i19 < size; i19++) {
            androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) list.get(i19);
            iMax = Math.max(iMax, this.f29200c ? k02.f40346c : k02.f40345b);
        }
        this.f29213p = iMax;
        int i22 = iMax + i14;
        this.f29214q = i22 >= 0 ? i22 : 0;
        if (this.f29200c) {
            j14 = (iMax & 4294967295L) | (this.f29201d << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
        } else {
            j14 = (this.f29201d & 4294967295L) | (iMax << 32);
            u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        }
        this.f29218u = j14;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f29219v = 0L;
        this.f29220w = -1;
        this.f29221x = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.O
    /* renamed from: a, reason: from getter */
    public final long getF29218u() {
        return this.f29218u;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: b, reason: from getter */
    public final int getF29211n() {
        return this.f29211n;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void c(int i12, int i13, int i14, int i15) {
        r(i12, i13, i14, i15, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final int d() {
        return this.f29206i.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.O
    /* renamed from: e, reason: from getter */
    public final long getF29219v() {
        return this.f29219v;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: f, reason: from getter */
    public final long getF29210m() {
        return this.f29210m;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: g, reason: from getter */
    public final boolean getF29222y() {
        return this.f29222y;
    }

    @Override // androidx.compose.foundation.lazy.grid.O, androidx.compose.foundation.lazy.layout.T
    /* renamed from: getIndex, reason: from getter */
    public final int getF29198a() {
        return this.f29198a;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.k
    /* renamed from: getKey, reason: from getter */
    public final Object getF29199b() {
        return this.f29199b;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: h, reason: from getter */
    public final boolean getF29200c() {
        return this.f29200c;
    }

    @Override // androidx.compose.foundation.lazy.grid.O
    /* renamed from: i, reason: from getter */
    public final int getF29221x() {
        return this.f29221x;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: j, reason: from getter */
    public final int getF29214q() {
        return this.f29214q;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void k() {
        this.f29222y = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: l, reason: from getter */
    public final int getF29212o() {
        return this.f29212o;
    }

    @Override // androidx.compose.foundation.lazy.grid.O
    /* renamed from: m, reason: from getter */
    public final int getF29220w() {
        return this.f29220w;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.l
    public final Object n(int i12) {
        return this.f29206i.get(i12).getF40847t();
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final long o(int i12) {
        return this.f29219v;
    }

    public final int p(long j12) {
        long j13;
        if (this.f29200c) {
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 & 4294967295L;
        } else {
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 >> 32;
        }
        return (int) j13;
    }

    public final void q(@Y61.k K0.a aVar, boolean z12) {
        C22267c c22267c;
        if (this.f29215r == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.e.a("position() should be called first");
        }
        List<androidx.compose.ui.layout.K0> list = this.f29206i;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.K0 k02 = list.get(i12);
            int i13 = this.f29216s;
            boolean z13 = this.f29200c;
            int i14 = i13 - (z13 ? k02.f40346c : k02.f40345b);
            int i15 = this.f29217t;
            long j12 = this.f29219v;
            C20737p c20737pA = this.f29209l.a(i12, this.f29199b);
            if (c20737pA != null) {
                if (z12) {
                    c20737pA.f29499r = j12;
                } else {
                    long j13 = c20737pA.f29499r;
                    C20737p.f29480s.getClass();
                    long jE2 = androidx.compose.ui.unit.q.e(!androidx.compose.ui.unit.q.c(j13, C20737p.f29481t) ? c20737pA.f29499r : j12, ((androidx.compose.ui.unit.q) ((C22082i3) c20737pA.f29498q).getF42167b()).f42864a);
                    if ((p(j12) <= i14 && p(jE2) <= i14) || (p(j12) >= i15 && p(jE2) >= i15)) {
                        c20737pA.b();
                    }
                    j12 = jE2;
                }
                c22267c = c20737pA.f29495n;
            } else {
                c22267c = null;
            }
            if (this.f29202e) {
                q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
                j12 = ((z13 ? (int) (j12 >> 32) : (this.f29215r - ((int) (j12 >> 32))) - (z13 ? k02.f40346c : k02.f40345b)) << 32) | ((z13 ? (this.f29215r - ((int) (j12 & 4294967295L))) - (z13 ? k02.f40346c : k02.f40345b) : (int) (j12 & 4294967295L)) & 4294967295L);
            }
            long jE3 = androidx.compose.ui.unit.q.e(j12, this.f29207j);
            if (!z12 && c20737pA != null) {
                c20737pA.f29494m = jE3;
            }
            if (z13) {
                if (c22267c != null) {
                    aVar.getClass();
                    K0.a.a(k02, aVar);
                    k02.m0(androidx.compose.ui.unit.q.e(jE3, k02.f40349f), 0.0f, c22267c);
                } else {
                    K0.a.n(aVar, k02, jE3);
                }
            } else if (c22267c != null) {
                K0.a.l(aVar, k02, jE3, c22267c);
            } else {
                K0.a.k(aVar, k02, jE3);
            }
        }
    }

    public final void r(int i12, int i13, int i14, int i15, int i16, int i17) {
        long j12;
        boolean z12 = this.f29200c;
        int i18 = z12 ? i15 : i14;
        this.f29215r = i18;
        if (!z12) {
            i14 = i15;
        }
        if (z12) {
            if (this.f29203f == LayoutDirection.f42839c) {
                i13 = (i14 - i13) - this.f29201d;
            }
        }
        if (z12) {
            j12 = (i12 & 4294967295L) | (i13 << 32);
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
        } else {
            j12 = (i13 & 4294967295L) | (i12 << 32);
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        }
        this.f29219v = j12;
        this.f29220w = i16;
        this.f29221x = i17;
        this.f29216s = -this.f29204g;
        this.f29217t = i18 + this.f29205h;
    }
}
