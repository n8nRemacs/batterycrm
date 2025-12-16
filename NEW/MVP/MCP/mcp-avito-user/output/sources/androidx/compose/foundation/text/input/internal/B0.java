package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: OffsetMappingCalculator.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/B0;", "", "values", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final int[] f30786a;

    public final boolean equals(Object obj) {
        if (obj instanceof B0) {
            return kotlin.jvm.internal.L.f(this.f30786a, ((B0) obj).f30786a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30786a);
    }

    public final String toString() {
        return "OpArray(values=" + Arrays.toString(this.f30786a) + ')';
    }
}
