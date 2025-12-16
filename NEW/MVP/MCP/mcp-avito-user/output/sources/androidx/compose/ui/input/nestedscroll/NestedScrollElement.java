package androidx.compose.ui.input.nestedscroll;

import Y61.k;
import Y61.l;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/nestedscroll/f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends AbstractC22430p0<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f40075b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f40076c;

    public NestedScrollElement(@k a aVar, @l b bVar) {
        this.f40075b = aVar;
        this.f40076c = bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new f(this.f40075b, this.f40076c);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        f fVar = (f) dVar;
        fVar.f40088p = this.f40075b;
        b bVar = fVar.f40089q;
        if (bVar.f40077a == fVar) {
            bVar.f40077a = null;
        }
        b bVar2 = this.f40076c;
        if (bVar2 == null) {
            fVar.f40089q = new b();
        } else if (!bVar2.equals(bVar)) {
            fVar.f40089q = bVar2;
        }
        if (fVar.f42893o) {
            fVar.m2();
        }
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return L.f(nestedScrollElement.f40075b, this.f40075b) && L.f(nestedScrollElement.f40076c, this.f40076c);
    }

    public final int hashCode() {
        int iHashCode = this.f40075b.hashCode() * 31;
        b bVar = this.f40076c;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
