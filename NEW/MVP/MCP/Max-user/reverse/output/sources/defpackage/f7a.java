package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class f7a implements t4h {
    public final Context a;
    public final gf3 b;
    public final xo8 c;
    public final uy0 d;
    public final s4h e;
    public final Executor f;
    public final SparseArray g;
    public final ScheduledExecutorService h;
    public final pr4 i;
    public final ArrayDeque j;
    public final SparseArray k;
    public final boolean l;
    public List m;
    public mni n;
    public rr4 o;
    public ir4 p;
    public c4f q;
    public boolean r;
    public boolean s;
    public long t;
    public volatile boolean u;

    public f7a(uy0 uy0Var, gf3 gf3Var, c4h c4hVar, s4h s4hVar, Context context, Executor executor, boolean z) {
        hsi.b(c4hVar instanceof pr4);
        this.a = context;
        this.b = gf3Var;
        this.d = uy0Var;
        this.e = s4hVar;
        this.f = executor;
        this.l = z;
        this.t = -9223372036854775807L;
        this.g = new SparseArray();
        String str = zxg.a;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new nn3(3, "Effect:MultipleInputVideoGraph:Thread"));
        this.h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        xo8 xo8Var = new xo8(26, (byte) 0);
        this.c = xo8Var;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$BuilderB = ((pr4) c4hVar).b();
        defaultVideoFrameProcessor$Factory$BuilderB.b = xo8Var;
        defaultVideoFrameProcessor$Factory$BuilderB.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.i = defaultVideoFrameProcessor$Factory$BuilderB.build();
        this.j = new ArrayDeque();
        this.k = new SparseArray();
        this.q = c4f.c;
        t76 t76Var = wg7.b;
        this.m = zjd.o;
        this.n = mni.z0;
    }

    public final e4h a(int i) {
        SparseArray sparseArray = this.g;
        hsi.g(zxg.k(sparseArray, i));
        return (e4h) sparseArray.get(i);
    }

    public final void b() {
        h9g h9gVar = (h9g) this.j.peek();
        if (h9gVar == null) {
            return;
        }
        rr4 rr4Var = this.o;
        hsi.h(rr4Var);
        tu6 tu6Var = h9gVar.a;
        int i = tu6Var.c;
        int i2 = tu6Var.d;
        c4f c4fVar = this.q;
        if (i != c4fVar.a || i2 != c4fVar.b) {
            ff6 ff6Var = new ff6();
            ff6Var.C = this.b;
            ff6Var.t = i;
            ff6Var.u = i2;
            rr4Var.f(3, 0L, new hf6(ff6Var), this.m);
            this.q = new c4f(i, i2);
        }
        int i3 = h9gVar.a.a;
        long j = h9gVar.b;
        hsi.g(!rr4Var.w);
        if (!rr4Var.m.e() || rr4Var.x) {
            return;
        }
        j3 j3Var = (j3) rr4Var.f.j;
        hsi.h(j3Var);
        j3Var.l(i3, j);
        this.j.remove();
        if (this.r && this.j.isEmpty()) {
            rr4Var.i();
        }
    }

    @Override // defpackage.t4h
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t4h
    public final void e() throws VideoFrameProcessingException {
        hsi.g(this.g.size() == 0 && this.p == null && this.o == null && !this.s);
        rr4 rr4VarC = this.i.c(this.a, this.d, this.b, this.l, dx4.a, new h08(25, this));
        this.o = rr4VarC;
        b7a b7aVar = new b7a(this);
        SparseArray sparseArray = (SparseArray) rr4VarC.f.h;
        hsi.g(zxg.k(sparseArray, 3));
        ((zn7) sparseArray.get(3)).a.v(b7aVar);
        ir4 ir4Var = new ir4(this.a, this.c, this.h, new a3b(27, this), new b7a(this));
        this.p = ir4Var;
        ir4Var.k = this.n;
    }

    @Override // defpackage.t4h
    public final boolean f(int i) {
        return ((rr4) a(i)).e();
    }

    @Override // defpackage.t4h
    public final void flush() throws ExecutionException, InterruptedException, TimeoutException {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            ((rr4) ((e4h) sparseArray.get(sparseArray.keyAt(i)))).c();
            i++;
        }
    }

    @Override // defpackage.t4h
    public final int g(int i) {
        j3 j3Var = (j3) ((rr4) a(i)).f.j;
        if (j3Var != null) {
            return j3Var.h();
        }
        return 0;
    }

    @Override // defpackage.t4h
    public final void h(List list) {
        this.m = list;
    }

    @Override // defpackage.t4h
    public final void i(int i) throws VideoFrameProcessingException {
        hsi.g(!zxg.k(this.g, i));
        ir4 ir4Var = this.p;
        ir4Var.getClass();
        synchronized (ir4Var) {
            hsi.g(!zxg.k(ir4Var.f, i));
            ir4Var.f.put(i, new hr4());
            if (ir4Var.o == -1) {
                ir4Var.o = i;
            }
        }
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$BuilderB = this.i.b();
        defaultVideoFrameProcessor$Factory$BuilderB.c = new ad0(this, i, 12);
        defaultVideoFrameProcessor$Factory$BuilderB.d = 2;
        this.g.put(i, defaultVideoFrameProcessor$Factory$BuilderB.build().c(this.a, uy0.d, this.b, true, this.f, new bj(this, i, 10)));
    }

    @Override // defpackage.t4h
    public final Surface j(int i) {
        SparseArray sparseArray = (SparseArray) ((rr4) a(i)).f.h;
        hsi.g(zxg.k(sparseArray, 1));
        return ((zn7) sparseArray.get(1)).a.g();
    }

    @Override // defpackage.t4h
    public final void k(long j) {
        rr4 rr4Var = this.o;
        rr4Var.getClass();
        hsi.f("Calling this method is not allowed when renderFramesAutomatically is enabled", !rr4Var.j);
        rr4Var.g.h(new dr4(rr4Var, j, 1));
    }

    @Override // defpackage.t4h
    public final void l(int i, int i2, hf6 hf6Var, List list, long j) {
        ((rr4) a(i)).f(i2, j, hf6Var, list);
    }

    @Override // defpackage.t4h
    public final boolean m(int i, Bitmap bitmap, ct3 ct3Var) {
        return ((rr4) a(i)).d(bitmap, ct3Var);
    }

    @Override // defpackage.t4h
    public final boolean n() {
        return this.u;
    }

    @Override // defpackage.t4h
    public final void o(mni mniVar) {
        this.n = mniVar;
        ir4 ir4Var = this.p;
        if (ir4Var != null) {
            ir4Var.k = mniVar;
        }
    }

    @Override // defpackage.t4h
    public final void p(esf esfVar) throws ExecutionException, TimeoutException {
        rr4 rr4Var = this.o;
        rr4Var.getClass();
        rr4Var.h(esfVar);
    }

    @Override // defpackage.t4h
    public final void q(int i) {
        ((rr4) a(i)).i();
    }

    @Override // defpackage.t4h
    public final void release() throws InterruptedException {
        if (this.s) {
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            SparseArray sparseArray = this.g;
            ((rr4) ((e4h) sparseArray.get(sparseArray.keyAt(i)))).g();
        }
        ir4 ir4Var = this.p;
        if (ir4Var != null) {
            synchronized (ir4Var) {
                try {
                    ir4Var.e.e(new er4(ir4Var, 0));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.p = null;
        }
        rr4 rr4Var = this.o;
        if (rr4Var != null) {
            rr4Var.g();
            this.o = null;
        }
        this.h.submit(new gq5(23, this));
        this.h.shutdown();
        try {
            this.h.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            a8i.g("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.s = true;
    }
}
