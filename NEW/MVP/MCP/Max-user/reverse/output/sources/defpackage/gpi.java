package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class gpi {
    public static final int d(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int e(Layout layout) {
        if (layout != null) {
            return (layout.getLineCount() <= 0 || layout.getEllipsisCount(0) != 0) ? layout.getEllipsizedWidth() : (int) layout.getLineMax(0);
        }
        return 0;
    }

    public static final void h(esg esgVar) {
        esgVar.d(72, new sdf(27));
        esgVar.d(73, new sdf(28));
        esgVar.d(74, new sdf(29));
        int i = 0;
        esgVar.b(0, new qzg(i));
        esgVar.d(13, new rzg(i));
        esgVar.d(75, new rzg(1));
        esgVar.d(76, new rzg(2));
        esgVar.d(35, new rzg(3));
        esgVar.d(77, new rzg(4));
        esgVar.d(78, new rzg(5));
    }

    public abstract boolean a(k4 k4Var, g4 g4Var, g4 g4Var2);

    public abstract boolean b(k4 k4Var, Object obj, Object obj2);

    public abstract boolean c(k4 k4Var, j4 j4Var, j4 j4Var2);

    public abstract void f(j4 j4Var, j4 j4Var2);

    public abstract void g(j4 j4Var, Thread thread);
}
