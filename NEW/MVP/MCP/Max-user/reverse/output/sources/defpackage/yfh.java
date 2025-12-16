package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class yfh {
    public final u44 a = new u44();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        u44 u44Var = this.a;
        if (u44Var != null) {
            if (u44Var.a) {
                u44.b(autoCloseable);
                return;
            }
            synchronized (((cwf) u44Var.b)) {
                autoCloseable2 = (AutoCloseable) ((LinkedHashMap) u44Var.c).put(str, autoCloseable);
            }
            u44.b(autoCloseable2);
        }
    }

    public final void b() {
        u44 u44Var = this.a;
        if (u44Var != null && !u44Var.a) {
            u44Var.a = true;
            synchronized (((cwf) u44Var.b)) {
                try {
                    Iterator it = ((LinkedHashMap) u44Var.c).values().iterator();
                    while (it.hasNext()) {
                        u44.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((LinkedHashSet) u44Var.d).iterator();
                    while (it2.hasNext()) {
                        u44.b((AutoCloseable) it2.next());
                    }
                    ((LinkedHashSet) u44Var.d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        u44 u44Var = this.a;
        if (u44Var == null) {
            return null;
        }
        synchronized (((cwf) u44Var.b)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) u44Var.c).get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
