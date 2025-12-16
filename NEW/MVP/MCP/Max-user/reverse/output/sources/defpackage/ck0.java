package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class ck0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final lk6 c = new lk6(new CopyOnWriteArrayList(), 0, (Object) null, 19);
    public final d55 d = new d55(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public s9g f;
    public n4c g;

    public boolean a(k09 k09Var) {
        return this instanceof ln3;
    }

    public final lk6 b(d99 d99Var) {
        return new lk6((CopyOnWriteArrayList) this.c.d, 0, d99Var, 19);
    }

    public abstract p29 c(d99 d99Var, ri4 ri4Var, long j);

    public final void d(f99 f99Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(f99Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public void e() {
    }

    public final void f(f99 f99Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(f99Var);
        if (zIsEmpty) {
            g();
        }
    }

    public void g() {
    }

    public s9g h() {
        return null;
    }

    public abstract k09 i();

    public boolean j() {
        return !(this instanceof mn3);
    }

    public abstract void k();

    public final void l(f99 f99Var, wgg wggVar, n4c n4cVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        hsi.b(looper == null || looper == looperMyLooper);
        this.g = n4cVar;
        s9g s9gVar = this.f;
        this.a.add(f99Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(f99Var);
            m(wggVar);
        } else if (s9gVar != null) {
            f(f99Var);
            f99Var.a(this, s9gVar);
        }
    }

    public abstract void m(wgg wggVar);

    public final void n(s9g s9gVar) {
        this.f = s9gVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f99) it.next()).a(this, s9gVar);
        }
    }

    public abstract void o(p29 p29Var);

    public final void p(f99 f99Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(f99Var);
        if (!arrayList.isEmpty()) {
            d(f99Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(f55 f55Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            if (c55Var.b == f55Var) {
                copyOnWriteArrayList.remove(c55Var);
            }
        }
    }

    public final void s(n99 n99Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l99 l99Var = (l99) it.next();
            if (l99Var.b == n99Var) {
                copyOnWriteArrayList.remove(l99Var);
            }
        }
    }

    public void t(k09 k09Var) {
    }
}
