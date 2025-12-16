package defpackage;

/* loaded from: classes.dex */
public final class l18 implements rpc {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile rpc b;

    public l18(rpc rpcVar) {
        this.b = rpcVar;
    }

    @Override // defpackage.rpc
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
