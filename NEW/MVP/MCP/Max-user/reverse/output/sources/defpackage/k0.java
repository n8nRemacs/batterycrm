package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k0 implements zy7 {
    @Override // defpackage.zy7
    public Object b(lh4 lh4Var) {
        return i(lh4Var);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(lh4 lh4Var) {
        Object objE = e();
        int iF = f(objE);
        yl3 yl3VarR = lh4Var.r(d());
        while (true) {
            int iE = yl3VarR.e(d());
            if (iE == -1) {
                yl3VarR.m(d());
                return l(objE);
            }
            j(yl3VarR, iE + iF, objE);
        }
    }

    public abstract void j(yl3 yl3Var, int i, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
