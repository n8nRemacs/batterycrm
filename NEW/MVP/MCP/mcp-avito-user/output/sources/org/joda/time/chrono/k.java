package org.joda.time.chrono;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicWeekyearDateTimeField.java */
/* loaded from: classes7.dex */
final class k extends org.joda.time.field.k {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420601e;

    public k(AbstractC44859c abstractC44859c) {
        super(AbstractC44865g.f420890l, abstractC44859c.Y());
        this.f420601e = abstractC44859c;
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
        AbstractC44859c abstractC44859c = this.f420601e;
        long jF2 = abstractC44859c.f420498D.F(j12);
        return abstractC44859c.w0(abstractC44859c.z0(jF2), jF2) > 1 ? jF2 - ((r0 - 1) * 604800000) : jF2;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        int iAbs = Math.abs(i12);
        AbstractC44859c abstractC44859c = this.f420601e;
        org.joda.time.field.j.d(this, iAbs, abstractC44859c.r0(), abstractC44859c.p0());
        int iY02 = abstractC44859c.y0(j12);
        if (iY02 == i12) {
            return j12;
        }
        int iE02 = AbstractC44859c.e0(j12);
        int iX02 = abstractC44859c.x0(iY02);
        int iX03 = abstractC44859c.x0(i12);
        if (iX03 < iX02) {
            iX02 = iX03;
        }
        int iW02 = abstractC44859c.w0(abstractC44859c.z0(j12), j12);
        if (iW02 <= iX02) {
            iX02 = iW02;
        }
        long jE02 = abstractC44859c.E0(i12, j12);
        int iY03 = abstractC44859c.y0(jE02);
        if (iY03 < i12) {
            jE02 += 604800000;
        } else if (iY03 > i12) {
            jE02 -= 604800000;
        }
        return abstractC44859c.f420495A.G(iE02, ((iX02 - abstractC44859c.w0(abstractC44859c.z0(jE02), jE02)) * 604800000) + jE02);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        return i12 == 0 ? j12 : G(this.f420601e.y0(j12) + i12, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return a(org.joda.time.field.j.c(j13), j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420601e.y0(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420601e.f420516j;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420601e.p0();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420601e.r0();
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return null;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        AbstractC44859c abstractC44859c = this.f420601e;
        return abstractC44859c.x0(abstractC44859c.y0(j12)) > 52;
    }
}
