package org.joda.time.field;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: OffsetDateTimeField.java */
/* loaded from: classes7.dex */
public class n extends e {

    /* renamed from: d, reason: collision with root package name */
    public final int f420706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420707e;

    /* renamed from: f, reason: collision with root package name */
    public final int f420708f;

    public n(AbstractC44864f abstractC44864f, int i12) {
        this(abstractC44864f, abstractC44864f == null ? null : abstractC44864f.y(), i12);
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
        j.d(this, i12, this.f420707e, this.f420708f);
        return this.f420691c.G(i12 - this.f420706d, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        long jA2 = super.a(i12, j12);
        j.d(this, c(jA2), this.f420707e, this.f420708f);
        return jA2;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        long jB2 = super.b(j12, j13);
        j.d(this, c(jB2), this.f420707e, this.f420708f);
        return jB2;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        return this.f420691c.c(j12) + this.f420706d;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420691c.l();
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420708f;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420707e;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        return this.f420691c.z(j12);
    }

    public n(AbstractC44864f abstractC44864f, AbstractC44865g abstractC44865g, int i12) {
        super(abstractC44864f, abstractC44865g);
        if (i12 == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.f420706d = i12;
        if (Integer.MIN_VALUE < abstractC44864f.s() + i12) {
            this.f420707e = abstractC44864f.s() + i12;
        } else {
            this.f420707e = BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (Integer.MAX_VALUE > abstractC44864f.n() + i12) {
            this.f420708f = abstractC44864f.n() + i12;
        } else {
            this.f420708f = Integer.MAX_VALUE;
        }
    }
}
