package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class zj0 implements bw8, cw8 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public long d;

    public zj0(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                this.d = j - 1;
                break;
            default:
                this.b = j;
                this.c = j2;
                this.d = j - 1;
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                long j = this.d;
                if (j < this.b || j > this.c) {
                    throw new NoSuchElementException();
                }
                return;
            default:
                long j2 = this.d;
                if (j2 < this.b || j2 > this.c) {
                    throw new NoSuchElementException();
                }
                return;
        }
    }

    @Override // defpackage.bw8
    public final boolean next() {
        switch (this.a) {
            case 0:
                long j = this.d + 1;
                this.d = j;
                return !(j > this.c);
            default:
                long j2 = this.d + 1;
                this.d = j2;
                return !(j2 > this.c);
        }
    }
}
