package defpackage;

/* loaded from: classes.dex */
public abstract class nmi {
    public static final Object a = new Object();

    public static int a(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(wy1.g("overflow: checkedAdd(", i, ", ", i2, ")"));
    }

    public static long b(umb umbVar, int i, int i2) {
        umbVar.J(i);
        if (umbVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = umbVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i2 || (iJ & 32) == 0 || umbVar.x() < 7 || umbVar.a() < 7 || (umbVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        umbVar.h(0, new byte[6], 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
