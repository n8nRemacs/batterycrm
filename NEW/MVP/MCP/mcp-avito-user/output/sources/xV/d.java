package xV;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgressBarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxV/d;", "LxV/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements InterfaceC49889b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<C49890c> f442515a;

    public d(@k List<C49890c> list) {
        this.f442515a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f442515a, ((d) obj).f442515a);
    }

    public final int hashCode() {
        return this.f442515a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("Segments(value="), this.f442515a, ')');
    }
}
