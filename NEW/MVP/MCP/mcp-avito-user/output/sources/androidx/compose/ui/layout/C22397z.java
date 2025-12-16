package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: Layout.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/z;", "Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/x;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22397z implements InterfaceC22369k0, InterfaceC22393x {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LayoutDirection f40524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22393x f40525c;

    public C22397z(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k LayoutDirection layoutDirection) {
        this.f40524b = layoutDirection;
        this.f40525c = interfaceC22393x;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float A0(long j12) {
        return this.f40525c.A0(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
        if (i12 < 0) {
            i12 = 0;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            C47949a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C22395y(i12, i13, map);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final float E(long j12) {
        return this.f40525c.E(j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    public final boolean I1() {
        return this.f40525c.I1();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float J(int i12) {
        return this.f40525c.J(i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float K(float f12) {
        return this.f40525c.K(f12);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f40525c.getF40390d();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long L(long j12) {
        return this.f40525c.L(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float M0(float f12) {
        return this.f40525c.M0(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int O0(long j12) {
        return this.f40525c.O0(j12);
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f40525c.getF40389c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    @Y61.k
    /* renamed from: getLayoutDirection, reason: from getter */
    public final LayoutDirection getF40388b() {
        return this.f40524b;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long n(long j12) {
        return this.f40525c.n(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long o(float f12) {
        return this.f40525c.o(f12);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final long s(float f12) {
        return this.f40525c.s(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int y0(float f12) {
        return this.f40525c.y0(f12);
    }
}
