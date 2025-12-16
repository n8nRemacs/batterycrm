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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/semantics/q;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends AbstractC22430p0<C22556d> implements q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41716b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<F, G0> f41717c;

    public AppendedSemanticsElement(@Y61.k Y41.l lVar, boolean z12) {
        this.f41716b = z12;
        this.f41717c = lVar;
    }

    @Override // androidx.compose.ui.semantics.q
    @Y61.k
    public final l Q() {
        l lVar = new l();
        lVar.f41788d = this.f41716b;
        this.f41717c.invoke(lVar);
        return lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C22556d(this.f41716b, false, this.f41717c);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C22556d c22556d = (C22556d) dVar;
        c22556d.f41731p = this.f41716b;
        c22556d.f41733r = this.f41717c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f41716b == appendedSemanticsElement.f41716b && L.f(this.f41717c, appendedSemanticsElement.f41717c);
    }

    public final int hashCode() {
        return this.f41717c.hashCode() + (Boolean.hashCode(this.f41716b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppendedSemanticsElement(mergeDescendants=");
        sb2.append(this.f41716b);
        sb2.append(", properties=");
        return H.l(sb2, this.f41717c, ')');
    }
}
