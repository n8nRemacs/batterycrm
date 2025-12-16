package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class isd extends cb8 {
    public final lrd l;
    public final s7c m;
    public final jad o;
    public final n84 p;
    public final boolean n = true;
    public final AtomicBoolean q = new AtomicBoolean(true);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final hsd t = new hsd(this, 0);
    public final hsd u = new hsd(this, 1);

    public isd(lrd lrdVar, s7c s7cVar, jad jadVar, String[] strArr) {
        this.l = lrdVar;
        this.m = s7cVar;
        this.o = jadVar;
        this.p = new n84(strArr, this, 1);
    }

    @Override // defpackage.cb8
    public final void g() {
        Executor executor;
        ((Set) this.m.b).add(this);
        boolean z = this.n;
        lrd lrdVar = this.l;
        if (!z ? (executor = lrdVar.b) == null : (executor = lrdVar.c) == null) {
            executor = null;
        }
        executor.execute(this.t);
    }

    @Override // defpackage.cb8
    public final void h() {
        ((Set) this.m.b).remove(this);
    }
}
