package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class hv4 implements iv4 {
    public final long a;
    public final long b;
    public final hbd c;

    public hv4() {
        AtomicLong atomicLong = pu4.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        this.a = jIncrementAndGet;
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.b = jIncrementAndGet2;
        n5g n5gVar = new n5g(j3d.oneme_settings_old_dev_menu);
        int i = yud.T;
        wg4 wg4Var = wg4.a;
        this.c = new hbd(ucf.a(ve3.j(new yg4(jIncrementAndGet, n5gVar, i, null, wg4Var, 8), new yg4(jIncrementAndGet2, new n5g(j3d.oneme_settings_old_logs_menu), yud.f, null, wg4Var, 8))));
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.c;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        long j = yg4Var.a;
        if (pu4.a(j, this.b)) {
            av4.c.p0().b(":settings/dev/logsviewer", null);
        } else if (pu4.a(j, this.a)) {
            av4.c.p0().b(":settings/dev/showroom", null);
        }
    }
}
