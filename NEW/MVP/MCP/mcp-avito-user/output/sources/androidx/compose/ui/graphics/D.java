package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import kotlin.Metadata;

/* compiled from: Bezier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* compiled from: Bezier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PathSegment.Type type = PathSegment.Type.f39312b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PathSegment.Type type2 = PathSegment.Type.f39312b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PathSegment.Type type3 = PathSegment.Type.f39312b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PathSegment.Type type4 = PathSegment.Type.f39312b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PathSegment.Type type5 = PathSegment.Type.f39312b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PathSegment.Type type6 = PathSegment.Type.f39312b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final int a(float f12, int i12, float[] fArr) {
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (Math.abs(f13 - f12) > 1.05E-6f) {
            f13 = Float.NaN;
        }
        fArr[i12] = f13;
        return !Float.isNaN(f13) ? 1 : 0;
    }
}
