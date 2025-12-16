package androidx.compose.ui.text.input;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlatformImeOptions.android.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/O;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f42366a;

    public O() {
        this(null, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return kotlin.jvm.internal.L.f(this.f42366a, ((O) obj).f42366a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f42366a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.f42366a, ')');
    }

    public O(String str, int i12, C42822w c42822w) {
        this.f42366a = (i12 & 1) != 0 ? null : str;
    }
}
