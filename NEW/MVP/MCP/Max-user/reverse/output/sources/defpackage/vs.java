package defpackage;

/* loaded from: classes.dex */
public abstract class vs {
    public static final int a;

    static {
        Object ipdVar;
        try {
            ipdVar = cnf.h(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        Integer num = (Integer) ipdVar;
        a = num != null ? num.intValue() : 2097152;
    }
}
