package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextLayout.android.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/P;", "", "packedValue", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final long f42003a;

    public final boolean equals(Object obj) {
        if (obj instanceof P) {
            return this.f42003a == ((P) obj).f42003a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42003a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("VerticalPaddings(packedValue="), this.f42003a, ')');
    }
}
