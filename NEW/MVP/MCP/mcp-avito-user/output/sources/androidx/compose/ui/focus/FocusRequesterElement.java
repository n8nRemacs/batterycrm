package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: FocusRequesterModifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/a0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends AbstractC22430p0<a0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f39117b;

    public FocusRequesterElement(@Y61.k S s5) {
        this.f39117b = s5;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        a0 a0Var = new a0();
        a0Var.f39155p = this.f39117b;
        return a0Var;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        a0 a0Var = (a0) dVar;
        a0Var.f39155p.f39152a.j(a0Var);
        S s5 = this.f39117b;
        a0Var.f39155p = s5;
        s5.f39152a.b(a0Var);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && kotlin.jvm.internal.L.f(this.f39117b, ((FocusRequesterElement) obj).f39117b);
    }

    public final int hashCode() {
        return this.f39117b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f39117b + ')';
    }
}
