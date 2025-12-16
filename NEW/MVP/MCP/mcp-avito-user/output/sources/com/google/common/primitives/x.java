package com.google.common.primitives;

import java.io.Serializable;

/* compiled from: UnsignedLong.java */
@XY0.b
@f
/* loaded from: classes6.dex */
public final class x extends Number implements Comparable<x>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final long f360423b;

    static {
        new x(0L);
        new x(1L);
        new x(-1L);
    }

    public x(long j12) {
        this.f360423b = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(x xVar) {
        x xVar2 = xVar;
        xVar2.getClass();
        return y.a(this.f360423b, xVar2.f360423b);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j12 = this.f360423b;
        return j12 >= 0 ? j12 : ((j12 >>> 1) | (j12 & 1)) * 2.0d;
    }

    public final boolean equals(@I41.a Object obj) {
        return (obj instanceof x) && this.f360423b == ((x) obj).f360423b;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j12 = this.f360423b;
        return j12 >= 0 ? j12 : ((j12 >>> 1) | (j12 & 1)) * 2.0f;
    }

    public final int hashCode() {
        return n.b(this.f360423b);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f360423b;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f360423b;
    }

    public final String toString() {
        long j12 = this.f360423b;
        if (j12 == 0) {
            return "0";
        }
        if (j12 > 0) {
            return Long.toString(j12, 10);
        }
        char[] cArr = new char[64];
        long j13 = (j12 >>> 1) / 5;
        long j14 = 10;
        int i12 = 63;
        cArr[63] = Character.forDigit((int) (j12 - (j13 * j14)), 10);
        while (j13 > 0) {
            i12--;
            cArr[i12] = Character.forDigit((int) (j13 % j14), 10);
            j13 /= j14;
        }
        return new String(cArr, i12, 64 - i12);
    }
}
