package defpackage;

import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class lv7 {
    public static final sz a;

    static {
        sz szVar = new sz(4);
        Collections.addAll(szVar, 2, 7, 4, 5);
        a = szVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(ysd ysdVar, ce5 ce5Var) throws IOException {
        ce5Var.i0();
        Integer numValueOf = Integer.valueOf(ce5Var.d);
        sz szVar = a;
        int iIndexOf = szVar.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int i = ysdVar.a;
        if (i == -1) {
            i = 0;
        } else if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return ((Number) szVar.get(((i / 90) + iIndexOf) % szVar.size())).intValue();
    }

    public static final int b(ysd ysdVar, ce5 ce5Var) throws IOException {
        int i = 0;
        if (ysdVar.a == -2) {
            return 0;
        }
        ce5Var.i0();
        int i2 = ce5Var.c;
        if (i2 == 90 || i2 == 180 || i2 == 270) {
            ce5Var.i0();
            i = ce5Var.c;
        }
        int i3 = ysdVar.a;
        if (i3 == -1) {
            return i;
        }
        if (i3 != -1) {
            return (i3 + i) % 360;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public static final int c(ysd ysdVar, ynd yndVar, ce5 ce5Var, boolean z) throws IOException {
        int i;
        int i2;
        if (z && yndVar != null) {
            int iB = b(ysdVar, ce5Var);
            ce5Var.i0();
            int iA = a.contains(Integer.valueOf(ce5Var.d)) ? a(ysdVar, ce5Var) : 0;
            boolean z2 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
            if (z2) {
                ce5Var.i0();
                i = ce5Var.X;
            } else {
                ce5Var.i0();
                i = ce5Var.o;
            }
            if (z2) {
                ce5Var.i0();
                i2 = ce5Var.o;
            } else {
                ce5Var.i0();
                i2 = ce5Var.X;
            }
            float f = i;
            float f2 = i2;
            float fMax = Math.max(yndVar.a / f, yndVar.b / f2);
            if (f * fMax > 2048.0f) {
                fMax = 2048.0f / f;
            }
            if (f2 * fMax > 2048.0f) {
                fMax = 2048.0f / f2;
            }
            int i3 = (int) ((fMax * 8) + 0.6666667f);
            if (i3 <= 8) {
                if (i3 < 1) {
                    return 1;
                }
                return i3;
            }
        }
        return 8;
    }
}
