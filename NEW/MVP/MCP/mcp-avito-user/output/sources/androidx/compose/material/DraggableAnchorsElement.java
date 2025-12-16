package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/material/h3;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends AbstractC22430p0<C21192h3<T>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C21398x<T> f32545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<androidx.compose.ui.unit.u, C22712b, kotlin.Q<InterfaceC21153e3<T>, T>> f32546c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Orientation f32547d;

    public DraggableAnchorsElement(@Y61.k C21398x c21398x, @Y61.k Y41.p pVar) {
        Orientation orientation = Orientation.f27425b;
        this.f32545b = c21398x;
        this.f32546c = pVar;
        this.f32547d = orientation;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C21192h3 c21192h3 = new C21192h3();
        c21192h3.f33610p = this.f32545b;
        c21192h3.f33611q = this.f32546c;
        c21192h3.f33612r = this.f32547d;
        return c21192h3;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C21192h3 c21192h3 = (C21192h3) dVar;
        c21192h3.f33610p = this.f32545b;
        c21192h3.f33611q = this.f32546c;
        c21192h3.f33612r = this.f32547d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return kotlin.jvm.internal.L.f(this.f32545b, draggableAnchorsElement.f32545b) && this.f32546c == draggableAnchorsElement.f32546c && this.f32547d == draggableAnchorsElement.f32547d;
    }

    public final int hashCode() {
        return this.f32547d.hashCode() + ((this.f32546c.hashCode() + (this.f32545b.hashCode() * 31)) * 31);
    }
}
