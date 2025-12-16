package defpackage;

/* loaded from: classes.dex */
public final class uci implements yci {
    public static final Object c = new Object();
    public volatile yci a;
    public volatile Object b;

    public static yci a(yci yciVar) {
        if (yciVar instanceof uci) {
            return yciVar;
        }
        uci uciVar = new uci();
        uciVar.b = c;
        uciVar.a = yciVar;
        return uciVar;
    }

    @Override // defpackage.yci
    public final Object d() {
        Object objD;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objD = this.b;
                if (objD == obj2) {
                    objD = this.a.d();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objD) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objD + ". This is likely due to a circular dependency.");
                    }
                    this.b = objD;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }
}
