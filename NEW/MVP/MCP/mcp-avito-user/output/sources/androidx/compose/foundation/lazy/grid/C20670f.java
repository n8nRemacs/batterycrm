package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20731m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyGridBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/f;", "Landroidx/compose/foundation/lazy/layout/m;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20670f implements InterfaceC20731m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I0 f29120a;

    public C20670f(@Y61.k I0 i02) {
        this.f29120a = i02;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int P() {
        return this.f29120a.j().getF29193o();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int Q() {
        return this.f29120a.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int R() {
        int i12;
        I0 i02 = this.f29120a;
        if (i02.j().h().isEmpty()) {
            return 0;
        }
        InterfaceC20675h0 interfaceC20675h0J = i02.j();
        int iC2 = (int) (interfaceC20675h0J.getF29195q() == Orientation.f27425b ? interfaceC20675h0J.c() & 4294967295L : interfaceC20675h0J.c() >> 32);
        int iA2 = C20677i0.a(i02.j());
        if (iA2 != 0 && (i12 = iC2 / iA2) >= 1) {
            return i12;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final boolean S() {
        return !this.f29120a.j().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int T() {
        return ((O) C42745f0.Q(this.f29120a.j().h())).getF29645a();
    }
}
