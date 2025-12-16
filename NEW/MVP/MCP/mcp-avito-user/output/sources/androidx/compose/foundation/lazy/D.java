package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20731m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyListBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/D;", "Landroidx/compose/foundation/lazy/layout/m;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D implements InterfaceC20731m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f28812a;

    public D(@Y61.k w0 w0Var) {
        this.f28812a = w0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int P() {
        return this.f28812a.j().getF28948n();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int Q() {
        return Math.max(0, this.f28812a.h());
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int R() {
        int i12;
        w0 w0Var = this.f28812a;
        if (w0Var.j().h().isEmpty()) {
            return 0;
        }
        Y yJ2 = w0Var.j();
        int iC2 = (int) (yJ2.getF28950p() == Orientation.f27425b ? yJ2.c() & 4294967295L : yJ2.c() >> 32);
        int iA2 = Z.a(w0Var.j());
        if (iA2 != 0 && (i12 = iC2 / iA2) >= 1) {
            return i12;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final boolean S() {
        return !this.f28812a.j().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int T() {
        return Math.min(P() - 1, ((K) C42745f0.Q(this.f28812a.j().h())).getF29645a());
    }
}
