package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShapeContainingUtil.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22485i2 {
    public static final boolean a(@Y61.k androidx.compose.ui.graphics.D0 d02, float f12, float f13) {
        float f14;
        float f15;
        boolean zC2;
        float f16 = f12;
        if (!(d02 instanceof D0.b)) {
            if (!(d02 instanceof D0.c)) {
                if (d02 instanceof D0.a) {
                    return b(f16, f13, ((D0.a) d02).f39221a);
                }
                throw new NoWhenBranchMatchedException();
            }
            l0.l lVar = ((D0.c) d02).f39223a;
            if (f16 < lVar.f413394a) {
                return false;
            }
            float f17 = lVar.f413396c;
            if (f16 >= f17) {
                return false;
            }
            float f18 = lVar.f413395b;
            if (f13 < f18) {
                return false;
            }
            float f19 = lVar.f413397d;
            if (f13 >= f19) {
                return false;
            }
            long j12 = lVar.f413398e;
            int i12 = (int) (j12 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i12);
            long j13 = lVar.f413399f;
            int i13 = (int) (j13 >> 32);
            if (Float.intBitsToFloat(i13) + fIntBitsToFloat <= lVar.c()) {
                long j14 = lVar.f413401h;
                int i14 = (int) (j14 >> 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i14);
                long j15 = lVar.f413400g;
                int i15 = (int) (j15 >> 32);
                if (Float.intBitsToFloat(i15) + fIntBitsToFloat2 <= lVar.c()) {
                    int i16 = (int) (j12 & 4294967295L);
                    int i17 = (int) (j14 & 4294967295L);
                    if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= lVar.b()) {
                        int i18 = (int) (j13 & 4294967295L);
                        int i19 = (int) (j15 & 4294967295L);
                        if (Float.intBitsToFloat(i19) + Float.intBitsToFloat(i18) <= lVar.b()) {
                            float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
                            float f22 = lVar.f413394a;
                            float f23 = fIntBitsToFloat3 + f22;
                            float fIntBitsToFloat4 = Float.intBitsToFloat(i16) + f18;
                            float fIntBitsToFloat5 = f17 - Float.intBitsToFloat(i13);
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i18) + f18;
                            float fIntBitsToFloat7 = f17 - Float.intBitsToFloat(i15);
                            float fIntBitsToFloat8 = f19 - Float.intBitsToFloat(i19);
                            float fIntBitsToFloat9 = f19 - Float.intBitsToFloat(i17);
                            float fIntBitsToFloat10 = Float.intBitsToFloat(i14) + f22;
                            if (f12 < f23) {
                                f15 = f13;
                                if (f15 < fIntBitsToFloat4) {
                                    zC2 = c(f12, f13, f23, fIntBitsToFloat4, lVar.f413398e);
                                }
                                return zC2;
                            }
                            f15 = f13;
                            if (f12 < fIntBitsToFloat10 && f15 > fIntBitsToFloat9) {
                                zC2 = c(f12, f13, fIntBitsToFloat10, fIntBitsToFloat9, lVar.f413401h);
                            } else if (f12 > fIntBitsToFloat5 && f15 < fIntBitsToFloat6) {
                                zC2 = c(f12, f13, fIntBitsToFloat5, fIntBitsToFloat6, lVar.f413399f);
                            } else if (f12 > fIntBitsToFloat7 && f15 > fIntBitsToFloat8) {
                                zC2 = c(f12, f13, fIntBitsToFloat7, fIntBitsToFloat8, lVar.f413400g);
                            }
                            return zC2;
                        }
                    }
                }
                f16 = f12;
                f14 = f13;
            } else {
                f14 = f13;
            }
            C22277p c22277pA = C22315w.a();
            Path.b(c22277pA, lVar);
            return b(f16, f14, c22277pA);
        }
        l0.j jVar = ((D0.b) d02).f39222a;
        if (jVar.f413390a > f16 || f16 >= jVar.f413392c || jVar.f413391b > f13 || f13 >= jVar.f413393d) {
            return false;
        }
        return true;
    }

    public static final boolean b(float f12, float f13, Path path) {
        l0.j jVar = new l0.j(f12 - 0.005f, f13 - 0.005f, f12 + 0.005f, f13 + 0.005f);
        C22277p c22277pA = C22315w.a();
        Path.q(c22277pA, jVar);
        C22277p c22277pA2 = C22315w.a();
        androidx.compose.ui.graphics.P0.f39298b.getClass();
        c22277pA2.u(path, c22277pA, androidx.compose.ui.graphics.P0.f39299c);
        boolean zIsEmpty = c22277pA2.f39716a.isEmpty();
        c22277pA2.reset();
        c22277pA.reset();
        return !zIsEmpty;
    }

    public static final boolean c(float f12, float f13, float f14, float f15, long j12) {
        float f16 = f12 - f14;
        float f17 = f13 - f15;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return ((f17 * f17) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f16 * f16) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
