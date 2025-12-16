package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/G1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC22430p0<G1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28398b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28399c;

    public LayoutWeightElement(float f12, boolean z12) {
        this.f28398b = f12;
        this.f28399c = z12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        G1 g12 = new G1();
        g12.f28272p = this.f28398b;
        g12.f28273q = this.f28399c;
        return g12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        G1 g12 = (G1) dVar;
        g12.f28272p = this.f28398b;
        g12.f28273q = this.f28399c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f28398b == layoutWeightElement.f28398b && this.f28399c == layoutWeightElement.f28399c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28399c) + (Float.hashCode(this.f28398b) * 31);
    }
}
