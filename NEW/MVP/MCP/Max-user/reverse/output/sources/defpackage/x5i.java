package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class x5i {
    public static final String e = cei.m("WorkTimer");
    public final usd a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public x5i(usd usdVar) {
        this.a = usdVar;
    }

    public final void a(v4i v4iVar) {
        synchronized (this.d) {
            try {
                if (((w5i) this.b.remove(v4iVar)) != null) {
                    cei.g().c(e, "Stopping timer for " + v4iVar);
                    this.c.remove(v4iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
