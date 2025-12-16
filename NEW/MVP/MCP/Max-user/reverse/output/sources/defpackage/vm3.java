package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class vm3 {
    public final int a;
    public final wm3[] b;
    public long c;

    public vm3(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new wm3[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new wm3(threadFactory);
        }
    }

    public final wm3 a() {
        int i = this.a;
        if (i == 0) {
            return xm3.g;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % i)];
    }
}
