package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class tih {
    public static final /* synthetic */ int n = 0;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final z74 d;
    public final k18 e;
    public long g;
    public volatile int h;
    public final s1e j;
    public int f = 0;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public volatile boolean k = false;
    public volatile boolean l = true;
    public final sih m = new sih(this);

    public tih(Application application, s1e s1eVar, k18 k18Var, k18 k18Var2, k18 k18Var3, z74 z74Var, k18 k18Var4) {
        this.j = s1eVar;
        this.a = k18Var;
        this.b = k18Var2;
        this.d = z74Var;
        this.c = k18Var3;
        this.e = k18Var4;
        application.registerActivityLifecycleCallbacks(new jh0(1, this));
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "tih", "app enter background, time=" + d8j.a(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + jElapsedRealtime, null);
            }
        }
        dd ddVar = (dd) this.b.getValue();
        int i = 1;
        if (!ddVar.a().e()) {
            Long lValueOf = Long.valueOf(jElapsedRealtime);
            us usVar = new us(1);
            usVar.put("duration", lValueOf);
            ddVar.h(new hg8(0L, 0L, System.currentTimeMillis(), "ACTION", "INTERACTIVE_SESSION", usVar));
        }
        this.d.mo13dispatch(bd5.a, new rih(this, i));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((wq) it.next()).c();
        }
    }

    public final void b() {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "tih", "app enter foreground, time = " + d8j.a(Long.valueOf(System.currentTimeMillis())), null);
            }
        }
        this.g = SystemClock.elapsedRealtime();
        this.d.mo13dispatch(bd5.a, new rih(this, 2));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((wq) it.next()).n();
        }
    }

    public final void c(wq wqVar) {
        this.i.add(wqVar);
    }

    public final boolean d() {
        return this.k && this.l;
    }
}
