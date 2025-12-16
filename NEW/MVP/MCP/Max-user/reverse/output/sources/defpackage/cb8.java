package defpackage;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cb8 {
    public static final Object k = new Object();
    public final Object a;
    public final rwd b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final r98 j;

    public cb8(Object obj) {
        this.a = new Object();
        this.b = new rwd();
        this.c = 0;
        this.f = k;
        this.j = new r98(1, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        fs.c().b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(ho7.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(bb8 bb8Var) {
        if (bb8Var.b) {
            if (!bb8Var.e()) {
                bb8Var.a(false);
                return;
            }
            int i = bb8Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            bb8Var.c = i2;
            bb8Var.a.a(this.e);
        }
    }

    public final void c(bb8 bb8Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bb8Var != null) {
                b(bb8Var);
                bb8Var = null;
            } else {
                rwd rwdVar = this.b;
                rwdVar.getClass();
                pwd pwdVar = new pwd(rwdVar);
                rwdVar.c.put(pwdVar, Boolean.FALSE);
                while (pwdVar.hasNext()) {
                    b((bb8) ((Map.Entry) pwdVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(j48 j48Var, wta wtaVar) {
        a("observe");
        if (j48Var.p().d == l38.a) {
            return;
        }
        ab8 ab8Var = new ab8(this, j48Var, wtaVar);
        bb8 bb8Var = (bb8) this.b.b(wtaVar, ab8Var);
        if (bb8Var != null && !bb8Var.c(j48Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bb8Var != null) {
            return;
        }
        j48Var.p().a(ab8Var);
    }

    public final void f(wta wtaVar) {
        a("observeForever");
        za8 za8Var = new za8(this, wtaVar);
        bb8 bb8Var = (bb8) this.b.b(wtaVar, za8Var);
        if (bb8Var instanceof ab8) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bb8Var != null) {
            return;
        }
        za8Var.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            fs.c().d(this.j);
        }
    }

    public void j(wta wtaVar) {
        a("removeObserver");
        bb8 bb8Var = (bb8) this.b.c(wtaVar);
        if (bb8Var == null) {
            return;
        }
        bb8Var.b();
        bb8Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public cb8() {
        this.a = new Object();
        this.b = new rwd();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new r98(1, this);
        this.e = obj;
        this.g = -1;
    }
}
