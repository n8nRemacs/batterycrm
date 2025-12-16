package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.a;
import androidx.compose.ui.graphics.colorspace.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ColorSpace.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static c a(c cVar, u uVar) {
        a.f39377b.getClass();
        a.C1658a c1658a = a.f39378c;
        b.f39380b.getClass();
        if (!b.a(cVar.f39387b, b.f39381c)) {
            return cVar;
        }
        r rVar = (r) cVar;
        u uVar2 = rVar.f39448d;
        if (c(uVar2, uVar)) {
            return cVar;
        }
        return new r(rVar.f39386a, rVar.f39452h, uVar, f(b(c1658a.f39379a, uVar2.a(), uVar.a()), rVar.f39453i), rVar.f39455k, rVar.f39458n, rVar.f39449e, rVar.f39450f, rVar.f39451g, -1);
    }

    @Y61.k
    public static final float[] b(@Y61.k float[] fArr, @Y61.k float[] fArr2, @Y61.k float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        return f(e(fArr), g(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean c(@Y61.k u uVar, @Y61.k u uVar2) {
        if (uVar == uVar2) {
            return true;
        }
        return Math.abs(uVar.f39471a - uVar2.f39471a) < 0.001f && Math.abs(uVar.f39472b - uVar2.f39472b) < 0.001f;
    }

    public static final h d(c cVar, c cVar2) {
        if (cVar == cVar2) {
            h.f39416e.getClass();
            n.f39435b.getClass();
            return new g(cVar, cVar, n.f39436c, null);
        }
        b.f39380b.getClass();
        long j12 = b.f39381c;
        return (b.a(cVar.f39387b, j12) && b.a(cVar2.f39387b, j12)) ? new h.b((r) cVar, (r) cVar2, 0, null) : new h(cVar, cVar2, 0, null);
    }

    @Y61.k
    public static final float[] e(@Y61.k float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[3];
        float f14 = fArr[6];
        float f15 = fArr[1];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = fArr[2];
        float f19 = fArr[5];
        float f22 = fArr[8];
        float f23 = (f16 * f22) - (f17 * f19);
        float f24 = (f17 * f18) - (f15 * f22);
        float f25 = (f15 * f19) - (f16 * f18);
        float f26 = (f14 * f25) + (f13 * f24) + (f12 * f23);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f23 / f26;
        fArr2[1] = f24 / f26;
        fArr2[2] = f25 / f26;
        fArr2[3] = ((f14 * f19) - (f13 * f22)) / f26;
        fArr2[4] = ((f22 * f12) - (f14 * f18)) / f26;
        fArr2[5] = ((f18 * f13) - (f19 * f12)) / f26;
        fArr2[6] = ((f13 * f17) - (f14 * f16)) / f26;
        fArr2[7] = ((f14 * f15) - (f17 * f12)) / f26;
        fArr2[8] = ((f12 * f16) - (f13 * f15)) / f26;
        return fArr2;
    }

    @Y61.k
    public static final float[] f(@Y61.k float[] fArr, @Y61.k float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f12 = fArr[0] * fArr2[0];
        float f13 = fArr[3];
        float f14 = fArr2[1];
        float f15 = fArr[6];
        float f16 = fArr2[2];
        fArr3[0] = (f15 * f16) + (f13 * f14) + f12;
        float f17 = fArr[1];
        float f18 = fArr2[0];
        float f19 = fArr[4];
        float f22 = fArr[7];
        float f23 = f22 * f16;
        fArr3[1] = f23 + (f14 * f19) + (f17 * f18);
        float f24 = fArr[2] * f18;
        float f25 = fArr[5];
        float f26 = (fArr2[1] * f25) + f24;
        float f27 = fArr[8];
        fArr3[2] = (f16 * f27) + f26;
        float f28 = fArr[0];
        float f29 = fArr2[3] * f28;
        float f32 = fArr2[4];
        float f33 = (f13 * f32) + f29;
        float f34 = fArr2[5];
        fArr3[3] = (f15 * f34) + f33;
        float f35 = fArr[1];
        float f36 = fArr2[3];
        float f37 = f19 * f32;
        fArr3[4] = (f22 * f34) + f37 + (f35 * f36);
        float f38 = fArr[2];
        float f39 = f34 * f27;
        fArr3[5] = f39 + (f25 * fArr2[4]) + (f36 * f38);
        float f42 = f28 * fArr2[6];
        float f43 = fArr[3];
        float f44 = fArr2[7];
        float f45 = (f43 * f44) + f42;
        float f46 = fArr2[8];
        fArr3[6] = (f15 * f46) + f45;
        float f47 = fArr2[6];
        float f48 = f22 * f46;
        fArr3[7] = f48 + (fArr[4] * f44) + (f35 * f47);
        float f49 = f27 * f46;
        fArr3[8] = f49 + (fArr[5] * fArr2[7]) + (f38 * f47);
        return fArr3;
    }

    @Y61.k
    public static final float[] g(@Y61.k float[] fArr, @Y61.k float[] fArr2) {
        float f12 = fArr[0];
        float f13 = fArr2[0] * f12;
        float f14 = fArr[1];
        float f15 = fArr2[1] * f14;
        float f16 = fArr[2];
        return new float[]{f13, f15, fArr2[2] * f16, fArr2[3] * f12, fArr2[4] * f14, fArr2[5] * f16, f12 * fArr2[6], f14 * fArr2[7], f16 * fArr2[8]};
    }

    @Y61.k
    public static final float[] h(@Y61.k float[] fArr, @Y61.k float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f12 = fArr2[0];
        float f13 = fArr2[1];
        float f14 = fArr2[2];
        fArr2[0] = (fArr[6] * f14) + (fArr[3] * f13) + (fArr[0] * f12);
        fArr2[1] = (fArr[7] * f14) + (fArr[4] * f13) + (fArr[1] * f12);
        fArr2[2] = (fArr[8] * f14) + (fArr[5] * f13) + (fArr[2] * f12);
        return fArr2;
    }
}
