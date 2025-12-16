package androidx.compose.ui.semantics;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SemanticsModifier.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/semantics/q;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends AbstractC22430p0<C22556d> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<F, G0> f41720b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@Y61.k Y41.l<? super F, G0> lVar) {
        this.f41720b = lVar;
    }

    @Override // androidx.compose.ui.semantics.q
    @Y61.k
    public final l Q() {
        l lVar = new l();
        lVar.f41788d = false;
        lVar.f41789e = true;
        this.f41720b.invoke(lVar);
        return lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C22556d(false, true, this.f41720b);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C22556d) dVar).f41733r = this.f41720b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && L.f(this.f41720b, ((ClearAndSetSemanticsElement) obj).f41720b);
    }

    public final int hashCode() {
        return this.f41720b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.l(new StringBuilder("ClearAndSetSemanticsElement(properties="), this.f41720b, ')');
    }
}
