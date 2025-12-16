package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: ColorMatrix.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/W;", "", "values", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f39338a;

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            return kotlin.jvm.internal.L.f(this.f39338a, ((W) obj).f39338a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39338a);
    }

    public final String toString() {
        return "ColorMatrix(values=" + Arrays.toString(this.f39338a) + ')';
    }
}
