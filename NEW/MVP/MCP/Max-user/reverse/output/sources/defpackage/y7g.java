package defpackage;

import java.lang.Thread;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class y7g implements iv4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final EnumMap e;
    public final ContextScope f;
    public su7 g;
    public final i3e h;

    public y7g(k18 k18Var) throws Throwable {
        AtomicLong atomicLong = pu4.b;
        this.a = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        this.e = new EnumMap(Thread.State.class);
        this.f = d7j.a(((q2b) ((lzf) k18Var.getValue())).a());
        mk3 mk3Var = new mk3();
        mk3Var.makeCompleting$kotlinx_coroutines_core(qqg.a);
        this.g = mk3Var;
        this.h = new i3e(2, this);
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.h;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        long j = yg4Var.a;
        if (pu4.a(j, this.a) && !this.g.isActive()) {
            this.g = svi.e(this.f, null, null, new x7g(2, null), 3);
        } else if (pu4.a(j, this.d)) {
            av4.c.p0().b(":settings/dev/threadsviewer", null);
        }
    }
}
