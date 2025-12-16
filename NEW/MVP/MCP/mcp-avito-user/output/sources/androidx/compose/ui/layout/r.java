package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/r;", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class r implements InterfaceC22374n {
    @Override // androidx.compose.ui.layout.InterfaceC22374n
    public final long a(long j12, long j13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i12 = S0.f40400b;
        return jFloatToRawIntBits;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        ((r) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    @Y61.k
    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
