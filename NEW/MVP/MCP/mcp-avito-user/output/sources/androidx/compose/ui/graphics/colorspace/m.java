package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Oklab.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/m;", "Landroidx/compose/ui/graphics/colorspace/c;", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final float[] f39431d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final float[] f39432e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final float[] f39433f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final float[] f39434g;

    /* compiled from: Oklab.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/m$a;", "", "<init>", "()V", "", "InverseM1", "[F", "InverseM2", "M1", "M2", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        androidx.compose.ui.graphics.colorspace.a.f39377b.getClass();
        float[] fArr = androidx.compose.ui.graphics.colorspace.a.f39378c.f39379a;
        k.f39425a.getClass();
        float[] fArrF = d.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(fArr, k.f39427c.a(), k.f39429e.a()));
        f39431d = fArrF;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f39432e = fArr2;
        f39433f = d.e(fArrF);
        f39434g = d.e(fArr2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] a(@Y61.k float[] fArr) {
        d.h(f39431d, fArr);
        fArr[0] = E0.e.a(fArr[0]);
        fArr[1] = E0.e.a(fArr[1]);
        fArr[2] = E0.e.a(fArr[2]);
        d.h(f39432e, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i12) {
        return i12 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i12) {
        return i12 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f12, float f13, float f14) {
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        if (f13 > 0.5f) {
            f13 = 0.5f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        float f15 = f14 <= 0.5f ? f14 : 0.5f;
        float[] fArr = f39434g;
        float f16 = (fArr[6] * f15) + (fArr[3] * f13) + (fArr[0] * f12);
        float f17 = (fArr[7] * f15) + (fArr[4] * f13) + (fArr[1] * f12);
        float f18 = (fArr[8] * f15) + (fArr[5] * f13) + (fArr[2] * f12);
        float f19 = f17 * f17 * f17;
        float f22 = f18 * f18 * f18;
        float[] fArr2 = f39433f;
        float f23 = (fArr2[6] * f22) + (fArr2[3] * f19) + (fArr2[0] * f16 * f16 * f16);
        return (Float.floatToRawIntBits((fArr2[7] * f22) + (fArr2[4] * f19) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f23) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @Y61.k
    public final float[] f(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        fArr[0] = f12;
        float f13 = fArr[1];
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        if (f13 > 0.5f) {
            f13 = 0.5f;
        }
        fArr[1] = f13;
        float f14 = fArr[2];
        float f15 = f14 >= -0.5f ? f14 : -0.5f;
        fArr[2] = f15 <= 0.5f ? f15 : 0.5f;
        d.h(f39434g, fArr);
        float f16 = fArr[0];
        fArr[0] = f16 * f16 * f16;
        float f17 = fArr[1];
        fArr[1] = f17 * f17 * f17;
        float f18 = fArr[2];
        fArr[2] = f18 * f18 * f18;
        d.h(f39433f, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f12, float f13, float f14) {
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        if (f13 > 0.5f) {
            f13 = 0.5f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        float f15 = f14 <= 0.5f ? f14 : 0.5f;
        float[] fArr = f39434g;
        float f16 = (fArr[6] * f15) + (fArr[3] * f13) + (fArr[0] * f12);
        float f17 = (fArr[7] * f15) + (fArr[4] * f13) + (fArr[1] * f12);
        float f18 = (fArr[8] * f15) + (fArr[5] * f13) + (fArr[2] * f12);
        float f19 = f16 * f16 * f16;
        float f22 = f17 * f17 * f17;
        float f23 = f18 * f18 * f18;
        float[] fArr2 = f39433f;
        return (fArr2[8] * f23) + (fArr2[5] * f22) + (fArr2[2] * f19);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f12, float f13, float f14, float f15, @Y61.k c cVar) {
        float[] fArr = f39431d;
        float f16 = (fArr[6] * f14) + (fArr[3] * f13) + (fArr[0] * f12);
        float f17 = (fArr[7] * f14) + (fArr[4] * f13) + (fArr[1] * f12);
        float f18 = (fArr[8] * f14) + (fArr[5] * f13) + (fArr[2] * f12);
        float fA2 = E0.e.a(f16);
        float fA3 = E0.e.a(f17);
        float fA4 = E0.e.a(f18);
        float[] fArr2 = f39432e;
        return V.a((fArr2[6] * fA4) + (fArr2[3] * fA3) + (fArr2[0] * fA2), (fArr2[7] * fA4) + (fArr2[4] * fA3) + (fArr2[1] * fA2), (fArr2[8] * fA4) + (fArr2[5] * fA3) + (fArr2[2] * fA2), f15, cVar);
    }
}
