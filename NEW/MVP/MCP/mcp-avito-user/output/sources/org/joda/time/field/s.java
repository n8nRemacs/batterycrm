package org.joda.time.field;

import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: ScaledDurationField.java */
/* loaded from: classes7.dex */
public class s extends f {
    private static final long serialVersionUID = -3205227092378684157L;

    /* renamed from: d, reason: collision with root package name */
    public final int f420717d;

    public s(AbstractC44871m abstractC44871m, AbstractC44872n abstractC44872n) {
        super(abstractC44871m, abstractC44872n);
        this.f420717d = 100;
    }

    @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
    public final long a(int i12, long j12) {
        return this.f420692c.b(j12, i12 * this.f420717d);
    }

    @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
    public final long b(long j12, long j13) {
        int i12 = this.f420717d;
        if (i12 != -1) {
            if (i12 == 0) {
                j13 = 0;
            } else if (i12 != 1) {
                long j14 = i12;
                long j15 = j13 * j14;
                if (j15 / j14 != j13) {
                    throw new ArithmeticException("Multiplication overflows a long: " + j13 + " * " + i12);
                }
                j13 = j15;
            }
        } else {
            if (j13 == Long.MIN_VALUE) {
                throw new ArithmeticException("Multiplication overflows a long: " + j13 + " * " + i12);
            }
            j13 = -j13;
        }
        return this.f420692c.b(j12, j13);
    }

    @Override // org.joda.time.field.f, org.joda.time.AbstractC44871m
    public final long d() {
        return this.f420692c.d() * this.f420717d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f420692c.equals(sVar.f420692c) && this.f420690b == sVar.f420690b && this.f420717d == sVar.f420717d;
    }

    public final int hashCode() {
        long j12 = this.f420717d;
        return this.f420692c.hashCode() + this.f420690b.hashCode() + ((int) (j12 ^ (j12 >>> 32)));
    }
}
