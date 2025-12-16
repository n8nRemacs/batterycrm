package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20981p1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: TextFieldDecoratorModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/text/input/internal/R0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends AbstractC22430p0<R0> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new R0(null, null, null, null, false, false, null, null, false, null, false, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        R0 r02 = (R0) dVar;
        boolean z12 = r02.f30919v;
        boolean z13 = false;
        if (z12 && !r02.f30920w) {
            z13 = true;
        }
        t1 t1Var = r02.f30915r;
        C20981p1 c20981p1 = r02.f30921x;
        TextFieldSelectionState textFieldSelectionState = r02.f30917t;
        androidx.compose.foundation.interaction.m mVar = r02.f30900A;
        Y1<kotlin.G0> y12 = r02.f30902C;
        r02.f30915r = null;
        r02.f30916s = null;
        r02.f30917t = null;
        r02.f30918u = null;
        r02.f30919v = false;
        r02.f30920w = false;
        r02.f30921x = null;
        r02.f30922y = null;
        r02.f30923z = false;
        r02.f30900A = null;
        r02.f30901B = false;
        r02.f30902C = null;
        if (z13 || !kotlin.jvm.internal.L.f(null, t1Var) || !kotlin.jvm.internal.L.f(null, c20981p1) || !kotlin.jvm.internal.L.f(null, y12)) {
            r02.p2();
        }
        if (!z12 && !z13) {
            throw null;
        }
        C22421l.g(r02).Z();
        boolean zF2 = kotlin.jvm.internal.L.f(null, textFieldSelectionState);
        androidx.compose.ui.input.pointer.b0 b0Var = r02.f30903D;
        if (zF2) {
            if (kotlin.jvm.internal.L.f(null, mVar)) {
                return;
            }
            b0Var.B0();
        } else {
            b0Var.B0();
            if (r02.f42893o) {
                throw null;
            }
            new c1(r02);
            throw null;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        ((TextFieldDecoratorModifier) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + ((Object) null) + ", textLayoutState=" + ((Object) null) + ", textFieldSelectionState=" + ((Object) null) + ", filter=" + ((Object) null) + ", enabled=false, readOnly=false, keyboardOptions=" + ((Object) null) + ", keyboardActionHandler=" + ((Object) null) + ", singleLine=false, interactionSource=" + ((Object) null) + ", isPassword=false, stylusHandwritingTrigger=" + ((Object) null) + ')';
    }
}
