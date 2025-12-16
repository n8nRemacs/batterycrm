package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class msf {
    public static final Range p = ob0.f;
    public final Object a = new Object();
    public final Size b;
    public final u75 c;
    public final Range d;
    public final n22 e;
    public final boolean f;
    public final wu1 g;
    public final tu1 h;
    public final wu1 i;
    public final tu1 j;
    public final tu1 k;
    public final cg7 l;
    public vb0 m;
    public lsf n;
    public Executor o;

    public msf(Size size, n22 n22Var, boolean z, u75 u75Var, Range range, yrf yrfVar) {
        this.b = size;
        this.e = n22Var;
        this.f = z;
        this.c = u75Var;
        this.d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        wu1 wu1VarA = ixi.a(new uu1() { // from class: isf
            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i) {
                    case 0:
                        atomicReference.set(tu1Var);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(tu1Var);
                        return str + "-status";
                    default:
                        atomicReference.set(tu1Var);
                        return str + "-Surface";
                }
            }
        });
        tu1 tu1Var = (tu1) atomicReference.get();
        tu1Var.getClass();
        this.k = tu1Var;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        wu1 wu1VarA2 = ixi.a(new uu1() { // from class: isf
            @Override // defpackage.uu1
            public final String m(tu1 tu1Var2) {
                switch (i2) {
                    case 0:
                        atomicReference2.set(tu1Var2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(tu1Var2);
                        return str + "-status";
                    default:
                        atomicReference2.set(tu1Var2);
                        return str + "-Surface";
                }
            }
        });
        this.i = wu1VarA2;
        wsf.b(wu1VarA2, new enb(tu1Var, 11, wu1VarA), ayi.a());
        tu1 tu1Var2 = (tu1) atomicReference2.get();
        tu1Var2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        wu1 wu1VarA3 = ixi.a(new uu1() { // from class: isf
            @Override // defpackage.uu1
            public final String m(tu1 tu1Var22) {
                switch (i3) {
                    case 0:
                        atomicReference3.set(tu1Var22);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(tu1Var22);
                        return str + "-status";
                    default:
                        atomicReference3.set(tu1Var22);
                        return str + "-Surface";
                }
            }
        });
        this.g = wu1VarA3;
        tu1 tu1Var3 = (tu1) atomicReference3.get();
        tu1Var3.getClass();
        this.h = tu1Var3;
        cg7 cg7Var = new cg7(this, size);
        this.l = cg7Var;
        ha8 ha8VarG = wsf.g(cg7Var.e);
        wsf.b(wu1VarA3, new u5i(ha8VarG, tu1Var2, str), ayi.a());
        ha8VarG.d(new wp4(this, 1), ayi.a());
        ex4 ex4VarA = ayi.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        wsf.b(ixi.a(new z9a(this, 26, atomicReference4)), new zkb(8, yrfVar), ex4VarA);
        tu1 tu1Var4 = (tu1) atomicReference4.get();
        tu1Var4.getClass();
        this.j = tu1Var4;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final ju3 ju3Var) {
        if (!this.h.b(surface)) {
            wu1 wu1Var = this.g;
            if (!wu1Var.isCancelled()) {
                z5j.f(null, wu1Var.b.isDone());
                try {
                    wu1Var.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: jsf
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    ju3Var.accept(new ub0(3, surface));
                                    break;
                                default:
                                    ju3Var.accept(new ub0(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: jsf
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ju3Var.accept(new ub0(3, surface));
                                    break;
                                default:
                                    ju3Var.accept(new ub0(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        wsf.b(this.i, new vhb(ju3Var, surface, false, 12), executor);
    }

    public final void c(Executor executor, lsf lsfVar) {
        vb0 vb0Var;
        synchronized (this.a) {
            this.n = lsfVar;
            this.o = executor;
            vb0Var = this.m;
        }
        if (vb0Var != null) {
            executor.execute(new hsf(lsfVar, vb0Var, 1));
        }
    }

    public final void d() {
        this.h.d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
