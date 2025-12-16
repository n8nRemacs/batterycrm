package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyLayoutPrefetchState.kt */
@W0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/layout/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends AbstractC22430p0<O0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20714d0 f29363b;

    public TraversablePrefetchStateModifierElement(@Y61.k C20714d0 c20714d0) {
        this.f29363b = c20714d0;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new O0(this.f29363b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((O0) dVar).f29357p = this.f29363b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && kotlin.jvm.internal.L.f(this.f29363b, ((TraversablePrefetchStateModifierElement) obj).f29363b);
    }

    public final int hashCode() {
        return this.f29363b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f29363b + ')';
    }
}
