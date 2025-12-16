package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/x0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC22430p0<C22394x0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<A, kotlin.G0> f40358b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@Y61.k Y41.l<? super A, kotlin.G0> lVar) {
        this.f40358b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C22394x0 c22394x0 = new C22394x0();
        c22394x0.f40520p = this.f40358b;
        return c22394x0;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C22394x0) dVar).f40520p = this.f40358b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f40358b == ((OnGloballyPositionedElement) obj).f40358b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40358b.hashCode();
    }
}
