package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m3c implements s4h {
    public static final es z = new es(1);
    public final Context a;
    public final e7a b;
    public final SparseArray c;
    public final boolean d;
    public final ur4 e;
    public final g3c f;
    public final mwf g;
    public final CopyOnWriteArraySet h;
    public i9g i = new i9g(1);
    public hf6 j;
    public final mni k;
    public final zjd l;
    public wwf m;
    public t4h n;
    public x3h o;
    public long p;
    public int q;
    public Pair r;
    public int s;
    public int t;
    public long u;
    public long v;
    public boolean w;
    public int x;
    public int y;

    public m3c(sk skVar) {
        this.a = (Context) skVar.d;
        e7a e7aVar = (e7a) skVar.X;
        hsi.h(e7aVar);
        this.b = e7aVar;
        this.c = new SparseArray();
        t76 t76Var = wg7.b;
        this.l = zjd.o;
        this.k = mni.z0;
        this.d = skVar.b;
        mwf mwfVar = (mwf) skVar.Y;
        this.g = mwfVar;
        this.e = new ur4((f4h) skVar.o, mwfVar);
        this.f = new g3c(this);
        this.h = new CopyOnWriteArraySet();
        this.j = new hf6(new ff6());
        this.p = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -1;
        this.t = 0;
    }

    public static void b(m3c m3cVar, boolean z2) {
        if (m3cVar.t == 1) {
            m3cVar.s++;
            m3cVar.e.o(z2);
            while (m3cVar.i.h() > 1) {
                m3cVar.i.e();
            }
            if (m3cVar.i.h() == 1) {
                l3c l3cVar = (l3c) m3cVar.i.e();
                l3cVar.getClass();
                m3cVar.p = l3cVar.a;
                m3cVar.q = l3cVar.b;
                m3cVar.e();
            }
            m3cVar.u = -9223372036854775807L;
            m3cVar.v = -9223372036854775807L;
            m3cVar.w = false;
            wwf wwfVar = m3cVar.m;
            hsi.h(wwfVar);
            wwfVar.d(new awa(10, m3cVar));
        }
    }

    @Override // defpackage.s4h
    public final void F(float f) {
        ff6 ff6VarA = this.j.a();
        ff6VarA.x = f;
        this.j = new hf6(ff6VarA);
        e();
    }

    @Override // defpackage.s4h
    public final void a(long j) {
    }

    public final void c(Surface surface, int i, int i2) {
        t4h t4hVar = this.n;
        if (t4hVar == null) {
            return;
        }
        ur4 ur4Var = this.e;
        if (surface != null) {
            t4hVar.p(new esf(surface, i, i2, 0, false));
            ur4Var.f(surface, new c4f(i, i2));
        } else {
            t4hVar.p(null);
            ur4Var.l();
        }
    }

    @Override // defpackage.s4h
    public final void d(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            j3cVar.h.execute(new se5(j3cVar, j3cVar.g, videoFrameProcessingException, 28));
        }
    }

    public final void e() {
        hf6 hf6Var = this.j;
        long j = this.p;
        int i = this.q;
        t76 t76Var = wg7.b;
        this.e.u(i, j, hf6Var, zjd.o);
    }

    @Override // defpackage.s4h
    public final void l(int i, int i2) {
        ff6 ff6VarA = this.j.a();
        ff6VarA.t = i;
        ff6VarA.u = i2;
        this.j = new hf6(ff6VarA);
        e();
    }

    @Override // defpackage.s4h
    public final void p(long j, boolean z2) {
        if (this.s > 0) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            och ochVar = j3cVar.g;
            Executor executor = j3cVar.h;
            Objects.requireNonNull(ochVar);
            executor.execute(new i3c(ochVar, 0));
        }
        if (z2) {
            x3h x3hVar = this.o;
            if (x3hVar != null) {
                x3hVar.b(j, -9223372036854775807L, this.j, null);
                return;
            }
            return;
        }
        this.u = j;
        l3c l3cVar = (l3c) this.i.f(j);
        if (l3cVar != null) {
            this.p = l3cVar.a;
            this.q = l3cVar.b;
            e();
        }
        g3c g3cVar = this.f;
        ur4 ur4Var = this.e;
        ur4Var.g(j, g3cVar);
        long j2 = this.v;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        ur4Var.c();
        this.w = true;
    }
}
