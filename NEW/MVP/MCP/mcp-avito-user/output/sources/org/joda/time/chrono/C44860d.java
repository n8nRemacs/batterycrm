package org.joda.time.chrono;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicDayOfMonthDateTimeField.java */
/* renamed from: org.joda.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C44860d extends org.joda.time.field.p {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420590e;

    public C44860d(AbstractC44859c abstractC44859c, AbstractC44871m abstractC44871m) {
        super(AbstractC44865g.f420888j, abstractC44871m);
        this.f420590e = abstractC44859c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420590e.d0(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420590e.g0();
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int o(long j12) {
        AbstractC44859c abstractC44859c = this.f420590e;
        int iZ02 = abstractC44859c.z0(j12);
        return abstractC44859c.m0(iZ02, abstractC44859c.t0(iZ02, j12));
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        AbstractC44865g abstractC44865g = AbstractC44865g.f420887i;
        boolean zF4 = kVar.F4(abstractC44865g);
        AbstractC44859c abstractC44859c = this.f420590e;
        if (!zF4) {
            return abstractC44859c.g0();
        }
        int iI1 = kVar.I1(abstractC44865g);
        AbstractC44865g abstractC44865g2 = AbstractC44865g.f420885g;
        return kVar.F4(abstractC44865g2) ? abstractC44859c.m0(kVar.I1(abstractC44865g2), iI1) : abstractC44859c.h0(iI1);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        int size = kVar.size();
        int i12 = 0;
        while (true) {
            AbstractC44859c abstractC44859c = this.f420590e;
            if (i12 >= size) {
                return abstractC44859c.g0();
            }
            if (kVar.I(i12) == AbstractC44865g.f420887i) {
                int i13 = iArr[i12];
                for (int i14 = 0; i14 < size; i14++) {
                    if (kVar.I(i14) == AbstractC44865g.f420885g) {
                        return abstractC44859c.m0(iArr[i14], i13);
                    }
                }
                return abstractC44859c.h0(i13);
            }
            i12++;
        }
    }

    @Override // org.joda.time.AbstractC44864f
    public final int r(int i12, long j12) {
        return this.f420590e.i0(i12, j12);
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420590e.f420518l;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        return this.f420590e.C0(j12);
    }
}
