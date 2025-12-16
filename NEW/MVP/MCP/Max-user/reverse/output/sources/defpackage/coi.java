package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
public abstract class coi {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final float[] c = new float[0];
    public static final String[] d = new String[0];
    public static final byte[] e = new byte[0];

    public static final int a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final int b(gd3 gd3Var, int i) throws InvalidProtocolBufferNanoException {
        int iC = gd3Var.c();
        gd3Var.u(i);
        int i2 = 1;
        while (gd3Var.s() == i) {
            gd3Var.u(i);
            i2++;
        }
        gd3Var.t(iC);
        return i2;
    }

    public static vvg c(Integer num) {
        if (num != null) {
            for (vvg vvgVar : vvg.o) {
                if (vvgVar.a == num.intValue()) {
                    return vvgVar;
                }
            }
        }
        return vvg.UNKNOWN;
    }

    public static wvg d(Integer num) {
        if (num != null) {
            f2 f2Var = new f2(0, wvg.v0);
            while (f2Var.hasNext()) {
                wvg wvgVar = (wvg) f2Var.next();
                if (wvgVar.a == num.intValue()) {
                    return wvgVar;
                }
            }
        }
        return wvg.b;
    }

    public static gsc e(Integer num) {
        if (num != null) {
            return (gsc) gsc.w0.get(num.intValue());
        }
        throw new NullPointerException("qualityValueFromInt fail!");
    }
}
