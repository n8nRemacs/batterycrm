package org.threeten.bp.temporal;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* compiled from: ValueRange.java */
/* loaded from: classes15.dex */
public final class l implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: b, reason: collision with root package name */
    public final long f422205b;

    /* renamed from: c, reason: collision with root package name */
    public final long f422206c;

    /* renamed from: d, reason: collision with root package name */
    public final long f422207d;

    /* renamed from: e, reason: collision with root package name */
    public final long f422208e;

    public l(long j12, long j13, long j14, long j15) {
        this.f422205b = j12;
        this.f422206c = j13;
        this.f422207d = j14;
        this.f422208e = j15;
    }

    public static l d(long j12, long j13) {
        if (j12 <= j13) {
            return new l(j12, j12, j13, j13);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static l e(long j12, long j13, long j14, long j15) {
        if (j12 > j13) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j14 > j15) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j13 <= j15) {
            return new l(j12, j13, j14, j15);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public final int a(long j12, h hVar) {
        if (this.f422205b >= -2147483648L && this.f422208e <= 2147483647L && c(j12)) {
            return (int) j12;
        }
        throw new DateTimeException("Invalid int value for " + hVar + ": " + j12);
    }

    public final void b(long j12, h hVar) {
        if (c(j12)) {
            return;
        }
        if (hVar == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j12);
        }
        throw new DateTimeException("Invalid value for " + hVar + " (valid values " + this + "): " + j12);
    }

    public final boolean c(long j12) {
        return j12 >= this.f422205b && j12 <= this.f422208e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f422205b == lVar.f422205b && this.f422206c == lVar.f422206c && this.f422207d == lVar.f422207d && this.f422208e == lVar.f422208e;
    }

    public final int hashCode() {
        long j12 = this.f422205b;
        long j13 = this.f422206c;
        long j14 = (j12 + j13) << ((int) (j13 + 16));
        long j15 = this.f422207d;
        long j16 = (j14 >> ((int) (j15 + 48))) << ((int) (j15 + 32));
        long j17 = this.f422208e;
        long j18 = ((j16 >> ((int) (32 + j17))) << ((int) (j17 + 48))) >> 16;
        return (int) (j18 ^ (j18 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j12 = this.f422205b;
        sb2.append(j12);
        long j13 = this.f422206c;
        if (j12 != j13) {
            sb2.append('/');
            sb2.append(j13);
        }
        sb2.append(" - ");
        long j14 = this.f422207d;
        sb2.append(j14);
        long j15 = this.f422208e;
        if (j14 != j15) {
            sb2.append('/');
            sb2.append(j15);
        }
        return sb2.toString();
    }
}
