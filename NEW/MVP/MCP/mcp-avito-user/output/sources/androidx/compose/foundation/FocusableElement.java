package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/a1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableElement extends AbstractC22430p0<C20409a1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f26703b;

    public FocusableElement(@Y61.l androidx.compose.foundation.interaction.m mVar) {
        this.f26703b = mVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20409a1(this.f26703b, 0, null, 6, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C20409a1) dVar).p2(this.f26703b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return kotlin.jvm.internal.L.f(this.f26703b, ((FocusableElement) obj).f26703b);
        }
        return false;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.m mVar = this.f26703b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }
}
