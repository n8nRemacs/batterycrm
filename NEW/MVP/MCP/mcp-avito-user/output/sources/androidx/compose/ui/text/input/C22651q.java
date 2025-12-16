package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/q;", "Landroidx/compose/ui/text/input/k;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22651q implements InterfaceC22645k {
    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        c22649o.f42461d = -1;
        c22649o.f42462e = -1;
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj instanceof C22651q;
    }

    public final int hashCode() {
        return m0.f406844a.b(C22651q.class).hashCode();
    }

    @Y61.k
    public final String toString() {
        return "FinishComposingTextCommand()";
    }
}
