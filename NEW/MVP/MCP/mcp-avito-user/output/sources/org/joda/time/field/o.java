package org.joda.time.field;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: PreciseDateTimeField.java */
/* loaded from: classes7.dex */
public class o extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f420709e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC44871m f420710f;

    public o(AbstractC44865g abstractC44865g, AbstractC44871m abstractC44871m, AbstractC44871m abstractC44871m2) {
        super(abstractC44865g, abstractC44871m);
        if (!abstractC44871m2.e()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int iD2 = (int) (abstractC44871m2.d() / this.f420711c);
        this.f420709e = iD2;
        if (iD2 < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.f420710f = abstractC44871m2;
    }

    @Override // org.joda.time.field.p, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        j.d(this, i12, 0, this.f420709e - 1);
        return ((i12 - c(j12)) * this.f420711c) + j12;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int i12 = this.f420709e;
        long j13 = this.f420711c;
        return j12 >= 0 ? (int) ((j12 / j13) % i12) : (i12 - 1) + ((int) (((j12 + 1) / j13) % i12));
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420709e - 1;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420710f;
    }
}
