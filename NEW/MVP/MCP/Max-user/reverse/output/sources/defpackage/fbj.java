package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class fbj {
    public static final f7f a(pb2 pb2Var) {
        rf2 rf2Var = pb2Var.b;
        if (pb2Var.M()) {
            return new a7f(rf2Var.a);
        }
        if (pb2Var.K()) {
            ku3 ku3VarN = pb2Var.n();
            if (ku3VarN != null) {
                return new c7f(ku3VarN.p());
            }
            return null;
        }
        if (!pb2Var.Q()) {
            return new b7f(rf2Var.a);
        }
        ku3 ku3VarN2 = pb2Var.n();
        if (ku3VarN2 != null) {
            return new d7f(ku3VarN2.p());
        }
        return null;
    }

    public static fv5 b(String str) {
        return (str == null || vmf.F(str) || str.length() > 4) ? fv5.c : new fv5(str.toUpperCase(Locale.ROOT));
    }
}
