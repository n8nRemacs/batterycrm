package org.joda.time.chrono;

import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: GJYearOfEraDateTimeField.java */
/* loaded from: classes7.dex */
final class v extends org.joda.time.field.e {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC44859c f420647d;

    public v(AbstractC44864f abstractC44864f, AbstractC44859c abstractC44859c) {
        super(abstractC44864f, AbstractC44865g.f420882d);
        this.f420647d = abstractC44859c;
    }

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
        AbstractC44864f abstractC44864f = this.f420691c;
        org.joda.time.field.j.d(this, i12, 1, abstractC44864f.n());
        if (this.f420647d.z0(j12) <= 0) {
            i12 = 1 - i12;
        }
        return abstractC44864f.G(i12, j12);
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
        return iC2 <= 0 ? 1 - iC2 : iC2;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420691c.n();
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int s() {
        return 1;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420647d.f420521o;
    }
}
