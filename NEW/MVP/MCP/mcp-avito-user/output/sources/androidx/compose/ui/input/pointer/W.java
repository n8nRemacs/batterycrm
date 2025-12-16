package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/W;", "", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final int f40195a;

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            return this.f40195a == ((W) obj).f40195a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40195a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("ProcessResult(value="), this.f40195a, ')');
    }
}
