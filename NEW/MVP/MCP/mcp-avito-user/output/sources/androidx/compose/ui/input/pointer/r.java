package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/r;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f40277a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f40277a == ((r) obj).f40277a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40277a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("PointerButtons(packedValue="), this.f40277a, ')');
    }
}
