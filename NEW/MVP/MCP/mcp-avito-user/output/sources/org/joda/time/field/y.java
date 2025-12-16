package org.joda.time.field;

import org.joda.time.AbstractC44871m;

/* compiled from: ZeroIsMaxDateTimeField.java */
/* loaded from: classes7.dex */
public final class y extends e {
    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return this.f420691c.C(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        return this.f420691c.E(j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long F(long j12) {
        return this.f420691c.F(j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        int iN2 = n();
        j.d(this, i12, 1, iN2);
        if (i12 == iN2) {
            i12 = 0;
        }
        return this.f420691c.G(i12, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        return this.f420691c.a(i12, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return this.f420691c.b(j12, j13);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int iC2 = this.f420691c.c(j12);
        return iC2 == 0 ? n() : iC2;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420691c.l();
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420691c.n() + 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int o(long j12) {
        return this.f420691c.o(j12) + 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        return this.f420691c.p(kVar) + 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        return this.f420691c.q(kVar, iArr) + 1;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int t(long j12) {
        return 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int u(org.joda.time.base.k kVar) {
        return 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final int v(org.joda.time.base.k kVar, int[] iArr) {
        return 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        return this.f420691c.z(j12);
    }
}
