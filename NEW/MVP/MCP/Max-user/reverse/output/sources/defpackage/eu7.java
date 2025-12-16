package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class eu7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu7 b;

    public /* synthetic */ eu7(gu7 gu7Var, int i) {
        this.a = i;
        this.b = gu7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ce5 ce5Var;
        int i;
        switch (this.a) {
            case 0:
                gu7 gu7Var = this.b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (gu7Var) {
                    ce5Var = gu7Var.e;
                    i = gu7Var.f;
                    gu7Var.e = null;
                    gu7Var.f = 0;
                    gu7Var.g = 3;
                    gu7Var.i = jUptimeMillis;
                }
                try {
                    if (gu7.d(ce5Var, i)) {
                        gu7Var.b.d(ce5Var, i);
                    }
                    return;
                } finally {
                    ce5.d(ce5Var);
                    gu7Var.b();
                }
            default:
                gu7 gu7Var2 = this.b;
                gu7Var2.a.execute(gu7Var2.c);
                return;
        }
    }
}
