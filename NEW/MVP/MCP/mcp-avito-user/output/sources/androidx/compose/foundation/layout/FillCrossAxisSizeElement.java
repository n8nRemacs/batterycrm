package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillCrossAxisSizeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/v0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FillCrossAxisSizeElement extends AbstractC22430p0<C20629v0> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28254b = 1.0f;

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20629v0 c20629v0 = new C20629v0();
        c20629v0.f28754p = this.f28254b;
        return c20629v0;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C20629v0) dVar).f28754p = this.f28254b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        C20629v0 c20629v0 = obj instanceof C20629v0 ? (C20629v0) obj : null;
        if (c20629v0 == null) {
            return false;
        }
        return this.f28254b == c20629v0.f28754p;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28254b) * 31;
    }
}
