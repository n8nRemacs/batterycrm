package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/E;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E implements InterfaceC22645k {
    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        if (c22649o.d() == -1) {
            int i12 = c22649o.f42459b;
            c22649o.h(i12, i12);
        }
        int i13 = c22649o.f42459b;
        c22649o.f42458a.toString();
        c22649o.h(i13, i13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        ((E) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "MoveCursorCommand(amount=0)";
    }
}
