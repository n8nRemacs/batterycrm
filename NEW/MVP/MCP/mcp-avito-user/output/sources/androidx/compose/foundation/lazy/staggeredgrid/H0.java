package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* compiled from: LazyStaggeredGridMeasure.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/H0;", "", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f29571a;

    public final boolean equals(Object obj) {
        if (obj instanceof H0) {
            return this.f29571a == ((H0) obj).f29571a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29571a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("SpanRange(packedValue="), this.f29571a, ')');
    }
}
