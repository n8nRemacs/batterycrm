package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LayoutId.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/D;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutIdElement extends AbstractC22430p0<D> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f40356b;

    public LayoutIdElement(@Y61.k Object obj) {
        this.f40356b = obj;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        D d12 = new D();
        d12.f40328p = this.f40356b;
        return d12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((D) dVar).f40328p = this.f40356b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && kotlin.jvm.internal.L.f(this.f40356b, ((LayoutIdElement) obj).f40356b);
    }

    public final int hashCode() {
        return this.f40356b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("LayoutIdElement(layoutId="), this.f40356b, ')');
    }
}
