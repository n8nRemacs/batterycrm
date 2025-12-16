package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotTree.jvm.kt */
@P
@r
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/i;", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class i {
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        ((i) obj).getClass();
        return L.f(null, null) && L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParameterInformation(name=");
        sb2.append((String) null);
        sb2.append(", value=");
        sb2.append((Object) null);
        sb2.append(", fromDefault=");
        sb2.append(false);
        sb2.append(", static=");
        sb2.append(false);
        sb2.append(", compared=");
        sb2.append(false);
        sb2.append(", inlineClass=");
        sb2.append((String) null);
        sb2.append(", stable=");
        return androidx.appcompat.app.r.x(sb2, false, ')');
    }
}
