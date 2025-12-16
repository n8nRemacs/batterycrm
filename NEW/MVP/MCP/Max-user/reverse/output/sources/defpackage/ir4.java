package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class ir4 implements vu6 {
    public final a3b a;
    public final b7a b;
    public final xo8 c;
    public final sa9 d;
    public final iy1 e;
    public boolean g;
    public gf3 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;
    public final SparseArray f = new SparseArray();
    public final rs0 h = new rs0(false, 1);
    public final ry i = new ry(1);
    public final ry j = new ry(1);
    public mni k = mni.z0;

    public ir4(Context context, xo8 xo8Var, ScheduledExecutorService scheduledExecutorService, a3b a3bVar, b7a b7aVar) {
        this.a = a3bVar;
        this.b = b7aVar;
        this.c = xo8Var;
        this.d = new sa9(context, 7);
        iy1 iy1Var = new iy1((ExecutorService) scheduledExecutorService, false, (z3h) new wo4(2, a3bVar));
        this.e = iy1Var;
        iy1Var.g(new er4(this, 2), true);
    }

    @Override // defpackage.vu6
    public final void a(long j) {
        this.e.g(new dr4(this, j, 0), true);
    }

    public final synchronized zjd b() {
        if (this.h.j() == 0) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (((hr4) this.f.valueAt(i)).a.isEmpty()) {
                t76 t76Var2 = wg7.b;
                return zjd.o;
            }
        }
        tg7 tg7Var = new tg7(4);
        gr4 gr4Var = (gr4) ((hr4) this.f.get(this.o)).a.element();
        tg7Var.a(gr4Var);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.keyAt(i2) != this.o) {
                hr4 hr4Var = (hr4) this.f.valueAt(i2);
                if (hr4Var.a.size() == 1 && !hr4Var.b) {
                    t76 t76Var3 = wg7.b;
                    return zjd.o;
                }
                Iterator it = hr4Var.a.iterator();
                long j = BuildConfig.MAX_TIME_TO_UPLOAD;
                gr4 gr4Var2 = null;
                while (it.hasNext()) {
                    gr4 gr4Var3 = (gr4) it.next();
                    long j2 = gr4Var3.b.b;
                    long jAbs = Math.abs(j2 - gr4Var.b.b);
                    if (jAbs < j) {
                        gr4Var2 = gr4Var3;
                        j = jAbs;
                    }
                    if (j2 > gr4Var.b.b || (!it.hasNext() && hr4Var.b)) {
                        gr4Var2.getClass();
                        tg7Var.a(gr4Var2);
                        break;
                    }
                }
            }
        }
        zjd zjdVarI = tg7Var.i();
        if (zjdVarI.d == this.f.size()) {
            return zjdVarI;
        }
        return zjd.o;
    }

    public final synchronized void c() {
        try {
            zjd zjdVarB = b();
            if (zjdVarB.isEmpty()) {
                return;
            }
            gr4 gr4Var = (gr4) zjdVarB.get(this.o);
            u4j.a(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i = 0;
            int i2 = 0;
            while (i < zjdVarB.d) {
                tu6 tu6Var = ((gr4) zjdVarB.get(i)).b.a;
                c4f c4fVar = new c4f(tu6Var.c, tu6Var.d);
                int i3 = i2 + 1;
                int iH = mg7.h(objArrCopyOf.length, i3);
                if (iH > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
                }
                objArrCopyOf[i2] = c4fVar;
                i++;
                i2 = i3;
            }
            mni mniVar = this.k;
            zjd zjdVarH = wg7.h(i2, objArrCopyOf);
            mniVar.getClass();
            c4f c4fVar2 = (c4f) zjdVarH.get(0);
            this.h.i(this.c, c4fVar2.a, c4fVar2.b);
            tu6 tu6VarL = this.h.l();
            long j = gr4Var.b.b;
            this.i.e(j);
            this.d.v(zjdVarB, tu6VarL);
            this.j.e(guf.k());
            this.b.a(this, tu6VarL, j);
            hr4 hr4Var = (hr4) this.f.get(this.o);
            f(hr4Var, 1);
            d();
            if (this.g && hr4Var.a.isEmpty()) {
                this.a.y();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.keyAt(i) != this.o) {
                e((hr4) this.f.valueAt(i));
            }
        }
    }

    public final synchronized void e(hr4 hr4Var) {
        int iH;
        hr4 hr4Var2 = (hr4) this.f.get(this.o);
        if (hr4Var2.a.isEmpty() && hr4Var2.b) {
            f(hr4Var, hr4Var.a.size());
            return;
        }
        gr4 gr4Var = (gr4) hr4Var2.a.peek();
        final long j = gr4Var != null ? gr4Var.b.b : -9223372036854775807L;
        ArrayDeque arrayDeque = hr4Var.a;
        l7c l7cVar = new l7c() { // from class: fr4
            @Override // defpackage.l7c
            public final boolean apply(Object obj) {
                return ((gr4) obj).b.b <= j;
            }
        };
        arrayDeque.getClass();
        Iterable dt7Var = new dt7(arrayDeque, l7cVar);
        if (dt7Var instanceof Collection) {
            iH = ((Collection) dt7Var).size();
        } else {
            Iterator it = dt7Var.iterator();
            long j2 = 0;
            while (true) {
                et7 et7Var = (et7) it;
                if (!et7Var.hasNext()) {
                    break;
                }
                et7Var.next();
                j2++;
            }
            iH = jni.h(j2);
        }
        f(hr4Var, Math.max(iH - 1, 0));
    }

    public final synchronized void f(hr4 hr4Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            gr4 gr4Var = (gr4) hr4Var.a.remove();
            gr4Var.a.a(gr4Var.b.b);
        }
    }
}
