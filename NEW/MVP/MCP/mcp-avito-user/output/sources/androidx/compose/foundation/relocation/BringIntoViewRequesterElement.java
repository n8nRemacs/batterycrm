package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BringIntoViewRequester.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/relocation/h;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC22430p0<h> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f30067b;

    public BringIntoViewRequesterElement(@Y61.k a aVar) {
        this.f30067b = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        h hVar = new h();
        hVar.f30077p = this.f30067b;
        return hVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        h hVar = (h) dVar;
        a aVar = hVar.f30077p;
        if (aVar instanceof d) {
            ((d) aVar).f30076a.j(hVar);
        }
        a aVar2 = this.f30067b;
        if (aVar2 instanceof d) {
            ((d) aVar2).f30076a.b(hVar);
        }
        hVar.f30077p = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (L.f(this.f30067b, ((BringIntoViewRequesterElement) obj).f30067b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30067b.hashCode();
    }
}
