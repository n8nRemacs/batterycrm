package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: CodepointTransformation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/G0;", "Landroidx/compose/foundation/text/input/internal/r;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G0 implements r {
    static {
        new G0();
    }

    @Override // androidx.compose.foundation.text.input.internal.r
    public final int a(int i12, int i13) {
        if (i13 == 10) {
            return 32;
        }
        if (i13 == 13) {
            return 65279;
        }
        return i13;
    }

    @Y61.k
    public final String toString() {
        return "SingleLineCodepointTransformation";
    }
}
