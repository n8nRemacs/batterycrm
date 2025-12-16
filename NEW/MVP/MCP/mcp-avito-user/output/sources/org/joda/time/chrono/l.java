package org.joda.time.chrono;

import androidx.compose.foundation.H;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicYearDateTimeField.java */
/* loaded from: classes7.dex */
class l extends org.joda.time.field.k {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420602e;

    public l(AbstractC44859c abstractC44859c) {
        super(AbstractC44865g.f420885g, abstractC44859c.Y());
        this.f420602e = abstractC44859c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return j12 - F(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        AbstractC44859c abstractC44859c = this.f420602e;
        int iZ02 = abstractC44859c.z0(j12);
        return j12 != abstractC44859c.A0(iZ02) ? abstractC44859c.A0(iZ02 + 1) : j12;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        AbstractC44859c abstractC44859c = this.f420602e;
        return abstractC44859c.A0(abstractC44859c.z0(j12));
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        AbstractC44859c abstractC44859c = this.f420602e;
        org.joda.time.field.j.d(this, i12, abstractC44859c.r0(), abstractC44859c.p0());
        return abstractC44859c.E0(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long I(int i12, long j12) {
        AbstractC44859c abstractC44859c = this.f420602e;
        org.joda.time.field.j.d(this, i12, abstractC44859c.r0() - 1, abstractC44859c.p0() + 1);
        return abstractC44859c.E0(i12, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        if (i12 == 0) {
            return j12;
        }
        int iZ02 = this.f420602e.z0(j12);
        int i13 = iZ02 + i12;
        if ((iZ02 ^ i13) >= 0 || (iZ02 ^ i12) < 0) {
            return G(i13, j12);
        }
        throw new ArithmeticException(H.j(iZ02, i12, "The calculation caused an overflow: ", " + "));
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return a(org.joda.time.field.j.c(j13), j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420602e.z0(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420602e.f420515i;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420602e.p0();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420602e.r0();
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return null;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        AbstractC44859c abstractC44859c = this.f420602e;
        return abstractC44859c.D0(abstractC44859c.z0(j12));
    }
}
