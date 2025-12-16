package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: OnLayoutRectChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnLayoutRectChangedElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/z0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class OnLayoutRectChangedElement extends AbstractC22430p0<C22398z0> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C22398z0();
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C22398z0 c22398z0 = (C22398z0) dVar;
        c22398z0.getClass();
        c22398z0.k2();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        ((OnLayoutRectChangedElement) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        Long.hashCode(0L);
        Long.hashCode(0L);
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=0, debounceMillis=0, callback=null)";
    }
}
