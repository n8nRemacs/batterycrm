package defpackage;

/* loaded from: classes.dex */
public abstract class ixi {
    public static wu1 a(uu1 uu1Var) {
        tu1 tu1Var = new tu1();
        tu1Var.c = new dod();
        wu1 wu1Var = new wu1(tu1Var);
        tu1Var.b = wu1Var;
        tu1Var.a = uu1Var.getClass();
        try {
            String strM = uu1Var.m(tu1Var);
            if (strM == null) {
                return wu1Var;
            }
            tu1Var.a = strM;
            return wu1Var;
        } catch (Exception e) {
            wu1Var.b.m(e);
            return wu1Var;
        }
    }

    public static int b(u62 u62Var, int i, int i2, int i3) {
        hsi.b(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        nmi.a(nmi.a(i4, i5), 1 << i3);
        if (u62Var.b() < i) {
            return -1;
        }
        int i6 = u62Var.i(i);
        if (i6 == i4) {
            if (u62Var.b() < i2) {
                return -1;
            }
            int i7 = u62Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (u62Var.b() < i3) {
                    return -1;
                }
                return u62Var.i(i3) + i6;
            }
        }
        return i6;
    }

    public static void c(u62 u62Var) {
        u62Var.t(3);
        u62Var.t(8);
        boolean zH = u62Var.h();
        boolean zH2 = u62Var.h();
        if (zH) {
            u62Var.t(5);
        }
        if (zH2) {
            u62Var.t(6);
        }
    }

    public static void d(u62 u62Var) {
        int i;
        int i2 = u62Var.i(2);
        if (i2 == 0) {
            u62Var.t(6);
            return;
        }
        int iB = b(u62Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            u62Var.t(iB * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = u62Var.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iB) {
                if (u62Var.h()) {
                    u62Var.t(7);
                    i = 0;
                } else {
                    if (u62Var.i(2) == 3 && u62Var.i(i4) * i3 != 0) {
                        u62Var.s();
                    }
                    i = u62Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        u62Var.s();
                    }
                    u62Var.s();
                }
                if (i != 0 && i != 180 && u62Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }
}
