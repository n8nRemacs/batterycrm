package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class bva {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public hn6 c;

    public bva(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(te0 te0Var) {
    }

    public void d() {
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j42) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cm6, hn6] */
    public final void f(boolean z) {
        this.a = z;
        ?? r1 = this.c;
        if (r1 != 0) {
            r1.invoke();
        }
    }
}
