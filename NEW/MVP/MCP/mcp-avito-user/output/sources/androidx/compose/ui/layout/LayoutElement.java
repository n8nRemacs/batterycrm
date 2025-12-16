package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/O;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends AbstractC22430p0<O> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> f40355b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@Y61.k Y41.q<? super InterfaceC22369k0, ? super InterfaceC22363h0, ? super C22712b, ? extends InterfaceC22367j0> qVar) {
        this.f40355b = qVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        O o12 = new O();
        o12.f40357p = this.f40355b;
        return o12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((O) dVar).f40357p = this.f40355b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && kotlin.jvm.internal.L.f(this.f40355b, ((LayoutElement) obj).f40355b);
    }

    public final int hashCode() {
        return this.f40355b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "LayoutElement(measure=" + this.f40355b + ')';
    }
}
