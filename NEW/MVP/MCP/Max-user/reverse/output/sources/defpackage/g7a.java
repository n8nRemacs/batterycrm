package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class g7a {
    public final Object a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Closeable c;
    public float d;
    public int e;
    public mk0 f;
    public d4 g;
    public final /* synthetic */ kp0 h;

    public g7a(kp0 kp0Var, Object obj) {
        this.h = kp0Var;
        this.a = obj;
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean a(hj0 hj0Var, oac oacVar) {
        g7a g7aVar;
        Pair pairCreate = Pair.create(hj0Var, oacVar);
        synchronized (this) {
            try {
                kp0 kp0Var = this.h;
                Object obj = this.a;
                synchronized (kp0Var) {
                    g7aVar = (g7a) kp0Var.a.get(obj);
                }
                if (g7aVar != this) {
                    return false;
                }
                this.b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableC = this.c;
                float f = this.d;
                int i = this.e;
                mk0.c(arrayListK);
                mk0.d(arrayListL);
                mk0.b(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            if (closeableC != this.c) {
                                closeableC = null;
                            } else if (closeableC != null) {
                                closeableC = this.h.c(closeableC);
                            }
                        }
                        if (closeableC != null) {
                            if (f > 0.0f) {
                                hj0Var.i(f);
                            }
                            hj0Var.g(i, closeableC);
                            b(closeableC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                ((mk0) oacVar).a(new ia7(this, pairCreate, false, 1));
                return true;
            } finally {
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((mk0) ((oac) ((Pair) it.next()).second)).f()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((mk0) ((oac) ((Pair) it.next()).second)).g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized m9c e() {
        m9c m9cVar;
        m9c m9cVar2;
        m9cVar = m9c.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            mk0 mk0Var = (mk0) ((oac) ((Pair) it.next()).second);
            synchronized (mk0Var) {
                m9cVar2 = mk0Var.Z;
            }
            if (m9cVar.ordinal() <= m9cVar2.ordinal()) {
                m9cVar = m9cVar2;
            }
        }
        return m9cVar;
    }

    public final void f(d4 d4Var, Throwable th) {
        synchronized (this) {
            try {
                if (this.g != d4Var) {
                    return;
                }
                Iterator it = this.b.iterator();
                this.b.clear();
                this.h.e(this.a, this);
                b(this.c);
                this.c = null;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            Object obj = pair.second;
                            ((mk0) ((oac) obj)).c.d((oac) obj, this.h.c, th, null);
                            mk0 mk0Var = this.f;
                            if (mk0Var != null) {
                                ((mk0) ((oac) pair.second)).putExtras(mk0Var.X);
                            }
                            ((hj0) pair.first).e(th);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void g(d4 d4Var, Closeable closeable, int i) {
        synchronized (this) {
            try {
                if (this.g != d4Var) {
                    return;
                }
                b(this.c);
                this.c = null;
                Iterator it = this.b.iterator();
                int size = this.b.size();
                if (hj0.b(i)) {
                    this.c = this.h.c(closeable);
                    this.e = i;
                } else {
                    this.b.clear();
                    this.h.e(this.a, this);
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            if (hj0.a(i)) {
                                Object obj = pair.second;
                                ((mk0) ((oac) obj)).c.a((oac) obj, this.h.c, null);
                                mk0 mk0Var = this.f;
                                if (mk0Var != null) {
                                    ((mk0) ((oac) pair.second)).putExtras(mk0Var.X);
                                }
                                ((mk0) ((oac) pair.second)).putExtra(this.h.d, Integer.valueOf(size));
                            }
                            ((hj0) pair.first).g(i, closeable);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void h(d4 d4Var, float f) {
        synchronized (this) {
            try {
                if (this.g != d4Var) {
                    return;
                }
                this.d = f;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        ((hj0) pair.first).i(f);
                    }
                }
            } finally {
            }
        }
    }

    public final void i(int i) {
        synchronized (this) {
            try {
                boolean z = false;
                if (!(this.f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.b.isEmpty()) {
                    this.h.e(this.a, this);
                    return;
                }
                oac oacVar = (oac) ((Pair) this.b.iterator().next()).second;
                mk0 mk0Var = new mk0(((mk0) oacVar).a, ((mk0) oacVar).b, null, ((mk0) oacVar).c, ((mk0) oacVar).d, ((mk0) oacVar).o, d(), c(), e(), ((mk0) oacVar).v0);
                this.f = mk0Var;
                mk0Var.putExtras(((mk0) oacVar).X);
                if (i == 0) {
                    throw null;
                }
                if (i != 3) {
                    mk0 mk0Var2 = this.f;
                    int iV = az1.v(i);
                    if (iV == 0) {
                        z = true;
                    } else if (iV != 1) {
                        if (iV == 2) {
                            throw new IllegalStateException("No boolean equivalent for UNSET");
                        }
                        throw new IllegalStateException("Unrecognized TriState value: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "UNSET" : "NO" : "YES"));
                    }
                    mk0Var2.putExtra("started_as_prefetch", Boolean.valueOf(z));
                }
                d4 d4Var = new d4(1, this);
                this.g = d4Var;
                this.h.b.a(d4Var, this.f);
            } finally {
            }
        }
    }

    public final synchronized ArrayList j() {
        mk0 mk0Var = this.f;
        ArrayList arrayList = null;
        if (mk0Var == null) {
            return null;
        }
        boolean zC = c();
        synchronized (mk0Var) {
            if (zC != mk0Var.s0) {
                mk0Var.s0 = zC;
                arrayList = new ArrayList(mk0Var.u0);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList k() {
        mk0 mk0Var = this.f;
        ArrayList arrayList = null;
        if (mk0Var == null) {
            return null;
        }
        boolean zD = d();
        synchronized (mk0Var) {
            if (zD != mk0Var.Y) {
                mk0Var.Y = zD;
                arrayList = new ArrayList(mk0Var.u0);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList l() {
        ArrayList arrayList;
        mk0 mk0Var = this.f;
        if (mk0Var == null) {
            return null;
        }
        m9c m9cVarE = e();
        synchronized (mk0Var) {
            if (m9cVarE == mk0Var.Z) {
                arrayList = null;
            } else {
                mk0Var.Z = m9cVarE;
                arrayList = new ArrayList(mk0Var.u0);
            }
        }
        return arrayList;
    }
}
