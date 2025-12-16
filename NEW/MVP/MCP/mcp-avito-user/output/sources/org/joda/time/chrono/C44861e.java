package org.joda.time.chrono;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicDayOfYearDateTimeField.java */
/* renamed from: org.joda.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C44861e extends org.joda.time.field.p {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420591e;

    public C44861e(AbstractC44859c abstractC44859c, AbstractC44871m abstractC44871m) {
        super(AbstractC44865g.f420886h, abstractC44871m);
        this.f420591e = abstractC44859c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        AbstractC44859c abstractC44859c = this.f420591e;
        return abstractC44859c.f0(abstractC44859c.z0(j12), j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420591e.l0();
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int o(long j12) {
        AbstractC44859c abstractC44859c = this.f420591e;
        return abstractC44859c.k0(abstractC44859c.z0(j12));
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        AbstractC44865g abstractC44865g = AbstractC44865g.f420885g;
        boolean zF4 = kVar.F4(abstractC44865g);
        AbstractC44859c abstractC44859c = this.f420591e;
        return zF4 ? abstractC44859c.k0(kVar.I1(abstractC44865g)) : abstractC44859c.l0();
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        int size = kVar.size();
        int i12 = 0;
        while (true) {
            AbstractC44859c abstractC44859c = this.f420591e;
            if (i12 >= size) {
                return abstractC44859c.l0();
            }
            if (kVar.I(i12) == AbstractC44865g.f420885g) {
                return abstractC44859c.k0(iArr[i12]);
            }
            i12++;
        }
    }

    @Override // org.joda.time.AbstractC44864f
    public final int r(int i12, long j12) {
        int iL02 = this.f420591e.l0() - 1;
        return (i12 > iL02 || i12 < 1) ? o(j12) : iL02;
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420591e.f420519m;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        return this.f420591e.C0(j12);
    }
}
