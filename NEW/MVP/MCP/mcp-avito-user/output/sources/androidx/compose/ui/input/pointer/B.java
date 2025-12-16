package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/B;", "", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final long f40115a;

    public static final boolean a(long j12, long j13) {
        return j12 == j13;
    }

    public static String b(long j12) {
        return "PointerId(value=" + j12 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f40115a == ((B) obj).f40115a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40115a);
    }

    public final String toString() {
        return b(this.f40115a);
    }
}
