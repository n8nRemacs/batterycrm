package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: TransformGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20500r2 {
    public static final float a(long j12) {
        if (Float.intBitsToFloat((int) (j12 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j12 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j12 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public static final long b(@Y61.k C22340s c22340s, boolean z12) {
        l0.g.f413384b.getClass();
        ?? r72 = c22340s.f40278a;
        int size = ((Collection) r72).size();
        long j12 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) r72.get(i13);
            if (c12.f40119d && c12.f40123h) {
                j12 = l0.g.j(j12, z12 ? c12.f40118c : c12.f40122g);
                i12++;
            }
        }
        if (i12 != 0) {
            return l0.g.c(j12, i12);
        }
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public static final float c(@Y61.k C22340s c22340s, boolean z12) {
        long jB2 = b(c22340s, z12);
        l0.g.f413384b.getClass();
        float fE2 = 0.0f;
        if (l0.g.d(jB2, l0.g.f413386d)) {
            return 0.0f;
        }
        ?? r82 = c22340s.f40278a;
        int size = ((Collection) r82).size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) r82.get(i13);
            if (c12.f40119d && c12.f40123h) {
                i12++;
                fE2 = l0.g.e(l0.g.i(z12 ? c12.f40118c : c12.f40122g, jB2)) + fE2;
            }
        }
        return fE2 / i12;
    }

    public static final long d(@Y61.k C22340s c22340s) {
        long jB2 = b(c22340s, true);
        l0.g.f413384b.getClass();
        if (l0.g.d(jB2, l0.g.f413386d)) {
            return 0L;
        }
        return l0.g.i(jB2, b(c22340s, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static final float e(@Y61.k C22340s c22340s) {
        ?? r02 = c22340s.f40278a;
        int size = ((Collection) r02).size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i12 >= size) {
                break;
            }
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) r02.get(i12);
            if (!c12.f40123h || !c12.f40119d) {
                i14 = 0;
            }
            i13 += i14;
            i12++;
        }
        if (i13 < 2) {
            return 0.0f;
        }
        long jB2 = b(c22340s, true);
        long jB3 = b(c22340s, false);
        int size2 = ((Collection) r02).size();
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size2; i15++) {
            androidx.compose.ui.input.pointer.C c13 = (androidx.compose.ui.input.pointer.C) r02.get(i15);
            if (c13.f40119d && c13.f40123h) {
                long jI2 = l0.g.i(c13.f40122g, jB3);
                long jI3 = l0.g.i(c13.f40118c, jB2);
                float fA2 = a(jI3) - a(jI2);
                float fE2 = l0.g.e(l0.g.j(jI3, jI2)) / 2.0f;
                if (fA2 > 180.0f) {
                    fA2 -= 360.0f;
                } else if (fA2 < -180.0f) {
                    fA2 += 360.0f;
                }
                f13 += fA2 * fE2;
                f12 += fE2;
            }
        }
        if (f12 == 0.0f) {
            return 0.0f;
        }
        return f13 / f12;
    }
}
