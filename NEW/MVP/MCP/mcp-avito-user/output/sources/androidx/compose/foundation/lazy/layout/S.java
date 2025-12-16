package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LazyLayoutMeasureScope.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/S;", "Landroidx/compose/foundation/lazy/layout/Q;", "Landroidx/compose/ui/layout/k0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S implements Q, InterfaceC22369k0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f29359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z0 f29360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final F f29361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.A0<List<androidx.compose.ui.layout.K0>> f29362e = androidx.collection.K.a();

    public S(@Y61.k B b12, @Y61.k Z0 z02) {
        this.f29359b = b12;
        this.f29360c = z02;
        this.f29361d = b12.f29247b.invoke();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float A0(long j12) {
        return this.f29360c.A0(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
        return this.f29360c.A1(i12, i13, map, lVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.n
    public final float E(long j12) {
        return this.f29360c.E(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    public final boolean I1() {
        return this.f29360c.I1();
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.d
    public final float J(int i12) {
        return this.f29360c.J(i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.d
    public final float K(float f12) {
        return this.f29360c.K(f12);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f29360c.getF40390d();
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.d
    public final long L(long j12) {
        return this.f29360c.L(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 L0(int i12, int i13, @Y61.k Map<AbstractC22348a, Integer> map, @Y61.k Y41.l<? super K0.a, kotlin.G0> lVar) {
        return this.f29360c.L0(i12, i13, map, lVar);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float M0(float f12) {
        return this.f29360c.M0(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int O0(long j12) {
        return this.f29360c.O0(j12);
    }

    @Override // androidx.compose.foundation.lazy.layout.Q
    @Y61.k
    public final List<androidx.compose.ui.layout.K0> W(int i12, long j12) {
        androidx.collection.A0<List<androidx.compose.ui.layout.K0>> a02 = this.f29362e;
        List<androidx.compose.ui.layout.K0> listB = a02.b(i12);
        if (listB != null) {
            return listB;
        }
        F f12 = this.f29361d;
        Object key = f12.getKey(i12);
        List<InterfaceC22363h0> listH0 = this.f29360c.h0(key, this.f29359b.a(i12, key, f12.g(i12)));
        int size = listH0.size();
        ArrayList arrayList = new ArrayList(size);
        int iF2 = 0;
        while (iF2 < size) {
            iF2 = androidx.compose.foundation.H.f(listH0.get(iF2), j12, arrayList, iF2, 1);
        }
        a02.h(i12, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f29360c.getF40389c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    @Y61.k
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getF40524b() {
        return this.f29360c.getF40524b();
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.d
    public final long n(long j12) {
        return this.f29360c.n(j12);
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.d
    public final long o(float f12) {
        return this.f29360c.o(f12);
    }

    @Override // androidx.compose.foundation.lazy.layout.Q, androidx.compose.ui.unit.n
    public final long s(float f12) {
        return this.f29360c.s(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int y0(float f12) {
        return this.f29360c.y0(f12);
    }
}
