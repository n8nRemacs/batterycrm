package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "Landroidx/compose/foundation/lazy/staggeredgrid/L;", "Landroidx/compose/foundation/lazy/layout/T;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/K0;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 implements L, androidx.compose.foundation.lazy.layout.T {

    /* renamed from: a, reason: collision with root package name */
    public final int f29645a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f29646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<K0> f29647c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29648d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29651g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29652h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Object f29653i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<l0> f29654j;

    /* renamed from: k, reason: collision with root package name */
    public final long f29655k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29656l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29657m;

    /* renamed from: n, reason: collision with root package name */
    public final int f29658n;

    /* renamed from: o, reason: collision with root package name */
    public int f29659o;

    /* renamed from: p, reason: collision with root package name */
    public int f29660p;

    /* renamed from: q, reason: collision with root package name */
    public int f29661q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29662r;

    /* renamed from: s, reason: collision with root package name */
    public final long f29663s;

    /* renamed from: t, reason: collision with root package name */
    public long f29664t;

    public l0() {
        throw null;
    }

    public l0(int i12, Object obj, List list, boolean z12, int i13, int i14, int i15, int i16, int i17, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12, C42822w c42822w) {
        int i18;
        long j13;
        this.f29645a = i12;
        this.f29646b = obj;
        this.f29647c = list;
        this.f29648d = z12;
        this.f29649e = i14;
        this.f29650f = i15;
        this.f29651g = i16;
        this.f29652h = i17;
        this.f29653i = obj2;
        this.f29654j = lazyLayoutItemAnimator;
        this.f29655k = j12;
        this.f29656l = true;
        int i19 = 0;
        if (list.isEmpty()) {
            i18 = 0;
        } else {
            K0 k02 = (K0) list.get(0);
            i18 = z12 ? k02.f40346c : k02.f40345b;
            int size = list.size() - 1;
            if (1 <= size) {
                int i22 = 1;
                while (true) {
                    K0 k03 = (K0) list.get(i22);
                    int i23 = this.f29648d ? k03.f40346c : k03.f40345b;
                    i18 = i23 > i18 ? i23 : i18;
                    if (i22 == size) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
        }
        this.f29657m = i18;
        int i24 = i18 + i13;
        this.f29658n = i24 < 0 ? 0 : i24;
        List<K0> list2 = this.f29647c;
        if (!list2.isEmpty()) {
            K0 k04 = list2.get(0);
            i19 = this.f29648d ? k04.f40345b : k04.f40346c;
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                int i25 = 1;
                while (true) {
                    K0 k05 = list2.get(i25);
                    int i26 = this.f29648d ? k05.f40345b : k05.f40346c;
                    i19 = i26 > i19 ? i26 : i19;
                    if (i25 == size2) {
                        break;
                    } else {
                        i25++;
                    }
                }
            }
        }
        this.f29659o = -1;
        if (this.f29648d) {
            j13 = (this.f29657m & 4294967295L) | (i19 << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
        } else {
            j13 = (i19 & 4294967295L) | (this.f29657m << 32);
            u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        }
        this.f29663s = j13;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f29664t = 0L;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.L
    /* renamed from: a, reason: from getter */
    public final long getF29663s() {
        return this.f29663s;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.L, androidx.compose.foundation.lazy.layout.T
    /* renamed from: b, reason: from getter */
    public final int getF29649e() {
        return this.f29649e;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void c(int i12, int i13, int i14, int i15) {
        if (this.f29648d) {
            i14 = i15;
        }
        p(i12, i13, i14);
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final int d() {
        return this.f29647c.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.L
    /* renamed from: e, reason: from getter */
    public final long getF29664t() {
        return this.f29664t;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: f, reason: from getter */
    public final long getF29655k() {
        return this.f29655k;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: g, reason: from getter */
    public final boolean getF29662r() {
        return this.f29662r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.L, androidx.compose.foundation.lazy.layout.T
    /* renamed from: getIndex, reason: from getter */
    public final int getF29645a() {
        return this.f29645a;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.k
    /* renamed from: getKey, reason: from getter */
    public final Object getF29646b() {
        return this.f29646b;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: h, reason: from getter */
    public final boolean getF29648d() {
        return this.f29648d;
    }

    public final int i(long j12) {
        long j13;
        if (this.f29648d) {
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 & 4294967295L;
        } else {
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 >> 32;
        }
        return (int) j13;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: j, reason: from getter */
    public final int getF29658n() {
        return this.f29658n;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void k() {
        this.f29662r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: l, reason: from getter */
    public final int getF29650f() {
        return this.f29650f;
    }

    public final int m() {
        long j12;
        if (this.f29648d) {
            long j13 = this.f29664t;
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j12 = j13 & 4294967295L;
        } else {
            long j14 = this.f29664t;
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j12 = j14 >> 32;
        }
        return (int) j12;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.l
    public final Object n(int i12) {
        return this.f29647c.get(i12).getF40847t();
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final long o(int i12) {
        return this.f29664t;
    }

    public final void p(int i12, int i13, int i14) {
        long j12;
        this.f29659o = i14;
        this.f29660p = -this.f29651g;
        this.f29661q = i14 + this.f29652h;
        if (this.f29648d) {
            j12 = (i13 << 32) | (4294967295L & i12);
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
        } else {
            j12 = (i13 & 4294967295L) | (i12 << 32);
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        }
        this.f29664t = j12;
    }
}
