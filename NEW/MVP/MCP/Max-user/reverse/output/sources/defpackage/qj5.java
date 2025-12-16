package defpackage;

/* loaded from: classes.dex */
public abstract class qj5 {
    public static final j0e a;

    static {
        j0e j0eVar = u0e.a;
        b6a b6aVar = t8j.c;
        if (b6aVar != null) {
            try {
                j0eVar = (j0e) b6aVar.apply(j0eVar);
            } catch (Throwable th) {
                throw bj5.d(th);
            }
        }
        a = j0eVar;
    }
}
