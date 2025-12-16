package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class bk0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final qr4 c = new qr4(1);
    public final lk6 d = new lk6(10, (byte) 0);
    public Looper e;
    public r9g f;
    public m4c g;

    public abstract o29 a(c99 c99Var, qi4 qi4Var, long j);

    public final void b(e99 e99Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e99Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public void c() {
    }

    public final void d(e99 e99Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e99Var);
        if (zIsEmpty) {
            e();
        }
    }

    public void e() {
    }

    public abstract i09 f();

    public abstract void g();

    public final void h(e99 e99Var, vgg vggVar, m4c m4cVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        fsi.b(looper == null || looper == looperMyLooper);
        this.g = m4cVar;
        r9g r9gVar = this.f;
        this.a.add(e99Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(e99Var);
            i(vggVar);
        } else if (r9gVar != null) {
            d(e99Var);
            e99Var.a(this, r9gVar);
        }
    }

    public abstract void i(vgg vggVar);

    public final void j(r9g r9gVar) {
        this.f = r9gVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e99) it.next()).a(this, r9gVar);
        }
    }

    public abstract void k(o29 o29Var);

    public final void l(e99 e99Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(e99Var);
        if (!arrayList.isEmpty()) {
            b(e99Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        m();
    }

    public abstract void m();

    public final void n(e55 e55Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b55 b55Var = (b55) it.next();
            if (b55Var.a == e55Var) {
                copyOnWriteArrayList.remove(b55Var);
            }
        }
    }

    public final void o(m99 m99Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            if (k99Var.b == m99Var) {
                copyOnWriteArrayList.remove(k99Var);
            }
        }
    }
}
