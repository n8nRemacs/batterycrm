package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C20737p;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.R0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyGridMeasureResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/o0;", "Landroidx/compose/foundation/lazy/grid/h0;", "Landroidx/compose/ui/layout/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20689o0 implements InterfaceC20675h0, InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final s0 f29179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29180b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29181c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29182d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22367j0 f29183e;

    /* renamed from: f, reason: collision with root package name */
    public final float f29184f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29185g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f29186h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f29187i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29188j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f29189k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f29190l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29191m;

    /* renamed from: n, reason: collision with root package name */
    public final int f29192n;

    /* renamed from: o, reason: collision with root package name */
    public final int f29193o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f29194p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Orientation f29195q;

    /* renamed from: r, reason: collision with root package name */
    public final int f29196r;

    /* renamed from: s, reason: collision with root package name */
    public final int f29197s;

    /* JADX WARN: Multi-variable type inference failed */
    public C20689o0(@Y61.l s0 s0Var, int i12, boolean z12, float f12, @Y61.k InterfaceC22367j0 interfaceC22367j0, float f13, boolean z13, @Y61.k kotlinx.coroutines.T t12, @Y61.k androidx.compose.ui.unit.d dVar, int i13, @Y61.k Y41.l<? super Integer, ? extends List<kotlin.Q<Integer, C22712b>>> lVar, @Y61.k List<C20691p0> list, int i14, int i15, int i16, boolean z14, @Y61.k Orientation orientation, int i17, int i18) {
        this.f29179a = s0Var;
        this.f29180b = i12;
        this.f29181c = z12;
        this.f29182d = f12;
        this.f29183e = interfaceC22367j0;
        this.f29184f = f13;
        this.f29185g = z13;
        this.f29186h = t12;
        this.f29187i = dVar;
        this.f29188j = i13;
        this.f29189k = (kotlin.jvm.internal.N) lVar;
        this.f29190l = list;
        this.f29191m = i14;
        this.f29192n = i15;
        this.f29193o = i16;
        this.f29194p = z14;
        this.f29195q = orientation;
        this.f29196r = i17;
        this.f29197s = i18;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Y61.l
    public final C20689o0 a(int i12, boolean z12) {
        s0 s0Var;
        int i13;
        int i14;
        List list;
        int i15;
        long j12;
        int i16;
        int i17;
        if (this.f29185g) {
            return null;
        }
        ?? r32 = this.f29190l;
        if (r32.isEmpty() || (s0Var = this.f29179a) == null || (i13 = this.f29180b - i12) < 0 || i13 >= s0Var.f29233h) {
            return null;
        }
        C20691p0 c20691p0 = (C20691p0) C42745f0.E(r32);
        C20691p0 c20691p02 = (C20691p0) C42745f0.Q(r32);
        if (c20691p0.f29222y || c20691p02.f29222y) {
            return null;
        }
        Orientation orientation = this.f29195q;
        int i18 = this.f29192n;
        int i19 = this.f29191m;
        if (i12 < 0) {
            if (Math.min((androidx.compose.foundation.gestures.snapping.f.a(c20691p0, orientation) + c20691p0.f29214q) - i19, (androidx.compose.foundation.gestures.snapping.f.a(c20691p02, orientation) + c20691p02.f29214q) - i18) <= (-i12)) {
                return null;
            }
        } else if (Math.min(i19 - androidx.compose.foundation.gestures.snapping.f.a(c20691p0, orientation), i18 - androidx.compose.foundation.gestures.snapping.f.a(c20691p02, orientation)) <= i12) {
            return null;
        }
        int size = ((Collection) r32).size();
        int i22 = 0;
        List list2 = r32;
        while (i22 < size) {
            C20691p0 c20691p03 = (C20691p0) list2.get(i22);
            if (c20691p03.f29222y) {
                list = list2;
                i14 = i22;
            } else {
                long j13 = c20691p03.f29219v;
                boolean z13 = c20691p03.f29200c;
                q.a aVar = androidx.compose.ui.unit.q.f42862b;
                long j14 = 4294967295L;
                i14 = i22;
                list = list2;
                c20691p03.f29219v = ((z13 ? ((int) (j13 & 4294967295L)) + i12 : (int) (j13 & 4294967295L)) & 4294967295L) | ((z13 ? (int) (j13 >> 32) : ((int) (j13 >> 32)) + i12) << 32);
                if (z12) {
                    int size2 = c20691p03.f29206i.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        C20737p c20737pA = c20691p03.f29209l.a(i23, c20691p03.f29199b);
                        if (c20737pA != null) {
                            long j15 = c20737pA.f29493l;
                            if (z13) {
                                i15 = i13;
                                i16 = (int) (j15 >> 32);
                            } else {
                                i15 = i13;
                                i16 = ((int) (j15 >> 32)) + i12;
                            }
                            if (z13) {
                                j12 = 4294967295L;
                                i17 = ((int) (j15 & 4294967295L)) + i12;
                            } else {
                                j12 = 4294967295L;
                                i17 = (int) (j15 & 4294967295L);
                            }
                            c20737pA.f29493l = (i17 & j12) | (i16 << 32);
                        } else {
                            i15 = i13;
                            j12 = j14;
                        }
                        i23++;
                        j14 = j12;
                        i13 = i15;
                    }
                }
            }
            i22 = i14 + 1;
            list2 = list;
            i13 = i13;
        }
        return new C20689o0(this.f29179a, i13, this.f29181c || i12 > 0, i12, this.f29183e, this.f29184f, this.f29185g, this.f29186h, this.f29187i, this.f29188j, this.f29189k, list2, this.f29191m, this.f29192n, this.f29193o, this.f29194p, orientation, this.f29196r, this.f29197s);
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Orientation getF29195q() {
        return this.f29195q;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    public final long c() {
        InterfaceC22367j0 interfaceC22367j0 = this.f29183e;
        long f40715a = (interfaceC22367j0.getF40584b() << 32) | (interfaceC22367j0.getF40585c() & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return f40715a;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    public final int d() {
        return -this.f29191m;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    /* renamed from: e, reason: from getter */
    public final int getF29196r() {
        return this.f29196r;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    /* renamed from: f, reason: from getter */
    public final int getF29193o() {
        return this.f29193o;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    /* renamed from: g, reason: from getter */
    public final int getF29197s() {
        return this.f29197s;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight */
    public final int getF40585c() {
        return this.f29183e.getF40585c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth */
    public final int getF40584b() {
        return this.f29183e.getF40584b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.compose.foundation.lazy.grid.p0>] */
    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    @Y61.k
    public final List<C20691p0> h() {
        return this.f29190l;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    /* renamed from: i, reason: from getter */
    public final int getF29191m() {
        return this.f29191m;
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20675h0
    /* renamed from: j, reason: from getter */
    public final int getF29192n() {
        return this.f29192n;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.k
    public final Map<AbstractC22348a, Integer> t() {
        return this.f29183e.t();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f29183e.u();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.l
    public final Y41.l<R0, kotlin.G0> v() {
        return this.f29183e.v();
    }
}
