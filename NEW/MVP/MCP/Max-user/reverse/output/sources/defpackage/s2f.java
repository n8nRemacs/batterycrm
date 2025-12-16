package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class s2f implements t4h {
    public final Context a;
    public final c4h b;
    public final gf3 c;
    public final s4h d;
    public final uy0 e;
    public final Executor f;
    public final boolean g;
    public e4h h;
    public esf i;
    public wg7 j;
    public boolean k;
    public volatile boolean l;
    public int m;

    public s2f(uy0 uy0Var, gf3 gf3Var, c4h c4hVar, s4h s4hVar, Context context, Executor executor, boolean z) {
        this.a = context;
        this.b = c4hVar;
        this.c = gf3Var;
        this.d = s4hVar;
        this.e = uy0Var;
        this.f = executor;
        t76 t76Var = wg7.b;
        this.j = zjd.o;
        this.g = z;
        this.m = -1;
    }

    @Override // defpackage.t4h
    public final void d() {
        e4h e4hVar = this.h;
        hsi.h(e4hVar);
        rr4 rr4Var = (rr4) e4hVar;
        emd emdVar = rr4Var.u;
        if (emdVar == null) {
            throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
        }
        if (emdVar.j == 0) {
            return;
        }
        rr4Var.g.g(new nr4(rr4Var, 2), true);
    }

    @Override // defpackage.t4h
    public final void e() {
    }

    @Override // defpackage.t4h
    public final boolean f(int i) {
        hsi.h(this.h);
        return ((rr4) this.h).e();
    }

    @Override // defpackage.t4h
    public final void flush() throws ExecutionException, InterruptedException, TimeoutException {
        hsi.h(this.h);
        ((rr4) this.h).c();
    }

    @Override // defpackage.t4h
    public final int g(int i) {
        hsi.h(this.h);
        j3 j3Var = (j3) ((rr4) this.h).f.j;
        if (j3Var != null) {
            return j3Var.h();
        }
        return 0;
    }

    @Override // defpackage.t4h
    public final void h(List list) {
        this.j = wg7.j(list);
    }

    @Override // defpackage.t4h
    public final void i(int i) throws ExecutionException, TimeoutException {
        if (this.h == null) {
            boolean z = this.k;
        }
        hsi.f("This VideoGraph supports only one input.", this.m == -1);
        this.m = i;
        e4h e4hVarA = this.b.a(this.a, this.e, this.c, this.g, new v32(13, this));
        this.h = e4hVarA;
        esf esfVar = this.i;
        if (esfVar != null) {
            ((rr4) e4hVarA).h(esfVar);
        }
    }

    @Override // defpackage.t4h
    public final Surface j(int i) {
        hsi.h(this.h);
        SparseArray sparseArray = (SparseArray) ((rr4) this.h).f.h;
        hsi.g(zxg.k(sparseArray, 1));
        return ((zn7) sparseArray.get(1)).a.g();
    }

    @Override // defpackage.t4h
    public final void k(long j) {
        hsi.h(this.h);
        rr4 rr4Var = (rr4) this.h;
        hsi.f("Calling this method is not allowed when renderFramesAutomatically is enabled", !rr4Var.j);
        rr4Var.g.h(new dr4(rr4Var, j, 1));
    }

    @Override // defpackage.t4h
    public final void l(int i, int i2, hf6 hf6Var, List list, long j) {
        hsi.h(this.h);
        e4h e4hVar = this.h;
        tg7 tg7Var = new tg7(4);
        tg7Var.d(list);
        tg7Var.d(this.j);
        ((rr4) e4hVar).f(i2, j, hf6Var, tg7Var.i());
    }

    @Override // defpackage.t4h
    public final boolean m(int i, Bitmap bitmap, ct3 ct3Var) {
        hsi.h(this.h);
        return ((rr4) this.h).d(bitmap, ct3Var);
    }

    @Override // defpackage.t4h
    public final boolean n() {
        return this.l;
    }

    @Override // defpackage.t4h
    public final void o(mni mniVar) {
        hsi.a("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", mniVar.equals(mni.z0));
    }

    @Override // defpackage.t4h
    public final void p(esf esfVar) throws ExecutionException, TimeoutException {
        this.i = esfVar;
        e4h e4hVar = this.h;
        if (e4hVar != null) {
            ((rr4) e4hVar).h(esfVar);
        }
    }

    @Override // defpackage.t4h
    public final void q(int i) {
        hsi.h(this.h);
        ((rr4) this.h).i();
    }

    @Override // defpackage.t4h
    public final void release() {
        if (this.k) {
            return;
        }
        e4h e4hVar = this.h;
        if (e4hVar != null) {
            ((rr4) e4hVar).g();
        }
        this.k = true;
    }
}
