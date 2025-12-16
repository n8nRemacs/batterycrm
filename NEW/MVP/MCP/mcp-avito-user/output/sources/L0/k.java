package l0;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Rect.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {
    @F3
    @Y61.k
    public static final j a(long j12, long j13) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        return new j(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat(i13));
    }
}
