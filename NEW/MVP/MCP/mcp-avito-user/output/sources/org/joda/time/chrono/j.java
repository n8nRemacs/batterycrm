package org.joda.time.chrono;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: BasicWeekOfWeekyearDateTimeField.java */
/* loaded from: classes7.dex */
final class j extends org.joda.time.field.p {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44859c f420600e;

    public j(AbstractC44859c abstractC44859c, AbstractC44871m abstractC44871m) {
        super(AbstractC44865g.f420891m, abstractC44871m);
        this.f420600e = abstractC44859c;
    }

    @Override // org.joda.time.field.p, org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return super.C(j12 + 259200000);
    }

    @Override // org.joda.time.field.p, org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        return super.E(j12 + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final long F(long j12) {
        return super.F(j12 + 259200000) - 259200000;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        AbstractC44859c abstractC44859c = this.f420600e;
        return abstractC44859c.w0(abstractC44859c.z0(j12), j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return 53;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int o(long j12) {
        AbstractC44859c abstractC44859c = this.f420600e;
        return abstractC44859c.x0(abstractC44859c.y0(j12));
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        AbstractC44865g abstractC44865g = AbstractC44865g.f420890l;
        if (!kVar.F4(abstractC44865g)) {
            return 53;
        }
        return this.f420600e.x0(kVar.I1(abstractC44865g));
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        int size = kVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (kVar.I(i12) == AbstractC44865g.f420890l) {
                return this.f420600e.x0(iArr[i12]);
            }
        }
        return 53;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int r(int i12, long j12) {
        if (i12 > 52) {
            return o(j12);
        }
        return 52;
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420600e.f420517k;
    }
}
