package androidx.compose.ui;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: SensitiveContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/SensitiveNodeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/A;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SensitiveNodeElement extends AbstractC22430p0<A> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new A();
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        A a12 = (A) dVar;
        a12.getClass();
        if (a12.f38809p) {
            ((AndroidComposeView) C22421l.h(a12)).m();
            a12.f38809p = false;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveNodeElement)) {
            return false;
        }
        ((SensitiveNodeElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Y61.k
    public final String toString() {
        return "SensitiveNodeElement(isContentSensitive=false)";
    }
}
