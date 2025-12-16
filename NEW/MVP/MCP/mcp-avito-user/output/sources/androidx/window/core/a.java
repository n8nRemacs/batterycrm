package androidx.window.core;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActivityComponentInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/a;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ((a) obj).getClass();
        return L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClassInfo { packageName: ");
        sb2.append((String) null);
        sb2.append(", className: ");
        return AK.c.s(sb2, null, " }");
    }
}
