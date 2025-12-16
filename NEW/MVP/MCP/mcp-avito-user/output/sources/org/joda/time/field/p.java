package org.joda.time.field;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: PreciseDurationDateTimeField.java */
/* loaded from: classes7.dex */
public abstract class p extends c {

    /* renamed from: c, reason: collision with root package name */
    public final long f420711c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC44871m f420712d;

    public p(AbstractC44865g abstractC44865g, AbstractC44871m abstractC44871m) {
        super(abstractC44865g);
        if (!abstractC44871m.e()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jD2 = abstractC44871m.d();
        this.f420711c = jD2;
        if (jD2 < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.f420712d = abstractC44871m;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public long C(long j12) {
        long j13 = this.f420711c;
        return j12 >= 0 ? j12 % j13 : (((j12 + 1) % j13) + j13) - 1;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public long E(long j12) {
        long j13 = this.f420711c;
        if (j12 <= 0) {
            return j12 - (j12 % j13);
        }
        long j14 = j12 - 1;
        return (j14 - (j14 % j13)) + j13;
    }

    @Override // org.joda.time.AbstractC44864f
    public long F(long j12) {
        long j13 = this.f420711c;
        if (j12 >= 0) {
            return j12 - (j12 % j13);
        }
        long j14 = j12 + 1;
        return (j14 - (j14 % j13)) - j13;
    }

    @Override // org.joda.time.AbstractC44864f
    public long G(int i12, long j12) {
        j.d(this, i12, s(), r(i12, j12));
        return ((i12 - c(j12)) * this.f420711c) + j12;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420712d;
    }

    @Override // org.joda.time.AbstractC44864f
    public int s() {
        return 0;
    }
}
