package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class l10 {
    public long a;
    public long b;
    public long c;
    public long d;
    public int e;
    public Object f;

    public l10(l10 l10Var) {
        this.a = l10Var.a;
        this.b = l10Var.b;
        this.c = l10Var.c;
        this.d = l10Var.d;
        this.e = l10Var.e;
        this.f = (String) l10Var.f;
    }

    public void a() {
        if (((g60) this.f) != null) {
            b(0);
        }
    }

    public void b(int i) {
        this.e = i;
        if (i == 0) {
            this.c = 0L;
            this.d = -1L;
            this.a = System.nanoTime() / 1000;
            this.b = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 1) {
            this.b = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 2 || i == 3) {
            this.b = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.b = 500000L;
        }
    }
}
