package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.V;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Xyz.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/v;", "Landroidx/compose/ui/graphics/colorspace/c;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v extends c {
    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] a(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        fArr[0] = f12;
        float f13 = fArr[1];
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        float f15 = f14 >= -2.0f ? f14 : -2.0f;
        fArr[2] = f15 <= 2.0f ? f15 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i12) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i12) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f12, float f13, float f14) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        return (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13 <= 2.0f ? f13 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] f(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        fArr[0] = f12;
        float f13 = fArr[1];
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        float f15 = f14 >= -2.0f ? f14 : -2.0f;
        fArr[2] = f15 <= 2.0f ? f15 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f12, float f13, float f14) {
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            return 2.0f;
        }
        return f14;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f12, float f13, float f14, float f15, @Y61.k c cVar) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        return V.a(f12, f13, f14 <= 2.0f ? f14 : 2.0f, f15, cVar);
    }
}
