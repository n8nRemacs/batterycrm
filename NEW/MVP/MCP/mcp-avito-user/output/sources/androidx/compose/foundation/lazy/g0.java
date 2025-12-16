package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListMeasuredItem.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/g0;", "Landroidx/compose/foundation/lazy/K;", "Landroidx/compose/foundation/lazy/layout/T;", "", "index", "", "Landroidx/compose/ui/layout/K0;", "placeables", "", "isVertical", "Landroidx/compose/ui/f$b;", "horizontalAlignment", "Landroidx/compose/ui/f$c;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/q;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/f$b;Landroidx/compose/ui/f$c;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 implements K, androidx.compose.foundation.lazy.layout.T {

    /* renamed from: a, reason: collision with root package name */
    public final int f28953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<K0> f28954b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28955c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22215f.b f28956d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22215f.c f28957e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f28958f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28959g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28960h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28961i;

    /* renamed from: j, reason: collision with root package name */
    public final int f28962j;

    /* renamed from: k, reason: collision with root package name */
    public final long f28963k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f28964l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Object f28965m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<g0> f28966n;

    /* renamed from: o, reason: collision with root package name */
    public final long f28967o;

    /* renamed from: p, reason: collision with root package name */
    public int f28968p;

    /* renamed from: q, reason: collision with root package name */
    public final int f28969q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28970r;

    /* renamed from: s, reason: collision with root package name */
    public final int f28971s;

    /* renamed from: t, reason: collision with root package name */
    public final int f28972t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28973u;

    /* renamed from: v, reason: collision with root package name */
    public int f28974v;

    /* renamed from: w, reason: collision with root package name */
    public int f28975w;

    /* renamed from: x, reason: collision with root package name */
    public int f28976x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final int[] f28977y;

    public g0() {
        throw null;
    }

    public g0(int i12, List list, boolean z12, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, LayoutDirection layoutDirection, boolean z13, int i13, int i14, int i15, long j12, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j13, C42822w c42822w) {
        this.f28953a = i12;
        this.f28954b = list;
        this.f28955c = z12;
        this.f28956d = bVar;
        this.f28957e = cVar;
        this.f28958f = layoutDirection;
        this.f28959g = z13;
        this.f28960h = i13;
        this.f28961i = i14;
        this.f28962j = i15;
        this.f28963k = j12;
        this.f28964l = obj;
        this.f28965m = obj2;
        this.f28966n = lazyLayoutItemAnimator;
        this.f28967o = j13;
        this.f28970r = 1;
        this.f28974v = BeduinInputModel.MIN_TEXT_VERSION;
        int size = list.size();
        int i16 = 0;
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            K0 k02 = (K0) list.get(i17);
            boolean z14 = this.f28955c;
            i16 += z14 ? k02.f40346c : k02.f40345b;
            iMax = Math.max(iMax, !z14 ? k02.f40346c : k02.f40345b);
        }
        this.f28969q = i16;
        int i18 = i16 + this.f28962j;
        this.f28971s = i18 >= 0 ? i18 : 0;
        this.f28972t = iMax;
        this.f28977y = new int[this.f28954b.size() * 2];
    }

    public final int a(long j12) {
        long j13;
        if (this.f28955c) {
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 & 4294967295L;
        } else {
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j13 = j12 >> 32;
        }
        return (int) j13;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: b */
    public final int getF29211n() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void c(int i12, int i13, int i14, int i15) {
        i(i12, i14, i15);
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final int d() {
        return this.f28954b.size();
    }

    public final void e(@Y61.k K0.a aVar, boolean z12) {
        C22267c c22267c;
        if (this.f28974v == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.e.a("position() should be called first");
        }
        List<K0> list = this.f28954b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            K0 k02 = list.get(i12);
            int i13 = this.f28975w;
            boolean z13 = this.f28955c;
            int i14 = i13 - (z13 ? k02.f40346c : k02.f40345b);
            int i15 = this.f28976x;
            long jO2 = o(i12);
            C20737p c20737pA = this.f28966n.a(i12, this.f28964l);
            if (c20737pA != null) {
                if (z12) {
                    c20737pA.f29499r = jO2;
                } else {
                    long j12 = c20737pA.f29499r;
                    C20737p.f29480s.getClass();
                    if (!androidx.compose.ui.unit.q.c(j12, C20737p.f29481t)) {
                        jO2 = c20737pA.f29499r;
                    }
                    long jE2 = androidx.compose.ui.unit.q.e(jO2, ((androidx.compose.ui.unit.q) ((C22082i3) c20737pA.f29498q).getF42167b()).f42864a);
                    if ((a(jO2) <= i14 && a(jE2) <= i14) || (a(jO2) >= i15 && a(jE2) >= i15)) {
                        c20737pA.b();
                    }
                    jO2 = jE2;
                }
                c22267c = c20737pA.f29495n;
            } else {
                c22267c = null;
            }
            if (this.f28959g) {
                q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
                jO2 = z13 ? (((int) (jO2 >> 32)) << 32) | (4294967295L & ((this.f28974v - ((int) (jO2 & 4294967295L))) - (z13 ? k02.f40346c : k02.f40345b))) : (((int) (jO2 & 4294967295L)) & 4294967295L) | (((this.f28974v - ((int) (jO2 >> 32))) - (z13 ? k02.f40346c : k02.f40345b)) << 32);
            }
            long jE3 = androidx.compose.ui.unit.q.e(jO2, this.f28963k);
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

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: f, reason: from getter */
    public final long getF28967o() {
        return this.f28967o;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: g, reason: from getter */
    public final boolean getF28973u() {
        return this.f28973u;
    }

    @Override // androidx.compose.foundation.lazy.K, androidx.compose.foundation.lazy.layout.T
    /* renamed from: getIndex, reason: from getter */
    public final int getF28953a() {
        return this.f28953a;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.k
    /* renamed from: getKey, reason: from getter */
    public final Object getF28964l() {
        return this.f28964l;
    }

    @Override // androidx.compose.foundation.lazy.K
    /* renamed from: getOffset, reason: from getter */
    public final int getF28968p() {
        return this.f28968p;
    }

    @Override // androidx.compose.foundation.lazy.K
    /* renamed from: getSize, reason: from getter */
    public final int getF28969q() {
        return this.f28969q;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: h, reason: from getter */
    public final boolean getF28955c() {
        return this.f28955c;
    }

    public final void i(int i12, int i13, int i14) {
        int i15;
        this.f28968p = i12;
        boolean z12 = this.f28955c;
        this.f28974v = z12 ? i14 : i13;
        List<K0> list = this.f28954b;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            K0 k02 = list.get(i16);
            int i17 = i16 * 2;
            int[] iArr = this.f28977y;
            if (z12) {
                InterfaceC22215f.b bVar = this.f28956d;
                if (bVar == null) {
                    androidx.compose.foundation.internal.e.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i17] = bVar.a(k02.f40345b, i13, this.f28958f);
                iArr[i17 + 1] = i12;
                i15 = k02.f40346c;
            } else {
                iArr[i17] = i12;
                int i18 = i17 + 1;
                InterfaceC22215f.c cVar = this.f28957e;
                if (cVar == null) {
                    androidx.compose.foundation.internal.e.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i18] = cVar.a(k02.f40346c, i14);
                i15 = k02.f40345b;
            }
            i12 += i15;
        }
        this.f28975w = -this.f28960h;
        this.f28976x = this.f28974v + this.f28961i;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: j, reason: from getter */
    public final int getF28971s() {
        return this.f28971s;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final void k() {
        this.f28973u = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    /* renamed from: l, reason: from getter */
    public final int getF28970r() {
        return this.f28970r;
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    @Y61.l
    public final Object n(int i12) {
        return this.f28954b.get(i12).getF40847t();
    }

    @Override // androidx.compose.foundation.lazy.layout.T
    public final long o(int i12) {
        int i13 = i12 * 2;
        int[] iArr = this.f28977y;
        long j12 = (iArr[i13] << 32) | (iArr[i13 + 1] & 4294967295L);
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        return j12;
    }
}
