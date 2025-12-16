package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotTree.jvm.kt */
@P
@r
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/p;", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class p {
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        ((p) obj).getClass();
        return L.f(null, null);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((androidx.appcompat.app.r.e(0, androidx.appcompat.app.r.e(0, Integer.hashCode(0) * 31, 31), 31) + 0) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SourceLocation(lineNumber=");
        sb2.append(0);
        sb2.append(", offset=");
        sb2.append(0);
        sb2.append(", length=");
        sb2.append(0);
        sb2.append(", sourceFile=");
        sb2.append((String) null);
        sb2.append(", packageHash=");
        return androidx.appcompat.app.r.t(sb2, 0, ')');
    }
}
