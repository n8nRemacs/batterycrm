package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public abstract class ki5 extends z74 {
    public static final /* synthetic */ int d = 0;
    public long a;
    public boolean b;
    public js c;

    public final void P(boolean z) {
        this.a = (z ? 4294967296L : 1L) + this.a;
        if (z) {
            return;
        }
        this.b = true;
    }

    public final boolean Q() {
        return this.a >= 4294967296L;
    }

    public abstract long Z();

    public final void d(boolean z) {
        long j = this.a - (z ? 4294967296L : 1L);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public final boolean h0() {
        js jsVar = this.c;
        if (jsVar == null) {
            return false;
        }
        ey4 ey4Var = (ey4) (jsVar.isEmpty() ? null : jsVar.removeFirst());
        if (ey4Var == null) {
            return false;
        }
        ey4Var.run();
        return true;
    }

    public void i0(long j, hi5 hi5Var) {
        km4.Z.n0(j, hi5Var);
    }

    @Override // defpackage.z74
    public final z74 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public abstract void shutdown();

    public final void w(ey4 ey4Var) {
        js jsVar = this.c;
        if (jsVar == null) {
            jsVar = new js();
            this.c = jsVar;
        }
        jsVar.addLast(ey4Var);
    }

    public abstract Thread y();
}
