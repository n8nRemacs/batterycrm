package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.R0;
import androidx.compose.ui.unit.u;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerMeasureResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/Z;", "Landroidx/compose/foundation/pager/K;", "Landroidx/compose/ui/layout/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z implements K, InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<C20820n> f29866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Orientation f29870e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29871f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29872g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29873h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29874i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final C20820n f29875j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final C20820n f29876k;

    /* renamed from: l, reason: collision with root package name */
    public final float f29877l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29878m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29879n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.gestures.snapping.v f29880o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22367j0 f29881p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29882q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final List<C20820n> f29883r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final List<C20820n> f29884s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f29885t;

    public Z(@Y61.k List<C20820n> list, int i12, int i13, int i14, @Y61.k Orientation orientation, int i15, int i16, boolean z12, int i17, @Y61.l C20820n c20820n, @Y61.l C20820n c20820n2, float f12, int i18, boolean z13, @Y61.k androidx.compose.foundation.gestures.snapping.v vVar, @Y61.k InterfaceC22367j0 interfaceC22367j0, boolean z14, @Y61.k List<C20820n> list2, @Y61.k List<C20820n> list3, @Y61.k kotlinx.coroutines.T t12) {
        this.f29866a = list;
        this.f29867b = i12;
        this.f29868c = i13;
        this.f29869d = i14;
        this.f29870e = orientation;
        this.f29871f = i15;
        this.f29872g = i16;
        this.f29873h = z12;
        this.f29874i = i17;
        this.f29875j = c20820n;
        this.f29876k = c20820n2;
        this.f29877l = f12;
        this.f29878m = i18;
        this.f29879n = z13;
        this.f29880o = vVar;
        this.f29881p = interfaceC22367j0;
        this.f29882q = z14;
        this.f29883r = list2;
        this.f29884s = list3;
        this.f29885t = t12;
    }

    @Override // androidx.compose.foundation.pager.K
    /* renamed from: C, reason: from getter */
    public final int getF29867b() {
        return this.f29867b;
    }

    @Override // androidx.compose.foundation.pager.K
    /* renamed from: a, reason: from getter */
    public final int getF29868c() {
        return this.f29868c;
    }

    @Override // androidx.compose.foundation.pager.K
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Orientation getF29870e() {
        return this.f29870e;
    }

    @Override // androidx.compose.foundation.pager.K
    public final long c() {
        InterfaceC22367j0 interfaceC22367j0 = this.f29881p;
        long f40715a = (interfaceC22367j0.getF40394a() << 32) | (interfaceC22367j0.getF40395b() & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return f40715a;
    }

    @Override // androidx.compose.foundation.pager.K
    public final int d() {
        return -this.f29871f;
    }

    @Override // androidx.compose.foundation.pager.K
    /* renamed from: e, reason: from getter */
    public final int getF29869d() {
        return this.f29869d;
    }

    @Override // androidx.compose.foundation.pager.K
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final androidx.compose.foundation.gestures.snapping.v getF29880o() {
        return this.f29880o;
    }

    @Override // androidx.compose.foundation.pager.K
    /* renamed from: g, reason: from getter */
    public final boolean getF29873h() {
        return this.f29873h;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight */
    public final int getF40395b() {
        return this.f29881p.getF40395b();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth */
    public final int getF40394a() {
        return this.f29881p.getF40394a();
    }

    @Override // androidx.compose.foundation.pager.K
    @Y61.k
    public final List<C20820n> h() {
        return this.f29866a;
    }

    @Y61.l
    public final Z i(int i12) {
        int i13;
        int i14;
        int i15 = this.f29867b + this.f29868c;
        if (this.f29882q) {
            return null;
        }
        List<C20820n> list = this.f29866a;
        if (list.isEmpty() || this.f29875j == null || (i14 = (i13 = this.f29878m) - i12) < 0 || i14 >= i15) {
            return null;
        }
        float f12 = i15 != 0 ? i12 / i15 : 0.0f;
        float f13 = this.f29877l;
        float f14 = f13 - f12;
        if (this.f29876k == null || f14 >= 0.5f || f14 <= -0.5f) {
            return null;
        }
        C20820n c20820n = (C20820n) C42745f0.E(list);
        C20820n c20820n2 = (C20820n) C42745f0.Q(list);
        int i16 = this.f29872g;
        int i17 = this.f29871f;
        if (i12 < 0) {
            if (Math.min((c20820n.f30013m + i15) - i17, (c20820n2.f30013m + i15) - i16) <= (-i12)) {
                return null;
            }
        } else if (Math.min(i17 - c20820n.f30013m, i16 - c20820n2.f30013m) <= i12) {
            return null;
        }
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            list.get(i18).a(i12);
        }
        List<C20820n> list2 = this.f29883r;
        int size2 = list2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            list2.get(i19).a(i12);
        }
        List<C20820n> list3 = this.f29884s;
        int size3 = list3.size();
        for (int i22 = 0; i22 < size3; i22++) {
            list3.get(i22).a(i12);
        }
        return new Z(this.f29866a, this.f29867b, this.f29868c, this.f29869d, this.f29870e, this.f29871f, this.f29872g, this.f29873h, this.f29874i, this.f29875j, this.f29876k, f13 - f12, i13 - i12, this.f29879n || i12 > 0, this.f29880o, this.f29881p, this.f29882q, this.f29883r, this.f29884s, this.f29885t);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.k
    public final Map<AbstractC22348a, Integer> t() {
        return this.f29881p.t();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f29881p.u();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    @Y61.l
    public final Y41.l<R0, G0> v() {
        return this.f29881p.v();
    }

    public Z(List list, int i12, int i13, int i14, Orientation orientation, int i15, int i16, boolean z12, int i17, C20820n c20820n, C20820n c20820n2, float f12, int i18, boolean z13, androidx.compose.foundation.gestures.snapping.v vVar, InterfaceC22367j0 interfaceC22367j0, boolean z14, List list2, List list3, kotlinx.coroutines.T t12, int i19, C42822w c42822w) {
        this(list, i12, i13, i14, orientation, i15, i16, z12, i17, c20820n, c20820n2, f12, i18, z13, vVar, interfaceC22367j0, z14, (i19 & 131072) != 0 ? C42784z0.f406748b : list2, (i19 & 262144) != 0 ? C42784z0.f406748b : list3, t12);
    }
}
