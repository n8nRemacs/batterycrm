package org.joda.time.chrono;

/* compiled from: BasicFixedMonthChronology.java */
/* loaded from: classes7.dex */
abstract class f extends AbstractC44859c {
    private static final long serialVersionUID = 261387371998L;

    @Override // org.joda.time.chrono.AbstractC44859c
    public final boolean D0(int i12) {
        return (i12 & 3) == 3;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long E0(int i12, long j12) {
        int iF02 = f0(z0(j12), j12);
        int iQ02 = AbstractC44859c.q0(j12);
        if (iF02 > 365 && !D0(i12)) {
            iF02--;
        }
        return B0(i12, 1, iF02) + iQ02;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long X() {
        return 2592000000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Y() {
        return 31557600000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Z() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int d0(long j12) {
        return ((f0(z0(j12), j12) - 1) % 30) + 1;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int g0() {
        return 30;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int h0(int i12) {
        return i12 != 13 ? 30 : 6;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int m0(int i12, int i13) {
        if (i13 != 13) {
            return 30;
        }
        return D0(i12) ? 6 : 5;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int o0() {
        return 13;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int t0(int i12, long j12) {
        return ((int) ((j12 - A0(i12)) / 2592000000L)) + 1;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int u0(long j12) {
        return androidx.appcompat.app.r.f(f0(z0(j12), j12), 1, 30, 1);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long v0(int i12, int i13) {
        return (i13 - 1) * 2592000000L;
    }
}
