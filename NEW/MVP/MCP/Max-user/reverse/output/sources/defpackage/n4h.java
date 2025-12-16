package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class n4h {
    public final h79 a;
    public final f4h b;
    public long k;
    public final dq0 c = new dq0();
    public final i9g d = new i9g(1);
    public final i9g e = new i9g(1);
    public final ry f = new ry(4, (byte) 0);
    public long g = -9223372036854775807L;
    public sch j = sch.d;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;

    public n4h(h79 h79Var, f4h f4hVar) {
        this.a = h79Var;
        this.b = f4hVar;
    }

    public final void a(long j, long j2) {
        final h79 h79Var = this.a;
        ur4 ur4Var = (ur4) h79Var.c;
        while (true) {
            ry ryVar = this.f;
            if (ryVar.d == 0) {
                return;
            }
            long jF = ryVar.f();
            Long l = (Long) this.e.f(jF);
            f4h f4hVar = this.b;
            if (l != null && l.longValue() != this.k) {
                this.k = l.longValue();
                f4hVar.f(2);
            }
            long j3 = this.k;
            f4h f4hVar2 = this.b;
            dq0 dq0Var = this.c;
            int iA = f4hVar2.a(jF, j, j2, j3, false, false, dq0Var);
            if (iA == 0 || iA == 1) {
                this.h = jF;
                boolean z = iA == 0;
                long jH = ryVar.h();
                sch schVar = (sch) this.d.f(jH);
                if (schVar != null && !schVar.equals(sch.d) && !schVar.equals(this.j)) {
                    this.j = schVar;
                    ff6 ff6Var = new ff6();
                    ff6Var.t = schVar.a;
                    ff6Var.u = schVar.b;
                    ff6Var.m = xz9.n("video/raw");
                    h79Var.b = new hf6(ff6Var);
                    ur4Var.h.execute(new kr4(h79Var, 1, schVar));
                }
                long jNanoTime = z ? System.nanoTime() : dq0Var.c;
                boolean z2 = f4hVar.e != 3;
                f4hVar.e = 3;
                f4hVar.l.getClass();
                f4hVar.g = zxg.U(SystemClock.elapsedRealtime());
                if (z2 && ur4Var.d != null) {
                    final int i = 0;
                    ur4Var.h.execute(new Runnable() { // from class: tr4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    ((ur4) h79Var.c).g.onFirstFrameRendered();
                                    break;
                                default:
                                    ((ur4) h79Var.c).g.b();
                                    break;
                            }
                        }
                    });
                }
                hf6 hf6Var = (hf6) h79Var.b;
                ur4Var.i.b(jH, jNanoTime, hf6Var == null ? new hf6(new ff6()) : hf6Var, null);
                ((pch) ur4Var.c.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.h = jF;
                ryVar.h();
                final int i2 = 1;
                ur4Var.h.execute(new Runnable() { // from class: tr4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ((ur4) h79Var.c).g.onFirstFrameRendered();
                                break;
                            default:
                                ((ur4) h79Var.c).g.b();
                                break;
                        }
                    }
                });
                ((pch) ur4Var.c.remove()).G();
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.h = jF;
            }
        }
    }
}
