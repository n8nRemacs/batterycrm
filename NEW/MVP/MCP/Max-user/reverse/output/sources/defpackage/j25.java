package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class j25 {
    public static final nnd n = new nnd(1);
    public final Context a;
    public final ll4 b;
    public final g25 c;
    public final wo4 d;
    public final CopyOnWriteArraySet e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public List l;
    public za0 m;

    public j25(Context context, df4 df4Var, ey0 ey0Var, oe4 oe4Var, ExecutorService executorService) {
        ll4 ll4Var = new ll4(df4Var);
        jy0 jy0Var = new jy0();
        jy0Var.a = ey0Var;
        jy0Var.e = oe4Var;
        ka5 ka5Var = new ka5();
        ka5Var.a = jy0Var;
        ka5Var.b = executorService;
        ka5Var.c = new SparseArray();
        this.a = context.getApplicationContext();
        this.b = ll4Var;
        this.i = true;
        this.l = Collections.EMPTY_LIST;
        this.e = new CopyOnWriteArraySet();
        Handler handlerO = zxg.o(new dn3(3, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        g25 g25Var = new g25(handlerThread, ll4Var, ka5Var, handlerO, this.i);
        this.c = g25Var;
        wo4 wo4Var = new wo4(5, this);
        this.d = wo4Var;
        za0 za0Var = new za0(context, wo4Var, n);
        this.m = za0Var;
        int iD = za0Var.d();
        this.j = iD;
        this.f = 1;
        g25Var.obtainMessage(1, iD, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((h25) it.next()).d(this, this.k);
        }
    }

    public final void b(za0 za0Var, int i) {
        Object obj = za0Var.d;
        if (this.j != i) {
            this.j = i;
            this.f++;
            this.c.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean zD = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((h25) it.next()).b();
        }
        if (zD) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean zD = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((h25) it.next()).getClass();
        }
        if (zD) {
            a();
        }
    }

    public final boolean d() {
        boolean z;
        if (this.i || this.j == 0) {
            z = false;
        } else {
            for (int i = 0; i < this.l.size(); i++) {
                if (((xz4) this.l.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = this.k != z;
        this.k = z;
        return z2;
    }
}
