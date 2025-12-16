package defpackage;

/* loaded from: classes.dex */
public abstract class fzd {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final c9a b = new c9a(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final c9a b() {
        return new c9a();
    }

    public static final c9a c(imb... imbVarArr) {
        c9a c9aVar = new c9a(imbVarArr.length);
        for (imb imbVar : imbVarArr) {
            c9aVar.m(imbVar.a, imbVar.b);
        }
        return c9aVar;
    }

    public static final int d(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int e(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int f(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
