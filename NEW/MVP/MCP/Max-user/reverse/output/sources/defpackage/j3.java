package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class j3 implements oaa, qu6 {
    public final Object a;
    public final Object b;
    public Object c;

    public j3() {
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
        this.a = new dl6(10, false);
    }

    public vk6 a() {
        lrd lrdVar = (lrd) this.a;
        lrdVar.a();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (vk6) ((bwf) this.c).getValue() : lrdVar.d(d());
    }

    public ybj c(Executor executor, Callable callable, zkb zkbVar) {
        if (((AtomicInteger) this.b).get() <= 0) {
            throw new IllegalStateException();
        }
        if (((ybj) zkbVar.b).g()) {
            ybj ybjVar = new ybj();
            ybjVar.p();
            return ybjVar;
        }
        iv6 iv6Var = new iv6(8);
        n2g n2gVar = new n2g((zkb) iv6Var.b);
        ((dl6) this.a).u(new tv8(this, zkbVar, iv6Var, callable, n2gVar), new tn(executor, zkbVar, iv6Var, n2gVar));
        return n2gVar.a;
    }

    public abstract String d();

    public void e() {
    }

    public void f() {
        synchronized (this.b) {
            try {
                a4h a4hVar = (a4h) this.c;
                if (a4hVar != null) {
                    ((iy1) this.a).h(a4hVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface g() {
        throw new UnsupportedOperationException();
    }

    public abstract int h();

    public abstract void i();

    public void j(ju3 ju3Var) {
        Iterator it = ((Set) this.a).iterator();
        while (it.hasNext()) {
            ju3Var.accept(it.next());
        }
    }

    public void k(Bitmap bitmap, yj6 yj6Var, ct3 ct3Var) {
        throw new UnsupportedOperationException();
    }

    public void l(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void n(yj6 yj6Var) {
        throw new UnsupportedOperationException();
    }

    public void p(Object obj) {
        ((Set) this.a).add(obj);
    }

    public abstract void q();

    public void r(vk6 vk6Var) {
        if (vk6Var == ((vk6) ((bwf) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void s() {
    }

    public abstract List t(nm7 nm7Var);

    public void u(yj6 yj6Var, boolean z) {
    }

    public void v(b7a b7aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void w(jp4 jp4Var);

    public abstract void x();

    @Override // defpackage.qu6
    public void y() {
        ((iy1) this.a).g(new mr4(4, this), true);
    }

    public j3(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = context;
    }

    public j3(lrd lrdVar) {
        this.a = lrdVar;
        this.b = new AtomicBoolean(false);
        this.c = new bwf(new m2(11, this));
    }

    public j3(iy1 iy1Var) {
        this.a = iy1Var;
        this.b = new Object();
    }
}
