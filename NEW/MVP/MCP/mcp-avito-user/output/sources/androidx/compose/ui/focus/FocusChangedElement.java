package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusChangedElement extends AbstractC22430p0<C22219d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<f0, G0> f39098b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@Y61.k Y41.l<? super f0, G0> lVar) {
        this.f39098b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C22219d c22219d = new C22219d();
        c22219d.f39160p = this.f39098b;
        return c22219d;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C22219d) dVar).f39160p = this.f39098b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && kotlin.jvm.internal.L.f(this.f39098b, ((FocusChangedElement) obj).f39098b);
    }

    public final int hashCode() {
        return this.f39098b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.l(new StringBuilder("FocusChangedElement(onFocusChanged="), this.f39098b, ')');
    }
}
