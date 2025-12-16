package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Lab.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/l;", "Landroidx/compose/ui/graphics/colorspace/c;", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends c {

    /* compiled from: Lab.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/l$a;", "", "<init>", "()V", "", "A", "F", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] a(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        k.f39425a.getClass();
        float[] fArr2 = k.f39430f;
        float f13 = f12 / fArr2[0];
        float f14 = fArr[1] / fArr2[1];
        float f15 = fArr[2] / fArr2[2];
        float fCbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f16 = (116.0f * fCbrt2) - 16.0f;
        float f17 = (fCbrt - fCbrt2) * 500.0f;
        float f18 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        if (f16 > 100.0f) {
            f16 = 100.0f;
        }
        fArr[0] = f16;
        if (f17 < -128.0f) {
            f17 = -128.0f;
        }
        if (f17 > 128.0f) {
            f17 = 128.0f;
        }
        fArr[1] = f17;
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        fArr[2] = f18 <= 128.0f ? f18 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i12) {
        return i12 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i12) {
        return i12 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f12, float f13, float f14) {
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 100.0f) {
            f12 = 100.0f;
        }
        if (f13 < -128.0f) {
            f13 = -128.0f;
        }
        if (f13 > 128.0f) {
            f13 = 128.0f;
        }
        float f15 = (f12 + 16.0f) / 116.0f;
        float f16 = (f13 * 0.002f) + f15;
        float f17 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f18 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        k kVar = k.f39425a;
        kVar.getClass();
        float f19 = f17 * k.f39430f[0];
        kVar.getClass();
        return (Float.floatToRawIntBits(f18 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f19) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] f(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 100.0f) {
            f12 = 100.0f;
        }
        fArr[0] = f12;
        float f13 = fArr[1];
        if (f13 < -128.0f) {
            f13 = -128.0f;
        }
        if (f13 > 128.0f) {
            f13 = 128.0f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        float f15 = f14 >= -128.0f ? f14 : -128.0f;
        float f16 = f15 <= 128.0f ? f15 : 128.0f;
        fArr[2] = f16;
        float f17 = (f12 + 16.0f) / 116.0f;
        float f18 = (f13 * 0.002f) + f17;
        float f19 = f17 - (f16 * 0.005f);
        float f22 = f18 > 0.20689656f ? f18 * f18 * f18 : (f18 - 0.13793103f) * 0.12841855f;
        float f23 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float f24 = f19 > 0.20689656f ? f19 * f19 * f19 : (f19 - 0.13793103f) * 0.12841855f;
        k.f39425a.getClass();
        float[] fArr2 = k.f39430f;
        fArr[0] = f22 * fArr2[0];
        fArr[1] = f23 * fArr2[1];
        fArr[2] = f24 * fArr2[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f12, float f13, float f14) {
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 100.0f) {
            f12 = 100.0f;
        }
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        float f15 = ((f12 + 16.0f) / 116.0f) - (f14 * 0.005f);
        float f16 = f15 > 0.20689656f ? f15 * f15 * f15 : 0.12841855f * (f15 - 0.13793103f);
        k.f39425a.getClass();
        return f16 * k.f39430f[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f12, float f13, float f14, float f15, @Y61.k c cVar) {
        k kVar = k.f39425a;
        kVar.getClass();
        float[] fArr = k.f39430f;
        float f16 = f12 / fArr[0];
        kVar.getClass();
        float f17 = f13 / fArr[1];
        kVar.getClass();
        float f18 = f14 / fArr[2];
        float fCbrt = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
        float f19 = (116.0f * fCbrt2) - 16.0f;
        float f22 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f19 < 0.0f) {
            f19 = 0.0f;
        }
        if (f19 > 100.0f) {
            f19 = 100.0f;
        }
        if (f22 < -128.0f) {
            f22 = -128.0f;
        }
        if (f22 > 128.0f) {
            f22 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return V.a(f19, f22, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f15, cVar);
    }
}
