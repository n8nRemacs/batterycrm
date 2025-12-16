package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dsf {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final ob0 g;
    public int h;
    public int i;
    public msf k;
    public csf l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public dsf(int i, int i2, ob0 ob0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = ob0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new csf(ob0Var.a, i2);
    }

    public final void a(Runnable runnable) {
        jei.b();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        z5j.f("Edge is already closed.", !this.n);
    }

    public final void c() {
        jei.b();
        this.l.a();
        this.n = true;
    }

    public final msf d(n22 n22Var, boolean z) {
        jei.b();
        b();
        ob0 ob0Var = this.g;
        msf msfVar = new msf(ob0Var.a, n22Var, z, ob0Var.b, ob0Var.c, new yrf(this, 0));
        try {
            cg7 cg7Var = msfVar.l;
            csf csfVar = this.l;
            Objects.requireNonNull(csfVar);
            if (csfVar.g(cg7Var, new zrf(csfVar, 0))) {
                wsf.g(csfVar.e).d(new asf(cg7Var, 0), ayi.a());
            }
            this.k = msfVar;
            f();
            return msfVar;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            msfVar.d();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        jei.b();
        b();
        csf csfVar = this.l;
        csfVar.getClass();
        jei.b();
        if (csfVar.q == null) {
            synchronized (csfVar.a) {
                z = csfVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new csf(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        lsf lsfVar;
        Executor executor;
        jei.b();
        vb0 vb0Var = new vb0(this.d, this.i, this.h, this.c, this.b, this.e);
        msf msfVar = this.k;
        if (msfVar != null) {
            synchronized (msfVar.a) {
                msfVar.m = vb0Var;
                lsfVar = msfVar.n;
                executor = msfVar.o;
            }
            if (lsfVar != null && executor != null) {
                executor.execute(new hsf(lsfVar, vb0Var, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((ju3) it.next()).accept(vb0Var);
        }
    }
}
