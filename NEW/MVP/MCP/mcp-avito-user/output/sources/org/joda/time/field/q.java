package org.joda.time.field;

import androidx.compose.foundation.H;
import org.joda.time.AbstractC44872n;

/* compiled from: PreciseDurationField.java */
/* loaded from: classes7.dex */
public class q extends d {
    private static final long serialVersionUID = -8346152187724495365L;

    /* renamed from: c, reason: collision with root package name */
    public final long f420713c;

    public q(AbstractC44872n abstractC44872n, long j12) {
        super(abstractC44872n);
        this.f420713c = j12;
    }

    @Override // org.joda.time.AbstractC44871m
    public final long a(int i12, long j12) {
        return j.b(j12, i12 * this.f420713c);
    }

    @Override // org.joda.time.AbstractC44871m
    public final long b(long j12, long j13) {
        long j14 = this.f420713c;
        if (j14 != 1) {
            if (j13 == 1) {
                j13 = j14;
            } else {
                long j15 = 0;
                if (j13 != 0 && j14 != 0) {
                    j15 = j13 * j14;
                    if (j15 / j14 != j13 || ((j13 == Long.MIN_VALUE && j14 == -1) || (j14 == Long.MIN_VALUE && j13 == -1))) {
                        StringBuilder sbQ = H.q(j13, "Multiplication overflows a long: ", " * ");
                        sbQ.append(j14);
                        throw new ArithmeticException(sbQ.toString());
                    }
                }
                j13 = j15;
            }
        }
        return j.b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44871m
    public final long d() {
        return this.f420713c;
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f420690b == qVar.f420690b && this.f420713c == qVar.f420713c;
    }

    public final int hashCode() {
        long j12 = this.f420713c;
        return this.f420690b.hashCode() + ((int) (j12 ^ (j12 >>> 32)));
    }
}
