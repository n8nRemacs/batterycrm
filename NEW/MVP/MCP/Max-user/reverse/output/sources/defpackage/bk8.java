package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class bk8 implements Iterable, my7 {
    public final long a;
    public final long b;
    public final long c;

    public bk8(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bk8)) {
            return false;
        }
        if (isEmpty() && ((bk8) obj).isEmpty()) {
            return true;
        }
        bk8 bk8Var = (bk8) obj;
        return this.a == bk8Var.a && this.b == bk8Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ak8(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
