package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class z59 extends a69 {
    public final Object a = new Object();
    public Executor b;
    public kce c;
    public h59 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(h59 h59Var, ArrayList arrayList) {
        if (h59Var == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            try {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new b6i(this, this.c, h59Var, arrayList, 5));
                    } else {
                        this.d = h59Var;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
