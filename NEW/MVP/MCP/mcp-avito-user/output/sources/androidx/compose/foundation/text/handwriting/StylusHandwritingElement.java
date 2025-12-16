package androidx.compose.foundation.text.handwriting;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StylusHandwriting.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/handwriting/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class StylusHandwritingElement extends AbstractC22430p0<i> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f30722b;

    public StylusHandwritingElement(@k Y41.a<G0> aVar) {
        this.f30722b = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new i(this.f30722b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((i) dVar).f30732r = this.f30722b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && L.f(this.f30722b, ((StylusHandwritingElement) obj).f30722b);
    }

    public final int hashCode() {
        return this.f30722b.hashCode();
    }

    @k
    public final String toString() {
        return r.v(new StringBuilder("StylusHandwritingElement(onHandwritingSlopExceeded="), this.f30722b, ')');
    }
}
