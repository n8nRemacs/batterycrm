package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.r1;
import kotlin.Metadata;

/* compiled from: TransformOrigin.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s1 {
    public static final long a(float f12, float f13) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        r1.a aVar = r1.f39755b;
        return jFloatToRawIntBits;
    }
}
