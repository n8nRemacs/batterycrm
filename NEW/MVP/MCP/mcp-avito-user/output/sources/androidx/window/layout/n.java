package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: WindowLayoutInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/n;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f55342a;

    @RestrictTo
    public n(@Y61.k List<? extends a> list) {
        this.f55342a = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n.class.equals(obj.getClass())) {
            return false;
        }
        return L.f(this.f55342a, ((n) obj).f55342a);
    }

    public final int hashCode() {
        return this.f55342a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O((Iterable) this.f55342a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
