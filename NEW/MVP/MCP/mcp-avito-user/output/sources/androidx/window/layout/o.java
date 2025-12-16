package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.core.view.J0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WindowMetrics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/o;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.window.core.c f55343a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f55344b;

    public o(@Y61.k androidx.window.core.c cVar, @Y61.k J0 j02) {
        this.f55343a = cVar;
        this.f55344b = j02;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f55343a, oVar.f55343a) && L.f(this.f55344b, oVar.f55344b);
    }

    public final int hashCode() {
        return this.f55344b.hashCode() + (this.f55343a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "WindowMetrics( bounds=" + this.f55343a + ", windowInsetsCompat=" + this.f55344b + ')';
    }

    public /* synthetic */ o(Rect rect, J0 j02, int i12, C42822w c42822w) {
        this(rect, (i12 & 2) != 0 ? new J0.b().a() : j02);
    }

    @RestrictTo
    public o(@Y61.k Rect rect, @Y61.k J0 j02) {
        this(new androidx.window.core.c(rect), j02);
    }
}
