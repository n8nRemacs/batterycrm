package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@F3
@X41.g
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00028\u0000¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/M0;", "T", "", "value", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f29345a;

    public final boolean equals(Object obj) {
        if (obj instanceof M0) {
            return kotlin.jvm.internal.L.f(this.f29345a, ((M0) obj).f29345a);
        }
        return false;
    }

    public final int hashCode() {
        T t12 = this.f29345a;
        if (t12 == null) {
            return 0;
        }
        return t12.hashCode();
    }

    public final String toString() {
        return "StableValue(value=" + this.f29345a + ')';
    }
}
