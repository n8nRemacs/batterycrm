package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: FontFamily.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/j0;", "Landroidx/compose/ui/text/font/E;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 extends E {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.platform.q f42267h;

    public j0(@Y61.k androidx.compose.ui.text.platform.q qVar) {
        super(true, null);
        this.f42267h = qVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return kotlin.jvm.internal.L.f(this.f42267h, ((j0) obj).f42267h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42267h.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f42267h + ')';
    }
}
