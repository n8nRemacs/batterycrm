package defpackage;

/* loaded from: classes.dex */
public abstract class d5j {
    public static final Object a(Object obj) {
        return obj instanceof zk3 ? new ipd(((zk3) obj).a) : obj;
    }

    public static final Object b(Object obj, em6 em6Var) {
        Throwable thA = kpd.a(obj);
        return thA == null ? em6Var != null ? new al3(obj, em6Var) : obj : new zk3(thA, false);
    }

    public static final void c(esg esgVar) {
        esgVar.d(512, new cya(10));
    }
}
