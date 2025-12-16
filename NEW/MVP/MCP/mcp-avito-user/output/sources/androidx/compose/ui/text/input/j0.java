package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;

/* compiled from: VisualTransformation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/j0;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f42449a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f42450b;

    public j0(@Y61.k C22602e c22602e, @Y61.k L l12) {
        this.f42449a = c22602e;
        this.f42450b = l12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.L.f(this.f42449a, j0Var.f42449a) && kotlin.jvm.internal.L.f(this.f42450b, j0Var.f42450b);
    }

    public final int hashCode() {
        return this.f42450b.hashCode() + (this.f42449a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f42449a) + ", offsetMapping=" + this.f42450b + ')';
    }
}
