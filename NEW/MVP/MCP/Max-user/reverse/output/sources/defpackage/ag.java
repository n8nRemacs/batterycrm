package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ag {
    public boolean a;
    public long b;
    public Object c;
    public Object d = "";
    public Object e = ww0.DEFAULT;
    public Object f;
    public Object g;

    public int a() {
        return ((uo0) this.c).c.p();
    }

    public int b(int i) {
        return ((int[]) ((fs3) ((uo0) this.c).c.b).g)[i];
    }

    public int c() {
        return ((uo0) this.c).c.v();
    }

    public synchronized void d() {
        if (!this.a) {
            this.a = true;
            ((ScheduledExecutorService) this.f).schedule((ue) this.g, 1000L, TimeUnit.MILLISECONDS);
        }
    }
}
