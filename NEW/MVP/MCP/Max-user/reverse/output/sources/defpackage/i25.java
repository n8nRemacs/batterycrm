package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i25 extends Thread {
    public volatile g25 X;
    public volatile boolean Y;
    public Exception Z;
    public final r25 a;
    public final u25 b;
    public final o25 c;
    public final boolean d;
    public final int o;
    public long s0 = -1;

    public i25(r25 r25Var, u25 u25Var, o25 o25Var, boolean z, int i, g25 g25Var) {
        this.a = r25Var;
        this.b = u25Var;
        this.c = o25Var;
        this.d = z;
        this.o = i;
        this.X = g25Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.X = null;
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.b.cancel();
        interrupt();
    }

    public final void b(long j, long j2, float f) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.s0) {
            this.s0 = j;
            g25 g25Var = this.X;
            if (g25Var != null) {
                g25Var.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        try {
            if (this.d) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.Y) {
                    try {
                        this.b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.Y) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.o) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.Z = e2;
        }
        g25 g25Var = this.X;
        if (g25Var != null) {
            g25Var.obtainMessage(10, this).sendToTarget();
        }
    }
}
