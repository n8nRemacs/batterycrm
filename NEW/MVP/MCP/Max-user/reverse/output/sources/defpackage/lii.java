package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lii {
    public kc8 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Executor f;
    public volatile sx g;
    public volatile sx h;
    public final Semaphore i;
    public final Set j;

    public lii(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = sx.Z;
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        context.getApplicationContext();
        this.f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.b) {
                this.e = true;
            }
            if (this.h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            sx sxVar = this.g;
            sxVar.d.set(true);
            if (sxVar.b.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        sx sxVar = this.g;
        Executor executor = this.f;
        if (sxVar.c == 1) {
            sxVar.c = 2;
            sxVar.a.getClass();
            executor.execute(sxVar.b);
        } else {
            int iV = az1.v(sxVar.c);
            if (iV == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iV == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() throws InterruptedException {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((yai) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        j8j.b(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
