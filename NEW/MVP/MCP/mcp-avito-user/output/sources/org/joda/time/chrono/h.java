package org.joda.time.chrono;

import androidx.compose.foundation.text.selection.C21030p;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicMonthOfYearDateTimeField.java */
/* loaded from: classes7.dex */
class h extends org.joda.time.field.k {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420596e;

    /* renamed from: f, reason: collision with root package name */
    public final int f420597f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420598g;

    public h(AbstractC44859c abstractC44859c, int i12) {
        super(AbstractC44865g.f420887i, abstractC44859c.X());
        this.f420596e = abstractC44859c;
        this.f420597f = abstractC44859c.o0();
        this.f420598g = i12;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return j12 - F(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        AbstractC44859c abstractC44859c = this.f420596e;
        int iZ02 = abstractC44859c.z0(j12);
        return abstractC44859c.A0(iZ02) + abstractC44859c.v0(iZ02, abstractC44859c.t0(iZ02, j12));
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        org.joda.time.field.j.d(this, i12, 1, this.f420597f);
        AbstractC44859c abstractC44859c = this.f420596e;
        int iZ02 = abstractC44859c.z0(j12);
        int iC02 = abstractC44859c.c0(iZ02, abstractC44859c.t0(iZ02, j12), j12);
        int iM02 = abstractC44859c.m0(iZ02, i12);
        if (iC02 > iM02) {
            iC02 = iM02;
        }
        return abstractC44859c.B0(iZ02, i12, iC02) + AbstractC44859c.q0(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        int i13;
        int i14;
        int i15;
        if (i12 == 0) {
            return j12;
        }
        AbstractC44859c abstractC44859c = this.f420596e;
        abstractC44859c.getClass();
        long jQ02 = AbstractC44859c.q0(j12);
        int iZ02 = abstractC44859c.z0(j12);
        int iT02 = abstractC44859c.t0(iZ02, j12);
        int i16 = iT02 - 1;
        int i17 = i16 + i12;
        int i18 = this.f420597f;
        if (iT02 <= 0 || i17 >= 0) {
            i13 = iZ02;
        } else {
            int i19 = i12 + i18;
            if (Math.signum(i19) == Math.signum(i12)) {
                i13 = iZ02 - 1;
            } else {
                i19 = i12 - i18;
                i13 = iZ02 + 1;
            }
            i17 = i19 + i16;
        }
        if (i17 >= 0) {
            i14 = (i17 / i18) + i13;
            i15 = (i17 % i18) + 1;
        } else {
            i14 = (i17 / i18) + i13;
            int i22 = i14 - 1;
            int iAbs = Math.abs(i17) % i18;
            if (iAbs == 0) {
                iAbs = i18;
            }
            i15 = (i18 - iAbs) + 1;
            if (i15 != 1) {
                i14 = i22;
            }
        }
        int iC02 = abstractC44859c.c0(iZ02, iT02, j12);
        int iM02 = abstractC44859c.m0(i14, i15);
        if (iC02 > iM02) {
            iC02 = iM02;
        }
        return abstractC44859c.B0(i14, i15, iC02) + jQ02;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        long j14;
        long j15;
        long j16;
        int i12 = (int) j13;
        if (i12 == j13) {
            return a(i12, j12);
        }
        AbstractC44859c abstractC44859c = this.f420596e;
        abstractC44859c.getClass();
        long jQ02 = AbstractC44859c.q0(j12);
        int iZ02 = abstractC44859c.z0(j12);
        int iT02 = abstractC44859c.t0(iZ02, j12);
        long j17 = (iT02 - 1) + j13;
        int i13 = this.f420597f;
        if (j17 < 0) {
            long j18 = i13;
            j14 = (j17 / j18) + iZ02;
            long j19 = j14 - 1;
            int iAbs = (int) (Math.abs(j17) % j18);
            if (iAbs == 0) {
                iAbs = i13;
            }
            j15 = (i13 - iAbs) + 1;
            if (j15 != 1) {
                j16 = j19;
            }
            if (j16 >= abstractC44859c.r0() || j16 > abstractC44859c.p0()) {
                throw new IllegalArgumentException(C21030p.a(j13, "Magnitude of add amount is too large: "));
            }
            int i14 = (int) j16;
            int i15 = (int) j15;
            int iC02 = abstractC44859c.c0(iZ02, iT02, j12);
            int iM02 = abstractC44859c.m0(i14, i15);
            if (iC02 > iM02) {
                iC02 = iM02;
            }
            return abstractC44859c.B0(i14, i15, iC02) + jQ02;
        }
        long j22 = i13;
        j14 = (j17 / j22) + iZ02;
        j15 = (j17 % j22) + 1;
        j16 = j14;
        if (j16 >= abstractC44859c.r0()) {
        }
        throw new IllegalArgumentException(C21030p.a(j13, "Magnitude of add amount is too large: "));
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420596e.u0(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420596e.f420515i;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420597f;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420596e.f420519m;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        AbstractC44859c abstractC44859c = this.f420596e;
        int iZ02 = abstractC44859c.z0(j12);
        return abstractC44859c.D0(iZ02) && abstractC44859c.t0(iZ02, j12) == this.f420598g;
    }
}
