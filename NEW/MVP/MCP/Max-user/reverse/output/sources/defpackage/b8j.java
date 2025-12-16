package defpackage;

/* loaded from: classes.dex */
public abstract class b8j {
    public static h1f a(Exception exc) {
        h1f h1fVar = new h1f();
        exc.getClass();
        h1fVar.i(exc, null);
        return h1fVar;
    }

    public static final Object b(l48 l48Var, l38 l38Var, sm6 sm6Var, dtf dtfVar) {
        Object objD;
        if (l38Var != l38.b) {
            return (l48Var.d != l38.a && (objD = d7j.d(new cmd(l48Var, l38Var, sm6Var, null), dtfVar)) == g84.a) ? objD : qqg.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
