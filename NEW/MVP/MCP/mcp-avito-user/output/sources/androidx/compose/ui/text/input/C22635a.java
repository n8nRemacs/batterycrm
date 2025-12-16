package androidx.compose.ui.text.input;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/a;", "Landroidx/compose/ui/text/input/k;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22635a implements InterfaceC22645k {
    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        if (c22649o.e()) {
            c22649o.a(c22649o.f42461d, c22649o.f42462e);
            return;
        }
        if (c22649o.d() == -1) {
            int i12 = c22649o.f42459b;
            int i13 = c22649o.f42460c;
            c22649o.h(i12, i12);
            c22649o.a(i12, i13);
            return;
        }
        if (c22649o.d() == 0) {
            return;
        }
        String string = c22649o.f42458a.toString();
        int iD2 = c22649o.d();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        c22649o.a(characterInstance.preceding(iD2), c22649o.d());
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj instanceof C22635a;
    }

    public final int hashCode() {
        return m0.f406844a.b(C22635a.class).hashCode();
    }

    @Y61.k
    public final String toString() {
        return "BackspaceCommand()";
    }
}
