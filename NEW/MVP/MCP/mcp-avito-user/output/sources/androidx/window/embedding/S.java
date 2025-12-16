package androidx.window.embedding;

import kotlin.Metadata;

/* compiled from: SplitInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/S;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S {
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        ((S) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SplitInfo:{");
        sb2.append("primaryActivityStack=" + ((Object) null) + ", ");
        sb2.append("secondaryActivityStack=" + ((Object) null) + ", ");
        sb2.append("splitAttributes=" + ((Object) null) + ", ");
        StringBuilder sb3 = new StringBuilder("token=");
        sb3.append((Object) null);
        sb2.append(sb3.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
