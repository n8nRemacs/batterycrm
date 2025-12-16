package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class w4c {
    public final u4c a;
    public final s4c b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public w4c(s4c s4cVar, u4c u4cVar, s9g s9gVar, int i, Looper looper) {
        this.b = s4cVar;
        this.a = u4cVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        hsi.g(!this.f);
        this.f = true;
        sm5 sm5Var = (sm5) this.b;
        if (!sm5Var.S0 && sm5Var.t0.getThread().isAlive()) {
            sm5Var.Z.a(14, this).b();
        } else {
            a8i.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
