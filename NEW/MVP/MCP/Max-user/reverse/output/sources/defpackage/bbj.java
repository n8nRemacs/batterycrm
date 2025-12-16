package defpackage;

/* loaded from: classes.dex */
public abstract class bbj {
    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? wy1.g("Both size ", i, " and step ", i2, " must be greater than zero.") : wy1.e(i, "size ", " must be greater than zero.")).toString());
        }
    }

    public static final vsb b(imb... imbVarArr) {
        vsb vsbVar = vsb.c;
        xsb xsbVar = new xsb();
        to8.m(xsbVar, imbVarArr);
        return xsbVar.d();
    }
}
