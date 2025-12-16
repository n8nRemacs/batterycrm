package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import java.util.Map;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: ApproachMeasureScope.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/j;", "Landroidx/compose/ui/layout/h;", "Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/Z;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22366j implements InterfaceC22362h, InterfaceC22369k0, Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.node.L f40469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public InterfaceC22358f f40470c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40471d;

    public C22366j(@Y61.k androidx.compose.ui.node.L l12, @Y61.k InterfaceC22358f interfaceC22358f) {
        this.f40469b = l12;
        this.f40470c = interfaceC22358f;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float A0(long j12) {
        return this.f40469b.A0(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            C47949a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C22364i(i12, i13, map, lVar, this);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final float E(long j12) {
        return this.f40469b.E(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float J(int i12) {
        return this.f40469b.J(i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float K(float f12) {
        return this.f40469b.K(f12);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f40469b.getF40390d();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long L(long j12) {
        return this.f40469b.L(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 L0(int i12, int i13, @Y61.k Map<AbstractC22348a, Integer> map, @Y61.k Y41.l<? super K0.a, kotlin.G0> lVar) {
        return this.f40469b.A1(i12, i13, map, lVar);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float M0(float f12) {
        return this.f40469b.getF40389c() * f12;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int O0(long j12) {
        return this.f40469b.O0(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22352c
    public final long Z() {
        InterfaceC22367j0 interfaceC22367j0Z0 = this.f40469b.f40580V.z0();
        long f40464a = (interfaceC22367j0Z0.getF40464a() << 32) | (interfaceC22367j0Z0.getF40465b() & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return f40464a;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f40469b.getF40389c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    @Y61.k
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getF40449b() {
        return this.f40469b.f40909n.f40609C;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long n(long j12) {
        return this.f40469b.n(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long o(float f12) {
        return this.f40469b.o(f12);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final long s(float f12) {
        return this.f40469b.s(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int y0(float f12) {
        return this.f40469b.y0(f12);
    }
}
